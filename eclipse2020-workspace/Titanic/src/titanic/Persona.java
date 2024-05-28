package titanic;

public class Persona {

	private String categoria;
	private String edad;
	private String genero;
	private String supervivencia;
	public Persona(String categoria, String edad, String genero, String supervivencia) {
		
		this.categoria = categoria;
		this.edad = edad;
		this.genero = genero;
		this.supervivencia = supervivencia;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSupervivencia() {
		return supervivencia;
	}
	public void setSupervivencia(String supervivencia) {
		this.supervivencia = supervivencia;
	}
	@Override
	public String toString() {
		return "Persona [categoria=" + categoria + ", edad=" + edad + ", genero=" + genero + ", supervivencia="
				+ supervivencia + "]";
	}
	
	

}
