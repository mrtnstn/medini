package uk.ac.kent.cs.kmf.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.kent.cs.kmf.util.ILog;
import uk.ac.kent.cs.kmf.util.OutputStreamLog;

@SuppressWarnings("rawtypes")
public class WarehouseImpl implements Warehouse {
	protected ILog log;
	Map repositories = new LinkedHashMap();

	public WarehouseImpl() {
		this.log = new OutputStreamLog(System.out);
	}

	public WarehouseImpl(ILog log) {
		this.log = log;
	}

	public ILog getLog() {
		return this.log;
	}

	public void setLog(ILog log) {
		this.log = log;
	}

	public void registerRepository(String modelName, Repository rep) {
		if (this.repositories.get(modelName) != null) {
			this.log.reportMessage("Repository for model '" + modelName
					+ "' was replaced");
		}
		this.repositories.put(modelName, rep);
	}

	public Repository getRepository(String modelName) {
		Repository rep = (Repository) this.repositories.get(modelName);
		if (rep == null) {
			this.log.reportMessage("Repository for model '" + modelName
					+ "' is not registered.");
		}
		return rep;
	}

	protected String getModelName(String fullClassName) {
		String result = "";
		int i = fullClassName.indexOf('.');
		if (i != -1)
			result = fullClassName.substring(0, i);
		return result;
	}

	public Object buildElement(String fullClassName) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			return rep.buildElement(fullClassName);

		this.log.reportError("Missing repository for model '" + modelName + "'");
		return null;
	}

	public void addElement(String fullClassName, Object elem) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			rep.addElement(fullClassName, elem);
		else
			this.log.reportError("Missing repository for model '" + modelName
					+ "'");
	}

	public void removeElement(String fullClassName, Object elem) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			rep.removeElement(fullClassName, elem);
		else
			this.log.reportError("Missing repository for model '" + modelName
					+ "'");
	}

	public List getElements(String fullClassName) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			return rep.getElements(fullClassName);

		this.log.reportError("Missing repository for model '" + modelName + "'");
		return null;
	}

	public void removeElements(String fullClassName) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			rep.removeElements(fullClassName);
		else
			this.log.reportError("Missing repository for model '" + modelName
					+ "'");
	}

	public List getInstances(String fullClassName) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			return rep.getInstances(fullClassName);

		this.log.reportError("Missing repository for model '" + modelName + "'");
		return null;
	}

	public void removeInstances(String fullClassName) {
		String modelName = getModelName(fullClassName);

		Repository rep = (Repository) this.repositories.get(modelName);

		if (rep != null)
			rep.removeInstances(fullClassName);
		else
			this.log.reportError("Missing repository for model '" + modelName
					+ "'");
	}

	public List getAllElements() {
		List res = new ArrayList();
		Set keys = this.repositories.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			Repository rep = (Repository) this.repositories.get(key);
			Collection pop = rep.getAllElements();
			res.addAll(pop);
		}
		return res;
	}

	public void removeAllElements() {
		Set keys = this.repositories.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			Repository rep = (Repository) this.repositories.get(key);
			rep.removeAllElements();
		}
	}

	public List getAll(String modelName) {
		Repository rep = (Repository) this.repositories.get(modelName);
		return rep.getAllElements();
	}

	public String toString() {
		String result = "";
		Set keys = this.repositories.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
			String key = (String) i.next();
			result = result + "Population for key '" + key + "'\n";
		}
		return result;
	}
}