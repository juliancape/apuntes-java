package operacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class App {

	private Scanner leer= new Scanner(System.in);
	private Grafo operacion= new Grafo();
	private int tam;
	private HashMap<String, Integer> aux= new HashMap<String,Integer>();
	
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
		
		public void tamaño() {
			System.out.println("Ingrese cantidad de nodos");
			tam=leer.nextInt();
			operacion.tamaño(tam);
			
		}
		public void ingresarDatos() {
			/*char[] b;
			b=(Arrays.copyOfRange(operacion.getVertices(), 0, tam));
				String e;
				int p;
				int cantidad;
				ArrayList<Integer> peso= new ArrayList<>();
				ArrayList<String> etiqueta= new ArrayList<>();
			for (int i = 0; i < b.length; i++) {
				char c = b[i];
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
			}*/
			
			aux.put("B", 4);
			aux.put("C", 2);
			operacion.crearVertice("A", aux);
			
			aux= new HashMap<String,Integer>();
			aux.put("C", 7);
			operacion.crearVertice("B", aux);
			
			
		}
		public void imprimir() {
			operacion.imprimir();
		}
		

	 
	 
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App a= new App();
		a.iniciar();
	}

}
