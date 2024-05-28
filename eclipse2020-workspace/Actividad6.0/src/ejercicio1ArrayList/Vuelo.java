package ejercicio1ArrayList;

import ejercicio1.Piloto;


public class Vuelo {

	private int numero;
	private String salida;
	private String llegada;
	private Piloto piloto;
	private Puesto puestos[];
	//CONSTRUCTOR
	/**
	 * @param numero
	 * @param salida
	 * @param llegada
	 * @param piloto
	 * @param puestos
	 */
	public Vuelo(int numero, String salida, String llegada, Piloto piloto, int nPuestos) {
		super();
		this.numero = numero;
		this.salida = salida;
		this.llegada = llegada;
		this.piloto = piloto;
		puestos = new Puesto[nPuestos];
	
	for (int i = 0; i < puestos.length; i++) {
		puestos[i] = new Puesto('A', (i+100));
	}	
		
	
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the salida
	 */
	public String getSalida() {
		return salida;
	}
	/**
	 * @param salida the salida to set
	 */
	public void setSalida(String salida) {
		this.salida = salida;
	}
	/**
	 * @return the llegada
	 */
	public String getLlegada() {
		return llegada;
	}
	/**
	 * @param llegada the llegada to set
	 */
	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}
	/**
	 * @return the piloto
	 */
	public Piloto getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the puestos
	 */
	public Puesto[] getPuestos() {
		return puestos;
	}
	/**
	 * @param puestos the puestos to set
	 */
	public void setPuestos(Puesto[] puestos) {
		this.puestos = puestos;
	}
	
	public void agregarPasajero(Pasajero pasajero) {
		
		for (int i = 0; i < puestos.length; i++) {
			if (puestos[i].getPasajero()== null) {
				puestos[i].setPasajero(pasajero);
				break;
			}
		}
	}
	
	public Puesto busacarPasajero(int idPasajero) {
		Puesto puesto=null;
		for (Puesto p : puestos) {
			if (p!=null) {
				if (puesto.getPasajero().getId() == idPasajero) {
				puesto = p ;
				break;
			}
			
			}
			
		}
		return puesto;
		
	}
	
	
	
	
}
