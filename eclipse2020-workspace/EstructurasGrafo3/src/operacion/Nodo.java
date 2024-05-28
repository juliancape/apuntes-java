package operacion;

public class Nodo {

	private int vertice;
	private Nodo siguiente;
	
	public Nodo(int vertice, Nodo siguiente) {
		super();
		this.vertice = vertice;
		this.siguiente = siguiente;
	}
	/**
	 * @return the vertice
	 */
	public int getVertice() {
		return vertice;
	}
	/**
	 * @param vertice the vertice to set
	 */
	public void setVertice(int vertice) {
		this.vertice = vertice;
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
