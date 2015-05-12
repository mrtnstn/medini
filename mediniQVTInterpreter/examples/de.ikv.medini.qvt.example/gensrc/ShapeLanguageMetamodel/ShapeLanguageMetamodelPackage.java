/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface ShapeLanguageMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ShapeLanguageMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ikv.de/ShapeLanguageMetamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ShapeLanguageMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShapeLanguageMetamodelPackage eINSTANCE = ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.ModelElementImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__PARENT = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.ShapeImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PARENT = MODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__OUT_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__IN_ARROW = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.BlockImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MODEL_ELEMENT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.RootBlockImpl <em>Root Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.RootBlockImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getRootBlock()
	 * @generated
	 */
	int ROOT_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__OUT_ARROW = BLOCK__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__IN_ARROW = BLOCK__IN_ARROW;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK__MODEL_ELEMENT = BLOCK__MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Root Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.SimpleShapeImpl <em>Simple Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.SimpleShapeImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getSimpleShape()
	 * @generated
	 */
	int SIMPLE_SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__NAME = SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__PARENT = SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__OUT_ARROW = SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE__IN_ARROW = SHAPE__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Simple Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SHAPE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.CircleImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__PARENT = SIMPLE_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.TriangleImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__PARENT = SIMPLE_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.SquareImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = SIMPLE_SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__PARENT = SIMPLE_SHAPE__PARENT;

	/**
	 * The feature id for the '<em><b>Out Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__OUT_ARROW = SIMPLE_SHAPE__OUT_ARROW;

	/**
	 * The feature id for the '<em><b>In Arrow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__IN_ARROW = SIMPLE_SHAPE__IN_ARROW;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = SIMPLE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShapeLanguageMetamodel.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShapeLanguageMetamodel.impl.ArrowImpl
	 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__PARENT = MODEL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.RootBlock <em>Root Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Block</em>'.
	 * @see ShapeLanguageMetamodel.RootBlock
	 * @generated
	 */
	EClass getRootBlock();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see ShapeLanguageMetamodel.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see ShapeLanguageMetamodel.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see ShapeLanguageMetamodel.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.SimpleShape <em>Simple Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Shape</em>'.
	 * @see ShapeLanguageMetamodel.SimpleShape
	 * @generated
	 */
	EClass getSimpleShape();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ShapeLanguageMetamodel.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ShapeLanguageMetamodel.Block#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element</em>'.
	 * @see ShapeLanguageMetamodel.Block#getModelElement()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ModelElement();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see ShapeLanguageMetamodel.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the reference list '{@link ShapeLanguageMetamodel.Shape#getOutArrow <em>Out Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Arrow</em>'.
	 * @see ShapeLanguageMetamodel.Shape#getOutArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_OutArrow();

	/**
	 * Returns the meta object for the reference list '{@link ShapeLanguageMetamodel.Shape#getInArrow <em>In Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Arrow</em>'.
	 * @see ShapeLanguageMetamodel.Shape#getInArrow()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_InArrow();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see ShapeLanguageMetamodel.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the reference '{@link ShapeLanguageMetamodel.Arrow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ShapeLanguageMetamodel.Arrow#getSource()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Source();

	/**
	 * Returns the meta object for the reference '{@link ShapeLanguageMetamodel.Arrow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ShapeLanguageMetamodel.Arrow#getTarget()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Target();

	/**
	 * Returns the meta object for class '{@link ShapeLanguageMetamodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see ShapeLanguageMetamodel.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ShapeLanguageMetamodel.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ShapeLanguageMetamodel.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link ShapeLanguageMetamodel.ModelElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ShapeLanguageMetamodel.ModelElement#getParent()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShapeLanguageMetamodelFactory getShapeLanguageMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.RootBlockImpl <em>Root Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.RootBlockImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getRootBlock()
		 * @generated
		 */
		EClass ROOT_BLOCK = eINSTANCE.getRootBlock();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.CircleImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.TriangleImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.SquareImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.SimpleShapeImpl <em>Simple Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.SimpleShapeImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getSimpleShape()
		 * @generated
		 */
		EClass SIMPLE_SHAPE = eINSTANCE.getSimpleShape();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.BlockImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MODEL_ELEMENT = eINSTANCE.getBlock_ModelElement();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.ShapeImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Out Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__OUT_ARROW = eINSTANCE.getShape_OutArrow();

		/**
		 * The meta object literal for the '<em><b>In Arrow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__IN_ARROW = eINSTANCE.getShape_InArrow();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.ArrowImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__SOURCE = eINSTANCE.getArrow_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TARGET = eINSTANCE.getArrow_Target();

		/**
		 * The meta object literal for the '{@link ShapeLanguageMetamodel.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShapeLanguageMetamodel.impl.ModelElementImpl
		 * @see ShapeLanguageMetamodel.impl.ShapeLanguageMetamodelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__PARENT = eINSTANCE.getModelElement_Parent();

	}

} //ShapeLanguageMetamodelPackage
