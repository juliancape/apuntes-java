package ejercicio1;

public class Puesto {

	private String letra;
	private int numero;
	private Pasajero pasajero;
	/**
	 * @param letra
	 * @param numero
	 * @param pasajero
	 */
	public Puesto(String letra, int numero, Pasajero pasajero) {
		super();
		this.letra = letra;
		this.numero = numero;
		this.pasajero = pasajero;
	}
	/**
	 * @return the letra
	 */
	public String getLetra() {
		return letra;
	}
	/**
	 * @param letra the letra to set
	 */
	public void setLetra(String letra) {
		this.letra = letra;
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
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}
	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	
	
	
}
