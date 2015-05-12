/*     */ package uk.ac.kent.cs.kmf.util;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class Naming
/*     */ {
/*  18 */   protected static Set keywords = new HashSet();
/*     */   protected static Map UMLPath;
/*     */ 
/*     */   static
/*     */   {
/*  21 */     keywords.add("abstract"); keywords.add("boolean"); keywords.add("break"); keywords.add("byte");
/*  22 */     keywords.add("case"); keywords.add("catch"); keywords.add("char"); keywords.add("class");
/*  23 */     keywords.add("const"); keywords.add("continue"); keywords.add("default"); keywords.add("do");
/*  24 */     keywords.add("double"); keywords.add("else"); keywords.add("extends"); keywords.add("final");
/*  25 */     keywords.add("finally"); keywords.add("float"); keywords.add("for"); keywords.add("goto");
/*  26 */     keywords.add("if"); keywords.add("implements"); keywords.add("import"); keywords.add("instanceof");
/*  27 */     keywords.add("int"); keywords.add("interface"); keywords.add("long"); keywords.add("native");
/*  28 */     keywords.add("new"); keywords.add("package"); keywords.add("private"); keywords.add("protected");
/*  29 */     keywords.add("public"); keywords.add("return"); keywords.add("short"); keywords.add("public"); keywords.add("static");
/*  30 */     keywords.add("strictfp"); keywords.add("super"); keywords.add("switch"); keywords.add("synchronized");
/*  31 */     keywords.add("this"); keywords.add("throw"); keywords.add("throws"); keywords.add("transient");
/*  32 */     keywords.add("try"); keywords.add("void"); keywords.add("volatile"); keywords.add("while");
/*     */ 
/*  34 */     keywords.add("Object");
/*  35 */     keywords.add("Enumeration");
/*  36 */     keywords.add("Integer");
/*  37 */     keywords.add("Boolean");
/*  38 */     keywords.add("Double");
/*  39 */     keywords.add("String");
/*  40 */     keywords.add("Collection");
/*  41 */     keywords.add("Set");
/*  42 */     keywords.add("Class");
/*     */ 
/*  44 */     keywords.add("namespace");
/*  45 */     keywords.add("internal");
/*     */ 
/*  87 */     UMLPath = new HashMap();
/*     */ 
/*  91 */     UMLPath.put("Action", "Behavioral Elements.State Machines");
/*  92 */     UMLPath.put("Guard", "Behavioral Elements.State Machines");
/*  93 */     UMLPath.put("Pseudostate", "Behavioral Elements.State Machines");
/*  94 */     UMLPath.put("State", "Behavioral Elements.State Machines");
/*  95 */     UMLPath.put("StateMachine", "Behavioral Elements.State Machines");
/*  96 */     UMLPath.put("StateVertex", "Behavioral Elements.State Machines");
/*  97 */     UMLPath.put("StubState", "Behavioral Elements.State Machines");
/*  98 */     UMLPath.put("SynchState", "Behavioral Elements.State Machines");
/*  99 */     UMLPath.put("Transition", "Behavioral Elements.State Machines");
/* 100 */     UMLPath.put("CallEvent", "Behavioral Elements.State Machines");
/* 101 */     UMLPath.put("CallEvent", "Behavioral Elements.State Machines");
/* 102 */     UMLPath.put("CompositeState", "Behavioral Elements.State Machines");
/*     */ 
/* 105 */     UMLPath.put("Abstraction", "Foundation.Core");
/* 106 */     UMLPath.put("Association", "Foundation.Core");
/* 107 */     UMLPath.put("AssociationClass", "Foundation.Core");
/* 108 */     UMLPath.put("AssociationEnd", "Foundation.Core");
/* 109 */     UMLPath.put("Attribute", "Foundation.Core");
/* 110 */     UMLPath.put("BehavioralFeature", "Foundation.Core");
/* 111 */     UMLPath.put("Bindind", "Foundation.Core");
/* 112 */     UMLPath.put("CallAction", "Foundation.Core");
/* 113 */     UMLPath.put("Class", "Foundation.Core");
/* 114 */     UMLPath.put("Classifier", "Foundation.Core");
/* 115 */     UMLPath.put("Comment", "Foundation.Core");
/* 116 */     UMLPath.put("Component", "Foundation.Core");
/* 117 */     UMLPath.put("Constraint", "Foundation.Core");
/* 118 */     UMLPath.put("DataType", "Foundation.Core");
/* 119 */     UMLPath.put("Dependency", "Foundation.Core");
/* 120 */     UMLPath.put("Element", "Foundation.Core");
/* 121 */     UMLPath.put("EnumLiteral", "Foundation.Core");
/* 122 */     UMLPath.put("Enumeration", "Foundation.Core");
/* 123 */     UMLPath.put("Feature", "Foundation.Core");
/* 124 */     UMLPath.put("Flow", "Foundation.Core");
/* 125 */     UMLPath.put("GeneralizableElement", "Foundation.Core");
/* 126 */     UMLPath.put("Generalization", "Foundation.Core");
/* 127 */     UMLPath.put("Interface", "Foundation.Core");
/* 128 */     UMLPath.put("Method", "Foundation.Core");
/* 129 */     UMLPath.put("ModelElement", "Foundation.Core");
/* 130 */     UMLPath.put("Namespace", "Foundation.Core");
/* 131 */     UMLPath.put("Node", "Foundation.Core");
/* 132 */     UMLPath.put("Operation", "Foundation.Core");
/* 133 */     UMLPath.put("Parameter", "Foundation.Core");
/* 134 */     UMLPath.put("Permission", "Foundation.Core");
/* 135 */     UMLPath.put("PresentationElement", "Foundation.Core");
/* 136 */     UMLPath.put("Primitive", "Foundation.Core");
/* 137 */     UMLPath.put("Relationship", "Foundation.Core");
/* 138 */     UMLPath.put("SendAction", "Foundation.Core");
/* 139 */     UMLPath.put("Signal", "Foundation.Core");
/* 140 */     UMLPath.put("StructuralFeature", "Foundation.Core");
/* 141 */     UMLPath.put("TemplateParameter", "Foundation.Core");
/* 142 */     UMLPath.put("Tie", "Foundation.Core");
/* 143 */     UMLPath.put("Usage", "Foundation.Core");
/*     */ 
/* 145 */     UMLPath.put("ActionExpression", "Foundation.Data Types");
/* 146 */     UMLPath.put("AggregationKind", "Foundation.Data Types");
/* 147 */     UMLPath.put("ArgListsExpression", "Foundation.Data Types");
/* 148 */     UMLPath.put("Boolean", "Foundation.Data Types");
/* 149 */     UMLPath.put("BooleanExpression", "Foundation.Data Types");
/* 150 */     UMLPath.put("CallConcurrencyKind", "Foundation.Data Types");
/* 151 */     UMLPath.put("ChangebilityKind", "Foundation.Data Types");
/* 152 */     UMLPath.put("Expression", "Foundation.Data Types");
/* 153 */     UMLPath.put("Geometry", "Foundation.Data Types");
/* 154 */     UMLPath.put("Integer", "Foundation.Data Types");
/* 155 */     UMLPath.put("IterationExpression", "Foundation.Data Types");
/* 156 */     UMLPath.put("LocationReference", "Foundation.Data Types");
/* 157 */     UMLPath.put("MappingExpression", "Foundation.Data Types");
/* 158 */     UMLPath.put("MessageDirectionKind", "Foundation.Data Types");
/* 159 */     UMLPath.put("Multiplicity", "Foundation.Data Types");
/* 160 */     UMLPath.put("MultiplicityRange", "Foundation.Data Types");
/* 161 */     UMLPath.put("Name", "Foundation.Data Types");
/* 162 */     UMLPath.put("ObjectSetExpression", "Foundation.Data Types");
/* 163 */     UMLPath.put("OrderingKind", "Foundation.Data Types");
/* 164 */     UMLPath.put("ParameterDirectionKind", "Foundation.Data Types");
/* 165 */     UMLPath.put("ProcedureExpression", "Foundation.Data Types");
/* 166 */     UMLPath.put("PseudostateKind", "Foundation.Data Types");
/* 167 */     UMLPath.put("ScopeKind", "Foundation.Data Types");
/* 168 */     UMLPath.put("String", "Foundation.Data Types");
/* 169 */     UMLPath.put("Time", "Foundation.Data Types");
/* 170 */     UMLPath.put("TimeExpression", "Foundation.Data Types");
/* 171 */     UMLPath.put("TypeExpression", "Foundation.Data Types");
/* 172 */     UMLPath.put("UnlimitedInteger", "Foundation.Data Types");
/* 173 */     UMLPath.put("VisibilityKind", "Foundation.Data Types");
/*     */ 
/* 175 */     UMLPath.put("Stereotype", "Foundation.Extension Mechanisms");
/* 176 */     UMLPath.put("StringArray", "Foundation.Extension Mechanisms");
/* 177 */     UMLPath.put("TagDefinition", "Foundation.Extension Mechanisms");
/* 178 */     UMLPath.put("TaggedValue", "Foundation.Extension Mechanisms");
/*     */ 
/* 180 */     UMLPath.put("Model", "Model Management");
/* 181 */     UMLPath.put("Package", "Model Management");
/* 182 */     UMLPath.put("Subsystem", "Model Management");
/*     */   }
/*     */ 
/*     */   public static boolean isKeyword(String name)
/*     */   {
/*  48 */     return keywords.contains(name);
/*     */   }
/*     */ 
/*     */   public static boolean isAlpha(char ch)
/*     */   {
/*  53 */     if (('a' <= ch) && (ch <= 'z')) return true;
/*  54 */     if (('A' <= ch) && (ch <= 'Z')) return true;
/*  55 */     if (('0' <= ch) && (ch <= '9')) return true;
/*  56 */     if (ch == '_') return true;
/*  57 */     return false;
/*     */   }
/*     */   public static String getCleanName(String name) {
/*  60 */     String res = new String();
/*  61 */     name = name.trim();
/*  62 */     for (int i = 0; i < name.length(); i++) {
/*  63 */       char ch = name.charAt(i);
/*  64 */       if ((ch != '\t') && (ch != '\n') && (ch != '\r') && (ch != '/')) {
/*  65 */         if ((isAlpha(ch)) || (ch == '.')) res = res + ch; else
/*  66 */           res = res + '_';
/*     */       }
/*     */     }
/*  69 */     int pos = res.lastIndexOf(".");
/*  70 */     String lastName = res.substring(pos + 1, res.length());
/*  71 */     if (isKeyword(lastName)) lastName = lastName + "_";
/*  72 */     return res.substring(0, pos + 1) + lastName;
/*     */   }
/*     */ 
/*     */   public static String getGetter(String name)
/*     */   {
/*  77 */     if (name.length() == 0) return "get_";
/*  78 */     return "get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
/*     */   }
/*     */ 
/*     */   public static String getSetter(String name) {
/*  82 */     if (name.length() == 0) return "set_";
/*  83 */     return "set" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());
/*     */   }
/*     */ 
/*     */   public static String getUMLPathName(String name)
/*     */   {
/* 185 */     String pathName = (String)UMLPath.get(name);
/* 186 */     return pathName + "." + name;
/*     */   }
/*     */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniOCLInterpreter\source\OCLEMF\lib\KMF_Util.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.util.Naming
 * JD-Core Version:    0.6.2
 */