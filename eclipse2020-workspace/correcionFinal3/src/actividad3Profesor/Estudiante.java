package actividad3Profesor;

import java.util.Arrays;

/**
 * 
 * @author william frasser acevedo
 *
 */
public class Estudiante {
	private int id;
	private String nombre;
	private String apellido;
	private double[] notas;
	/**
	 * Constructor de la clase 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param n
	 */
	public Estudiante(int id,String nombre,String apellido,double[] notas) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notas = notas;
	}

	/**
	 * Método que retorna el dato asignado a la variable o atributo Id del estudiante 
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the notas
	 */
	public double[] getNotas() {
		return notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	/**
	 * Método abstracto de la Object que perimte retorna una cadena de caracteres 
	 */
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", notas="
				+ Arrays.toString(notas) + "]";
			
	}
}









