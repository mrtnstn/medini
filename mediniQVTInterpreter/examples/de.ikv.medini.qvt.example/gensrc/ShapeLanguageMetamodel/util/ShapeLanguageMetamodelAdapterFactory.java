/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel.util;

import ShapeLanguageMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage
 * @generated
 */
public class ShapeLanguageMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShapeLanguageMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeLanguageMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShapeLanguageMetamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeLanguageMetamodelSwitch<Adapter> modelSwitch =
		new ShapeLanguageMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseRootBlock(RootBlock object) {
				return createRootBlockAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter caseTriangle(Triangle object) {
				return createTriangleAdapter();
			}
			@Override
			public Adapter caseSquare(Square object) {
				return createSquareAdapter();
			}
			@Override
			public Adapter caseSimpleShape(SimpleShape object) {
				return createSimpleShapeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseArrow(Arrow object) {
				return createArrowAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.RootBlock <em>Root Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.RootBlock
	 * @generated
	 */
	public Adapter createRootBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Triangle
	 * @generated
	 */
	public Adapter createTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Square
	 * @generated
	 */
	public Adapter createSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.SimpleShape <em>Simple Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.SimpleShape
	 * @generated
	 */
	public Adapter createSimpleShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.Arrow
	 * @generated
	 */
	public Adapter createArrowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShapeLanguageMetamodel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShapeLanguageMetamodel.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShapeLanguageMetamodelAdapterFactory
