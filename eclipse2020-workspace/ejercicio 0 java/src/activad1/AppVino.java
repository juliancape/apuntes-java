package activad1;

import java.util.Scanner;

/* Programa para fijar precio de vino
 *@author julian cardenas
 *@date 19/08/2020
 *@version 1
 */


//Declaracion de variables
public class AppVino {
public static String a="a";
public static String b="b";
public static String tipo;
public static int tamano1=1;
public static int tamano2=2;
public static int tamano;
public static float kilo;
public static Scanner leerdato =new Scanner(System.in);
public static Scanner leerdato1 =new Scanner(System.in);
public static float precio;
public static Scanner leerdato2 =new Scanner(System.in);
	public static void main(String[] args) {
		
		
		//Inicio del programa pidiendo el tipo si es "a" o "b"
		System.out.println("Ingrese tipo de uva ");
		 tipo= leerdato.next();
		 
		 //tipo a
		 if (tipo.equals(a)) {
			 System.out.println("ingrese tamaño");
			 tamano=leerdato2.nextInt();
			 //elegir tamaño 1 o 2
			 
			 //tamaño 1
			 if (tamano==tamano1) {
				 System.out.println("por kilo vale $20");

					System.out.println("¿cuantos kilos va a vender?");
					kilo= leerdato1.nextInt();
					precio= kilo*20;
					System.out.println("el valor es de $"+precio);
			}
			 //tamaño 2
			 	else {
				System.out.println("por kilo vale $30");

				System.out.println("¿cuantos kilos va a vender?");
				kilo= leerdato1.nextInt();
				precio= kilo*30;
				System.out.println("el valor es de $"+precio);
			 	}
		}
		 
		 
		 //tipo b
		 else {
			 //elegir tamaño 1 o 2
			System.out.println("ingrese tamaño");
			tamano=leerdato2.nextInt();
			//tamaño 1
			if (tamano==tamano1) {
				System.out.println("por kilo vale $30");
				
				System.out.println("¿cuantos kilos va a vender?");
				kilo= leerdato1.nextInt();
				precio= kilo*30;
				System.out.println("el valor es de $"+precio);
			}
				//tamaño 2
				else {
					System.out.println("por kilo vale $50");
					System.out.println("¿cuantos kilos va a vender?");
					kilo= leerdato1.nextInt();
					precio= kilo*50;
					System.out.println("el valor es de $"+precio);
				}
			
		}
		
		
		
		
		

	}

}
