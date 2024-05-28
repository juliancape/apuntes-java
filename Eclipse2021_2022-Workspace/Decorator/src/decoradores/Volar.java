package decoradores;

import xxabstractos.IHeroe;
import xxabstractos.SuperPoderes;

public class Volar extends SuperPoderes{
	
	
	
	public Volar(IHeroe h) {
		super(h);
		
	}

	public void operacion() {
		super.wrapped.operacion();
		volar();
	}
	public void volar() {
		System.out.println("puedo volar");
	}

	
}
