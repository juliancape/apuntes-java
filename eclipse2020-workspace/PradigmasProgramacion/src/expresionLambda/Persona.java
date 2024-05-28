package expresionLambda;
/**
 * Clase Persona para definir objetos de tipo Persona para las
 * pruebas que haremos
 * @author julian Cardenas
 * @since14/03/2021
 * @version 1.0
 * 
 */
public class Persona {

	private String nombre;
	private int edad;
	/**
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + " (" + edad + "a�os)";
	}
	
}
