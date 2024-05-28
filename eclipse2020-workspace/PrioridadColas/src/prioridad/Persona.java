package prioridad;

public class Persona implements Comparable<Persona>{

	public int id;
	public String nombre;
	public int edad;
	public int prioridad;
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param prioridad
	 */
	public Persona(int id, String nombre, int edad, int prioridad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.prioridad = prioridad;
	}
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
	
	public int compareTo(Persona o) {
		if (edad<o.getEdad()) {
			return 1;
		}
		else if (edad>o.getEdad()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", prioridad=" + prioridad + "]";
	}
	
	
}
