package listaDatos;



/**
 * Clase Persona con los metodos para determinar en que lista estan las personas
 * @author Jennifer Camacho y Julian Cardenas
 *@since 15-03-21
 */
public class Persona {
	public String nombre;
	public String apellido;
	public int nacimiento;
	public String genero;

	 /*
	 * @param nombre
	 * @param nacimiento
	 * @param genero
	 * @param listaNumeros
	 */
	public Persona(String nombre,String apellido , int nacimiento, String genero) {
		super();
		
		this.nombre = nombre;
		this.apellido= apellido;
		this.nacimiento = nacimiento;
		this.genero = genero;
		
	}
	
	public String getGenero() {
		return genero;
	}
	
	public int getNacimiento() {
		return nacimiento;
	}
	

}
