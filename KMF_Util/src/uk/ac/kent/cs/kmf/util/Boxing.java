package uk.ac.kent.cs.kmf.util;

public class Boxing {
	public static Object box(boolean b) {
		return new Boolean(b);
	}
}