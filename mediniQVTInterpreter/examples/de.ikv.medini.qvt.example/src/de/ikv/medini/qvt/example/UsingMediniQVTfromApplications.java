/* 
 * Copyright (c) 2007 ikv++ technologies ag
 * All rights reserved.
 */
package de.ikv.medini.qvt.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import uk.ac.kent.cs.kmf.util.ILog;
import uk.ac.kent.cs.kmf.util.OutputStreamLog;
import ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage;
import de.ikv.emf.qvt.EMFQvtProcessorImpl;
import de.ikv.medini.qvt.QVTProcessorConsts;

/**
 * Class, which demonstrated how to use medini QVT inside your Java application. See the TODOs in
 * the source code for assistance.
 * 
 * @author Hajo Eichler <eichler@ikv.de>
 */
public class UsingMediniQVTfromApplications {

	private ILog logger;

	private EMFQvtProcessorImpl processorImpl;

	protected ResourceSet resourceSet;

	/**
	 * Initializes the QVT processor
	 * 
	 * @param outputStream
	 *            an {@link OutputStream} for logging
	 */
	public UsingMediniQVTfromApplications(OutputStream outputStream) {
		this.logger = new OutputStreamLog(outputStream);
		this.processorImpl = new EMFQvtProcessorImpl(this.logger);
		this.processorImpl.setProperty(QVTProcessorConsts.PROP_DEBUG, "true");
	}

	/**
	 * Provide the information about the metamodels, which are involved in the transformation
	 * 
	 * @param ePackages
	 *            the metamodel packages
	 */
	public void init(Collection<EPackage> ePackages) {
		Iterator<EPackage> iterator = ePackages.iterator();
		while (iterator.hasNext()) {
			this.processorImpl.addMetaModel(iterator.next());
		}
	}

	private void clean() {
		this.processorImpl.setModels(Collections.EMPTY_LIST);
	}

	/**
	 * Before transforming, the engine has to now the model to perform the transformation on, as
	 * well as a directory for the traces to store.
	 * 
	 * @param modelResources
	 *            models for the execution - take care of the right order!
	 * @param workingDirectory
	 *            working directory of the QVT engine
	 */
	public void preExecution(Collection<?> modelResources, URI workingDirectory) {
		this.processorImpl.setWorkingLocation(workingDirectory);
		this.processorImpl.setModels(modelResources);
	}

	/**
	 * Transform a QVT script in a specific direction.
	 * 
	 * @param qvtRuleSet
	 *            the QVT transformation
	 * @param transformation
	 *            name of the transformation
	 * @param direction
	 *            name of the target - must conform to your QVT transformation definition
	 * @throws Throwable
	 */
	public void transform(Reader qvtRuleSet, String transformation, String direction) throws Throwable {
		this.processorImpl.evaluateQVT(qvtRuleSet, transformation, true, direction, new Object[0], null, this.logger);
		this.clean();
	}

	/**
	 * Helper for XMI loading. Does lazy loading.
	 * 
	 * @param xmlFileName
	 *            file name to load
	 * @return the EMF resource
	 */
	public Resource getResource(String xmlFileName) {
		URI uri = URI.createFileURI(xmlFileName);
		Resource resource = null;
		try {
			resource = this.resourceSet.getResource(uri, true);
		} catch (Throwable fileNotFoundException) {
			resource = this.resourceSet.createResource(uri);
		}
		return resource;
	}

	/**
	 * Example usage of the class {@link UsingMediniQVTfromApplications}.
	 * 
	 * @param args
	 *            are ignored here!
	 */
	public static void main(String[] args) {

		// initialize the engine
		UsingMediniQVTfromApplications simpleQVT = new UsingMediniQVTfromApplications(System.out);

		simpleQVT.launch();
	}

	public void launch() {

		// initialize resource set of models
		this.resourceSet = new ResourceSetImpl();
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// TODO: collect all necessary packages from the metamodel(s)
		Collection<EPackage> metaPackages = new ArrayList<EPackage>();
		this.collectMetaModels(metaPackages);

		// make these packages known to the QVT engine
		this.init(metaPackages);

		// load the example model files - TODO: adjust the filename!
		Resource resource1 = this.getResource("./model/source.xmi");
		Resource resource2 = this.getResource("./model/target.xmi");

		// Collect the models, which should participate in the transformation.
		// You can provide a list of models for each direction.
		// The models must be added in the same order as defined in your transformation!
		Collection<Collection<Resource>> modelResources = new ArrayList<Collection<Resource>>();
		Collection<Resource> firstSetOfModels = new ArrayList<Resource>();
		Collection<Resource> secondSetOfModels = new ArrayList<Resource>();
		modelResources.add(firstSetOfModels);
		modelResources.add(secondSetOfModels);
		firstSetOfModels.add(resource1);
		secondSetOfModels.add(resource2);

		// tell the QVT engine a directory to work in - e.g. to store the trace (meta)models
		URI directory = URI.createFileURI("./traces");
		this.preExecution(modelResources, directory);

		// load the QVT relations
		FileReader qvtRuleSet = null;
		try {
			qvtRuleSet = new FileReader("./qvt/yet-another.qvt"); // TODO: adjust the filename!
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
			return;
		}
		// tell the QVT engine, which transformation to execute - there might be more than one in
		// the QVT file!
		String transformation = "yetAnotherTrafo"; // TODO: adjust
		// give the direction of the transformation (according to the transformation definition)
		String direction = "thisWay"; // TODO: adjust

		// just do it ;-)
		try {
			this.transform(qvtRuleSet, transformation, direction);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

		// Note: the engine does not save the model resources, which were participating in the
		// transformation.
		// You have to take care on this.
		try {
			resource2.save(Collections.EMPTY_MAP);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Add all metamodel packages of models/qvt script
	 * 
	 * @param metaPackages
	 * @return
	 */
	protected void collectMetaModels(Collection<EPackage> metaPackages) {
		metaPackages.add(ShapeLanguageMetamodelPackage.eINSTANCE);
	}
}
