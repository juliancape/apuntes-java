package arrays;

import java.util.Scanner;

public class Unidimensionales {

	public static int[] array =new int[5];
	
	
	public static Scanner leerdato =new Scanner(System.in);  
	
	
	public static void main(String[] args) {
		
		System.out.println("Entre el numero de elementos del array");
		int elementos =leerdato.nextInt();
		    //new es la que crea los objetos
		array =new int[elementos];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Entrar un dato entero: ");
							
						//   nextInt para enteros ;existen para booleans double ext
			array[i] = leerdato.nextInt();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			//sout para print
			System.out.println(array[i]);
			
			
		}
		 int dato=0;
		System.out.println("Entre el dato a buscar ");
		dato= leerdato.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]==dato) {
				System.out.println("Dato encontado");
			
			}
			else {
				System.out.println("Dato no encontrado");
				
			}
			}
		}
		
	}
	


