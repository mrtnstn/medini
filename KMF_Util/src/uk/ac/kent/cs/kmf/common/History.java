package uk.ac.kent.cs.kmf.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Vector;

public class History {
	Vector objList = new Vector();

	final String fileName = "History.txt";

	final int max = 5;
	Iterator iter;

	public boolean isEmpty() {
		return this.objList.size() == 0;
	}

	public void load() {
		File file = new File("History.txt");
		if (file.exists())
			try {
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line;
				while ((line = in.readLine()) != null) {
					//String line;
					this.objList.add(line);
				}
			} catch (Exception localException) {
			}
	}

	public void save() {
		try {
			File file = new File("History.txt");

			PrintWriter out = new PrintWriter(new FileWriter(file));
			for (int i = 0; i < this.objList.size(); i++)
				out.println((String) this.objList.get(i));
			out.close();
		} catch (Exception localException) {
		}
	}

	public Object elementAt(int i) {
		return this.objList.elementAt(i);
	}

	public void add(Object obj) {
		if (this.objList.contains(obj))
			return;
		if (this.objList.size() == 5)
			this.objList.remove(4);
		this.objList.insertElementAt(obj, 0);
	}

	public Iterator iterator() {
		this.iter = this.objList.iterator();
		return this.iter;
	}

	public boolean hasNext() {
		return this.iter.hasNext();
	}

	public Object next() {
		return this.iter.next();
	}
}