package ejercicio1;
/**
 * Clase piloto para generar datos 
 * @author Julian Cardenas Peueñuela
 *@since 2020-08-27
 *@version 02
 */


public class Piloto {

	private String piloto;
	private String nacionalidad;
	/**
	 * @param piloto
	 * @param nacionalidad
	 */
	public Piloto(String piloto, String nacionalidad) {
		super();
		this.piloto = piloto;
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the piloto
	 */
	public String getPiloto() {
		return piloto;
	}
	/**
	 * @param piloto the piloto to set
	 */
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
