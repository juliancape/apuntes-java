package ejercicio1;
/**
 /* Aplicacion almacenador de datos Vuelos
 * @author julian Cardenas peñuela
 * @since 2020-08-27
 * @version 03
 */

import java.util.Scanner;

public class AppMillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner leerdato=new Scanner(System.in);
	
		//Ingreso de datos vuelo 1 por gets	
Vuelo vuelo1= new Vuelo(0, null, null, 0, null);
		
		System.out.println("Ingrese numero del vuelo ");
		vuelo1.setNumero(leerdato.nextInt());
		System.out.println("Ingrese ciudad de salida");
		vuelo1.setCiudadSalida(leerdato.next());
		System.out.println("Ingrese ciudad llegada");
		vuelo1.setCiudadLlegada(leerdato.next());
		System.out.println("Ingrese millas recorridas");

		System.out.println("Ingrese piloto");
		Piloto piloto1 =new Piloto(leerdato.next(), null);
		vuelo1.setPiloto(piloto1);
		
		//Ingreso de datos vuelo 2 por gets	
		
Vuelo vuelo2= new Vuelo(0, null, null, 0, null);
		
		System.out.println("Ingrese numero del vuelo ");
		vuelo2.setNumero(leerdato.nextInt());
		System.out.println("Ingrese ciudad de salida");
		vuelo2.setCiudadSalida(leerdato.next());
		System.out.println("Ingrese ciudad llegada");
		vuelo2.setCiudadLlegada(leerdato.next());
		System.out.println("Ingrese millas recorridas");
		vuelo2.setMillas(leerdato.nextFloat());
		System.out.println("Ingrese piloto");
		Piloto piloto2 =new Piloto(leerdato.next(), null);
		vuelo2.setPiloto(piloto2);
		
		//Ingreso de datos vuelo 3 por gets	
Vuelo vuelo3= new Vuelo(0, null, null, 0, null);
		
		System.out.println("Ingrese numero del vuelo ");
		vuelo3.setNumero(leerdato.nextInt());
		System.out.println("Ingrese ciudad de salida");
		vuelo3.setCiudadSalida(leerdato.next());
		System.out.println("Ingrese ciudad llegada");
		vuelo3.setCiudadLlegada(leerdato.next());
		System.out.println("Ingrese millas recorridas");
		vuelo3.setMillas(leerdato.nextFloat());
		System.out.println("Ingrese piloto");
		Piloto piloto3 =new Piloto(leerdato.next(), null);
		vuelo3.setPiloto(piloto3);
		
		//Impresion de datos por sets 1, 2 y 3
		
		System.out.println("El vuelo " +vuelo1.getNumero() + " que salio de ciudad " +vuelo1.getCiudadSalida() + " con destino a " +vuelo1.getCiudadLlegada() + ". Piloto " + vuelo1.getPiloto().getPiloto() + " recorrio " + vuelo1.getMillas() +" millas");
		
		System.out.println("El vuelo " +vuelo2.getNumero() + " que salio de ciudad " +vuelo2.getCiudadSalida() + " con destino a " +vuelo2.getCiudadLlegada() + ". Piloto " + vuelo2.getPiloto().getPiloto() + " recorrio " + vuelo2.getMillas() +" millas");
		
		System.out.println("El vuelo " +vuelo3.getNumero() + " que salio de ciudad " +vuelo3.getCiudadSalida() + " con destino a " +vuelo3.getCiudadLlegada() + ". Piloto " + vuelo3.getPiloto().getPiloto() + " recorrio " + vuelo3.getMillas() +" millas");
		
		
		// METODO IF PARA SABER CUAL VUELO TIENE MAS MILLAS 
		if (vuelo1.getMillas()>vuelo2.getMillas() && vuelo1.getMillas()>vuelo3.getMillas()) {
			System.out.println("El vuelo que mas millas volo es el vuelo numero: " + vuelo1.getNumero());
		}
		if (vuelo2.getMillas()>vuelo1.getMillas() && vuelo2.getMillas()>vuelo3.getMillas()) {
			System.out.println("El vuelo que mas millas volo es el vuelo numero: " + vuelo2.getNumero());
			
		
		}
		if (vuelo3.getMillas()>vuelo2.getMillas() && vuelo3.getMillas()>vuelo1.getMillas()) {
			System.out.println("El vuelo que mas millas volo es el vuelo numero: " + vuelo3.getNumero());
	
		}
	}
	
	
	
}
