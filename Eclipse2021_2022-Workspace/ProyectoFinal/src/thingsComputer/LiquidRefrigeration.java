package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import html.Generator;

public class LiquidRefrigeration extends DecoratorComputer{
	
	public LiquidRefrigeration(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateRefrigeration();
	}
	
	public String decorateRefrigeration() {
		Generator html = new Generator();
		html.htmlImg("refrigeration.jpg", "with liquid refrigeration ");
		return "with liquid refrigeration ";
	}
	
}
