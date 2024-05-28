package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import htmlGenerator.Generator;

public class ExtensionSSD extends DecoratorComputer{
	
	public ExtensionSSD(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		Generator html = new Generator();
		html.htmlImg("ssd.jpg", "with 1TB SSD extension ");
		return "with 1TB SSD extension ";
	}
	
}
