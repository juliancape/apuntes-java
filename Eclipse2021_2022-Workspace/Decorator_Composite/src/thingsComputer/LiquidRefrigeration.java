package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import htmlGenerator.Generator;

public class LiquidRefrigeration extends DecoratorComputer{
	
	public LiquidRefrigeration(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		Generator html = new Generator();
		html.htmlImg("refrigeration.jpg", "with liquid refrigeration ");
		return "with liquid refrigeration ";
	}
	
}
