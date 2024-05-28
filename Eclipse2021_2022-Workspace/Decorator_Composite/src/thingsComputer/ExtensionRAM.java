package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;
import htmlGenerator.Generator;

public class ExtensionRAM extends DecoratorComputer{
	
	public ExtensionRAM(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		Generator html = new Generator();
		html.htmlImg("ram.jpg", "with RAM extension ");
		return "with RAM extension ";
	}
	
}
