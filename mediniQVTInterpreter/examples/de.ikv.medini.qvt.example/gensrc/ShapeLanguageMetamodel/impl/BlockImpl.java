/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ShapeLanguageMetamodel.impl;

import ShapeLanguageMetamodel.Block;
import ShapeLanguageMetamodel.ModelElement;
import ShapeLanguageMetamodel.ShapeLanguageMetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ShapeLanguageMetamodel.impl.BlockImpl#getModelElement <em>Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends ShapeImpl implements Block {
	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapeLanguageMetamodelPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getModelElement() {
		if (modelElement == null) {
			modelElement = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this, ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT, ShapeLanguageMetamodelPackage.MODEL_ELEMENT__PARENT);
		}
		return modelElement;
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelElement()).basicAdd(otherEnd, msgs);
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				return ((InternalEList<?>)getModelElement()).basicRemove(otherEnd, msgs);
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				return getModelElement();
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				getModelElement().clear();
				getModelElement().addAll((Collection<? extends ModelElement>)newValue);
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				getModelElement().clear();
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
			case ShapeLanguageMetamodelPackage.BLOCK__MODEL_ELEMENT:
				return modelElement != null && !modelElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockImpl
