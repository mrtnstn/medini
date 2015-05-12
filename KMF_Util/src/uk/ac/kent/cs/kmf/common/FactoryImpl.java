/*    */ package uk.ac.kent.cs.kmf.common;
/*    */ 
/*    */ public class FactoryImpl
/*    */   implements Factory
/*    */ {
/* 24 */   private static int objId = 0;
/*    */   protected Repository repository;
/*    */ 
/*    */   public FactoryImpl()
/*    */   {
/*    */   }
/*    */ 
/*    */   public FactoryImpl(Repository repository)
/*    */   {
/* 16 */     this.repository = repository;
/*    */   }
/*    */ 
/*    */   public Object build() {
/* 20 */     return null;
/*    */   }
/*    */ 
/*    */   public static void resetId()
/*    */   {
/* 27 */     objId = 0;
/*    */   }
/*    */ 
/*    */   public static String newId() {
/* 31 */     return "" + ++objId;
/*    */   }
/*    */ 
/*    */   public Repository getRepository()
/*    */   {
/* 38 */     return this.repository;
/*    */   }
/*    */ 
/*    */   public void setRepository(Repository repository) {
/* 42 */     this.repository = repository;
/*    */   }
/*    */ 
/*    */   public String toString()
/*    */   {
/* 47 */     return "Factory";
/*    */   }
/*    */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.common.FactoryImpl
 * JD-Core Version:    0.6.2
 */