/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.semantics.model.expressions;

import org.oslo.ocl20.semantics.OclVisitor;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Unspecified Value Exp</b></em>'. <!-- end-user-doc -->
 * 
 * @see org.oslo.ocl20.semantics.model.expressions.ExpressionsPackage#getUnspecifiedValueExp()
 * @model
 * @generated
 */
public interface UnspecifiedValueExp extends OclExpression {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataType="org.oslo.ocl20.semantics.Object"
	 *        dataDataType="org.oslo.ocl20.semantics.Object" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return ((OclVisitor)visitor).visit(this,data);'"
	 * @generated
	 */
	Object accept(OclVisitor visitor, Object data);

} // UnspecifiedValueExp
