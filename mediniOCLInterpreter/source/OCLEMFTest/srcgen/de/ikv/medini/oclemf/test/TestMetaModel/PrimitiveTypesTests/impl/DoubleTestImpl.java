/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl;

import de.ikv.medini.kernel.impl.MediniObjectImpl;
import de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.DoubleTest;
import de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.PrimitiveTypesTestsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Double Test</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getBagAttribute
 * <em>Bag Attribute</em>}</li>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getOptionalSimpleAttribute
 * <em>Optional Simple Attribute</em>}</li>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getOrderedSetAttribute
 * <em>Ordered Set Attribute</em>}</li>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getSequenceAttribute
 * <em>Sequence Attribute</em>}</li>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getSetAttribute
 * <em>Set Attribute</em>}</li>
 * <li>
 * {@link de.ikv.medini.oclemf.test.TestMetaModel.PrimitiveTypesTests.impl.DoubleTestImpl#getSimpleAttribute
 * <em>Simple Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("rawtypes")
public class DoubleTestImpl extends MediniObjectImpl implements DoubleTest {
	/**
	 * The cached value of the '{@link #getBagAttribute()
	 * <em>Bag Attribute</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getBagAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList bagAttribute = null;

	/**
	 * The default value of the '{@link #getOptionalSimpleAttribute()
	 * <em>Optional Simple Attribute</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOptionalSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final double OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOptionalSimpleAttribute()
	 * <em>Optional Simple Attribute</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOptionalSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected double optionalSimpleAttribute = OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderedSetAttribute()
	 * <em>Ordered Set Attribute</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOrderedSetAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList orderedSetAttribute = null;

	/**
	 * The cached value of the '{@link #getSequenceAttribute()
	 * <em>Sequence Attribute</em>}' attribute list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSequenceAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList sequenceAttribute = null;

	/**
	 * The cached value of the '{@link #getSetAttribute()
	 * <em>Set Attribute</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSetAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList setAttribute = null;

	/**
	 * The default value of the '{@link #getSimpleAttribute()
	 * <em>Simple Attribute</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final double SIMPLE_ATTRIBUTE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSimpleAttribute()
	 * <em>Simple Attribute</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getSimpleAttribute()
	 * @generated
	 * @ordered
	 */
	protected double simpleAttribute = SIMPLE_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DoubleTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PrimitiveTypesTestsPackage.Literals.DOUBLE_TEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getBagAttribute() {
		if (bagAttribute == null) {
			bagAttribute = new EDataTypeEList(Double.class, this,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__BAG_ATTRIBUTE);
		}
		return bagAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getOptionalSimpleAttribute() {
		return optionalSimpleAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOptionalSimpleAttribute(double newOptionalSimpleAttribute) {
		double oldOptionalSimpleAttribute = optionalSimpleAttribute;
		optionalSimpleAttribute = newOptionalSimpleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__OPTIONAL_SIMPLE_ATTRIBUTE,
					oldOptionalSimpleAttribute, optionalSimpleAttribute));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getOrderedSetAttribute() {
		if (orderedSetAttribute == null) {
			orderedSetAttribute = new EDataTypeUniqueEList(
					Double.class,
					this,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__ORDERED_SET_ATTRIBUTE);
		}
		return orderedSetAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getSequenceAttribute() {
		if (sequenceAttribute == null) {
			sequenceAttribute = new EDataTypeEList(Double.class, this,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__SEQUENCE_ATTRIBUTE);
		}
		return sequenceAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList getSetAttribute() {
		if (setAttribute == null) {
			setAttribute = new EDataTypeUniqueEList(Double.class, this,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__SET_ATTRIBUTE);
		}
		return setAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getSimpleAttribute() {
		return simpleAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSimpleAttribute(double newSimpleAttribute) {
		double oldSimpleAttribute = simpleAttribute;
		simpleAttribute = newSimpleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrimitiveTypesTestsPackage.DOUBLE_TEST__SIMPLE_ATTRIBUTE,
					oldSimpleAttribute, simpleAttribute));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__BAG_ATTRIBUTE:
			return getBagAttribute();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
			return new Double(getOptionalSimpleAttribute());
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__ORDERED_SET_ATTRIBUTE:
			return getOrderedSetAttribute();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SEQUENCE_ATTRIBUTE:
			return getSequenceAttribute();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SET_ATTRIBUTE:
			return getSetAttribute();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SIMPLE_ATTRIBUTE:
			return new Double(getSimpleAttribute());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__BAG_ATTRIBUTE:
			getBagAttribute().clear();
			getBagAttribute().addAll((Collection) newValue);
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
			setOptionalSimpleAttribute(((Double) newValue).doubleValue());
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__ORDERED_SET_ATTRIBUTE:
			getOrderedSetAttribute().clear();
			getOrderedSetAttribute().addAll((Collection) newValue);
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SEQUENCE_ATTRIBUTE:
			getSequenceAttribute().clear();
			getSequenceAttribute().addAll((Collection) newValue);
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SET_ATTRIBUTE:
			getSetAttribute().clear();
			getSetAttribute().addAll((Collection) newValue);
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SIMPLE_ATTRIBUTE:
			setSimpleAttribute(((Double) newValue).doubleValue());
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__BAG_ATTRIBUTE:
			getBagAttribute().clear();
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
			setOptionalSimpleAttribute(OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT);
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__ORDERED_SET_ATTRIBUTE:
			getOrderedSetAttribute().clear();
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SEQUENCE_ATTRIBUTE:
			getSequenceAttribute().clear();
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SET_ATTRIBUTE:
			getSetAttribute().clear();
			return;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SIMPLE_ATTRIBUTE:
			setSimpleAttribute(SIMPLE_ATTRIBUTE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__BAG_ATTRIBUTE:
			return bagAttribute != null && !bagAttribute.isEmpty();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__OPTIONAL_SIMPLE_ATTRIBUTE:
			return optionalSimpleAttribute != OPTIONAL_SIMPLE_ATTRIBUTE_EDEFAULT;
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__ORDERED_SET_ATTRIBUTE:
			return orderedSetAttribute != null
					&& !orderedSetAttribute.isEmpty();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SEQUENCE_ATTRIBUTE:
			return sequenceAttribute != null && !sequenceAttribute.isEmpty();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SET_ATTRIBUTE:
			return setAttribute != null && !setAttribute.isEmpty();
		case PrimitiveTypesTestsPackage.DOUBLE_TEST__SIMPLE_ATTRIBUTE:
			return simpleAttribute != SIMPLE_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BagAttribute: ");
		result.append(bagAttribute);
		result.append(", OptionalSimpleAttribute: ");
		result.append(optionalSimpleAttribute);
		result.append(", OrderedSetAttribute: ");
		result.append(orderedSetAttribute);
		result.append(", SequenceAttribute: ");
		result.append(sequenceAttribute);
		result.append(", SetAttribute: ");
		result.append(setAttribute);
		result.append(", SimpleAttribute: ");
		result.append(simpleAttribute);
		result.append(')');
		return result.toString();
	}

} // DoubleTestImpl