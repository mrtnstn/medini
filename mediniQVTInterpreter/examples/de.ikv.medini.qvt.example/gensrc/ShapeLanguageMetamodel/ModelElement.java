/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ShapeLanguageMetamodel.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link ShapeLanguageMetamodel.ModelElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ShapeLanguageMetamodel.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ShapeLanguageMetamodel.Block#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Block)
	 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getModelElement_Parent()
	 * @see ShapeLanguageMetamodel.Block#getModelElement
	 * @model opposite="modelElement" transient="false"
	 * @generated
	 */
	Block getParent();

	/**
	 * Sets the value of the '{@link ShapeLanguageMetamodel.ModelElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Block value);

} // ModelElement
