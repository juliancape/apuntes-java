package ejercicio1;
/**
 * Clase Persona, es una superclase que contiene el id y el nombre 
 * @author Daniel Velasquez y julian Cardenas
 * @since 24-10-2020
 * @version 1
 * 
 */
public abstract class Persona {

	protected int id;
	protected String nombre;
	//CONSTRUCTOR
	/**
	 * @param id identifiacion
	 * @param nombre
	 */
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	//GETS Y SETS
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	@Override
	public String toString() {
		return " [id=" + id + ", nombre=" + nombre + "] ";
	}
	
	
}
