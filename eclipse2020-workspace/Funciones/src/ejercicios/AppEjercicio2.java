package ejercicios;

import java.util.Scanner;

public class AppEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leerDato=new Scanner(System.in);
		System.out.println("Ingrese el numero: ");
		 int numero= leerDato.nextInt();
		
		System.out.println(Ejercicio2.perfecto(numero));
		
		
		
	}

}
