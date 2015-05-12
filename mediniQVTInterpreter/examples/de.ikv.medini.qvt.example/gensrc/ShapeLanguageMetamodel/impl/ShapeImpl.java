/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel.impl;

import ShapeLanguageMetamodel.Arrow;
import ShapeLanguageMetamodel.Shape;
import ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ShapeLanguageMetamodel.impl.ShapeImpl#getOutArrow <em>Out Arrow</em>}</li>
 *   <li>{@link ShapeLanguageMetamodel.impl.ShapeImpl#getInArrow <em>In Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeImpl extends ModelElementImpl implements Shape {
	/**
	 * The cached value of the '{@link #getOutArrow() <em>Out Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> outArrow;

	/**
	 * The cached value of the '{@link #getInArrow() <em>In Arrow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArrow()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> inArrow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapeLanguageMetamodelPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getOutArrow() {
		if (outArrow == null) {
			outArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW, ShapeLanguageMetamodelPackage.ARROW__SOURCE);
		}
		return outArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arrow> getInArrow() {
		if (inArrow == null) {
			inArrow = new EObjectWithInverseResolvingEList<Arrow>(Arrow.class, this, ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW, ShapeLanguageMetamodelPackage.ARROW__TARGET);
		}
		return inArrow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArrow()).basicAdd(otherEnd, msgs);
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArrow()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				return ((InternalEList<?>)getOutArrow()).basicRemove(otherEnd, msgs);
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				return ((InternalEList<?>)getInArrow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				return getOutArrow();
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				return getInArrow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
				getOutArrow().addAll((Collection<? extends Arrow>)newValue);
				return;
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				getInArrow().addAll((Collection<? extends Arrow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				getOutArrow().clear();
				return;
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				getInArrow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShapeLanguageMetamodelPackage.SHAPE__OUT_ARROW:
				return outArrow != null && !outArrow.isEmpty();
			case ShapeLanguageMetamodelPackage.SHAPE__IN_ARROW:
				return inArrow != null && !inArrow.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
