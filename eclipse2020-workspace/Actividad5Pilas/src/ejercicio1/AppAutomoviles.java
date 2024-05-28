package ejercicio1;

import tda.TDAPila;
/**
 * Clase donde se llena la pila de automoviles y se llama al metodo de ordenamiento
 * @author Jennifer Camacho y Julian Cardenas
 * @since 10-04-21
 *
 */
public class AppAutomoviles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TDAPila <Automovil> miPila= new TDAPila<Automovil>();
		TDAPila <Automovil>opcional=new TDAPila<Automovil>();
		
		System.out.println("Lista Inicial");
		miPila.apilar(new Automovil("Audi", "SuperX"));
		miPila.apilar(new Automovil("Bmw", "Forza"));
		miPila.apilar(new Automovil("Ferrari", "FZ100"));
		miPila.apilar(new Automovil("Honda", "RXT"));
		miPila.apilar(new Automovil("Jaguar", "GT500"));
		miPila.apilar(new Automovil("Lamborghini", "CT300"));
		
	//	miPila.pila.stream().map(p->p.getClase()).forEach(System.out::println);
	//	miPila.ordenar(miPila, opcional);
	
		int f=10;
		for (f=5; f>0; f--) {
			System.out.println(f);
			System.out.println(f);
		}
		
		
		
		
		
		
		
		
		
		/*  stream.sort	
		System.out.println("\nLista con nuevo elemento");
		miPila.apilar(new Automovil("Hyandi", "JP500") );
		miPila.ordenar(miPila, opcional);
		
		System.out.println("\nNuevo elemento");
		miPila.apilar(new Automovil("Citroen", "FR7"));
		miPila.ordenar(miPila);
		*/
	}

}
