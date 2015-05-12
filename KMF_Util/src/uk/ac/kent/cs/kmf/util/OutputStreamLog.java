/*     */ package uk.ac.kent.cs.kmf.util;
/*     */ 
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ public class OutputStreamLog
/*     */   implements ILog
/*     */ {
/*     */   protected OutputStream stream;
/*     */   protected PrintWriter log;
/* 136 */   protected int warNo = 0;
/* 137 */   protected int errNo = 0;
/*     */ 
/* 139 */   protected int warUpperBound = 800;
/* 140 */   protected int errUpperBound = 800;
/*     */ 
/*     */   public OutputStreamLog(OutputStream str)
/*     */   {
/*  16 */     this.stream = str;
/*  17 */     reset();
/*     */   }
/*     */ 
/*     */   public void reset()
/*     */   {
/*     */     try {
/*  23 */       this.log = new PrintWriter(this.stream, true);
/*     */     } catch (Exception localException) {
/*     */     }
/*  26 */     this.warNo = 0;
/*  27 */     this.errNo = 0;
/*     */   }
/*     */ 
/*     */   public void resetViolations() {
/*  31 */     this.warNo = 0;
/*  32 */     this.errNo = 0;
/*     */   }
/*     */ 
/*     */   public void resetWarnings() {
/*  36 */     this.warNo = 0;
/*     */   }
/*     */ 
/*     */   public void resetErrors() {
/*  40 */     this.errNo = 0;
/*     */   }
/*     */ 
/*     */   public boolean tooManyViolations() {
/*  44 */     return (this.errNo > this.errUpperBound) || (this.warNo > this.warUpperBound);
/*     */   }
/*     */ 
/*     */   public boolean hasViolations() {
/*  48 */     return (this.errNo != 0) || (this.warNo != 0);
/*     */   }
/*     */ 
/*     */   public boolean hasErrors() {
/*  52 */     return this.errNo != 0;
/*     */   }
/*     */ 
/*     */   public boolean hasWarnings() {
/*  56 */     return this.warNo != 0;
/*     */   }
/*     */ 
/*     */   public int getWarnings() {
/*  60 */     return this.warNo;
/*     */   }
/*     */ 
/*     */   public int getErrors() {
/*  64 */     return this.errNo;
/*     */   }
/*     */ 
/*     */   public void reportMessage(String message)
/*     */   {
/*  69 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound))
/*  70 */       this.log.println(message);
/*     */   }
/*     */ 
/*     */   public void printMessage(String message) {
/*  74 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound))
/*  75 */       this.log.print(message);
/*     */   }
/*     */ 
/*     */   public void reportWarning(String message) {
/*  79 */     this.warNo += 1;
/*  80 */     if (this.warNo <= this.warUpperBound)
/*  81 */       this.log.println("Warning: " + message);
/*     */   }
/*     */ 
/*     */   public void reportWarning(String message, Exception e) {
/*  85 */     this.warNo += 1;
/*  86 */     if (this.warNo <= this.warUpperBound) {
/*  87 */       this.log.println("Warning: " + message);
/*  88 */       if (e != null) e.printStackTrace(this.log); 
/*     */     }
/*     */   }
/*     */ 
/*  92 */   public void reportError(String message, Exception e) { this.errNo += 1;
/*  93 */     if (this.errNo <= this.errUpperBound) {
/*  94 */       this.log.println("Error: " + message);
/*  95 */       if (e != null) e.printStackTrace(this.log); 
/*     */     } } 
/*     */   public void reportError(String message)
/*     */   {
/*  99 */     this.errNo += 1;
/* 100 */     if (this.errNo <= this.errUpperBound)
/* 101 */       this.log.println("Error: " + message);
/*     */   }
/*     */ 
/*     */   public void finalReport()
/*     */   {
/* 107 */     this.log.flush();
/* 108 */     if ((this.errNo <= this.errUpperBound) && (this.warNo <= this.warUpperBound)) {
/* 109 */       this.log.print("Finished - " + this.errNo + " errors " + this.warNo + " warnings");
/*     */     } else {
/* 111 */       if (this.errNo > this.errUpperBound) {
/* 112 */         this.log.print("Finished - Too many errors.");
/*     */       }
/* 114 */       if (this.warNo > this.warUpperBound)
/* 115 */         this.log.print("Finished - Too many warnings.");
/*     */     }
/*     */   }
/*     */ 
/*     */   public void setWarUpperBound(int bound)
/*     */   {
/* 122 */     this.warUpperBound = bound;
/*     */   }
/*     */   public void setErrUpperBound(int bound) {
/* 125 */     this.errUpperBound = bound;
/*     */   }
/*     */ 
/*     */   public void close()
/*     */   {
/* 130 */     this.log.close();
/*     */   }
/*     */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.OutputStreamLog
 * JD-Core Version:    0.6.2
 */