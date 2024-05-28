package ejercicio1;

import java.util.Scanner;

public class Agencia {
	
	
	private Vuelo[] vuelo;
	private static Scanner leerDato =new Scanner(System.in);
	
	
	/**
	 * @param vuelo
	 */
	public Agencia(Vuelo[] vuelo) {
		super();
		this.vuelo = vuelo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/**
		 * Método menu de opciones para acceso a las opciones del programa
		 */
		 
			int opc = 0;
			boolean salir=false;
			while(!salir) {
				System.out.println("Agencia Tiquetes muy Baratos");
				System.out.println("1. Crear Vuelo ");
				System.out.println("2. Comprar tiquetes");
				System.out.println("3. Consultar pasajero ");
				System.out.println("4. Mostrar Todos los vuelo");
				System.out.println("5. Salir");
				System.out.print("Entrar una de las opciones");
				opc = leerDato.nextInt();
				switch (opc) {
					case 1:
						crearVuelo();
						break;
					case 2:
						comprarTiquetes();
						;break;
					case 3:
						consultarPasajero();
						;break;
					case 4:
						listaVuelos();
						;break;
					
					case 5:salir=true;break;	
					default: 
						System.out.println("Solo números entre 1 y 5");break; 
			   }
			

		
		
		
		}
	}
	
	private static void listaVuelos() {
		// TODO Auto-generated method stub
		
	}
	
	private static void consultarPasajero() {
		// TODO Auto-generated method stub
		
	}
	public static void crearVuelo() {
		System.out.println("Numero de vuelo ");
		int nVuelo= leerDato.nextInt();
		System.out.println("Ciudad de salida ");
		String cSalida = leerDato.next();
		System.out.println("Ciudad de llegada ");
		String cLlegada = leerDato.next();
		
		
			System.out.println("Datos del piloto ");
			System.out.println("Identificacion ");
			int id = leerDato.nextInt();
			System.out.println("Nombre ");
			String nombre =leerDato.next();
			System.out.println("Horas de vuelo ");
			int nHoras= leerDato.nextInt();
			Piloto miPiloto= new Piloto(id, nombre, nHoras);
			
			
		System.out.println("Numero de puesto ");
		System.out.println("Letra ");
		String letra = leerDato.next();
		System.out.println("Numero");
		int numero = leerDato.nextInt();
		System.out.println("Pasajero");
		//Pasajero pasajero = leerDato.
		
		
		Puesto vueloPuesto = new Puesto(letra, numero, pasajero);
															//Datosp?
		Vuelo mivuelo= new Vuelo(nVuelo, cSalida, cLlegada, miPiloto, nPuesto, numero)
		
	}

	public static void comprarTiquetes() {
		
		
		
	}
	
	
}
