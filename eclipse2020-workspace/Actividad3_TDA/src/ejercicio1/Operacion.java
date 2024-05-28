package ejercicio1;

 
import java.util.ArrayList;
import java.util.Scanner;

import tdaLista.TdaList;
/**
 * Clase que contiene los metodos para poderagregar el cero entre una lista
 * @author Jennifer y Julian Cardenas
 * @since 01-03-2021
 * @version 1.0
 *
 */
public class Operacion {

	
	Scanner leeDato = new Scanner(System.in);
	private  TdaList listaNumeros;
	/**
	 * Constructor
	 */
	public Operacion() {
		listaNumeros = new TdaList();
	}
	
	/**
	 * metodo que agrega elementos a la lista
	 * @param dato tammaño de la lista
	 */
	public void crearLista(int dato) {
		
		for (int i = 0; i < dato; i++) {
			System.out.println("Ingrese numero en la posicion "+i);
		int numero= leeDato.nextInt();
		listaNumeros.addFinal(numero);
		}
		
		System.out.println("La longitud de la lista es ["+dato+"]");
	
	}
	
	
	/**
	 * Mostrar la lista
	 */
	public void mostrarLista() {
		listaNumeros.mostrar();
		
	}

	/**
	 * Metodo que suma los elementos posicion por posicion en la lista
	 * @return retorna el total de la suma
	 */
	public int suma() {
		System.out.println("");
		int total=0;
		ArrayList<Integer> lista= listaNumeros.getLista();
		
		for (int i = 0; i < lista.size(); i++) {
			total=total+lista.get(i);
			
		}
		System.out.println(total);
			
		return total;
		
	}
	
	
	/**
	 * Metodo que agrega el cero en la lista si es posible o si no
	 * @param total el total de la suma
	 */
	public void cero(int total) {
		
		ArrayList<Integer> lista= listaNumeros.getLista();
		if (total>lista.size()) {
            System.out.println("No se puede agregar ningun cero");
			
	}
	if (total<=0) {
            System.out.println("No se puede agregar ningun cero");
	}
	if (total<=lista.size() && total!=0) {
            System.out.println("Entra en este if");
            
            for (int i = total; i < lista.size(); i=i+total+1) {
                System.out.println("Entro en el for tantas veces:"+i);

                lista.add(i, 0);
            } 
				
			
	}
	}
	/**
	 * Menu del programa
	 */
	public void menu() {
		int opc=0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("operaciones con una lista de numeros ");
			System.out.println("1. crear lista");
			System.out.println("2. mostrar lista");
			System.out.println("3. realizar suma de elementos");
			System.out.println("4. Realizar operacion  Ceros entre lista ");
			System.out.println("5. salir");
			System.out.println("Entrar una de las opcciones");
			opc=leeDato.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Ingrese tamaño de la lista");
				int dato= leeDato.nextInt();
				crearLista(dato);
				break;

			case 2:
				System.out.println("mostrar lista: ");
				mostrarLista();
				System.out.println("");
				break;
			case 3:
				System.out.println("La suma de elementos es: ");
				suma();
				System.out.println("");
				
				break;
			case 4:
	
				cero(suma());
				break;
				
			
			case 5: salir=true;
					break;
				
			default:
				System.out.println("Solo numeros entre el 1 y el 7");
				break;
			}
	
		}
	}
	
}
