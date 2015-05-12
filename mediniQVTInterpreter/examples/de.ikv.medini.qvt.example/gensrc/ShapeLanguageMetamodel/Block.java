/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ShapeLanguageMetamodel.Block#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends Shape {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link ShapeLanguageMetamodel.ModelElement}.
	 * It is bidirectional and its opposite is '{@link ShapeLanguageMetamodel.ModelElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' containment reference list.
	 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getBlock_ModelElement()
	 * @see ShapeLanguageMetamodel.ModelElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelElement();

} // Block
