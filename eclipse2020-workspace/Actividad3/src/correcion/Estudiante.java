package correcion;

import java.util.Arrays;

/**
 * 
 * @author Julian Cardenas Peñuela
 *@since 24-09-2020
 */
public class Estudiante {

	private int id;
	private String nombre;
	private String apellido;
	private double[] notas;
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param notas
	 */
	public Estudiante(int id,String nombre, String apellido, double[] notas) {
		this.id= id;
		this.nombre= nombre;
		this.apellido= apellido;
		this.notas= notas;
		
	}
		//METODOS GET Y SET
	/**
	 * metodo que retorna el dato asigado a la variable o atributo id del estudiante
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
	 * Metodo abstracto de la Object que permite retornar una cadena de caracteres
	 */
	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	
	
	
}
