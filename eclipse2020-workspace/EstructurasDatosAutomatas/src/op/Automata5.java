package op;


import java.util.ArrayList;
import java.util.Scanner;

public class Automata5 {


	private String cadena;
	private char[] cadenaAutomata;
	private int contador; 
	private boolean aceptado;
    private ArrayList<String> arrayTransicion;
	
	/**
	 * @param cadena
	 * @param cadenaAutomata
	 * @param contador
	 * @param aceptado
	 */
	public Automata5(String cadena) {
		super();
		this.cadena = cadena;
		this.cadenaAutomata = cadena.toCharArray();
		this.contador = 0;
		this.aceptado = false;
		this.arrayTransicion= new ArrayList<String>();
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
		this.aceptado=true;
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
		System.out.println("Estado q0 ");
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				transicion("q0", 1, "q0");
				evaluarEstadoCero();
				
			}else if (cadenaAutomata[contador]== '0') {
				contador++;
				transicion("q0", 0, "q1");
				evaluarEstadoUno();
				
			}
			
		}
	}
	
	public void evaluarEstadoUno() {
		
			System.out.println("Estado q1");
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				transicion("q1", 1, "q2");
				evaluarEstadoDos();
			}else if (cadenaAutomata[contador]=='0') {
				contador++;
				transicion("q1", 0, "q1");
				evaluarEstadoUno();
			}
			
		}
	}
	public void evaluarEstadoDos() {
		
		System.out.println("Estado q2");
		if (contador < cadenaAutomata.length) {
			while(contador < cadenaAutomata.length) {
				if (cadenaAutomata[contador]=='1') {
					contador++;
					transicion("q2", 1, "q3");
					evaluarEstadoTres();
				}
				else if (cadenaAutomata[contador]=='0') {
				contador++;
				transicion("q2", 0, "q1");
				evaluarEstadoUno();
			}
			}
			
			
		}
	}
	
	
	public void evaluarEstadoTres() {
		System.out.println("Estado q3");
		this.aceptado=true;
		if (contador < cadenaAutomata.length) {
			if (cadenaAutomata[contador]=='1') {
				contador++;
				transicion("q3", 1, "q0");
				evaluarEstadoCero();
			}else if (cadenaAutomata[contador]=='0') {
				contador++;
				transicion("q3",0, "q1");
				evaluarEstadoUno();
			}
			
		}
	}
	
	/*public void evaluarEstadoError() {
		System.out.println("Estado de Error");
		this.aceptado= false;
	}*/
	public void transicion(String desde,int valor, String hasta) {
		arrayTransicion.add("("+desde+","+valor+") = "+hasta);	
	}
	
	public void imprimirTransicion() {
			System.out.println(arrayTransicion);
			
			char ultimo= arrayTransicion.get(arrayTransicion.size()-1).charAt(10);
			System.out.println("estado final de aceptacion: q"+ultimo);
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite Cadena: ");
		String cadena = in.next();
		Automata5 unAutomata= new Automata5(cadena);
		unAutomata.evaluarCadena();
		System.out.println("Transicion");
		unAutomata.imprimirTransicion();
		
	}
	
}
