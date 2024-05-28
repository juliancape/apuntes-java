package activad1;

import java.util.Scanner;

/* vectores consultar edades 
 *@author julian cardenas
 *@date 19/08/2020
 *@version 1
 */

 //variables
public class AppAnalitica {
	public static Scanner leerdato = new Scanner(System.in);
	public static int dato;
	public static int n;
	public static int mayor;
	public static int menor;
	public static float promedio;
	public static int total;
	public static void main(String[] args) {
		
		// n= numero de personas que se van a ingresar
		System.out.println("Numero de personas: ");
		n=leerdato.nextInt();
		System.out.println("Ingrese edades ");
		int vector[]=new int [n];
		
		//ingresar en un vector los datos
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Persona numero "+i);
			vector[i]=leerdato.nextInt();
			
			//proceso para determinar mayores de edad
			if (vector[i]>=18) {
				mayor++;
				
			}
			//proceso para determinar menores de edad
			else {
			menor++;	
			}
			
		}
		//proceso para tener el total de edades
		for (int i = 0; i < vector.length; i++) {
			total=vector[i]+total;
		}
		//proceso para encontrar promedio
		promedio=total/n;
		
		//mostrar datos  en pantalla
		System.out.println("Mayores de edad: "+mayor );
		System.out.println("Menores de edad: "+menor);
		System.out.println("Promedio de edades: "+promedio);
		
		
	}

}
