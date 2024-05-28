package ejercicio1;

public class Pasajero extends Persona {

	private int edad;
	private String genero;
	/**
	 * @param id
	 * @param nombre
	 * @param edad
	 * @param genero
	 */
	public Pasajero(int id, String nombre, int edad, String genero) {
		super(id, nombre);
		this.edad = edad;
		this.genero = genero;
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
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
