package funcion;

import java.util.Scanner;

public class array {

	public static int[] numero= new int[5];
	public static Scanner teclado =new Scanner(System.in);
	
	
	public static void main(String[] arrgs) {
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Entrar un dato entero ");
			numero[i] = teclado.nextInt();
			
		}
		int[] dato = {10,30,20,1};
		
		
	}
	
	
	
	
}
