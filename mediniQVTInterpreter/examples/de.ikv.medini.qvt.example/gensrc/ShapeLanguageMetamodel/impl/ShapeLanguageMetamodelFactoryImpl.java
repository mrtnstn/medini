/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel.impl;

import ShapeLanguageMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeLanguageMetamodelFactoryImpl extends EFactoryImpl implements ShapeLanguageMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShapeLanguageMetamodelFactory init() {
		try {
			ShapeLanguageMetamodelFactory theShapeLanguageMetamodelFactory = (ShapeLanguageMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ikv.de/ShapeLanguageMetamodel.ecore"); 
			if (theShapeLanguageMetamodelFactory != null) {
				return theShapeLanguageMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShapeLanguageMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeLanguageMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShapeLanguageMetamodelPackage.ROOT_BLOCK: return createRootBlock();
			case ShapeLanguageMetamodelPackage.CIRCLE: return createCircle();
			case ShapeLanguageMetamodelPackage.TRIANGLE: return createTriangle();
			case ShapeLanguageMetamodelPackage.SQUARE: return createSquare();
			case ShapeLanguageMetamodelPackage.SIMPLE_SHAPE: return createSimpleShape();
			case ShapeLanguageMetamodelPackage.BLOCK: return createBlock();
			case ShapeLanguageMetamodelPackage.SHAPE: return createShape();
			case ShapeLanguageMetamodelPackage.ARROW: return createArrow();
			case ShapeLanguageMetamodelPackage.MODEL_ELEMENT: return createModelElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootBlock createRootBlock() {
		RootBlockImpl rootBlock = new RootBlockImpl();
		return rootBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleShape createSimpleShape() {
		SimpleShapeImpl simpleShape = new SimpleShapeImpl();
		return simpleShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arrow createArrow() {
		ArrowImpl arrow = new ArrowImpl();
		return arrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeLanguageMetamodelPackage getShapeLanguageMetamodelPackage() {
		return (ShapeLanguageMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShapeLanguageMetamodelPackage getPackage() {
		return ShapeLanguageMetamodelPackage.eINSTANCE;
	}

} //ShapeLanguageMetamodelFactoryImpl
