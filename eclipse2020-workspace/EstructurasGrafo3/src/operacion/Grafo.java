package operacion;

import java.util.Scanner;

public class Grafo {

	private Nodo[] arreglo;

	private Scanner leer= new Scanner(System.in);
	/**
	 * @param arreglo
	 */
	public Grafo() {
		
		this.arreglo = new Nodo[4];
	}

	public void agregar(int i, int dato) {
		int aux=1;
		int dirige;
		int actual;
		int agregar;
		do {
			System.out.println("Nodo ["+aux+"]");
			System.out.println("¿Quiere agregar una arista? \n "
					+ "1. SI \n 2. NO");
			
			System.out.println("¿A que nodo se dirige?");
			dirige=leer.nextInt()-1;
			actual=i-1;
			arreglo[actual].setVertice(dato);
			arreglo[dirige].setVertice(dato);
			aux++;
		} while (aux!=i);
		
	}
	
	public void listar() {
		
	}
	
	public void llenar(){
		System.out.println("HOla");
		arreglo=new Nodo[4];
		arreglo[0].setVertice(1);
		arreglo[1].setVertice(2);
		arreglo[2].setVertice(3);
		arreglo[3].setVertice(4);
		arreglo[4].setVertice(5);
		arreglo[0].setSiguiente(new Nodo(arreglo[1].getVertice(), new Nodo(arreglo[2].getVertice(), new Nodo(arreglo[3].getVertice(), 
				new Nodo(arreglo[4].getVertice(), null)))));
		//arreglo[1].setSiguiente(new Nodo(arreglo[2].getVertice(), null));
		/*arreglo[2].setSiguiente(new Nodo(arreglo[3].getVertice(), ));
		arreglo[3].setSiguiente(new Nodo(arreglo[4].getVertice(), ));
		arreglo[4].setSiguiente(siguiente);*/
		
		System.out.println(arreglo[0].toString());
	}
	
	public void tamaño() {
		int tam=leer.nextInt();
		arreglo= new Nodo[tam];
	}
	
}
