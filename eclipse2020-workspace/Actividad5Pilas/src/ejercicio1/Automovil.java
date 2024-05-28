package ejercicio1;
/**
 * Clase Automovil con los parametros de la clase(marca) y el modelo
 * @author Jennifer Camacho y Julian Cardenas
 * @since 10-04-21
 *
 */
public class Automovil {

	private String clase;
	private String modelo;
	/**
	 * @param clase
	 * @param modelo
	 */
	public Automovil(String clase, String modelo) {
		super();
		this.clase = clase;
		this.modelo = modelo;
	}
	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}
	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	
}
