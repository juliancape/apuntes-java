package funcion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero;
		int resultado;
		
		System.out.println("Ingrese un numero entero");
		numero= teclado.nextInt();
		
		resultado=fibonacciRecursivo(numero);
		System.out.println("El resultado es: "+resultado);
		
		
		

	}
	public static int fibonacciRecursivo(int n) {
		if (n==0) {
			return 0;
			
		}if (n==1) {
			return 1;
			
		}
		else {
			return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
		}
		
	}
	
	
	

}
