package uk.ac.kent.cs.kmf.util;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileLog implements ILog {
	protected String fileName;
	protected File file;
	protected PrintWriter log;
	protected int warNo = 0;
	protected int errNo = 0;

	protected int warUpperBound = 800;
	protected int errUpperBound = 800;

	public FileLog(String fileName) {
		this.fileName = fileName;
		reset();
	}

	public void reset() {
		if (this.file != null)
			this.file.delete();
		this.file = new File(this.fileName);
		try {
			this.log = new PrintWriter(new FileWriter(this.file), true);
		} catch (Exception localException) {
		}
		this.warNo = 0;
		this.errNo = 0;
	}

	public void resetViolations() {
		this.warNo = 0;
		this.errNo = 0;
	}

	public void resetWarnings() {
		this.warNo = 0;
	}

	public void resetErrors() {
		this.errNo = 0;
	}

	public boolean tooManyViolations() {
		return (this.errNo > this.errUpperBound)
				|| (this.warNo > this.warUpperBound);
	}

	public boolean hasViolations() {
		return (this.errNo != 0) || (this.warNo != 0);
	}

	public boolean hasErrors() {
		return this.errNo != 0;
	}

	public boolean hasWarnings() {
		return this.warNo != 0;
	}

	public int getWarnings() {
		return this.warNo;
	}

	public int getErrors() {
		return this.errNo;
	}

	public void reportMessage(String message) {
		if ((this.errNo <= this.errUpperBound)
				&& (this.warNo <= this.warUpperBound))
			this.log.println(message);
	}

	public void printMessage(String message) {
		if ((this.errNo <= this.errUpperBound)
				&& (this.warNo <= this.warUpperBound))
			this.log.print(message);
	}

	public void reportWarning(String message) {
		this.warNo += 1;
		if (this.warNo <= this.warUpperBound)
			this.log.println("Warning: " + message);
	}

	public void reportWarning(String message, Exception e) {
		this.warNo += 1;
		if (this.warNo <= this.warUpperBound) {
			this.log.println("Warning: " + message);
			if (e != null)
				e.printStackTrace(this.log);
		}
	}

	public void reportError(String message, Exception e) {
		this.errNo += 1;
		if (this.errNo <= this.errUpperBound) {
			this.log.println("Error: " + message);
			if (e != null)
				e.printStackTrace(this.log);
		}
	}

	public void reportError(String message) {
		this.errNo += 1;
		if (this.errNo <= this.errUpperBound)
			this.log.println("Error: " + message);
	}

	public void finalReport() {
		this.log.flush();
		if ((this.errNo <= this.errUpperBound)
				&& (this.warNo <= this.warUpperBound)) {
			this.log.print("Finished - " + this.errNo + " errors " + this.warNo
					+ " warnings");
		} else {
			if (this.errNo > this.errUpperBound) {
				this.log.print("Finished - Too many errors.");
			}
			if (this.warNo > this.warUpperBound)
				this.log.print("Finished - Too many warnings.");
		}
	}

	public void setWarUpperBound(int bound) {
		this.warUpperBound = bound;
	}

	public void setErrUpperBound(int bound) {
		this.errUpperBound = bound;
	}

	public void close() {
		this.log.close();
	}
}