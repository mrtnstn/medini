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

package de.ikv.medini.qvt.execution.debug.events;

import de.ikv.medini.qvt.execution.debug.QVTSourcePosition;
import de.ikv.medini.qvt.execution.debug.stackframe.QVTDebugStackFrame;

/**
 * A reason class for execution suspension
 * 
 * @author kiegeland
 * 
 */
public class QVTDebugEventSuspendedBreakpointCause extends QVTDebugEventSuspendedCause {

	private QVTDebugStackFrame stackFrame;

	private QVTSourcePosition sourcePosition;

	public String toString() {
		return "breakpoint " + this.sourcePosition.getLine();
	}

	public QVTDebugEventSuspendedBreakpointCause(QVTDebugStackFrame stackFrame) {
		this.stackFrame = stackFrame;
		this.sourcePosition = stackFrame.getSourcePosition();
	}

	public QVTDebugEventSuspendedBreakpointCause(QVTSourcePosition sourcePosition) {
		this.sourcePosition = sourcePosition;
	}

	/**
	 * Returns the stack frame which was current when the breakpoint was hit
	 * 
	 * @return the stack frame or <code>null</code> if no stack frame was provided
	 */
	public QVTDebugStackFrame getStackFrame() {
		return this.stackFrame;
	}

	/**
	 * Hash code based on {@link #sourcePosition}
	 * 
	 * Generated by Eclipse
	 */
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (this.sourcePosition == null ? 0 : this.sourcePosition.hashCode());
		return result;
	}

	/**
	 * Equality based on {@link #sourcePosition}
	 * 
	 * Generated by Eclipse
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
		final QVTDebugEventSuspendedBreakpointCause other = (QVTDebugEventSuspendedBreakpointCause) obj;
		if (this.sourcePosition == null) {
			if (other.sourcePosition != null) {
				return false;
			}
		} else if (!this.sourcePosition.equals(other.sourcePosition)) {
			return false;
		}
		return true;
	}

	public QVTSourcePosition getSourcePosition() {
		return this.sourcePosition;
	}

}
