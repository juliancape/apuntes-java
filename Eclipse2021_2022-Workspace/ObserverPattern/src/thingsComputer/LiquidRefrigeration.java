package thingsComputer;

import decoratorComputer.DecoratorComputer;

import decoratorComputer.IComputer; 

public class LiquidRefrigeration extends DecoratorComputer{
	
	public LiquidRefrigeration(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateRefrigeration();
	}
	
	public String decorateRefrigeration() { 
		return "with liquid refrigeration ";
	}
	
}
