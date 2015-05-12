/*******************************************************************************
 * Copyright (c) 2008 ikv++ technologies ag and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ikv++ technologies ag - initial API and implementation
 *******************************************************************************/

package de.ikv.medini.ocl20.bridge4medini.test;

import de.ikv.medini.ocl.test.OCLTestAdapter;

public abstract class OclInterpreterTestCase extends MediniTestCase {

	public final String META_SuperClass = "TestMetaModel::ClassifierTest::SuperClass";

	public final String META_SuperClass_superName = "superName";

	public final String META_SubClass = "TestMetaModel::ClassifierTest::SubClass";

	public final String META_SubClass_subName = "subName";

	public final String META_SubClass_abstractSuperClass = "abstractSuperClass";

	public final String META_BooleanTest = "TestMetaModel::PrimitiveTypesTests::BooleanTest";

	public final String META_BooleanTest_simpleAttribute = "simpleAttribute";

	public final String META_BooleanTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_BooleanTest_setAttribute = "setAttribute";

	public final String META_BooleanTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_BooleanTest_bagAttribute = "bagAttribute";

	public final String META_BooleanTest_sequenceAttribute = "sequenceAttribute";

	public final String META_DoubleTest = "TestMetaModel::PrimitiveTypesTests::DoubleTest";

	public final String META_DoubleTest_simpleAttribute = "simpleAttribute";

	public final String META_DoubleTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_DoubleTest_setAttribute = "setAttribute";

	public final String META_DoubleTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_DoubleTest_bagAttribute = "bagAttribute";

	public final String META_DoubleTest_sequenceAttribute = "sequenceAttribute";

	public final String META_FloatTest = "TestMetaModel::PrimitiveTypesTests::FloatTest";

	public final String META_FloatTest_simpleAttribute = "simpleAttribute";

	public final String META_FloatTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_FloatTest_setAttribute = "setAttribute";

	public final String META_FloatTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_FloatTest_bagAttribute = "bagAttribute";

	public final String META_FloatTest_sequenceAttribute = "sequenceAttribute";

	public final String META_IntegerTest = "TestMetaModel::PrimitiveTypesTests::IntegerTest";

	public final String META_IntegerTest_simpleAttribute = "simpleAttribute";

	public final String META_IntegerTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_IntegerTest_setAttribute = "setAttribute";

	public final String META_IntegerTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_IntegerTest_bagAttribute = "bagAttribute";

	public final String META_IntegerTest_sequenceAttribute = "sequenceAttribute";

	public final String META_LongTest = "TestMetaModel::PrimitiveTypesTests::LongTest";

	public final String META_LongTest_simpleAttribute = "simpleAttribute";

	public final String META_LongTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_LongTest_setAttribute = "setAttribute";

	public final String META_LongTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_LongTest_bagAttribute = "bagAttribute";

	public final String META_LongTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StringTest = "TestMetaModel::PrimitiveTypesTests::StringTest";

	public final String META_StringTest_simpleAttribute = "simpleAttribute";

	public final String META_StringTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StringTest_setAttribute = "setAttribute";

	public final String META_StringTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StringTest_bagAttribute = "bagAttribute";

	public final String META_StringTest_sequenceAttribute = "sequenceAttribute";

	public final String META_EnumerationTest = "TestMetaModel::DataTypeTests::EnumerationTest";

	public final String META_EnumerationTest_simpleAttribute = "simpleAttribute";

	public final String META_EnumerationTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_EnumerationTest_setAttribute = "setAttribute";

	public final String META_EnumerationTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_EnumerationTest_bagAttribute = "bagAttribute";

	public final String META_EnumerationTest_sequenceAttribute = "sequenceAttribute";

	// public final String META_EnumerationTestType="TestMetaModel::DataTypeTests::EnumerationTestType";
	public final String META_EnumerationTestType_Label1 = "TestMetaModel::DataTypeTests::EnumerationTestType::Label1";

	public final String META_EnumerationTestType_Label2 = "TestMetaModel::DataTypeTests::EnumerationTestType::Label2";

	public final String META_EnumerationTestType_Label3 = "TestMetaModel::DataTypeTests::EnumerationTestType::Label3";

	public final String META_EnumerationTestType_Label4 = "TestMetaModel::DataTypeTests::EnumerationTestType::Label4";

	public final String META_StaticBooleanTest = "TestMetaModel::PrimitiveTypesStaticTests::StaticBooleanTest";

	public final String META_StaticBooleanTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticBooleanTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticBooleanTest_setAttribute = "setAttribute";

	public final String META_StaticBooleanTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticBooleanTest_bagAttribute = "bagAttribute";

	public final String META_StaticBooleanTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StaticDoubleTest = "TestMetaModel::PrimitiveTypesStaticTests::StaticDoubleTest";

	public final String META_StaticDoubleTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticDoubleTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticDoubleTest_setAttribute = "setAttribute";

	public final String META_StaticDoubleTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticDoubleTest_bagAttribute = "bagAttribute";

	public final String META_StaticDoubleTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StaticFloatTest = "TestMetaModel::PrimitiveTypesStaticTests::FloatTest";

	public final String META_StaticFloatTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticFloatTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticFloatTest_setAttribute = "setAttribute";

	public final String META_StaticFloatTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticFloatTest_bagAttribute = "bagAttribute";

	public final String META_StaticFloatTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StaticIntegerTest = "TestMetaModel::PrimitiveTypesStaticTests::StaticIntegerTest";

	public final String META_StaticIntegerTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticIntegerTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticIntegerTest_setAttribute = "setAttribute";

	public final String META_StaticIntegerTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticIntegerTest_bagAttribute = "bagAttribute";

	public final String META_StaticIntegerTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StaticLongTest = "TestMetaModel::PrimitiveTypesStaticTests::StaticLongTest";

	public final String META_StaticLongTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticLongTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticLongTest_setAttribute = "setAttribute";

	public final String META_StaticLongTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticLongTest_bagAttribute = "bagAttribute";

	public final String META_StaticLongTest_sequenceAttribute = "sequenceAttribute";

	public final String META_StaticStringTest = "TestMetaModel::PrimitiveTypesStaticTests::StaticStringTest";

	public final String META_StaticStringTest_simpleAttribute = "simpleAttribute";

	public final String META_StaticStringTest_optionalSimpleAttribute = "optionalSimpleAttribute";

	public final String META_StaticStringTest_setAttribute = "setAttribute";

	public final String META_StaticStringTest_orderedSetAttribute = "orderedSetAttribute";

	public final String META_StaticStringTest_bagAttribute = "bagAttribute";

	public final String META_StaticStringTest_sequenceAttribute = "sequenceAttribute";

	public OCLTestAdapter adapter;

	protected void setUp() throws Exception {
		super.setUp();
		Class adapterClass = Class.forName(this.getProperty("adapter"));
		this.adapter = (OCLTestAdapter) adapterClass.getConstructor(new Class[0]).newInstance(new Object[0]);
		this.adapter.setUp(this.getProperties());
	}

	protected void tearDown() throws Exception {
		this.adapter.tearDown();
		this.adapter = null;
		super.tearDown();
	}

}
