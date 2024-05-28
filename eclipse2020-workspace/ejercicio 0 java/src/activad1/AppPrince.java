package activad1;

import java.util.Scanner;

/* Programa para determinar el area de un circulo
 *@author julian cardenas
 *@date 15/08/2020
 *@version 1
 */

public class AppPrince {

	 static double largo;
	 static double ancho;
	 static double areametros;
	 static double areamm;
	 static double areakm;
	 static double areacirculo;
	 static double radio;
	 static double pi=3.141592654;
	 
	public static Scanner leerdato =new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		//PEDIR DATOS
		System.out.println("Ingrese largo (metros)");
		largo= leerdato.nextFloat();
		
		System.out.println("ingrese el ancho (metros)");
		ancho = leerdato.nextFloat();
		
		//PROCESO
		areametros= largo*ancho;
		areamm= areametros*1000000;
		areakm= (float) (areamm*Math.pow(10,-3));
		
		radio= (float) (areakm/(2*pi));
		areacirculo= (float) (pi*(radio*radio));
				
		System.out.println("el area en km^2 del circulo es de " +areacirculo);		
		
		System.out.println(+radio);
		
		
		
	}

}
