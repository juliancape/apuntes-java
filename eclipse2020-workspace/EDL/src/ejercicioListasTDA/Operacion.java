package ejercicioListasTDA;

import java.util.ArrayList;
import java.util.Scanner;

import lista.dta.ArrayList.TdaList;
/**
 * Implementa las funciones para crear la  lista
 * y realizar busqueda
 * @author Julian cardenas peñuela
 *@since 24-02-2021
 */
public class Operacion {
	private Scanner leerDato = new Scanner(System.in);
	private TdaList listaNumeros;
	
	public Operacion() {
		listaNumeros = new TdaList();
	}
	/**
	 * Metoodo pparra genera  aleatoriamente los numeros en la lista
	 * el tamaño de la lista depende de dato
	 * @param dato
	 */
	public void generarLista(int dato) {
		
		for (int i = 0; i < dato; i++) {
			listaNumeros.addFinal(Math.random());
		}
	}
	
	/**
	 * 
	 * @return un entero el numero mayor de la lista
	 */
	public int buscarMayor() {
			int mayor=0;
			//Se tiene la referencia de la lista
			ArrayList<Integer> lista = listaNumeros.getLista();
			
			for (Integer numero : lista) {
				if (numero > mayor) {
					mayor= numero;
					break;
				}
			}
			return mayor;
	
			
			}
	public int buscarMenor() {
		int menor=0;
		ArrayList<Integer> lista = listaNumeros.getLista();
		
		for (Integer numero : lista) {
			if (numero < menor) {
				menor = numero;
				break;
			}
		}
		return menor;
	
	
			
	}
	/**
	 * Metodo para buscar el promedio en la lista
	 * @return el promedio
	 */
	public double promedio() {
		double promedio;
		int suma =0;
		ArrayList<Integer> lista = listaNumeros.getLista();
		for (Integer integer : lista) {
			suma+=integer;
		}
		
		return suma/lista.size();
		
	}
	
	public boolean buscarNumero(int dato) {
		boolean encontro=false;
		ArrayList<Integer> lista = listaNumeros.getLista();
		for (Integer numero : lista) {
			
			if (dato==numero) {
				encontro =true;
				break;
			}
		
		}
		return encontro;
	
	}
	
	public void menu() {
		int opc=0;;
		boolean salir=false;
		while(!salir) {
			System.out.println("operaciones con una lista de numeros ");
			System.out.println("1. crear lista");
			System.out.println("2. el mayor");
			System.out.println("3, el menor");
			System.out.println("4. buscar numero");
			System.out.println("5. promedio");
			System.out.println("6. mostrar lista");
			System.out.println("7. salir");
			System.out.println("Entrar una de las opcciones");
			opc=leerDato.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Crear lista");
				System.out.println("Cuantos datos en la lista");
				generarLista(leerDato.nextInt());
				break;

			case 2:
				System.out.println("El mayor numero en la lista es: "+buscarMayor());
				break;
			case 3:
				System.out.println("El menor numero de la lista es: "+buscarMenor());
				break;
			case 4:
				System.out.println("Buscar numero en lal ista");
				System.out.println("Entrar el numero a buscar");
				int numero=leerDato.nextInt();
				if (buscarNumero(numero)) {
					System.out.println("Numero encontrado");
					
					
				}else {
					System.out.println("No encontrado");
				}
			case 5:
				System.out.println(promedio());
				break;
			case 6: 
				listaNumeros.muestra();
				break;
			case 7: salir=true;
					break;
				
			default:
				System.out.println("Solo numeros entre el 1 y el 7");
				break;
			}
	
		}
	}
	
	
	
	
}
