
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 23 11:26:09 CEST 2007
//----------------------------------------------------

package de.ikv.medini.qvt.syntax.parser;

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int BAG = 13;
  public static final int AT = 50;
  public static final int QUERY = 85;
  public static final int RIGHT_BRA = 60;
  public static final int CONTEXT = 4;
  public static final int BAD = 69;
  public static final int TIMES = 33;
  public static final int REAL = 63;
  public static final int GT = 27;
  public static final int ENDPACKAGE = 3;
  public static final int GE = 29;
  public static final int TOP = 74;
  public static final int ITERATE = 19;
  public static final int INIT = 5;
  public static final int COMMA = 44;
  public static final int TUPLE = 17;
  public static final int INT_MOD = 36;
  public static final int COLLECTION = 15;
  public static final int RELATION = 75;
  public static final int DERIVE = 6;
  public static final int LEFT_PAR = 55;
  public static final int IMPLEMENTEDBY = 77;
  public static final int LT = 26;
  public static final int SEQUENCE = 14;
  public static final int DOUBLEPLUS = 83;
  public static final int SIMPLE_NAME = 68;
  public static final int INTEGER = 62;
  public static final int RIGHT_PAR = 58;
  public static final int ORDERED_SET = 16;
  public static final int FALSE = 66;
  public static final int NOT = 37;
  public static final int DEF = 8;
  public static final int LE = 28;
  public static final int MINUS_GT = 61;
  public static final int THEN = 41;
  public static final int PACKAGE = 2;
  public static final int EQ = 24;
  public static final int OVERRIDES = 76;
  public static final int WHEN = 81;
  public static final int DOT_DOT = 52;
  public static final int COLON_COLON = 53;
  public static final int TRUE = 65;
  public static final int PLUS = 30;
  public static final int DIVIDE = 34;
  public static final int QUESTION = 51;
  public static final int EXTENDS = 72;
  public static final int DOMAIN = 84;
  public static final int PRIMITIVE = 78;
  public static final int ELSE = 42;
  public static final int INV = 7;
  public static final int DOT = 45;
  public static final int UNDEFINED = 67;
  public static final int EOF = 0;
  public static final int SEMICOLON = 47;
  public static final int WHERE = 82;
  public static final int ENDIF = 43;
  public static final int POST = 10;
  public static final int IMPORT = 70;
  public static final int MINUS = 31;
  public static final int TRANSFORMATION = 71;
  public static final int BODY = 11;
  public static final int IN = 39;
  public static final int OR = 22;
  public static final int SET = 12;
  public static final int error = 1;
  public static final int IF = 40;
  public static final int UP = 49;
  public static final int INT_DIVIDE = 35;
  public static final int PRE = 9;
  public static final int COLON = 46;
  public static final int CHECKONLY = 79;
  public static final int UP_UP = 54;
  public static final int STRING = 64;
  public static final int TUPLE_TYPE = 18;
  public static final int LEFT_BRK = 56;
  public static final int ENFORCE = 80;
  public static final int AND = 21;
  public static final int BAR = 48;
  public static final int IMPLIES = 20;
  public static final int UMINUS = 32;
  public static final int RIGHT_BRK = 59;
  public static final int LET = 38;
  public static final int KEY = 73;
  public static final int NE = 25;
  public static final int XOR = 23;
  public static final int LEFT_BRA = 57;

  /* non terminals */
  static final int collectionTemplate = 68;
  static final int operationContextDecl = 8;
  static final int argumentList = 18;
  static final int varDeclarationList = 49;
  static final int contextDeclList = 1;
  static final int pattern = 59;
  static final int where = 58;
  static final int oclExpression = 17;
  static final int paramDeclarationList = 64;
  static final int oclExpressionInBra = 51;
  static final int primitiveLiteralExp = 28;
  static final int packageDeclaration = 0;
  static final int transformation = 34;
  static final int optionalIdentifier = 53;
  static final int prePostOrBodyDecl = 10;
  static final int classifierContextDecl = 3;
  static final int tupleLiteralExp = 27;
  static final int checkEnforceQualifier = 56;
  static final int pathName = 29;
  static final int isOverriding = 47;
  static final int objectTemplate = 66;
  static final int semiOroclExpressionInBra = 62;
  static final int collectionType = 14;
  static final int collectionLiteralExp = 23;
  static final int relationOrQueryList = 39;
  static final int modelDeclList = 36;
  static final int paramDeclaration = 63;
  static final int oclMessageArgument = 20;
  static final int modelDecl = 40;
  static final int commaLeadingOclExpressionList = 71;
  static final int template = 65;
  static final int tupleType = 16;
  static final int identifierList = 37;
  static final int query = 61;
  static final int topLevel = 31;
  static final int simpleName = 30;
  static final int propertyContextDecl = 6;
  static final int variableDeclaration = 12;
  static final int literalExp = 22;
  static final int propertyIdList = 43;
  static final int collectionLiteralPart = 25;
  static final int type = 13;
  static final int propertyTemplateList = 54;
  static final int defExpression = 5;
  static final int keyDeclList = 38;
  static final int collectionLiteralParts = 24;
  static final int predicate = 60;
  static final int contextDeclaration = 2;
  static final int implementedByOperation = 52;
  static final int collectionRange = 26;
  static final int domainOrprimitiveTypeDomainList = 45;
  static final int invOrDef = 4;
  static final int metaModelIdList = 41;
  static final int isExtending = 35;
  static final int keyDecl = 42;
  static final int setComprehensionExpression = 69;
  static final int domain = 50;
  static final int when = 57;
  static final int collectionKind = 15;
  static final int primitiveTypeDomain = 55;
  static final int transformationList = 33;
  static final int memberSelectionExp = 70;
  static final int varDeclaration = 48;
  static final int isTopLevel = 46;
  static final int oclMessageArgumentList = 19;
  static final int relation = 44;
  static final int variableDeclarationList = 11;
  static final int operation = 9;
  static final int importFileList = 32;
  static final int initOrDerValue = 7;
  static final int isMarkedPre = 21;
  static final int propertyTemplate = 67;
}

