package uk.ac.kent.cs.kmf.util.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("rawtypes")
final class ClassUtilities {
	private static final Map objectToPrimitiveMap = new HashMap(13);
	private static final Map primitiveWideningsMap;

	static {
		objectToPrimitiveMap.put(Boolean.class, Boolean.TYPE);
		objectToPrimitiveMap.put(Byte.class, Byte.TYPE);
		objectToPrimitiveMap.put(Character.class, Character.TYPE);
		objectToPrimitiveMap.put(Double.class, Double.TYPE);
		objectToPrimitiveMap.put(Float.class, Float.TYPE);
		objectToPrimitiveMap.put(Integer.class, Integer.TYPE);
		objectToPrimitiveMap.put(Long.class, Long.TYPE);
		objectToPrimitiveMap.put(Short.class, Short.TYPE);

		primitiveWideningsMap = new HashMap(11);

		Set set = new HashSet();

		set.add(Short.TYPE);
		set.add(Integer.TYPE);
		set.add(Long.TYPE);
		set.add(Float.TYPE);
		set.add(Double.TYPE);
		primitiveWideningsMap.put(Byte.TYPE, set);

		set = new HashSet();

		set.add(Integer.TYPE);
		set.add(Long.TYPE);
		set.add(Float.TYPE);
		set.add(Double.TYPE);
		primitiveWideningsMap.put(Short.TYPE, set);
		primitiveWideningsMap.put(Character.TYPE, set);

		set = new HashSet();

		set.add(Long.TYPE);
		set.add(Float.TYPE);
		set.add(Double.TYPE);
		primitiveWideningsMap.put(Integer.TYPE, set);

		set = new HashSet();

		set.add(Float.TYPE);
		set.add(Double.TYPE);
		primitiveWideningsMap.put(Long.TYPE, set);

		set = new HashSet();

		set.add(Double.TYPE);
		primitiveWideningsMap.put(Float.TYPE, set);
	}

	static Class classForNameOrPrimitive(String name, ClassLoader loader)
			throws ClassNotFoundException {
		if ((name == null) || (name.equals("")) || (name.equals("null"))
				|| (name.equals("void"))) {
			return Void.TYPE;
		}
		if (name.equals("boolean")) {
			return Boolean.TYPE;
		}
		if (name.equals("byte")) {
			return Byte.TYPE;
		}
		if (name.equals("char")) {
			return Character.TYPE;
		}
		if (name.equals("double")) {
			return Double.TYPE;
		}
		if (name.equals("float")) {
			return Float.TYPE;
		}
		if (name.equals("int")) {
			return Integer.TYPE;
		}
		if (name.equals("long")) {
			return Long.TYPE;
		}
		if (name.equals("short")) {
			return Short.TYPE;
		}
		return Class.forName(name, false, loader);
	}

	static boolean classIsAccessible(Class aClass) {
		return Modifier.isPublic(aClass.getModifiers());
	}

	static boolean compatibleClasses(Class[] lhs, Class[] rhs) {
		if (lhs.length != rhs.length) {
			return false;
		}
		for (int i = 0; i < lhs.length; i++) {
			if ((rhs[i] == null) || (rhs[i].equals(Void.TYPE))) {
				if (lhs[i].isPrimitive()) {
					return false;
				}

			} else if (!lhs[i].isAssignableFrom(rhs[i])) {
				Class lhsPrimEquiv = primitiveEquivalentOf(lhs[i]);
				Class rhsPrimEquiv = primitiveEquivalentOf(rhs[i]);

				if (!primitiveIsAssignableFrom(lhsPrimEquiv, rhsPrimEquiv)) {
					return false;
				}
			}
		}
		return true;
	}

	static Method getAccessibleMethodFrom(Class aClass, String methodName,
			Class[] parameterTypes) {
		Class superclass = aClass.getSuperclass();
		Method overriddenMethod = null;

		if ((superclass != null) && (classIsAccessible(superclass))) {
			try {
				overriddenMethod = superclass.getMethod(methodName,
						parameterTypes);
			} catch (NoSuchMethodException localNoSuchMethodException) {
			}
			if (overriddenMethod != null) {
				return overriddenMethod;
			}

		}

		Class[] interfaces = aClass.getInterfaces();

		for (int i = 0; i < interfaces.length; i++) {
			overriddenMethod = null;

			if (classIsAccessible(interfaces[i])) {
				try {
					overriddenMethod = interfaces[i].getMethod(methodName,
							parameterTypes);
				} catch (NoSuchMethodException localNoSuchMethodException1) {
				}
				if (overriddenMethod != null) {
					return overriddenMethod;
				}
			}
		}
		overriddenMethod = null;

		if (superclass != null) {
			overriddenMethod = getAccessibleMethodFrom(superclass, methodName,
					parameterTypes);

			if (overriddenMethod != null) {
				return overriddenMethod;
			}
		}

		for (int i = 0; i < interfaces.length; i++) {
			overriddenMethod = getAccessibleMethodFrom(interfaces[i],
					methodName, parameterTypes);

			if (overriddenMethod != null) {
				return overriddenMethod;
			}
		}

		return null;
	}

	static Class primitiveEquivalentOf(Class aClass) {
		return aClass.isPrimitive() ? aClass : (Class) objectToPrimitiveMap
				.get(aClass);
	}

	static boolean primitiveIsAssignableFrom(Class lhs, Class rhs) {
		if ((lhs == null) || (rhs == null)) {
			return false;
		}
		if ((!lhs.isPrimitive()) || (!rhs.isPrimitive())) {
			return false;
		}
		if (lhs.equals(rhs)) {
			return true;
		}
		Set wideningSet = (Set) primitiveWideningsMap.get(rhs);

		if (wideningSet == null) {
			return false;
		}
		return wideningSet.contains(lhs);
	}
}