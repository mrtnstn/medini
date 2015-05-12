package uk.ac.kent.cs.kmf.util.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressWarnings("rawtypes")
public final class BetterMethodFinder {
	private final Class clazz;
	
	private final Map methodMap = new HashMap();

	private final List ctorList = new ArrayList();

	private final Map paramMap = new HashMap();

	public BetterMethodFinder(Class clazz) {
		if (clazz == null) {
			throw new IllegalArgumentException("null Class parameter");
		}

		if (clazz.isPrimitive()) {
			throw new IllegalArgumentException("primitive Class parameter");
		}

		if (clazz.isArray()) {
			throw new IllegalArgumentException("array Class parameter");
		}

		this.clazz = clazz;

		loadMethods();
		loadConstructors();
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if ((o == null) || (getClass() != o.getClass())) {
			return false;
		}
		BetterMethodFinder other = (BetterMethodFinder) o;
		return this.clazz.equals(other.clazz);
	}

	public Constructor findConstructor(Class[] parameterTypes)
			throws NoSuchMethodException {
		if (parameterTypes == null) {
			parameterTypes = new Class[0];
		}
		return (Constructor) findMemberIn(this.ctorList, parameterTypes);
	}

	private Member findMemberIn(List memberList, Class[] parameterTypes)
			throws NoSuchMethodException {
		List matchingMembers = new ArrayList();

		for (Iterator it = memberList.iterator(); it.hasNext();) {
			Member member = (Member) it.next();
			Class[] methodParamTypes = (Class[]) this.paramMap.get(member);

			if (Arrays.equals(methodParamTypes, parameterTypes)) {
				return member;
			}
			if (ClassUtilities.compatibleClasses(methodParamTypes,
					parameterTypes)) {
				matchingMembers.add(member);
			}
		}
		if (matchingMembers.isEmpty()) {
			throw new NoSuchMethodException("no member in "
					+ this.clazz.getName() + " matching given args");
		}
		if (matchingMembers.size() == 1) {
			return (Member) matchingMembers.get(0);
		}
		return findMostSpecificMemberIn(matchingMembers);
	}

	public Method findMethod(String methodName, Class[] parameterTypes)
			throws NoSuchMethodException {
		List methodList = (List) this.methodMap.get(methodName);

		if (methodList == null) {
			throw new NoSuchMethodException("no method named "
					+ this.clazz.getName() + "." + methodName);
		}
		if (parameterTypes == null) {
			parameterTypes = new Class[0];
		}
		return (Method) findMemberIn(methodList, parameterTypes);
	}

	private Member findMostSpecificMemberIn(List memberList)
			throws NoSuchMethodException {
		List mostSpecificMembers = new ArrayList();

		for (Iterator memberIt = memberList.iterator(); memberIt.hasNext();) {
			Member member = (Member) memberIt.next();

			if (mostSpecificMembers.isEmpty()) {
				mostSpecificMembers.add(member);
			} else {
				boolean moreSpecific = true;
				boolean lessSpecific = false;

				for (Iterator specificIt = mostSpecificMembers.iterator(); specificIt
						.hasNext();) {
					Member moreSpecificMember = (Member) specificIt.next();

					if (!memberIsMoreSpecific(member, moreSpecificMember)) {
						moreSpecific = false;
						lessSpecific = memberIsMoreSpecific(moreSpecificMember,
								member);
						break;
					}
				}

				if (moreSpecific) {
					mostSpecificMembers.clear();
					mostSpecificMembers.add(member);
				} else if (!lessSpecific) {
					mostSpecificMembers.add(member);
				}
			}
		}

		if (mostSpecificMembers.size() > 1) {
			throw new NoSuchMethodException("Ambiguous request for member in "
					+ this.clazz.getName() + " matching given args");
		}

		return (Member) mostSpecificMembers.get(0);
	}

	public static Class[] getParameterTypesFrom(Object[] args) {
		Class[] argTypes = (Class[]) null;

		if (args != null) {
			argTypes = new Class[args.length];

			for (int i = 0; i < args.length; i++)
				argTypes[i] = (args[i] == null ? Void.TYPE : args[i].getClass());
		} else {
			argTypes = new Class[0];
		}
		return argTypes;
	}

	public static Class[] getParameterTypesFrom(String[] classNames)
			throws ClassNotFoundException {
		return getParameterTypesFrom(classNames,
				BetterMethodFinder.class.getClassLoader());
	}

	public static Class[] getParameterTypesFrom(String[] classNames,
			ClassLoader loader) throws ClassNotFoundException {
		Class[] types = (Class[]) null;

		if (classNames != null) {
			types = new Class[classNames.length];

			for (int i = 0; i < classNames.length; i++)
				types[i] = ClassUtilities.classForNameOrPrimitive(
						classNames[i], loader);
		} else {
			types = new Class[0];
		}
		return types;
	}

	public int hashCode() {
		return this.clazz.hashCode();
	}

	private void loadConstructors() {
		Constructor[] ctors = this.clazz.getConstructors();

		for (int i = 0; i < ctors.length; i++) {
			this.ctorList.add(ctors[i]);
			this.paramMap.put(ctors[i], ctors[i].getParameterTypes());
		}
	}

	private void loadMethods() {
		Method[] methods = this.clazz.getMethods();

		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			String methodName = m.getName();
			Class[] paramTypes = m.getParameterTypes();

			List list = (List) this.methodMap.get(methodName);

			if (list == null) {
				list = new ArrayList();
				this.methodMap.put(methodName, list);
			}

			if (!ClassUtilities.classIsAccessible(this.clazz)) {
				m = ClassUtilities.getAccessibleMethodFrom(this.clazz,
						methodName, paramTypes);
			}
			if (m != null) {
				list.add(m);
				this.paramMap.put(m, paramTypes);
			}
		}
	}

	private boolean memberIsMoreSpecific(Member first, Member second) {
		Class[] firstParamTypes = (Class[]) this.paramMap.get(first);
		Class[] secondParamTypes = (Class[]) this.paramMap.get(second);

		return ClassUtilities.compatibleClasses(secondParamTypes,
				firstParamTypes);
	}
}