package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import html.Generator;

public class DedicatedGraphics extends DecoratorComputer{
	
	public DedicatedGraphics(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		Generator html = new Generator();
		html.htmlImg("graphic.jpg", "with dedicated graphics");
		return "with dedicated graphics ";
	}
	
}
