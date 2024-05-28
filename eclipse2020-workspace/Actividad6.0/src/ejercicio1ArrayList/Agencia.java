package ejercicio1ArrayList;

import java.util.Scanner;

import ejercicio1.Piloto;
import ejercicio1.Vuelo;

public class Agencia {

	private String nombre;
	private Vuelo vuelos[];
	private Scanner leerDato= new Scanner(System.in);
	/**
	 * @param nombre
	 * @param vuelos
	 */
	public Agencia(String nombre, int nVuelos) {
		super();
		this.nombre = nombre;
		vuelos = new Vuelo[nVuelos];
	}
	
	public void run() {
		int op=0;
		boolean salir = false;
		while(!salir) {
			System.out.println(" ");
			System.out.println("Bienvenido a la agencia TiquetesMuyBaratos.com");
			System.out.println("----------------------------------------------");
			System.out.println("1. Crear vuelo");
			System.out.println("2. Comprar tiquetes");
			System.out.println("3. Consultar pasajero");
			System.out.println("4. Lista vuelos");
			System.out.println("5. Salir");
			System.out.println("Digite una opcion");
			op = leerDato.nextInt();
			switch(op) {
				case 1:
					crearVuelo();
					break;
				case 2:
					comprarTiquete();
					break;
				case 3:
					buscarPasajero();
					break;
				case 4:
					dataVuelos();
					break;
				case 5:
					salir = true;
					break;
				default:
					System.out.println("Digite un numero entre 1 y 5");
					break;
					}
			System.out.println("----------------------------------------------");
			System.out.println(" ");
				}
	
			}
		
	//METODO PARA CREAR VUELO
		public void crearVuelo() {
			System.out.println("Bienvenido, crear nuevo vuelo");
			System.out.println("Numero del vuelo...");
			int numero = leerDato.nextInt();
			System.out.println("Ciudad de salida...");
			String salida = leerDato.next();
			System.out.println("Ciudad de llegada...");
			String llegada = leerDato.next();
			System.out.println(" ");
			System.out.println("Datos del piloto");
			System.out.println("Identificacion...");
			int id = leerDato.nextInt();
			System.out.println("Nombre...");
			String nombreP = leerDato.next();
			System.out.println("Horas de vuelo...");
			int horasVuelo = leerDato.nextInt();
			System.out.println(" ");
			System.out.println("Numero de puestos...");
			int nPuestos = leerDato.nextInt();
			
			
			Piloto miPiloto = new Piloto(id,nombreP,horasVuelo);
			Vuelo miVuelo = new Vuelo(numero,salida,llegada,miPiloto,nPuestos);
			
				for (int i = 0; i < vuelos.length; i++) {
					if (vuelos[i]==null) {
						vuelos[i]=miVuelo;
						break;
						}
					}
	
				}
			
			public void comprarTiquete() {
				System.out.println("Venta de Tiquetes");
				System.out.println("Datos del vuelo");
				int numeroVuelo = leerDato.nextInt();
				
				System.out.println("Datos pasajero");
				System.out.println("Identificacion...");
				int id = leerDato.nextInt();
				System.out.println("Nombre...");
				String nombrePa = leerDato.next();
				System.out.println("Edad...");
				int edad = leerDato.nextInt();
				System.out.println("Genero...");
				String genero = leerDato.next();
				
				Pasajero miPasajero = new Pasajero(id, nombrePa, edad, genero);
				
				for (int i = 0; i < vuelos.length; i++) {
					if (vuelos[i].getnVuelo()==numeroVuelo) {
						vuelos[i].buscarPasajero(miPasajero);
						System.out.println("Pasajero Agregado con exito");
						break;
					}
				}
			
				
			}
		
			public void buscarPasajero() {
				
				Puesto puesto = null;
				System.out.println("Datos del vuelo");
				int numeroVuelo = leerDato.nextInt();
				System.out.println("Datos Pasajero");
				System.out.println("Identificacion ");
				int id = leerDato.nextInt();
				for (Vuelo vuelo : vuelos) {
					if (vuelo != null) {
						if (vuelo.getnVuelo()==numeroVuelo) {
											//vuelo.getPuestos()
							for (Puesto p : vuelo.getPuestos().length) {
								if (p.getPasajero().getId()==id) {
									puesto = p;
									break;
								}
							}
						}
					}
				}
				
				if (puesto ==null) {
					System.out.println("Pasajero no Existe");
					
				}
				else {
				System.out.println(puesto);
				}
			}
			
			public void dataVuelos() {
				for (Vuelo v : vuelos) {
					System.out.println(v);
				}
				
			}
			
		
		
		
		
		
		
		
		
}
