package thingsComputer;

import decoratorComputer.DecoratorComputer;

import decoratorComputer.IComputer;

public class DedicatedGraphics extends DecoratorComputer{
	
	public DedicatedGraphics(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		return "with dedicated graphics ";
	}
	
}
