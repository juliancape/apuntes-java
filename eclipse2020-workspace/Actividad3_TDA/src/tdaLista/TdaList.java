package tdaLista;
import java.util.ArrayList;
	import java.util.Iterator;
	/**
	 * Programa TDA para implemnetar lista que contengan cualquier tipo de dato primario o instancias de una clase
	 * @author Jennifer y Julian Cardenas
	 * @since 01-03-2021
	 * @version 1.0
	 * @param <E> cualquier tipo de objeto
	 */
public class TdaList<E> {	

		private ArrayList<E> lista1;

		
		/**
		 * Constructor de la clase
		 */
		public TdaList() {
			this.lista1 =new ArrayList();
		}
		/**
		 * M�todo para obtener el estado de la lista vacio o no vacia
		 * @return true si la lista esta vacio, false si la lista no esta vacia
		 */
		public boolean esvacia() {
			return lista1.isEmpty();
			
		}
		/**
		 * M�todo para obtener el n�mero de elementos de la lista.
		 * @return un entreo con el numero de elementos de la lista
		 */
		public int tamanio() {
			return lista1.size();
		}
		/**
		 * M�todo para adicionar instancias ala final de la lista
		 * @param dato instancia de una clase 
		 * @return true on false
		 */
		public boolean addFinal(E dato) {
			return lista1.add(dato);
		}
		/**
		 * M�todo para adicionar una instancia al inicio de la lista, siempre en el nodo cero
		 * @param dato instancia de una clase 
		 */
		public void addInicio(E dato) {
			lista1.add(0, dato);
		}
		/**
		 * M�todo para adicionar una instancia entre Nodos
		 * @param index especifica el n�mero del nodo que se desea insertar
		 * @param dato
		 */
		public void addEntreNodo(int index ,E dato) {
			lista1.add(index,dato);
		} 
		/**
		 * 
		 * @param dato instancia a buscar en la lista
		 * @return true si encontro la instancia y false si no lo encontro
		 */
		public boolean contiene(E dato) {
			return lista1.contains(dato);
		}
		/**
		 * M�todo Reemplaza el elemento en la posici�n especificada en esta lista
		 * con el elemento especificado como indice.
		 * @param index un darto entero n�mero de indice
		 * @param dato instancai a reemplazar
		 */
		public void actualiza(int index ,E dato) {
			lista1.set(index, dato);
		}
		/**
		 * M�todo que recibe una instancia Devuelve el �ndice de la primera aparici�n del elemento
		 * especificado en esta lista, o -1 si esta lista no contiene el elemento. 
		 * @param dato instancia a buscar
		 * @return un entero con el �ndice de la primera aparici�n del elemento buscado
		 */
		public int indexOf(E dato) {
			return lista1.indexOf(dato);
		}
		/**
		 * M�todo para borrar una Nodo de lista sabiendo su indice 
		 * @param index es el n�mero del indice del nodo a borrar
		 */
		public void removerI(int index) {
			lista1.remove(index);
		}
		/**
		 * M�todo para borrar un Nodo de la lista  
		 * @param dato es la instancia a borrar
		 */
		public void removerO(E dato) {
			lista1.remove(dato);
		}
		
		/**
		 * 	M�todo que muestra los datos contenidos en los
		 *  nodos de la lista
		 */
		public void mostrar() {
			Iterator iteraLista = lista1.iterator();
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
			lista1.forEach((n)->System.out.println(n));
				
		}
		
		
		/**
		 * 
		 *  @return la lista de elementos
		 */
		public ArrayList<E> getLista(){
			return this.lista1;
		}
		
		
	}

