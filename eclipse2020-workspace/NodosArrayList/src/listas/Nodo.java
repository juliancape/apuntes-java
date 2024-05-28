package listas;

public class Nodo <E> {

	private E dato;
	private Nodo siguiente;
	
	public void Nodo() {
		this.dato = null;
		this.siguiente =null;
	}

	/**
	 * @return the dato
	 */
	public E getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(E dato) {
		this.dato = dato;
	}

	/**
	 * @return the siguiente
	 */
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	 * @param siguiente the siguiente to set
	 */
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	
}
