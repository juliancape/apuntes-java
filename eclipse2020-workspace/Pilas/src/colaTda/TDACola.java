package colaTda;

import java.util.LinkedList;
import java.util.Queue;

public class TDACola<E> {

	  private Queue<E> cola;
	    /**
	     * Constructor de la clase, crea una instancia d ela clase Queue
	     */
	    public TDACola(){
	        cola =new LinkedList<>();
	    }
	    /**
	     * Funci�n para evaluar si la cola esta vacia
	     * @return true si la cola esta vacia o false si no esta vacia.
	     */
	    public boolean vacia(){
	        return this.cola.isEmpty();
	    }
	    /**
	     * Funci�n para retornar el n�mero de elementos cotenidos en la cola
	     * @return un n�mero entero con el n�mero de elementos en la cola
	     */
	    public int tamanio(){
	        return this.cola.size();
	    }
	    /**
	     * Funci�n para insertar un elemento en el extermo inferior de la cola (al final de la cola)
	     * @param dato instancia (objeto) a insertar 
	     */
	    public void encolar(E dato){
	        this.cola.add(dato);
	    }
	    /**
	     * Funci�n para extraer un elemento del extremo superior de la cola (al imcio de la cola) 
	     * @return el elemento extraido
	     */
	    public E decolar(){
	        return this.cola.poll();
	    }
	    /**
	     * Fuci�n para mostrar el elemtno del xtremo superior de la cola (al imcio de la cola) si extraerlo
	     * @return el elemento en el extremo superior de la cola
	     */
	    public E tope(){
	        return this.cola.peek();
	    }
	    /**
	     * Funci�n para mostar los elementos contenmidos en la cola sin extraerlos
	     */
	    public void mostrar(){
	        cola.forEach((n)->System.out.println(n));
	    }

	
	
	
	
}
