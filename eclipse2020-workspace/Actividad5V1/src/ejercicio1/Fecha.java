package ejercicio1;
/**
 * Clase  Fecha que tendra la fecha de entrada a la empresa (dia mes a�o)
 * @author Julian Cardenas
 * @since 15-10-2020
 * @version 1.0
 *
 */

public class Fecha {
	
	private int dia;
	private int mes;
	private int anio;
	/**
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	//CONSTRUCTOR
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	//METODOS GET  Y SET
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return " [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
}
