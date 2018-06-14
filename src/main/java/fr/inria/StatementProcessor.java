package fr.inria;

import java.util.Collection;

import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.processing.Processor;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.support.QueueProcessingManager;

/**
 * User: Simon
 * Date: 5/29/13
 * Time: 6:00 PM
 */
public class StatementProcessor extends AbstractProcessor<CtStatement> {
    int i = 0;


    public void process(CtStatement element) {
        i++;
        System.out.println("Statement: "+ i);
        System.out.println(element);
        Factory factory = this.getFactory() ; 
        ProcessingManager pm = new QueueProcessingManager(factory) ;
        AbstractVariableProcessor p = new AbstractVariableProcessor() ; 
        pm.addProcessor(p);
        pm.process(element);
		
			
			
        System.out.println("-----------------------------------");
    }
}
