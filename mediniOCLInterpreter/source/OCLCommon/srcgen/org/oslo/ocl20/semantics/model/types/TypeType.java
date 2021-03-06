/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.semantics.model.types;

import org.oslo.ocl20.semantics.OclVisitor;

import org.oslo.ocl20.semantics.bridge.Classifier;
import org.oslo.ocl20.semantics.bridge.Primitive;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Type Type</b></em>'. <!--
 * end-user-doc -->
 * 
 * @see org.oslo.ocl20.semantics.model.types.TypesPackage#getTypeType()
 * @model
 * @generated
 */
public interface TypeType extends Primitive {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	Classifier getClassifier();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model dataType="org.oslo.ocl20.semantics.Object"
	 *        dataDataType="org.oslo.ocl20.semantics.Object" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='return ((OclVisitor)visitor).visit(this,data);'"
	 * @generated
	 */
	Object accept(OclVisitor visitor, Object data);

} // TypeType
