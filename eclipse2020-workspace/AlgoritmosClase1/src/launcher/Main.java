package launcher;

import controlador.Controller;
import modelo.A;
import vista.Ventana;

public class Main {

	public static void main(String[] args) {
		
		Ventana v= new Ventana();
	
		A a= new A(v);
		Controller c= new Controller(a,v);
	
		
		v.setcontroller(c);
	}

}
