package fr.inria;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtVariableAccess;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.visitor.filter.VariableAccessFilter ; 



public class AbstractVariableProcessor extends AbstractProcessor<CtVariableAccess>{
	int i=0; 
	
	public void process(CtVariableAccess variable) {
		// TODO Auto-generated method stub
	i++;
	
	System.out.println("Variable Access :"+i+" : "+ variable.getVariable().getSimpleName()) ;
	}

}
