package uk.ac.kent.cs.kmf.common;

import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import uk.ac.kent.cs.kmf.util.ILog;

public abstract interface Repository
{
  public abstract String getModelName();

  public abstract Object buildElement(String paramString);

  public abstract void addElement(String paramString, Object paramObject);

  public abstract void removeElement(String paramString, Object paramObject);

  public abstract List getElements(String paramString);

  public abstract void removeElements(String paramString);

  public abstract List getInstances(String paramString);

  public abstract void removeInstances(String paramString);

  public abstract List getAllElements();

  public abstract void removeAllElements();

  public abstract void saveXMI(String paramString);

  public abstract Repository loadXMI(String paramString);

  public abstract ILog getLog();

  public abstract void setLog(ILog paramILog);

  public abstract DefaultMutableTreeNode toJTree();
}

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.common.Repository
 * JD-Core Version:    0.6.2
 */