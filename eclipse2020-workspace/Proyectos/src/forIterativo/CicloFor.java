package forIterativo;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		
		int x;
		Scanner leerDato= new Scanner(System.in);
		System.out.println("Algoritmo para ingresar un numero x e imprimir todos los numeros pares de 0 a x");
		System.out.println("Ingrese numero: ");
		x=leerDato.nextInt();
		
		for (int i = 0; i <= x; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
			
		}
		System.out.println("¡Proceso finalizado con exito!");
		
		

	}

}
