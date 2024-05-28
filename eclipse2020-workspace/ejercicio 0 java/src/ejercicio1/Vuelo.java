package ejercicio1;

/**
 * Clase vuelo para generar datos 
 * @author Julian Cardenas
 *@since 2020-08-27
 *@version 01
 */


public class Vuelo {
	//DECLARACION DE VARIABLES
	private int numero;
	private String ciudadSalida;
	private String ciudadLlegada;
	private float millas;
	private Piloto piloto;
	/**
	 * @param numero
	 * @param ciudadSalida
	 * @param ciudadLlegada
	 * @param millas
	 * @param piloto
	 */
	public Vuelo(int numero, String ciudadSalida, String ciudadLlegada, float millas, Piloto piloto) {
		super();
		this.numero = numero;
		this.ciudadSalida = ciudadSalida;
		this.ciudadLlegada = ciudadLlegada;
		this.millas = millas;
		this.piloto = piloto;
	}
	
	//GETS Y SETS 
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
	 * @return the ciudadSalida
	 */
	public String getCiudadSalida() {
		return ciudadSalida;
	}
	/**
	 * @param ciudadSalida the ciudadSalida to set
	 */
	public void setCiudadSalida(String ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}
	/**
	 * @return the ciudadLlegada
	 */
	public String getCiudadLlegada() {
		return ciudadLlegada;
	}
	/**
	 * @param ciudadLlegada the ciudadLlegada to set
	 */
	public void setCiudadLlegada(String ciudadLlegada) {
		this.ciudadLlegada = ciudadLlegada;
	}
	/**
	 * @return the millas
	 */
	public float getMillas() {
		return millas;
	}
	/**
	 * @param millas the millas to set
	 */
	public void setMillas(float millas) {
		this.millas = millas;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	
}
