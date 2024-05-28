package decoratorCake;

public abstract class DecoratorCake implements ICake{
	
	protected ICake cake;
	
	public DecoratorCake(ICake c) {
		this.cake = c;
	}
	

	public abstract String personalizarTorta();
	
}
