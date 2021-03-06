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

package de.ikv.medini.ocl20.bridge4medini.test.exp.propertycallexp.loopexp.iteratorexp;

import java.util.List;

import junit.framework.Assert;

import de.ikv.medini.ocl20.bridge4medini.test.OclInterpreterTestCase;

public class ForAllIteratorExpTestCase extends OclInterpreterTestCase {

	public void testForAllIteratorWithoutType() throws Exception {
		List result = this.adapter.evaluate("Set { 1 , 2 , 3}->forAll( x | x <> 4 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(true, ((Boolean) result.get(0)).booleanValue());

		result = this.adapter.evaluate("Set { 1 , 2 , 3}->forAll( x | x <> 3  ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(false, ((Boolean) result.get(0)).booleanValue());

	}

	public void testForAllIteratorWithType() throws Exception {
		List result = this.adapter.evaluate("Set { 1 , 2 , 3}->forAll( x : Integer | x <> 4 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(true, ((Boolean) result.get(0)).booleanValue());

		result = this.adapter.evaluate("Set { 1 , 2 , 3}->forAll( x : Integer | x <> 3 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(false, ((Boolean) result.get(0)).booleanValue());

	}

}
