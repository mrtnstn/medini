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

package de.ikv.medini.qvt.execution.debug;

/**
 * Identifies a source line of a QVT script
 * 
 * @author kiegeland
 * 
 */
public class QVTSourcePosition {

	/**
	 * Path of the QVT script
	 */
	private String path;

	/**
	 * Line number (beginning from 1)
	 */
	private int line;

	public QVTSourcePosition(String path, int line) {
		this.path = path;
		this.line = line;
	}

	/**
	 * Hash code based on {@link #path} and {@link #line}.
	 * 
	 * Generated by Eclipse
	 */
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + this.line;
		result = PRIME * result + (this.path == null ? 0 : this.path.hashCode());
		return result;
	}

	/**
	 * Equality based on {@link #path} and {@link #line}.
	 * 
	 * Generated by Eclipse on above attributes
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final QVTSourcePosition other = (QVTSourcePosition) obj;
		if (this.line != other.line) {
			return false;
		}
		if (this.path == null) {
			if (other.path != null) {
				return false;
			}
		} else if (!this.path.equals(other.path)) {
			return false;
		}
		return true;
	}

	public int getLine() {
		return this.line;
	}

	public String getFile() {
		return this.path;
	}

}