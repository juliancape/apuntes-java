package xx;

import decoradores.TenerDinero;
import decoradores.Volar;
import xxabstractos.IHeroe;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IHeroe heroe = new Heroe();
		heroe = new Volar(heroe);
		heroe = new TenerDinero(heroe);
		heroe.operacion();
		
		
		System.out.println("-------------------------------");
		IHeroe heroe2 = new  Volar(new TenerDinero(new Heroe()));
		
		heroe2.operacion();
	}

}
