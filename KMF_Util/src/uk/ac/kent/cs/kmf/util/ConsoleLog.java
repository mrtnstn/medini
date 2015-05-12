/*     */ package uk.ac.kent.cs.kmf.util;
/*     */ 
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public class ConsoleLog extends JTextArea
/*     */   implements ILog
/*     */ {
/* 129 */   protected int warNo = 0;
/* 130 */   protected int errNo = 0;
/*     */ 
/* 132 */   protected int warUpperBound = 800;
/* 133 */   protected int errUpperBound = 800;
/*     */ 
/*     */   public void reset()
/*     */   {
/*  20 */     setText("");
/*  21 */     this.warNo = 0;
/*  22 */     this.errNo = 0;
/*  23 */     resetViolations();
/*     */   }
/*     */ 
/*     */   public void resetViolations()
/*     */   {
/*  28 */     this.warNo = 0;
/*  29 */     this.errNo = 0;
/*     */   }
/*     */ 
/*     */   public void resetWarnings() {
/*  33 */     this.warNo = 0;
/*     */   }
/*     */ 
/*     */   public void resetErrors() {
/*  37 */     this.errNo = 0;
/*     */   }
/*     */ 
/*     */   public boolean tooManyViolations() {
/*  41 */     return (this.errNo > this.errUpperBound) || (this.warNo > this.warUpperBound);
/*     */   }
/*     */ 
/*     */   public boolean hasViolations() {
/*  45 */     return (this.errNo != 0) || (this.warNo != 0);
/*     */   }
/*     */ 
/*     */   public boolean hasErrors() {
/*  49 */     return this.errNo != 0;
/*     */   }
/*     */ 
/*     */   public boolean hasWarnings() {
/*  53 */     return this.warNo != 0;
/*     */   }
/*     */ 
/*     */   public int getWarnings() {
/*  57 */     return this.warNo;
/*     */   }
/*     */ 
/*     */   public int getErrors() {
/*  61 */     return this.errNo;
/*     */   }
/*     */ 
/*     */   public void reportMessage(String message)
/*     */   {
/*  66 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound))
/*  67 */       append(message + "\n");
/*     */   }
/*     */ 
/*     */   public void printMessage(String message) {
/*  71 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound))
/*  72 */       append(message);
/*     */   }
/*     */ 
/*     */   public void reportWarning(String message) {
/*  76 */     this.warNo += 1;
/*  77 */     if (this.warNo <= this.warUpperBound)
/*  78 */       append("Warning: " + message + "\n");
/*     */   }
/*     */ 
/*     */   public void reportWarning(String message, Exception e) {
/*  82 */     this.warNo += 1;
/*  83 */     if (this.warNo <= this.warUpperBound) {
/*  84 */       append("Warning: " + message);
/*  85 */       if (e != null) append(e.toString() + "\n"); 
/*     */     }
/*     */   }
/*     */ 
/*  89 */   public void reportError(String message) { this.errNo += 1;
/*  90 */     if (this.errNo <= this.errUpperBound)
/*  91 */       append("Error: " + message + "\n"); }
/*     */ 
/*     */   public void reportError(String message, Exception e)
/*     */   {
/*  95 */     this.errNo += 1;
/*  96 */     if (this.errNo <= this.errUpperBound) {
/*  97 */       append("Error: " + message);
/*  98 */       if (e != null) append(e.toString() + "\n");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void finalReport()
/*     */   {
/* 104 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound)) {
/* 105 */       append("Finished - " + this.errNo + " errors " + this.warNo + " warnings" + "\n");
/*     */     } else {
/* 107 */       if (this.errNo > this.errUpperBound) {
/* 108 */         append("Finished - Too many errors.\n");
/*     */       }
/* 110 */       if (this.warNo > this.warUpperBound)
/* 111 */         append("Finished - Too many warnings.\n");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setWarUpperBound(int bound)
/*     */   {
/* 118 */     this.warUpperBound = bound;
/*     */   }
/*     */   public void setErrUpperBound(int bound) {
/* 121 */     this.errUpperBound = bound;
/*     */   }
/*     */ 
/*     */   public void close()
/*     */   {
/*     */   }
/*     */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.ConsoleLog
 * JD-Core Version:    0.6.2
 */