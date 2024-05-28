/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author miguelsalazar
 *
 */
public class TdaLista<E> {
	
	private String nombre;
	private List<E> lista;
	
	public TdaLista(String nombre) {
		
		this.nombre = nombre;
		this.lista = new ArrayList<E>();
	}
	
	public TdaLista(String nombre,List<E> lista)
	{
		this.nombre=nombre;
		this.lista=lista;
	}
	
	public boolean esvacia() {
		return lista.isEmpty();
	}
	/**
	 * M�todo para obtener el n�mero de elementos de la lista.
	 * @return un entreo con el numero de elementos de la lista
	 */
	public int tamanio() {
		return lista.size();
	}
	/**
	 * M�todo para adicionar instancias ala final de la lista
	 * @param dato instancia de una clase 
	 * @return true on false
	 */
	public boolean add(E dato) {
		return lista.add(dato);
	}
	/**
	 * M�todo para adicionar una instancia al inicio de la lista, siempre en el nodo cero
	 * @param dato instancia de una clase 
	 */
	public void addInicio(E dato) {
		lista.add(0, dato);
	}
	/**
	 * M�todo para adicionar una instancia entre Nodos
	 * @param index especifica el n�mero del nodo que se desea insertar
	 * @param dato
	 */
	public void addEntreNodo(int index ,E dato) {
		lista.add(index,dato);
	} 
	/**
	 * 
	 * @param dato instancia a buscar en la lista
	 * @return true si encontro la instancia y false si no lo encontro
	 */
	public boolean contiene(E dato) {
		return lista.contains(dato);
	}
	/**
	 * M�todo Reemplaza el elemento en la posici�n especificada en esta lista
	 * con el elemento especificado como indice.
	 * @param index un darto entero n�mero de indice
	 * @param dato instancai a reemplazar
	 */
	public void actualiza(int index ,E dato) {
		lista.set(index, dato);
	}
	/**
	 * M�todo que recibe una instancia Devuelve el �ndice de la primera aparici�n del elemento
	 * especificado en esta lista, o -1 si esta lista no contiene el elemento. 
	 * @param dato instancia a buscar
	 * @return un entero con el �ndice de la primera aparici�n del elemento buscado
	 */
	public int indexOf(E dato) {
		return lista.indexOf(dato);
	}
	/**
	 * M�todo para borrar una Nodo de lista sabiendo su indice 
	 * @param index es el n�mero del indice del nodo a borrar
	 */
	public void removerI(int index) {
		lista.remove(index);
	}
	/**
	 * M�todo para borrar un Nodo de la lista  
	 * @param dato es la instancia a borrar
	 */
	public void removerO(E dato) {
		lista.remove(dato);
	}
	
	/**
	 * 	M�todo que muestra los datos contenidos en los nodos de la lista
	 */
	public void mostrar() {
		Iterator iteraLista = lista.iterator();
		while(iteraLista.hasNext()) {
		   Object element = iteraLista.next();
		   System.out.print(element + " ");
		}
	}
	/**
	 * M�todo que muestra los datos contenidos en los nodos de las lista.
	 * Implementa expresiones lambda son funciones an�nimas
	 * funciones que no necesitan una clase.
	 */
	public void muestra() {
		lista.forEach((n)->System.out.println(n));
			
	}
	/**
	 * 
	 * @return la lista de elementos 
	 */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<E> getLista() {
		return lista;
	}

	public void setLista(List<E> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "TdaLista [nombre=" + nombre + ", lista=" + lista + "]";
	}
	
	
	
	
	

}
