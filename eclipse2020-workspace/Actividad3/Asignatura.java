package actividad3;
/**
 * 
 * @author william frasser
 *
 */
public class Asignatura {
	private int codigo;
	private String denominacion;
	/**
	 * @param codigo
	 * @param denominacion
	 */
	public Asignatura(int codigo, String denominacion) {
		super();
		this.codigo = codigo;
		this.denominacion = denominacion;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	/**
	 * Método de la clase Object para retorna una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "Codigo=" + codigo + ", denominacion=" + denominacion;
	}
	
	

}
