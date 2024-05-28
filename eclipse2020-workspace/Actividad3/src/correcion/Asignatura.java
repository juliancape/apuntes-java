package correcion;
/**
 * 
 * @author ASUS FX 505DY R5
 *@since 24-09-2020
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
	 * 
	 */
	
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
	 * Metodo de la clase object para retornar una cadena de caracteres
	 * 
	 */
	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", denominacion=" + denominacion + "]";
	}
	
	
	
}
