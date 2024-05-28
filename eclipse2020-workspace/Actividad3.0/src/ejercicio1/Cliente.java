package ejercicio1;
/**
 * Clase Cliente que contiene todas las especificaciones del cliente
 * @author Julian Cardenas Peñuela
 * @since 04-10-2020
 *@version 1.0
 *
 */
public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private int telefono;
	private String correo;
	private Fecha nacimiento;
	/**
	 * @param id identifiacion del cliente
	 * @param nombre del cliente
	 * @param apellido
	 * @param telefono
	 * @param correo correo electronico
	 * @param nacimiento  fecha de nacimiento dia mes año
	 */
	//CONSTRUCTOR
	public Cliente(int id, String nombre, String apellido, int telefono, String correo, Fecha nacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.nacimiento = nacimiento;
	}
	
	//METODOS GET  Y SET
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the nacimiento
	 */
	public Fecha getNacimiento() {
		return nacimiento;
	}
	/**
	 * @param nacimiento the nacimiento to set
	 */
	public void setNacimiento(Fecha nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public void registrarCliente() {
		
		
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", correo=" + correo + ", nacimiento=" + nacimiento + "]";
	}
	
	
	
	
}
