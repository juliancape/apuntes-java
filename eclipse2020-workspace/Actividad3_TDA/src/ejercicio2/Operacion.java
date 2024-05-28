package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

import tdaLista.TdaList;
/**
 * Clase que contiene los metodos para poder eliminar elementos con indices pares o impares
 * @author Jennifer Camacho y Julian Cardenas
 * @since 03-03-2021
 * @version 1.0
 *
 */
public class Operacion {

	private Scanner leerDato = new Scanner(System.in);
	private TdaList listaNumeros;
	
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
		int numero= leerDato.nextInt();
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
	 * Metodo para suma elementos de indice impares
	 * @return la suma
	 */
	public int operacionP() {
		ArrayList<Integer> lista= listaNumeros.getLista();
		int suma=0;
		for (int i = 0; i <lista.size() ; i++) {
			if (i%2!=0) {
				suma+=lista.get(i);
				
			}
		}
		return suma;
		
		
		
	}
	/**
	 * Metodo para suma elementos de indice pares
	 * @return la suma
	 */
	public int operacionI() {
		ArrayList<Integer> lista= listaNumeros.getLista();
		int suma=0;
		for (int i = 0; i <lista.size() ; i++) {
			if (i%2==0) {
				suma+=lista.get(i);
				
			}
		}
		return suma;
		
	}
	/**
	 * Metodo que compara si las sumas de pares e impares son iguales 
	 * si son iguales estado=true y borra pares
	 * @param sumaPares suma de los elementos de los indices pares
	 * @param sumaImpares suma de los elementos de los indices imparres
	 */
	public void comparar(int sumaPares, int sumaImpares) {
		ArrayList<Integer> lista= listaNumeros.getLista();
		boolean estado=false;
		int a=0;
		
		if (sumaPares==sumaImpares) {
			estado=true;
		}
		
		if(estado==true){
	           for(int i=0;i<lista.size();i++){
	                if(i%2!=0){ 
	                    lista.remove(i);
	                    a++;
	                }
	                if(i%2==0 && a%2!=0){
	                    lista.remove(i);
	                    a--;
	                }
	           }
	       }else{
	           for(int i=0;i<lista.size();i++){
	                if(i%2==0){ 
	                    lista.remove(i);
	                    a++;
	                }
	                if(i%2!=0 && a%2!=0){
	                    lista.remove(i);
	                    a--;
	                }
	 
	           	}
	       	}
		
		
		
		
	}
	
	
	/**
	 * Menu
	 */
	public void menu() {
		int opc=0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("operaciones con una lista de numeros ");
			System.out.println("1. crear lista");
			System.out.println("2. mostrar lista");
			System.out.println("3. realizar suma de elementos pares e impares");
			System.out.println("4. Realizar operacion  ");
			
			System.out.println("Entrar una de las opcciones");
			opc=leerDato.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Ingrese tamaño de la lista");
				int dato= leerDato.nextInt();
				crearLista(dato);
				break;

			case 2:
				System.out.println("mostrar lista: ");
				mostrarLista();
				System.out.println("");
				break;
			case 3:
				System.out.println("La suma de indice impares es: ");
			   System.out.println(operacionI()); ;
				System.out.println("La suma de indice pares es: ");
				System.out.println(operacionP());
				
				break;
			case 4:
				System.out.println("La lista quedaria de la siguiente forma: ");
				comparar(operacionP(), operacionI());
				mostrarLista();
				System.out.println("");
				
				
				break;
				
			default:
				System.out.println("Solo numeros entre el 1 y el 4");
				break;
			}
	
		}
	}
}
