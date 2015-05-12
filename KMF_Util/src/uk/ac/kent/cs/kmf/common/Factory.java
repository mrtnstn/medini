package uk.ac.kent.cs.kmf.common;

public abstract interface Factory
{
  public abstract Object build();

  public abstract Repository getRepository();

  public abstract void setRepository(Repository paramRepository);

  public abstract String toString();
}

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.common.Factory
 * JD-Core Version:    0.6.2
 */