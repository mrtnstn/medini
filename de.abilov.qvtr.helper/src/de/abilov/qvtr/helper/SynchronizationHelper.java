package de.abilov.qvtr.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.merge.BatchMerger;
import org.eclipse.emf.compare.merge.IBatchMerger;
import org.eclipse.emf.compare.merge.IMerger;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import uk.ac.kent.cs.kmf.util.OutputStreamLog;
import de.ikv.emf.qvt.EMFQvtProcessorImpl;
import de.ikv.medini.qvt.QVTProcessorConsts;

public class SynchronizationHelper {
	public SynchronizationHelper(OutputStream outputStream,
			Iterable<EPackage> metamodels) {
		this.logger = new OutputStreamLog(outputStream);
		this.processorImpl = new EMFQvtProcessorImpl(this.logger);
		this.processorImpl.setProperty(QVTProcessorConsts.PROP_DEBUG, "true");

		Iterator<EPackage> iterator = metamodels.iterator();
		while (iterator.hasNext()) {
			this.processorImpl.addMetaModel(iterator.next());
		}

		Map<String, Object> m = Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap();
		m.remove("*");
		m.put("xmi", new XMIResourceFactoryImpl());
		this.resourceSet = new ResourceSetImpl();

	}

	public static final String forwardDirection = "forward";
	public static final String backwardDirection = "backward";

	public void mergeRightToLeft(EObject left, EObject right) {
		List<Diff> differences = compare(left, right).getDifferences();
		IMerger.Registry mergerRegistry = IMerger.RegistryImpl
				.createStandaloneInstance();
		IBatchMerger merger = new BatchMerger(mergerRegistry);
		merger.copyAllRightToLeft(differences, new BasicMonitor());

		// Compare and copy it again due to cross references
		List<Diff> differences1 = compare(left, right).getDifferences();
		if (differences1.size() > 0) {
			merger.copyAllRightToLeft(differences1, new BasicMonitor());
		}
	}

	public void integrate(String sourceFile, String targetFile,
			String workingDir, String qvtFile, String direction) {
		this.processorImpl.setWorkingLocation(URI.createFileURI(workingDir));
		this.processorImpl.setModels(this.loadFiles(sourceFile, targetFile));

		FileReader qvtRuleSet = null;
		try {
			qvtRuleSet = new FileReader(qvtFile);
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
			return;
		}

		this.processorImpl.evaluateQVT(qvtRuleSet, "main", true, direction,
				new Object[0], null, this.logger);
	}

	public void saveSrc() throws IOException {
		if (this.src == null) {
			return;
		}
		this.src.save(Collections.EMPTY_MAP);
	}

	public void saveTrg() throws IOException {
		if (this.trg == null) {
			return;
		}
		this.trg.save(Collections.EMPTY_MAP);
	}

	private ResourceSet resourceSet;
	private Resource src, trg;
	private OutputStreamLog logger;
	private EMFQvtProcessorImpl processorImpl;

	private Comparison compare(EObject v1, EObject v2) {
		IEObjectMatcher matcher = DefaultMatchEngine
				.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
				new DefaultEqualityHelperFactory());
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(
				matcher, comparisonFactory);
		matchEngineFactory.setRanking(20);
		IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
		matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder()
				.setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		IComparisonScope scope = new DefaultComparisonScope(v1, v2, v1);
		return comparator.compare(scope);
	}

	private Resource getResource(String fileName) {
		URI uri = URI.createFileURI(fileName);
		Resource resource = null;
		try {
			resource = this.resourceSet.getResource(uri, true);
		} catch (Throwable fileNotFoundException) {
			resource = this.resourceSet.createResource(uri);
		}
		return resource;
	}

	private Collection<Collection<Resource>> loadFiles(String sourceFile,
			String targetFile) {
		Collection<Collection<Resource>> modelResources = new ArrayList<Collection<Resource>>();
		this.src = this.getResource(sourceFile);
		Collection<Resource> firstSetOfModels = new ArrayList<Resource>();
		firstSetOfModels.add(this.src);
		modelResources.add(firstSetOfModels);

		this.trg = this.getResource(targetFile);
		Collection<Resource> secondSetOfModels = new ArrayList<Resource>();
		secondSetOfModels.add(this.trg);
		modelResources.add(secondSetOfModels);
		return modelResources;
	}
}
