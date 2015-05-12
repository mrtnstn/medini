/*    */ package uk.ac.kent.cs.kmf.util;
/*    */ 
/*    */ public class PairImpl
/*    */   implements Pair
/*    */ {
/*    */   protected Object first;
/*    */   protected Object second;
/*    */ 
/*    */   public PairImpl()
/*    */   {
/*    */   }
/*    */ 
/*    */   public PairImpl(Object first, Object second)
/*    */   {
/*  9 */     this.first = first;
/* 10 */     this.second = second;
/*    */   }
/*    */ 
/*    */   public void setFirst(Object first) {
/* 14 */     this.first = first;
/*    */   }
/*    */ 
/*    */   public Object getFirst() {
/* 18 */     return this.first;
/*    */   }
/*    */ 
/*    */   public void setSecond(Object second) {
/* 22 */     this.second = second;
/*    */   }
/*    */ 
/*    */   public Object getSecond() {
/* 26 */     return this.second;
/*    */   }
/*    */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.PairImpl
 * JD-Core Version:    0.6.2
 */