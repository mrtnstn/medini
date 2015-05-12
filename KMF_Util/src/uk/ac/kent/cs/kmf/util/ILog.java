package uk.ac.kent.cs.kmf.util;

public abstract interface ILog
{
  public abstract void reset();

  public abstract void resetViolations();

  public abstract void resetWarnings();

  public abstract void resetErrors();

  public abstract boolean tooManyViolations();

  public abstract boolean hasViolations();

  public abstract boolean hasWarnings();

  public abstract boolean hasErrors();

  public abstract int getWarnings();

  public abstract int getErrors();

  public abstract void reportMessage(String paramString);

  public abstract void printMessage(String paramString);

  public abstract void reportWarning(String paramString);

  public abstract void reportWarning(String paramString, Exception paramException);

  public abstract void reportError(String paramString);

  public abstract void reportError(String paramString, Exception paramException);

  public abstract void finalReport();

  public abstract void close();
}

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.ILog
 * JD-Core Version:    0.6.2
 */