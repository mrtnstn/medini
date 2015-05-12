/* 
 * Copyright (c) 2007 ikv++ technologies ag
 * All rights reserved.
 */
package de.ikv.medini.qvt.example;

import java.io.OutputStream;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * As {@link UsingMediniQVTfromApplications}, however loads the metamodel reflective (i.e. not uses
 * the generated code)
 */
public class UsingMediniQVTfromApplicationsReflective extends UsingMediniQVTfromApplications {

	public UsingMediniQVTfromApplicationsReflective(OutputStream outputStream) {
		super(outputStream);
	}

	public static void main(String[] args) {

		// initialize the engine
		UsingMediniQVTfromApplications simpleQVT = new UsingMediniQVTfromApplicationsReflective(System.out);

		simpleQVT.launch();
	}

	@Override
	protected void collectMetaModels(Collection<EPackage> metaPackages) {

		// the resource set for the metamodels
		ResourceSetImpl mmResourceSet = new ResourceSetImpl();
		mmResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
		    Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// TODO if we load the metamodels NOT into "resourceSet", then the traces cannot be loaded!
		EPackageImpl p = UsingMediniQVTfromApplicationsReflective.buildMetaModelFromEcoreFile(
		    "./model/ShapesMetamodel.ecore", this.resourceSet/* mmResourceSet */);

		// make the metamodels known to the resourceset of the models
		this.resourceSet.getPackageRegistry().put(p.getNsURI(), p);
		// otherwise we would get
		// "(Relation 'RootBlock2RootBlock' initially has 0 tuple(s) to evaluate)" ..

		metaPackages.add(p);
	}

	/**
	 * Loads a metamodel into the given resource set
	 * 
	 * @param path
	 *            the path to the metamodel's ECORE file
	 * @param rset
	 *            the resource set
	 * @return the root package of the metamodel
	 */
	static protected EPackageImpl buildMetaModelFromEcoreFile(String path, ResourceSet rset) {
		URI simpleMMFileUri;
		try {
			simpleMMFileUri = URI.createFileURI(path); // e.g. "c:\.."
		} catch (Exception e) {
			simpleMMFileUri = URI.createURI(path); // e.g. file:/c:/.. or
			// platform:/resource/MyProjectName/..
		}
		Resource simpleMMResource = rset.getResource(simpleMMFileUri, true);
		return (EPackageImpl) simpleMMResource.getContents().get(0);
	}

}
