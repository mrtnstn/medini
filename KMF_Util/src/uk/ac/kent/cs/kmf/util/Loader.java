package uk.ac.kent.cs.kmf.util;

public abstract interface Loader
{
  public abstract Pair loadXMI(String paramString, ILog paramILog);

  public abstract Pair loadModel(String paramString, ILog paramILog);
}

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.Loader
 * JD-Core Version:    0.6.2
 */