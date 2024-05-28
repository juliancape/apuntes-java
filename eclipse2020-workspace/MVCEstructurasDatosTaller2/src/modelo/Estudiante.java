package modelo;


public class Estudiante {

	private String identificacion;
	private String nombre;
	private String apellido;
	private String correoInst;
	private String correoPer;
	private String numeroCel;
	private String genero;
	private String edad;
	private String programa;
	
	
	public Estudiante() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param identificacion
	 * @param nombre
	 * @param apellido
	 * @param correoInst
	 * @param correoPer
	 * @param numeroCel
	 * @param genero
	 * @param edad
	 * @param programa
	 */
	public Estudiante(String identificacion, String nombre, String apellido, String correoInst, String correoPer,
			String numeroCel, String genero, String edad, String programa) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoInst = correoInst;
		this.correoPer = correoPer;
		this.numeroCel = numeroCel;
		this.genero = genero;
		this.edad = edad;
		this.programa = programa;
	}
	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
	 * @return the correoInst
	 */
	public String getCorreoInst() {
		return correoInst;
	}
	/**
	 * @param correoInst the correoInst to set
	 */
	public void setCorreoInst(String correoInst) {
		this.correoInst = correoInst;
	}
	/**
	 * @return the correoPer
	 */
	public String getCorreoPer() {
		return correoPer;
	}
	/**
	 * @param correoPer the correoPer to set
	 */
	public void setCorreoPer(String correoPer) {
		this.correoPer = correoPer;
	}
	/**
	 * @return the numeroCel
	 */
	public String getNumeroCel() {
		return numeroCel;
	}
	/**
	 * @param numeroCel the numeroCel to set
	 */
	public void setNumeroCel(String numeroCel) {
		this.numeroCel = numeroCel;
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
	/**
	 * @return the edad
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}
	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	@Override
	public String toString() {
		return "Estudiante [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", correoInst=" + correoInst + ", correoPer=" + correoPer + ", numeroCel=" + numeroCel + ", genero="
				+ genero + ", edad=" + edad + ", programa=" + programa + "]";
	}
	
	
	


	
	
}
