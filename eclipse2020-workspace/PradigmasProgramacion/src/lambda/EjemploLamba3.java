package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *Ordenamiento de unos datos en un ArrayList con clase anonima y lambda
 * @author Julian cardenas
 * @since 10/03/21
 *@version 1.0
 */
public class EjemploLamba3 {

	private List <String> lista;
	
	public EjemploLamba3() {
		this.lista= new ArrayList<String>();
		
	}
	
	public void llenarLista() {
		lista.add("Computacion");
		lista.add("Ciencias");
		lista.add("Inteligencia");
		lista.add("Artificial");
		
	}
	
	//---------Clase anonima-------------
	public void ordenar() {
		System.out.println("Ordenamiento con programacion Imperativa");
		Collections.sort(lista, new Comparator<String>() {
		
			public int compare (String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for (String dato : lista) {
			System.out.println(dato);
		}
		
		
		}
	//----------Expresion Lambda------
			public void ordenar2() {
				System.out.println(" Ordenamiento con Expresiones Lambda"
						+ "Programacion fincional");
				Collections.sort(lista, (String d1, String d2) -> 
				d1.compareTo(d2));
				
				for (String dato : lista) {
					System.out.println(dato);
				}
				
			}
			
			public static void main(String[] args) {
				EjemploLamba3 e1 = new EjemploLamba3();
				e1.llenarLista();
				e1.ordenar();
				e1.ordenar2();	
		
	}

	
}
