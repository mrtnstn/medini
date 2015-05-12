/*    */ package uk.ac.kent.cs.kmf.util;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public class Reflection
/*    */ {
/*    */   public static Method findMethod(Class sourceClass, String methodName, Class[] paramTypes)
/*    */   {
/* 20 */     Method method = null;
/*    */     try
/*    */     {
/*    */       try {
/* 24 */         method = sourceClass.getMethod(methodName, paramTypes);
/*    */       } catch (Exception localException1) {
/*    */       }
/* 27 */       if (method == null) {
/* 28 */         Method[] methods = sourceClass.getMethods();
/* 29 */         for (int i = 0; i < methods.length; i++) {
/* 30 */           String methName = methods[i].getName();
/* 31 */           Class[] argTypes = methods[i].getParameterTypes();
/* 32 */           if ((methName.equals(methodName)) && (paramTypes.length == argTypes.length)) {
/* 33 */             boolean found = true;
/* 34 */             for (int j = 0; j < paramTypes.length; j++) {
/* 35 */               if (!argTypes[j].isAssignableFrom(paramTypes[j])) {
/* 36 */                 found = false;
/* 37 */                 break;
/*    */               }
/*    */             }
/* 40 */             if (found)
/* 41 */               return methods[i];
/*    */           }
/*    */         }
/*    */       }
/*    */     } catch (Exception e) {
/* 46 */       e.printStackTrace();
/*    */     }
/* 48 */     return method;
/*    */   }
/*    */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.Reflection
 * JD-Core Version:    0.6.2
 */