/*    */ package uk.ac.kent.cs.kmf.util;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.Map;
/*    */ import java.util.Vector;
/*    */ 
/*    */ public class CSFactory
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
/* 29 */     typeToObject.put("Collection", new Vector());
/* 30 */     typeToObject.put("List", new Vector());
/* 31 */     typeToObject.put("Set", new HashSet());
/*    */ 
/* 38 */     typeToString = new HashMap();
/*    */ 
/* 40 */     typeToString.put("bool", "false");
/* 41 */     typeToString.put("byte", "0");
/* 42 */     typeToString.put("char", "0");
/* 43 */     typeToString.put("double", "0");
/* 44 */     typeToString.put("float", "0.0f");
/* 45 */     typeToString.put("int", "0");
/* 46 */     typeToString.put("long", "0");
/* 47 */     typeToString.put("short", "0");
/* 48 */     typeToString.put("string", "\"\"");
/*    */ 
/* 50 */     typeToString.put("Boolean", "false");
/* 51 */     typeToString.put("Byte", "0");
/* 52 */     typeToString.put("Char", "0");
/* 53 */     typeToString.put("Double", "0");
/* 54 */     typeToString.put("Float", "0.0f");
/* 55 */     typeToString.put("Integer", "0");
/* 56 */     typeToString.put("Long", "0");
/* 57 */     typeToString.put("Short", "0");
/* 58 */     typeToString.put("String", "\"\"");
/*    */ 
/* 60 */     typeToString.put("Collection", "new Vector()");
/* 61 */     typeToString.put("List", "new Vector()");
/* 62 */     typeToString.put("Set", "new HashSet()");
/*    */ 
/* 64 */     typeToString.put("UnlimitedInteger", "-1");
/* 65 */     typeToString.put("UnboundedInteger", "-1");
/* 66 */     typeToString.put("UnlimitedNatural", "-1");
/*    */   }
/*    */ 
/*    */   public static Object createObject(String type)
/*    */   {
/* 34 */     return typeToObject.get(type);
/*    */   }
/*    */ 
/*    */   public static String createString(String type)
/*    */   {
/* 69 */     return (String)typeToString.get(type);
/*    */   }
/*    */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.CSFactory
 * JD-Core Version:    0.6.2
 */