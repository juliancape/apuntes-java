package listas;

public class Lista<E> implements ITda<E> {
//instancia de la clse Nodo
	private Nodo inicio;
	private int tamanio;
	/**
	 * Consturctor de la clase sin parametros para
	 * inicializar los atributos de la clase
	 */
	public void Lista() {
		inicio =null;
		tamanio=0;
		
	}
	/**
	 * Metodo que para consultar si la lista esta vacia
	 * 
	 * @return true si el primer nodo (inicio), no apunta a otro nodo
	 */
	public boolean esVacia() {
		return inicio ==null;
	}
	/**
	 * Consultar cuantos elementos (nodos) tiene la lista
	 * 
	 * @return the tamanio
	 */
	public int getTamanio() {
		return tamanio;
	}
	
	/**
	 * Metodo para agregar un nevo nodo al final de la lista
	 * crear un nuevo nodo.
	 * Agregar al valor al nodo
	 * consultar si la lista esta vacia
	 */
	
	
	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
