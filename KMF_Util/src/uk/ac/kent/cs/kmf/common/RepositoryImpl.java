package uk.ac.kent.cs.kmf.common;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.tree.DefaultMutableTreeNode;

import uk.ac.kent.cs.kmf.util.ILog;

@SuppressWarnings("rawtypes")
public abstract class RepositoryImpl implements Repository {
	protected Map factories = new Hashtable();

	protected Map population = new HashMap();
	protected ILog log;
	protected String modelName;

	public Object buildElement(String fullClassName) {
		Object instance = null;
		try {
			Class cls = Class.forName(fullClassName);
			Constructor constr = cls.getConstructor(new Class[0]);
			instance = constr.newInstance(new Object[0]);

			List elements = (List) this.population.get(fullClassName);
			if (elements == null)
				elements = new Vector();
			elements.add(instance);
			this.population.put(fullClassName, elements);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

	public void addElement(String fullClassName, Object elem) {
		List elements = (List) this.population.get(fullClassName);
		if (elements == null)
			elements = new Vector();
		elements.add(elem);
		this.population.put(fullClassName, elements);
	}

	public void removeElement(String fullClassName, Object elem) {
		List elements = (List) this.population.get(fullClassName);
		if (elements == null)
			elements = new Vector();
		elements.remove(elem);
		this.population.put(fullClassName, elements);
	}

	public List getElements(String fullClassName) {
		return (List) this.population.get(fullClassName);
	}

	public void removeElements(String fullClassName) {
		((List) this.population.get(fullClassName)).retainAll(new ArrayList());
	}

	protected boolean isInstanceOf(String elemName, String fullClassName) {
		boolean res = false;
		try {
			res = Class.forName(fullClassName).isAssignableFrom(
					Class.forName(elemName));
		} catch (Exception localException) {
		}
		return res;
	}

	public List getInstances(String fullClassName) {
		List objs = new Vector();
		Set elemNames = this.population.keySet();
		Iterator nameIt = elemNames.iterator();
		while (nameIt.hasNext()) {
			String elemName = (String) nameIt.next();
			if (isInstanceOf(elemName, fullClassName)) {
				List elements = (List) this.population.get(elemName);
				Iterator elemIt = elements.iterator();
				while (elemIt.hasNext()) {
					Object elem = elemIt.next();
					objs.add(elem);
				}
			}
		}
		return objs;
	}

	public void removeInstances(String fullClassName) {
		List objs = new Vector();
		Set elemNames = this.population.keySet();
		Iterator nameIt = elemNames.iterator();
		while (nameIt.hasNext()) {
			String elemName = (String) nameIt.next();
			if (isInstanceOf(elemName, fullClassName))
				((List) this.population.get(elemName))
						.retainAll(new ArrayList());
		}
	}

	public List getAllElements() {
		List res = new ArrayList();
		Iterator i = this.population.keySet().iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			res.addAll((Collection) this.population.get(key));
		}
		return res;
	}

	public void removeAllElements() {
		List res = new ArrayList();
		Iterator i = this.population.keySet().iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			((Collection) this.population.get(key)).retainAll(new ArrayList());
		}
	}

	public ILog getLog() {
		return this.log;
	}

	public void setLog(ILog log) {
		this.log = log;
	}

	public String getModelName() {
		return this.modelName;
	}

	public abstract void saveXMI(String paramString);

	public abstract Repository loadXMI(String paramString);

	public abstract DefaultMutableTreeNode toJTree();
}