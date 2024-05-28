package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import html.Generator;

public class ExtensionSSD extends DecoratorComputer{
	
	public ExtensionSSD(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateSSD();
	}
	
	public String decorateSSD() {
		Generator html = new Generator();
		html.htmlImg("ssd.jpg", "with 1TB SSD extension ");
		return "with 1TB SSD extension ";
	}
	
}
