package appBuses;

import java.util.Scanner;
/**
*Clase App 
* @author Jennifer Camacho y Julian Cardenas
* @since 16-05-2021
* @version 01
*/
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaBuses listBus= new ListaBuses();
		Scanner leerDato= new Scanner(System.in);
		
		System.out.println("LISTA DE BUSES");
		listBus.crearList();
		System.out.println("\nIngrese el dia para los km recorridos ese dia por los buses");
	    System.out.println("1. Lunes, 2.Martes, 3.Miercoles, 4.Jueves, 5.Viernes, 6.Sabado, 7.Domingo");
	    int opcion=leerDato.nextInt();
	    listBus.conseguirDia(opcion);
		listBus.ordenTotalKm();
	    listBus.ordenKm();	
	    listBus.mayorKm();
	    listBus.conseguirPromedioKm();
	    
	    
		
			
	    
		
		
		
		
	}

}
