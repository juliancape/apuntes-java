package tda;

import java.util.Stack;

/**
 * 
 * @author Julian Cardenas 
 *
 */
public class TDAPila<E> {

	public Stack<E> pila;
	/**
	 * Constructor de la clase que permite crear una instacia (objeto)  de laclase stack
	 */
	public TDAPila() {
		this.pila=new Stack<>();
	}
	/**
	 * 
	 * @return true si la pila es vacia o false si la pila no esta vacia
	 */
	public boolean vacio() {
		return this.pila.empty();
	}
	
	public int tamanio() {
		return this.pila.size();
	}
	
	public void apilar(E elemento) {
		this.pila.push(elemento);
	}
	/**
	 * Extraer el dato de la pila
	 * @return la referencia del elemento
	 */
	public E desapilar() {
		return this.pila.pop();
	}
	/**
	 * 
	 * @return la referencia al elemento (dato) sin removerlo
	 */
	public E tope() {
		return this.pila.peek();
	}
	
	
	
	
}
