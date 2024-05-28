package grafo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grafo {
 public Scanner leer= new Scanner(System.in);
 private Nodo operacion= new Nodo();
 private int tam;
 
public void iniciar() {
	int opcion = 0;
	String menu = "Menu Principal" + "\n"
	+ "Seleccione proceso a realizar:" + "\n"
	+ "1. Crear cantidad de nodos" + "\n"
	+ "2. Llenar" + "\n"
	+ "3. Imprimir" + "\n"
	
	+ "Opción:";
	do {
	System.out.println(menu);
	opcion = leer.nextInt();
	switch(opcion) {
	case 1:
		tamaño();
	break;
	case 2:
		ingresarDatos();
	break;
	case 3:
		imprimir();
	break;
	
	}
	}while (opcion!=4);
	}
	
	public int tamaño() {
		System.out.println("Ingrese cantidad de nodos");
		return tam= leer.nextInt();
	}
	public void ingresarDatos() {
		String[] b;
		b=(Arrays.copyOfRange(operacion.getVertices(), 0, tam));
			String e;
			int p;
			int cantidad;
			ArrayList<Integer> peso= new ArrayList<>();
			ArrayList<String> etiqueta= new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			String c = b[i];
			peso.clear();
			etiqueta.clear();
			System.out.println("Cuantas aristas va a tener el nodo -->"+c);
			cantidad=leer.nextInt();
			for (int j = 0; j < cantidad; j++) {
				System.out.println("Arista numero "+(j+1));
				System.out.println("Ingrese Etiqueta del nodo al que se conecta");
				e=leer.next();
				System.out.println("Ingrese peso");
				p= leer.nextInt();
				peso.add(p);
				etiqueta.add(e);
			}
			operacion.agregar(etiqueta, peso);
			
			
			
		}
		
	}
	public void imprimir() {
		operacion.imprimir();
	}
	

 
 
 
}
