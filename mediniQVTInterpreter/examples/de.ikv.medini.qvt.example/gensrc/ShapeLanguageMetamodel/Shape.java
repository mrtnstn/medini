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
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ShapeLanguageMetamodel.Shape#getOutArrow <em>Out Arrow</em>}</li>
 *   <li>{@link ShapeLanguageMetamodel.Shape#getInArrow <em>In Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Out Arrow</b></em>' reference list.
	 * The list contents are of type {@link ShapeLanguageMetamodel.Arrow}.
	 * It is bidirectional and its opposite is '{@link ShapeLanguageMetamodel.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Arrow</em>' reference list.
	 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getShape_OutArrow()
	 * @see ShapeLanguageMetamodel.Arrow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Arrow> getOutArrow();

	/**
	 * Returns the value of the '<em><b>In Arrow</b></em>' reference list.
	 * The list contents are of type {@link ShapeLanguageMetamodel.Arrow}.
	 * It is bidirectional and its opposite is '{@link ShapeLanguageMetamodel.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Arrow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Arrow</em>' reference list.
	 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage#getShape_InArrow()
	 * @see ShapeLanguageMetamodel.Arrow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Arrow> getInArrow();

} // Shape
