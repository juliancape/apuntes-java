package ejercicio1;

import java.util.Scanner;
/**
 * Clase APPParqueadero donde se ejecuta el programa
 *@author Jennifer Camacho y Julian Cardenas
 *@since 19-04-2021
 */
public class AppParqueadero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TDACola parqueo= new  TDACola();
		TDACola espera= new TDACola();
		
		Scanner leerDato= new Scanner(System.in);
		
		
		
		
		int op=0;
	do {
		System.out.println("INGRESE LA OPCCION");
		
		System.out.println("1. Ingreso de vehiculo");
		System.out.println("2. Retiro de vehiculo");
		System.out.println("");
		op=leerDato.nextInt();
		switch(op) {
		
		case 1:
		{
			System.out.println("Ingrese placa");
			String placa= leerDato.next();
			TDACola.ingresar(placa,parqueo,espera);
			break;
		}case 2: {
			System.out.println("Digita la placa");
			String placa= leerDato.next();
			TDACola.sacar(placa, parqueo, espera);
			break;
		}
		
		default: 
		{
			System.out.println("Adios");
		}
			
		}
	/*	System.out.println("---Parqueo---");
		parqueo.mostrar();
		System.out.println("---Espera--");
		espera.mostrar();   */
	} while (op>=0 && op<=2);
		
		
		
		
	}
	
	
	
}
