package xxabstractos;

public abstract class SuperPoderes implements IHeroe{
	//El que esta envuelto
	protected IHeroe wrapped;
	public SuperPoderes (IHeroe h) {
		this.wrapped = h;
	}
	
	@Override
	public abstract void operacion();
	
	
}
