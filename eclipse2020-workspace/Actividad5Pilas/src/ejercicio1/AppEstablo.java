package ejercicio1;

import java.util.ArrayList;

import tda.TDAPila;
/**
 * Clase donde se crean los 3 establos de tipo TDAPila y en el  cual se llama
 *  la funcion recursiva de ordenamiento
 * @author Jennifer Camacho y Julian Cardenas
 * @since 10-04-21
 *
 */
public class AppEstablo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TDAPila  ePrincipal= new TDAPila();
		TDAPila  eJovenes= new TDAPila();
		TDAPila  eToros= new TDAPila();
		TDAPila opcional = new TDAPila();
	
		for (int i = 0; i < 15; i++) {
		    int peso= (int) ((Math.random()*(150 -500))+500);	
		    ePrincipal.apilar(peso);
		    
		}

		
		ePrincipal.recursividadEstablos(ePrincipal,opcional, eJovenes, eToros, 1);
		ePrincipal=opcional;
		System.out.println("\nPrincipal de 150 a 199 y de 451 a 500");
		ePrincipal.pila.stream().forEach(System.out::println);
		System.out.println("\nEn la pila principal hay "+ePrincipal.pila.stream().count());
		System.out.println("\nJovenes de 200 a 350");
		eJovenes.pila.stream().forEach(System.out::println);
		System.out.println("\nEn la pila de Jovenes hay "+eJovenes.pila.stream().count());
		
		System.out.println("\nToros de 351 a 450");
		eToros.pila.stream().forEach(System.out::println);
		System.out.println("\nEn la pila de Toros hay "+eToros.pila.stream().count());
		
		
		
		
	
		
	}

	}
