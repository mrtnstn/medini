/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.syntax.ast.expressions;

import org.oslo.ocl20.syntax.ast.Visitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xor Exp AS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.oslo.ocl20.syntax.ast.expressions.ExpressionsPackage#getXorExpAS()
 * @model
 * @generated
 */
public interface XorExpAS extends LogicalExpAS{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.oslo.ocl20.syntax.ast.Object" dataDataType="org.oslo.ocl20.syntax.ast.Object"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((org.oslo.ocl20.semantics.analyser.OclSemanticAnalyserVisitorImpl)visitor).visit(this,data);'"
	 * @generated
	 */
	Object accept(Visitor visitor, Object data);

} // XorExpAS
