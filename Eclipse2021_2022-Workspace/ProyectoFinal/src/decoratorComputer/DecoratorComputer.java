package decoratorComputer;

public abstract class DecoratorComputer implements IComputer{
	
	protected IComputer computer;
	
	public DecoratorComputer(IComputer c) {
		this.computer = c;
	}
	

	public abstract String personalize();
	
}
