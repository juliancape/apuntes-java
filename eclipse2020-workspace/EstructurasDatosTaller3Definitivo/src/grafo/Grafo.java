package grafo;

import java.util.Scanner;

final class Grafo {

	Scanner leer= new Scanner(System.in);
	public void iniciar() {
		int opcion = 0;
		String menu = "Menu Principal" + "\n"
		+ "Seleccione proceso a realizar:" + "\n"
		+ "1. Llenar grafo" + "\n"
		+ "2. Imprimir lista de adyacencia con pesos" + "\n"
		+ "3. Salir" + "\n"
		
		+ "Opción:";
		do {
		System.out.println(menu);
		opcion = leer.nextInt();
		switch(opcion) {
		case 1:
			llenar();
			System.out.println("Grafo llenado con exito");
		break;
		case 2:
			listar(llenar());
		break;

		}
		}while (opcion!=3);
		}
	
	
	public Nodo llenar() {
		Nodo a= new Nodo("A");
		Nodo b= new Nodo("B");
		Nodo c= new Nodo("C");
		Nodo d= new Nodo("D");
		Nodo f= new Nodo("F");
		Nodo j= new Nodo("J");
		a.agrgarVecinos(b, 15);
		b.agrgarVecinos(c, 20);
		c.agrgarVecinos(f, 5);
		f.agrgarVecinos(j, 22);
		d.agrgarVecinos(j, 1);
		
		return a;
	}
	public void listar(Nodo a){
		System.out.println(a.imprimirNodos());
	}
	
}
