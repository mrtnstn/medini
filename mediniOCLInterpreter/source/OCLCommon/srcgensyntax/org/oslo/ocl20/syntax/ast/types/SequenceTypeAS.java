/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.oslo.ocl20.syntax.ast.types;

import org.oslo.ocl20.syntax.ast.Visitor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Type AS</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.oslo.ocl20.syntax.ast.types.TypesPackage#getSequenceTypeAS()
 * @model
 * @generated
 */
public interface SequenceTypeAS extends CollectionTypeAS{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.oslo.ocl20.syntax.ast.Object" dataDataType="org.oslo.ocl20.syntax.ast.Object"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return ((org.oslo.ocl20.semantics.analyser.OclSemanticAnalyserVisitorImpl)visitor).visit(this,data);'"
	 * @generated
	 */
	Object accept(Visitor visitor, Object data);

} // SequenceTypeAS
