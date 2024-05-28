package ejercicio1;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Clase TDACola con los metodos de la cola
 * @author Jennifer Camacho y Julian Cardenas
 *@since 19-04-2021
 * @param <E>
 */
public class TDACola<E> {

	  private Queue<E> cola;
	    /**
	     * Constructor de la clase, crea una instancia d ela clase Queue
	     */
	    public TDACola(){
	        cola =new LinkedList<>();
	    }
	    /**
	     * Función para evaluar si la cola esta vacia
	     * @return true si la cola esta vacia o false si no esta vacia.
	     */
	    public boolean vacia(){
	        return this.cola.isEmpty();
	    }
	    /**
	     * Función para retornar el número de elementos cotenidos en la cola
	     * @return un número entero con el número de elementos en la cola
	     */
	    public int tamanio(){
	        return this.cola.size();
	    }
	    /**
	     * Función para insertar un elemento en el extermo inferior de la cola (al final de la cola)
	     * @param dato instancia (objeto) a insertar 
	     */
	    public void encolar(E dato){
	        this.cola.add(dato);
	    }
	    /**
	     * Función para extraer un elemento del extremo superior de la cola (al imcio de la cola) 
	     * @return el elemento extraido
	     */
	    public E decolar(){
	        return this.cola.poll();
	    }
	    /**
	     * Fución para mostrar el elemtno del xtremo superior de la cola (al imcio de la cola) si extraerlo
	     * @return el elemento en el extremo superior de la cola
	     */
	    public E tope(){
	        return this.cola.peek();
	    }
	    /**
	     * Función para mostar los elementos contenmidos en la cola sin extraerlos
	     */
	    public void mostrar(){
	        cola.forEach((n)->System.out.println(n));
	        
	    }
	    public boolean buscar(E dato) {
			return this.cola.contains(dato);
	    	
	    }
	  /**
	   * Metodo para ingresar el auto (placa)
	   * @param dato la placa que se va a ingresar
	   * @param parqueo la via de parqueo de tipo TDACola
	   * @param espera la via de espera de tipo TDACola
	   */
	    public static void ingresar(String dato, TDACola parqueo, TDACola espera) {
	    	
	    		if (parqueo.tamanio()<=9) {
	    			parqueo.encolar(dato);
	    			
	    	
	    	//	LLENAR LA COLA RAPIDAMENTE 
	    		parqueo.encolar("aaa");
	    		parqueo.encolar("bbb");
	    		parqueo.encolar("ccc");
	    		parqueo.encolar("ddd");
	    		parqueo.encolar("eee");
	    		parqueo.encolar("fff");
	    		parqueo.encolar("ggg");
	    		parqueo.encolar("hhh");
	    		parqueo.encolar("iii");
	    		
	    		}else {
	    			System.out.println("Espere su turno en la cola de espera");
	    			espera.encolar(dato);
	    			
	    		}
	    		
	    	
	    		
	    	}
	    	
	    /**
	     * Metodo para sacar el automovil de la cola de parqueo
	     * @param dato placa a buscar
	     * @param parqueo la via de parqueo de tipo TDACola
	     * @param espera la via de espera de tipo TDACola
	     */
	    	public static void sacar(String dato, TDACola parqueo, TDACola espera) {
	    		
	    		if (parqueo.buscar(dato)==true) {
	    			int movimientos=0;
	                            
	    			for (int i = 0; i < parqueo.tamanio(); i++) {	
	                                
	                                if (parqueo.tope().equals(dato)) {
	    					parqueo.decolar();
	                                            break;
	    				}	
	                                else {
	    					
	    					String inicial;
	    					inicial=(String) parqueo.tope();
	                                            parqueo.decolar();
	                                            movimientos++;
	                                            parqueo.encolar(inicial);                 
	    				}	
	    			}
	    			
	    			
	    			if (movimientos==0) {
	    				System.out.println("El automovil con las placas ["+ dato + "] ha salido de la cola,\nhizo un total de "+ 
	    			(movimientos+1) +" movimentos dentro de la via."+"\nSe tuvieron que mover "+movimientos+" automoviles de la via para sacar el indicado."+
	    					"\n\nEl dispositivo de la entrada sur marco que entraron "+ movimientos+" automoviles \npara poder sacar el automovil indicado");
	    			}
	    			if (movimientos!=0) {
	    				int valorAnteriorDeMovimientos=movimientos;
	    				int aux=parqueo.tamanio()-movimientos;
	    				for (int i = 0; i < parqueo.tamanio()+aux; i++) {
	    				String	inicial=(String) parqueo.tope();
	                        parqueo.decolar();
	                        movimientos++;
	                        parqueo.encolar(inicial);
	    					
	    				}
	    				System.out.println("El automovil con las placas ["+ dato + "] ha salido de la cola,\nhizo un total de "+ 
	    						(valorAnteriorDeMovimientos+1) +" movimentos dentro de la via."+"\nSe tuvieron que mover "+valorAnteriorDeMovimientos+" automoviles de la via para sacar el indicado."+
	    								"\n\nEl dispositivo de la entrada sur marco que entraron "+ (valorAnteriorDeMovimientos+aux)+" automoviles \npara poder sacar el automovil indicado "+
	    						"y conservar el orden de llegada");
	    					
	    				
	    			}
	    			if (espera.vacia()!=true) {
	    				parqueo.encolar(espera.decolar());
	                                    
	    			}
	    			}else {
	    			System.out.println("No se encuentra el Automovil");
	    		}
	        
	        }
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    
	    
	
	
	
	
}
