package org.oslo.ocl20.standard.types;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.oslo.ocl20.OclProcessor;
import org.oslo.ocl20.semantics.SemanticsVisitor;
import org.oslo.ocl20.semantics.bridge.Classifier;
import org.oslo.ocl20.semantics.bridge.Operation;
import org.oslo.ocl20.semantics.factories.TypeFactory;
import org.oslo.ocl20.semantics.model.types.BagType;
import org.oslo.ocl20.semantics.model.types.CollectionType;
import org.oslo.ocl20.semantics.model.types.OrderedSetType;
import org.oslo.ocl20.semantics.model.types.SequenceType;
import org.oslo.ocl20.semantics.model.types.SetType;
import org.oslo.ocl20.semantics.model.types.VoidType;
import org.oslo.ocl20.standard.lib.OclOrderedSet;


/**
 * @author dha
 *
 */
public class OrderedSetTypeImpl extends SetTypeImpl implements OrderedSetType {
	/** Construct an OrderedSetType */
	public OrderedSetTypeImpl(Classifier elementType, OclProcessor proc) {
		super(elementType,proc);
		setName("OrderedSet");
	}
	
	/** Set the operations */
	public void createOperations(TypeFactory tf) {
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildBooleanType(), "=", new Classifier[] { this }) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildBooleanType(), "<>", new Classifier[] { this }));
		
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "union", new Classifier[] { this }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildBagType(this.getElementType()), "union", new Classifier[] { tf.buildBagType(this.getElementType()) }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSetType(this.getElementType()), "union", new Classifier[] { tf.buildSetType(this.getElementType()) }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "intersection", new Classifier[] { this }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSetType(this.getElementType()), "intersection", new Classifier[] { tf.buildBagType(this.getElementType()) }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSetType(this.getElementType()), "intersection", new Classifier[] { tf.buildSetType(this.getElementType()) }));

		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "append", new Classifier[] {getElementType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "prepend", new Classifier[] {getElementType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "insertAt", new Classifier[] {tf.buildIntegerType(), getElementType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "subOrderedSet", new Classifier[] {tf.buildIntegerType(), tf.buildIntegerType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(getElementType(), "at", new Classifier[] {tf.buildIntegerType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildIntegerType(), "indexOf", new Classifier[] {getElementType()}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(getElementType(), "first", new Classifier[] {}) );
		getOperations().add( super.processor.getBridgeFactory().buildOperation(getElementType(), "last", new Classifier[] {}) );

		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildIntegerType(), "count", new Classifier[] { this.getElementType() }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSetType(tf.getFlatType(this)), "flatten", new Classifier[] { }));

		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildBagType(this.getElementType()), "asBag", new Classifier[] {} ));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSequenceType(this.getElementType()), "asSequence", new Classifier[] {} ));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(tf.buildSetType(this.getElementType()), "asSet", new Classifier[] {} ));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "asOrderedSet", new Classifier[] {} ));

		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "select", new Classifier[] { tf.buildBooleanType() }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "select", new Classifier[] { getElementType(), tf.buildBooleanType() }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "reject", new Classifier[] { tf.buildBooleanType() }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "reject", new Classifier[] { getElementType(), tf.buildBooleanType() }));
		// collectNested's signature will be computed latter
		//_operations.put("collectNested", super.processor.getBridgeFactory().buildOperation(Bag(T), "collectNested", null));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "sortedBy", new Classifier[] { tf.buildClassifier() }));
		getOperations().add( super.processor.getBridgeFactory().buildOperation(this, "sortedBy", new Classifier[] { getElementType(), tf.buildClassifier() }));

		super.createOperations(tf);
	}
	
	/** Lookup for an operation */
	public Operation lookupOperation(String name, List types) {
		Operation op = (Operation)super.lookupOperation(name, types);
		//if (op == null) {
			if (name.equals("collect")) {
				Classifier bodyType = (Classifier)types.get(types.size()-1);
				Classifier baseType = baseElementType(bodyType);
				SequenceType seqT = super.processor.getTypeFactory().buildSequenceType( baseType );
				return super.processor.getBridgeFactory().buildOperation( seqT, "collect", null);
			} else if (name.equals("collectNested")) {
				SequenceType seqT = super.processor.getTypeFactory().buildSequenceType( (Classifier)types.get(types.size()-1) );
				return super.processor.getBridgeFactory().buildOperation( seqT, "collectNested", null);
			}
		//}
		return op;
	}

	/** Check if this (an OrderedSet) conforms to t2 */
	public Boolean conformsTo(Classifier t2) {
		//--- T2 is undefined ---
		if (t2 instanceof VoidType)
			return Boolean.TRUE;
		//--- T2 is OrderedSetType ---
		if (t2 instanceof OrderedSetType)
			return getElementType().conformsTo(((OrderedSetType)t2).getElementType());
		//--- T2 is CollectionType ---
		if (t2 instanceof CollectionType && 
			!(t2 instanceof SetType) && !(t2 instanceof BagType) && !(t2 instanceof SequenceType)) 
			return getElementType().conformsTo(((CollectionType)t2).getElementType());
		//--- Check for parents ---
		else
			return TypeConformance.isAssignableTo(this, t2) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	/** Accept a Semantic Visitor */
	public Object accept(SemanticsVisitor v, Object obj) {
		return v.visit(this,obj);
	}
	
	/** ToString */
	public String toString(){
		return "OrderedSet("+this.getElementType()+")";
	}
	public Object getDelegate() {
		return EList.class;
	}
	public Class getImplClass() {
		return OclOrderedSet.class;
	}
}
