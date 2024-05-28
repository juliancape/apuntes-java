package tda;

import java.util.Stack;

import ejercicio1.Automovil;

/**
 * TDAPila tiene los metodos para trabajar con la pila en especial el ordenamiento recursivo 
 * y el ordenamiento alfabetico 
 * @author Jennifer Camacho y Julian Cardenas
 * @since 10-04-21
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
	/**
	 * 
	 * @param ePrincipal establo principal
	 * @param eJovenes establo jovenes
	 * @param eToros establo toros
	 * @param i 
	 * @return un objeto de tipo TDAPila
	 */
	public static TDAPila recursividadEstablos(TDAPila ePrincipal,TDAPila opcional, TDAPila eJovenes, TDAPila eToros, int i ) {
		
	
		if (i==14) {	
			if ((int) ePrincipal.tope()<=199 || (int) ePrincipal.tope()>=451) {
				opcional.apilar(ePrincipal.tope());
				
			}
			if ((int) ePrincipal.tope()>=200 && (int) ePrincipal.tope()<=350) {
				eJovenes.apilar(ePrincipal.tope());
				
			} if ((int) ePrincipal.tope()>=351 && (int) ePrincipal.tope()<=450) {
				eToros.apilar( ePrincipal.tope());
				
			} 
			
			 ePrincipal.desapilar();
			
			 
		}
		//ePrincipal.pila.stream().forEach(System.out::println);
		if (i<15) {
			
			if ((int) ePrincipal.tope()<=199 || (int) ePrincipal.tope()>=451) {
			 opcional.apilar(ePrincipal.tope());
				
			}
			if ((int) ePrincipal.tope()>=200 && (int) ePrincipal.tope()<=350) {
				eJovenes.apilar(ePrincipal.tope());
				
			} if ((int) ePrincipal.tope()>=351 && (int) ePrincipal.tope()<=450) {
				eToros.apilar( ePrincipal.tope());
				
			} 
			
			ePrincipal.desapilar();
			
		recursividadEstablos(ePrincipal,opcional,eJovenes, eToros,i+1);
		}
		
		 return ePrincipal;
		
	}
	
	/**
	 * Metodo que permite ordenar alfabeticamente una pila
	 * @param miPila 
	 */
	public void ordenar(TDAPila<Automovil> miPila, TDAPila<Automovil> opcional) {
		
		  for(int i=0;i<2;i++){
              opcional.apilar(miPila.tope());
              miPila.desapilar();
          }  
          miPila.apilar(new Automovil("Hyundai","tucson"));
          for(int i=0;i<2;i++){
              miPila.apilar(opcional.tope());
              opcional.desapilar();
          
          }
          
          System.out.println("\nLista con la marca Hyundai ya integrada");
          miPila.pila.stream().map(p->p.getClase()).forEach(System.out::println);
      
     
          for(int i=0;i<5;i++){
              opcional.apilar(miPila.tope());
              miPila.desapilar();
          }  
          miPila.apilar(new Automovil("Citroen","c5"));
          for(int i=0;i<5;i++){
              miPila.apilar(opcional.tope());
              opcional.desapilar();
          
          }
      
          System.out.println("\nLista con la marca Hyundai y Citroen ya incluida");
          miPila.pila.stream().map(p->p.getClase()).forEach(System.out::println);
      
    //  miPila.pila.sort((c1,c2)->c1.getClase().compareTo(c2.getClase()));
    //  miPila.pila.stream().map(p->p.getClase()).forEach(System.out::println);
}

			
	
}
	
	

