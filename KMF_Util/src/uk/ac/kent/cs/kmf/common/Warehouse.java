package uk.ac.kent.cs.kmf.common;

import java.util.List;
import uk.ac.kent.cs.kmf.util.ILog;

public abstract interface Warehouse
{
  public abstract Object buildElement(String paramString);

  public abstract void addElement(String paramString, Object paramObject);

  public abstract void removeElement(String paramString, Object paramObject);

  public abstract List getElements(String paramString);

  public abstract void removeElements(String paramString);

  public abstract List getInstances(String paramString);

  public abstract void removeInstances(String paramString);

  public abstract List getAllElements();

  public abstract void removeAllElements();

  public abstract ILog getLog();

  public abstract void setLog(ILog paramILog);

  public abstract void registerRepository(String paramString, Repository paramRepository);

  public abstract Repository getRepository(String paramString);

  public abstract List getAll(String paramString);
}

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.common.Warehouse
 * JD-Core Version:    0.6.2
 */