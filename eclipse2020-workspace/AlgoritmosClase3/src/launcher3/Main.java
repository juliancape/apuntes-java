package launcher3;

import controlador3.Controller;
import controlador3.Controller2;
import modelo3.Op;
import vista3.Ventana;

public class Main {

	public static void main(String[] args) {
		
		Ventana v= new Ventana();
	
		Op a= new Op(v);
		Controller c= new Controller(a,v);
		Controller2 c2= new Controller2(a, v);
		
		//v.setContoler(c);
		//v.setContoler2(c2);
	}

}
