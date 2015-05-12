/*    */ package uk.ac.kent.cs.kmf.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class JavaFactory
/*    */ {
/* 18 */   protected static Map typeToObject = new HashMap();
/*    */   protected static Map typeToString;
/*    */ 
/*    */   static
/*    */   {
/* 20 */     typeToObject.put("Boolean", new Boolean(false));
/* 21 */     typeToObject.put("Byte", new Integer(0));
/* 22 */     typeToObject.put("Character", new Integer(0));
/* 23 */     typeToObject.put("Double", new Double(0.0D));
/* 24 */     typeToObject.put("Float", new Float(0.0F));
/* 25 */     typeToObject.put("Integer", new Integer(0));
/* 26 */     typeToObject.put("Long", new Long(0L));
/* 27 */     typeToObject.put("Short", new Integer(0));
/* 28 */     typeToObject.put("String", new String());
/* 29 */     typeToObject.put("StringBuffer", new String());
/* 30 */     typeToObject.put("Collection", new Vector());
/* 31 */     typeToObject.put("List", new Vector());
/* 32 */     typeToObject.put("Set", new HashSet());
/*    */ 
/* 39 */     typeToString = new HashMap();
/*    */ 
/* 41 */     typeToString.put("Boolean", "new Boolean(false)");
/* 42 */     typeToString.put("Byte", "new Integer(0)");
/* 43 */     typeToString.put("Character", "new Integer(0)");
/* 44 */     typeToString.put("Double", "new Double(0)");
/* 45 */     typeToString.put("Float", "new Float(0)");
/* 46 */     typeToString.put("Integer", "new Integer(0)");
/* 47 */     typeToString.put("Long", "new Long(0)");
/* 48 */     typeToString.put("Short", "new Integer(0)");
/* 49 */     typeToString.put("String", "new String()");
/* 50 */     typeToString.put("StringBuffer", "new String()");
/* 51 */     typeToString.put("Collection", "new Vector()");
/* 52 */     typeToString.put("List", "new Vector()");
/* 53 */     typeToString.put("Set", "new HashSet()");
/*    */ 
/* 55 */     typeToString.put("UnlimitedInteger", "new Integer(-1)");
/* 56 */     typeToString.put("UnboundedInteger", "new Integer(-1)");
/* 57 */     typeToString.put("UnlimitedNatural", "new Integer(-1)");
/*    */   }
/*    */ 
/*    */   public static Object createObject(String type)
/*    */   {
/* 35 */     return typeToObject.get(type);
/*    */   }
/*    */ 
/*    */   public static String createString(String type)
/*    */   {
/* 60 */     return (String)typeToString.get(type);
/*    */   }
/*    */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.JavaFactory
 * JD-Core Version:    0.6.2
 */