/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl;

import de.ikv.medini.kernel.impl.MediniObjectImpl;

import de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.IntegerTest;
import de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.PrimitiveTypesTestsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getBagAttribute <em>Bag Attribute</em>}</li>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getOrderedSetAttribute <em>Ordered Set Attribute</em>}</li>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getSequenceAttribute <em>Sequence Attribute</em>}</li>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getSetAttribute <em>Set Attribute</em>}</li>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getSimpleAttribute <em>Simple Attribute</em>}</li>
 *   <li>{@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.IntegerTestImpl#getOptionalSimpleAttribute <em>Optional Simple Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerTestImpl extends MediniObjectImpl implements IntegerTest {
	/**
	 * The cached value of the '{@link #getBagAttribute() <em>Bag Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBagAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList bagAttribute = null;

	/**
	 * The cached value of the '{@link #getOrderedSetAttribute() <em>Ordered Set Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedSetAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList orderedSetAttribute = null;

	/**
	 * The cached value of the '{@link #getSequenceAttribute() <em>Sequence Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList sequenceAttribute = null;

	/**
	 * The cached value of the '{@link #getSetAttribute() <em>Set Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList setAttribute = null;

	/**
	 * The default value of the '{@link #getSimpleAttribute() <em>Simple Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int SIMPLE_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSimpleAttribute() <em>Simple Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected int simpleAttribute = SIMPLE_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptionalSimpleAttribute() <em>Optional Simple Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final int OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOptionalSimpleAttribute() <em>Optional Simple Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected int optionalSimpleAttribute = OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrimitiveTypesTestsPackage.Literals.INTEGER_TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBagAttribute() {
		if (bagAttribute == null) {
			bagAttribute = new EDataTypeEList(Integer.class, this, PrimitiveTypesTestsPackage.INTEGER_TEST__BAG_ATTRIBUTE);
		}
		return bagAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrderedSetAttribute() {
		if (orderedSetAttribute == null) {
			orderedSetAttribute = new EDataTypeUniqueEList(Integer.class, this, PrimitiveTypesTestsPackage.INTEGER_TEST__ORDERED_SET_ATTRIBUTE);
		}
		return orderedSetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSequenceAttribute() {
		if (sequenceAttribute == null) {
			sequenceAttribute = new EDataTypeEList(Integer.class, this, PrimitiveTypesTestsPackage.INTEGER_TEST__SEQUENCE_ATTRIBUTE);
		}
		return sequenceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSetAttribute() {
		if (setAttribute == null) {
			setAttribute = new EDataTypeUniqueEList(Integer.class, this, PrimitiveTypesTestsPackage.INTEGER_TEST__SET_ATTRIBUTE);
		}
		return setAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSimpleAttribute() {
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleAttribute(int newSimpleAttribute) {
		int oldSimpleAttribute = simpleAttribute;
		simpleAttribute = newSimpleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitiveTypesTestsPackage.INTEGER_TEST__SIMPLE_ATTRIBUTE, oldSimpleAttribute, simpleAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOptionalSimpleAttribute() {
		return optionalSimpleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalSimpleAttribute(int newOptionalSimpleAttribute) {
		int oldOptionalSimpleAttribute = optionalSimpleAttribute;
		optionalSimpleAttribute = newOptionalSimpleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimitiveTypesTestsPackage.INTEGER_TEST__OPTIONAL_SIMPLE_ATTRIBUTE, oldOptionalSimpleAttribute, optionalSimpleAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimitiveTypesTestsPackage.INTEGER_TEST__BAG_ATTRIBUTE:
				return getBagAttribute();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__ORDERED_SET_ATTRIBUTE:
				return getOrderedSetAttribute();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SEQUENCE_ATTRIBUTE:
				return getSequenceAttribute();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SET_ATTRIBUTE:
				return getSetAttribute();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SIMPLE_ATTRIBUTE:
				return new Integer(getSimpleAttribute());
			case PrimitiveTypesTestsPackage.INTEGER_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
				return new Integer(getOptionalSimpleAttribute());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrimitiveTypesTestsPackage.INTEGER_TEST__BAG_ATTRIBUTE:
				getBagAttribute().clear();
				getBagAttribute().addAll((Collection)newValue);
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__ORDERED_SET_ATTRIBUTE:
				getOrderedSetAttribute().clear();
				getOrderedSetAttribute().addAll((Collection)newValue);
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SEQUENCE_ATTRIBUTE:
				getSequenceAttribute().clear();
				getSequenceAttribute().addAll((Collection)newValue);
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SET_ATTRIBUTE:
				getSetAttribute().clear();
				getSetAttribute().addAll((Collection)newValue);
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SIMPLE_ATTRIBUTE:
				setSimpleAttribute(((Integer)newValue).intValue());
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
				setOptionalSimpleAttribute(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrimitiveTypesTestsPackage.INTEGER_TEST__BAG_ATTRIBUTE:
				getBagAttribute().clear();
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__ORDERED_SET_ATTRIBUTE:
				getOrderedSetAttribute().clear();
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SEQUENCE_ATTRIBUTE:
				getSequenceAttribute().clear();
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SET_ATTRIBUTE:
				getSetAttribute().clear();
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SIMPLE_ATTRIBUTE:
				setSimpleAttribute(SIMPLE_ATTRIBUTE_EDEFAULT);
				return;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
				setOptionalSimpleAttribute(OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrimitiveTypesTestsPackage.INTEGER_TEST__BAG_ATTRIBUTE:
				return bagAttribute != null && !bagAttribute.isEmpty();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__ORDERED_SET_ATTRIBUTE:
				return orderedSetAttribute != null && !orderedSetAttribute.isEmpty();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SEQUENCE_ATTRIBUTE:
				return sequenceAttribute != null && !sequenceAttribute.isEmpty();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SET_ATTRIBUTE:
				return setAttribute != null && !setAttribute.isEmpty();
			case PrimitiveTypesTestsPackage.INTEGER_TEST__SIMPLE_ATTRIBUTE:
				return simpleAttribute != SIMPLE_ATTRIBUTE_EDEFAULT;
			case PrimitiveTypesTestsPackage.INTEGER_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
				return optionalSimpleAttribute != OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BagAttribute: ");
		result.append(bagAttribute);
		result.append(", OrderedSetAttribute: ");
		result.append(orderedSetAttribute);
		result.append(", SequenceAttribute: ");
		result.append(sequenceAttribute);
		result.append(", SetAttribute: ");
		result.append(setAttribute);
		result.append(", SimpleAttribute: ");
		result.append(simpleAttribute);
		result.append(", OptionalSimpleAttribute: ");
		result.append(optionalSimpleAttribute);
		result.append(')');
		return result.toString();
	}

} //IntegerTestImpl