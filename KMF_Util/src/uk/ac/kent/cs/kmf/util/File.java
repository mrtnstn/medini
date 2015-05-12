package uk.ac.kent.cs.kmf.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

public class File {
	java.io.File _file = null;

	public String getFileName() {
		return this._file.getAbsolutePath();
	}

	public void setFileName(String file_name) {
		setFileName(file_name, true);
	}

	public void setFileName(String file_name, boolean create) {
		String fname = null;
		try {
			fname = file_name;
			this._file = new java.io.File(fname);
			if (!this._file.exists())
				if (create) {
					java.io.File dir = this._file.getParentFile();
					if ((dir != null) && (!dir.exists())) {
						dir.mkdirs();
					}
					this._file.createNewFile();
				} else {
					System.err.println("File does not exist - " + file_name);
				}
		} catch (Exception e) {
			throw new RuntimeException("Cannot create file '" + fname + "'\n"
					+ e);
		}
		if (!this._file.isFile())
			throw new RuntimeException("Path '" + fname + "' is not a file!");
	}

	public File() {
	}

	public File(String file_name) {
		setFileName(file_name);
	}

	public File(String file_name, boolean create) {
		setFileName(file_name, create);
	}

	public String getDirName() {
		return this._file.getAbsoluteFile().getParent();
	}

	public String read() {
		FileReader fr = null;
		try {
			fr = new FileReader(this._file);
		} catch (Exception e) {
			return "Cannot find file '" + this._file.getPath() + "'." + e;
		}
		StringWriter str = new StringWriter();
		copy(fr, str);
		return str.toString();
	}

	public String write(String content) {
		String result = this._file.toString() + "\n";
		String str = content;
		FileWriter fileW = null;
		try {
			fileW = new FileWriter(this._file);
			PrintWriter printW = new PrintWriter(fileW);
			printW.print(str);
			fileW.close();
		} catch (Exception e) {
			result = result + "Cannot write to file '" + this._file.getPath()
					+ "'" + e;
		}
		return result;
	}

	void copy(Reader r, Writer w) {
		try {
			int c;
			while ((c = r.read()) != -1) {
				// int c;
				w.write(c);
			}
			r.close();
			w.close();
		} catch (Exception e) {
			throw new RuntimeException("Cannot copy " + e);
		}
	}

	public String toString() {
		return "File {'" + this._file.getPath() + "'}";
	}

	public boolean equals(Object f) {
		if (!(f instanceof File))
			return false;
		return this._file == ((File) f)._file;
	}

	public int hashCode() {
		return this._file.hashCode();
	}

	public Object clone() {
		return new File(this._file.getPath());
	}
}