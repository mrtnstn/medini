/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.syntax.ast.types.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.oslo.ocl20.syntax.ast.Visitor;

import org.oslo.ocl20.syntax.ast.expressions.ExpressionsPackage;
import org.oslo.ocl20.syntax.ast.expressions.IfExpAS;
import org.oslo.ocl20.syntax.ast.expressions.OclExpressionAS;

import org.oslo.ocl20.syntax.ast.types.SequenceTypeAS;
import org.oslo.ocl20.syntax.ast.types.TypeAS;
import org.oslo.ocl20.syntax.ast.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Type AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SequenceTypeASImpl extends CollectionTypeASImpl implements SequenceTypeAS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTypeASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SEQUENCE_TYPE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object accept(Visitor visitor, Object data) {
		return ((org.oslo.ocl20.semantics.analyser.OclSemanticAnalyserVisitorImpl)visitor).visit(this,data);
	}

} //SequenceTypeASImpl
