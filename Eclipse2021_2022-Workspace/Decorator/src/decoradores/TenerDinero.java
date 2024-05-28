package decoradores;

import xxabstractos.IHeroe;
import xxabstractos.SuperPoderes;

public class TenerDinero extends SuperPoderes {

	public TenerDinero(IHeroe h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

	public void operacion() {
		super.wrapped.operacion();
		tenerDinero();
	}
	public void tenerDinero() {
		System.out.println("Tengo dinero");
	}
}
