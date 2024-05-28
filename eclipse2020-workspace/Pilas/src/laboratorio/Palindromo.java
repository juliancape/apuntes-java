package laboratorio;
import tda.TDAPila;
import java.util.Scanner;
/**
 * Clase Palindromo para saber si una palabra es Palindroma
 * @author Jennifer Camacho y Julian Cardenas
 * @since 07-04-21
 *
 */

public class Palindromo {
/**
 * Metodo para saber si una palabra es palindroma
 * @param miPila
 * @param s
 */
public static void igualdad(TDAPila miPila, String s) {
	int cont=0;
	for (int i = 0; i < s.length(); i++) {
		if ((Character) miPila.tope() == s.toUpperCase().charAt(i)) {
			
			miPila.desapilar();
		
			cont++;
			
		if (cont==s.length()) {
			System.out.println("La palabra si es palindroma");
		}
			
	}
		else {
		    System.out.println("Las Palabra no es Palindroma");
		    for (int j = 0; j < s.length(); j++) {
				miPila.desapilar();
			}
		    
			break;
		}
		
	}
}
	/**
	 * Metodo para llenar pila
	 * @param miPila
	 * @param s
	 */
public static void llenarPila(TDAPila miPila, String s) {
	for (int i = 0; i < s.length(); i++) {
		miPila.apilar(s.toUpperCase().charAt(i));
			
		}
	
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int respuesta;
		Scanner leerDato= new Scanner(System.in);
		TDAPila miPila = new TDAPila<>();
		do {
		System.out.println("Ingrese la Palabra");
		String s= leerDato.next();
		
		
		llenarPila(miPila, s);
		igualdad(miPila, s);
		
		System.out.println("¿Quiere ingresar otra palabra?");
		System.out.println("1. SI  \n2. NO ");
		respuesta=leerDato.nextInt();
		}
		while(respuesta==1);
		
		
		
	}
}
