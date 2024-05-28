package pilaYCola;

import java.util.Stack;
/**
 *PILA JAVA 
 * @author Julian
 */
public class Pila {
	//La pila o Stack<E> representa una estructura de datos
	//de tipo Last-In-First-Out (LIFO)
	public static void main(String[] args) {
		//Crea e inicializa la pila
		Stack<String> miPila= new Stack<>();
		
		miPila.push("Mi");
		miPila.push("Pila");
		miPila.push("Java");
		System.out.println(miPila.peek());
		System.out.println(miPila.empty());
		miPila.pop();
		System.out.println("-----------");
		for (int i = 0; i < miPila.size(); i++) {
			System.out.println(miPila.get(i));
		}
		System.out.println(miPila.search("Mi"));
		
		
	}
	
	

}
