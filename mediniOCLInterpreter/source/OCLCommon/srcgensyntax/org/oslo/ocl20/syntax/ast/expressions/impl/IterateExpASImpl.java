/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.syntax.ast.expressions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.oslo.ocl20.syntax.ast.Visitor;

import org.oslo.ocl20.syntax.ast.contexts.VariableDeclarationAS;

import org.oslo.ocl20.syntax.ast.expressions.ExpressionsPackage;
import org.oslo.ocl20.syntax.ast.expressions.IfExpAS;
import org.oslo.ocl20.syntax.ast.expressions.IterateExpAS;
import org.oslo.ocl20.syntax.ast.expressions.OclExpressionAS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterate Exp AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IterateExpASImpl extends LoopExpASImpl implements IterateExpAS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateExpASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.ITERATE_EXP_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object accept(Visitor visitor, Object data) {
		return ((org.oslo.ocl20.semantics.analyser.OclSemanticAnalyserVisitorImpl)visitor).visit(this,data);
	}

} //IterateExpASImpl
