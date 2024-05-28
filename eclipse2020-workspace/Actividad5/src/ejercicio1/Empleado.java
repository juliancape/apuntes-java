package ejercicio1;
/**
 * Superclase Empleado donde estan los datos principales de los empleados
 * @author Julian Cardenas
 * @since 17-10-2020
 * @version 2.0
 *
 */
public class Empleado {

	protected int id;
	protected String nombre;
	protected String apellido;
	protected Fecha fecha;
	protected double salarioPagar;
	
	/**
	 * @param id identificacion del empleado
	 * @param nombre
	 * @param apellido
	 * @param fecha fecha de ingreso
	 * @param salarioPagar   salario final a pagar
	 */
	public Empleado(int id, String nombre, String apellido, Fecha fecha, double salarioPagar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.salarioPagar = salarioPagar;
	}
	
	//METODOS GET Y SET
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
	 * @return the fecha
	 */
	public Fecha getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the salarioPagar
	 */
	public double getSalarioPagar() {
		return salarioPagar;
	}
	/**
	 * @param salarioPagar the salarioPagar to set
	 */
	public void setSalarioPagar(double salarioPagar) {
		this.salarioPagar = salarioPagar;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha de ingreso=" + fecha;
		//+ fecha	+ ", salarioPagar=" + salarioPagar + "]";
	}
	
	
	
	
	
	
	
	
	
}
