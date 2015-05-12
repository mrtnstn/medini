/*******************************************************************************
 * Copyright (c) 2008 ikv++ technologies ag and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ikv++ technologies ag - initial API and implementation
 *******************************************************************************/

package de.ikv.emf.qvt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.oslo.ocl20.OclProcessor;
import org.oslo.ocl20.bridge4emf.EmfEvaluationAdapter;
import org.oslo.ocl20.standard.lib.OclAny;

public class EMFQvtEvaluationAdapter extends EmfEvaluationAdapter {

	public EMFQvtEvaluationAdapter(OclProcessor proc) {
		super(proc);
	}

	/**
	 * Equality of Ecore model elements is based on their URIs, not only on their ID attribute
	 * values as with the super class implementation (analyze #6217).
	 * 
	 * @see href https://projects.ikv.de/analyze/ticket/6217
	 * @see org.oslo.ocl20.bridge4emf.EmfEvaluationAdapter#OclModelElement_equalTo(org.oslo.ocl20.standard.lib.OclAny,
	 *      org.oslo.ocl20.standard.lib.OclAny)
	 */
	public boolean OclModelElement_equalTo(OclAny o1, OclAny o2) {
		if ((o1 == null) && (o2 == null)) {
			return true;
		}
		if ((o1 == null) || (o2 == null)) {
			return false;
		}

		Object obj1 = o1.asJavaObject();
		Object obj2 = o2.asJavaObject();
		if ((obj1 instanceof EObject) && (obj2 instanceof EObject)) {
			return EcoreUtil.getURI((EObject) obj1).equals(EcoreUtil.getURI((EObject) obj2));
		}
		return obj1.equals(obj2);
	}

}
