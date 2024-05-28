package interface_funcion;

public class Persona {

	public int edad;
	public String nombre;
	/**
	 * @param edad
	 * @param nombre
	 */
	public Persona(String nombre,int edad) {
		super();
		this.edad = edad;
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
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	
	
}
