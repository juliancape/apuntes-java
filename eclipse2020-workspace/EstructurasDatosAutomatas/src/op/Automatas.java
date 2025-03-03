package op;

import java.util.Scanner;

public class Automatas {
	
	private String cadena;
	private char[] cadenaAutomata;
	private int contador; 
	private boolean aceptado;
	/**
	 * @param cadena
	 * @param cadenaAutomata
	 * @param contador
	 * @param aceptado
	 */
	public Automatas() {
		super();
		this.cadena = "001111110";
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
	}
	/**
	 * @param cadena
	 * @param cadenaAutomata
	 * @param contador
	 * @param aceptado
	 */
	public Automatas(String cadena) {
		super();
		this.cadena = cadena;
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
	}
	/**
	 * @return the cadena
	 */
	public String getCadena() {
		return cadena;
	}
	/**
	 * @param cadena the cadena to set
	 */
	public void setCadena(String cadena) {
		this.cadena = cadena;
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
	}
	
	public void evaluarCadena() {
		this.aceptado=false;
		this.contador=0;
		evaluarEstadoCero();
		if (!aceptado) {
			System.out.println(cadena+" La cadena no "
					+ "esta definida en el automata");
		}else {
			System.out.println(cadena+" La cadena si esta"
					+ "definida en el automata");
		}
		
	}
	
	public void evaluarEstadoCero() {
		System.out.println("Estado so ");
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				evaluarEstadoCero();
				
			}else if (cadenaAutomata[contador]== '0') {
				contador++;
				evaluarEstadoUno();
				
			}
			
		}
	}
	
	public void evaluarEstadoUno() {
		
			System.out.println("Estado s1");
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				evaluarEstadoUno();
			}else if (cadenaAutomata[contador]=='0') {
				contador++;
				evaluarEstadoDos();
			}
			
		}
	}
	public void evaluarEstadoDos() {
		
		System.out.println("Estado s2");
		if (contador < cadenaAutomata.length) {
			while(contador < cadenaAutomata.length) {
				if (cadenaAutomata[contador]=='1') {
					contador++;
				}else {
					break;
				}
			}
			if (cadenaAutomata[contador]=='0') {
				contador++;
				evaluarEstadoTres();
			}
			
		}
	}
	
	public void evaluarEstadoTres() {
		System.out.println("Estado s3");
		this.aceptado=true;
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				evaluarEstadoTres();
			}else if (cadenaAutomata[contador]=='0') {
				contador++;
				evaluarEstadoError();
			}
			
		}
	}
	
	public void evaluarEstadoError() {
		System.out.println("Estado de Error");
		this.aceptado= false;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite Cadena: ");
		String cadena = in.next();
		Automatas unAutomata= new Automatas(cadena);
		unAutomata.evaluarCadena();
		
		
	}
	
	
	
	
	
}
