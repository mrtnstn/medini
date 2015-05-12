/*     */ package uk.ac.kent.cs.kmf.common;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.Container;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.GridBagConstraints;
/*     */ import java.awt.GridBagLayout;
/*     */ import java.awt.Insets;
/*     */ import java.util.Vector;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JList;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import javax.swing.text.JTextComponent;
/*     */ 
/*     */ public class MatrixPanel extends JPanel
/*     */ {
/*     */   protected GridBagConstraints constraints;
/*     */   protected int line;
/*     */   protected int column;
/*     */   protected EmptyBorder itemBorder;
/*     */   protected int fieldSize;
/*     */   protected Dimension listSize;
/*     */   protected Dimension buttonSize;
/*     */ 
/*     */   public MatrixPanel()
/*     */   {
/*  18 */     super(new GridBagLayout());
/*     */ 
/*  20 */     setBorder(new EmptyBorder(new Insets(10, 10, 10, 10)));
/*     */ 
/*  22 */     this.constraints = new GridBagConstraints();
/*     */ 
/*  24 */     this.constraints.insets = new Insets(2, 2, 2, 2);
/*  25 */     this.constraints.ipadx = 5;
/*  26 */     this.constraints.ipady = 5;
/*  27 */     this.constraints.weightx = 0.0D;
/*  28 */     this.constraints.weighty = 0.0D;
/*     */ 
/*  30 */     this.line = 0;
/*  31 */     this.column = 0;
/*  32 */     this.itemBorder = new EmptyBorder(new Insets(0, 0, 0, 10));
/*  33 */     this.buttonSize = new Dimension(80, 25);
/*  34 */     this.listSize = new Dimension(300, 100);
/*  35 */     this.fieldSize = 25;
/*     */   }
/*     */ 
/*     */   public Component add(Component c, int line, int column)
/*     */   {
/*  40 */     this.constraints.gridx = column;
/*  41 */     this.constraints.gridy = line;
/*  42 */     this.constraints.anchor = 17;
/*  43 */     add(c, this.constraints);
/*  44 */     return c;
/*     */   }
/*     */ 
/*     */   public Component add(Component c, int line, int column, int anchor)
/*     */   {
/*  49 */     this.constraints.gridx = column;
/*  50 */     this.constraints.gridy = line;
/*  51 */     this.constraints.anchor = anchor;
/*  52 */     add(c, this.constraints);
/*  53 */     return c;
/*     */   }
/*     */ 
/*     */   public JLabel addLabel(String tag, int line, int column)
/*     */   {
/*  58 */     JLabel label = new JLabel(tag);
/*  59 */     label.setBorder(this.itemBorder);
/*  60 */     add(label, line, column);
/*  61 */     return label;
/*     */   }
/*     */ 
/*     */   public JTextField addTextField(String initialContent, int line, int column)
/*     */   {
/*  66 */     JTextField field = new JTextField(this.fieldSize);
/*  67 */     field.setText(initialContent);
/*  68 */     add(field, line, column);
/*  69 */     return field;
/*     */   }
/*     */ 
/*     */   public JList addList(Vector objects, int line, int column)
/*     */   {
/*  74 */     JList list = new JList(objects);
/*  75 */     JScrollPane c = new JScrollPane(list, 22, 32);
/*  76 */     c.setPreferredSize(this.listSize);
/*  77 */     add(c, line, column);
/*  78 */     return list;
/*     */   }
/*     */   public JList addList(Vector objects, Dimension dim, int line, int column) {
/*  81 */     JList list = new JList(objects);
/*  82 */     JScrollPane c = new JScrollPane(list, 22, 32);
/*  83 */     c.setPreferredSize(dim);
/*  84 */     add(c, line, column);
/*  85 */     return list;
/*     */   }
/*     */ 
/*     */   public JButton addButton(String label, int line, int column)
/*     */   {
/*  90 */     JButton button = new JButton(label);
/*  91 */     button.setPreferredSize(this.buttonSize);
/*  92 */     add(button, line, column);
/*  93 */     return button;
/*     */   }
/*     */ 
/*     */   public Dimension getButtonSize() {
/*  97 */     return this.buttonSize; } 
/*  98 */   public void setButtonSize(Dimension dimension) { this.buttonSize = dimension; }
/*     */ 
/*     */   public int getFieldSize() {
/* 101 */     return this.fieldSize; } 
/* 102 */   public void setFieldSize(int i) { this.fieldSize = i; }
/*     */ 
/*     */   public Dimension getListSize() {
/* 105 */     return this.listSize; } 
/* 106 */   public void setListSize(Dimension i) { this.listSize = i; }
/*     */ 
/*     */   public EmptyBorder getItemBorder() {
/* 109 */     return this.itemBorder; } 
/* 110 */   public void setItemBorder(EmptyBorder border) { this.itemBorder = border; }
/*     */ 
/*     */   public GridBagConstraints getConstraints() {
/* 113 */     return this.constraints; } 
/* 114 */   public void setConstraints(GridBagConstraints constraints) { this.constraints = constraints; }
/*     */ 
/*     */ }

/* Location:           C:\Users\marat\Projects\mediniQVT\mediniQVTInterpreter\source\QVTCommon\lib\Util-1.2.jar
 * Qualified Name:     uk.ac.kent.cs.kmf.common.MatrixPanel
 * JD-Core Version:    0.6.2
 */