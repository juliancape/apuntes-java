package proyectoVuelos;



public class Pasajero {

	private int id;
	private String nombre;
	private int edad;
	private String genero;
	
	public Pasajero(int id, String nombre, int edad, String genero) {
		
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String aArchivo() {
		return id+":"+nombre+":"+edad+":"+genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
	
}
