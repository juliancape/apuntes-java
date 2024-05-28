package dinamico;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList = new ArrayList();  esto es para meter cualquierdato
		
		ArrayList listaNumeros = new ArrayList();
		
		listaNumeros.add(20);
		listaNumeros.add(100);
		listaNumeros.add(1);
		listaNumeros.add(10);
		
		
		for (int i = 0; i < listaNumeros.size(); i++) {
			System.out.println(listaNumeros.get(i));
			
			
		}
		
		listaNumeros.remove(2);
		for (int i = 0; i < listaNumeros.size(); i++) {
			System.out.println(listaNumeros.get(i));
		}
			listaNumeros.set(3, 300);
			
			
		for (int i = 0; i < listaNumeros.size(); i++) {
		System.out.println(listaNumeros.get(i));
		
		
	}
	}

	
}
