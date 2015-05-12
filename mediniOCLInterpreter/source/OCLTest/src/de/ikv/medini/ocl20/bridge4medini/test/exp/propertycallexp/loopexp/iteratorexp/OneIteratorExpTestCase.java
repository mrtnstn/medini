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

public class OneIteratorExpTestCase extends OclInterpreterTestCase {

	// TODO implement !!

	public void testOneIteratorWithoutType() throws Exception {
		List result = this.adapter.evaluate("Bag { 1 , 2 , 3}->one( x | x = 3 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(true, ((Boolean) result.get(0)).booleanValue());

		result = this.adapter.evaluate("Bag { 1 , 2 , 3, 3 }->one( x | x = 3  ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(false, ((Boolean) result.get(0)).booleanValue());

	}

	public void testOneIteratorWithType() throws Exception {
		List result = this.adapter.evaluate("Bag { 1 , 2 , 3}->one( x : Integer | x = 3 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(true, ((Boolean) result.get(0)).booleanValue());

		result = this.adapter.evaluate("Bag {  1 , 2 , 3, 3 }->one( x : Integer | x = 3 ) ");
		Assert.assertEquals(result.size(), 1);
		Assert.assertEquals(false, ((Boolean) result.get(0)).booleanValue());

	}
}