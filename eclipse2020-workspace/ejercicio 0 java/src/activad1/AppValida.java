package activad1;

import java.util.Scanner;

public class AppValida {
	
	
	static char[]  letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	
	static int cedula;
	public static Scanner leerdato =new Scanner(System.in);  
	static int resto;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Ingrese numero de cedula ");
		 cedula =leerdato.nextInt();
		 
		 //proceso
		resto=cedula%23;
		
		
		 for (int i = 0; i < letras.length; i++) {
			if (resto==i) {
				System.out.println("El codigo es: " +letras[i]+cedula) ;
			}
		}
		 
		
		
		
	}

}
