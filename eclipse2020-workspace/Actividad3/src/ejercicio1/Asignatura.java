package ejercicio1;
/**
 * Clase asignatura para generar los parametros de la asignatura, se utilizo el construcotr, metodos set y get
 * @author julian cardenas peñuela
 *@since 2020 09 10
 *@version 01
 */
public class Asignatura {

	private int coAsignatura;
	private String denominacion;
	/**
	 * @param coAsignatura codigo asinatura
	 * @param denominacion denominacion asignatura
	 */
	public Asignatura(int coAsignatura, String denominacion) {
		super();
		this.coAsignatura = coAsignatura;
		this.denominacion = denominacion;
	}
	//get y set
	/**
	 * @return the coAsignatura
	 */
	public int getCoAsignatura() {
		return coAsignatura;
	}
	/**
	 * @param coAsignatura the coAsignatura to set
	 */
	public void setCoAsignatura(int coAsignatura) {
		this.coAsignatura = coAsignatura;
	}
	/**
	 * @return the denominacion
	 */
	public String getDenominacion() {
		return denominacion;
	}
	/**
	 * @param denominacion the denominacion to set
	 */
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
	
	
}
