package ejercicio1;

import java.util.Arrays;
/**
 * Clase Domiciliario con los parametros del domiciliarios
 * @author Jeniffer Camacho y julian Cardenas
 * @since 28-05-2021
 *@version1
 */
public class Domiciliario {

	private int id;
	private String nombre;
	private String apellido;
	private int fNacimiento;
	private String nacionalidad;
	private int[] entregas;
	private long devengado;
	
	private long valorPagado;
	private int upz;
	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fNacimiento
	 * @param nacionalidad
	 * @param entregas
	 * @param devengado
	 * 
	 * @param valorPagado
	 * @param upz
	 */
	public Domiciliario(int id, String nombre, String apellido, int fNacimiento, String nacionalidad, int[] entregas,
			long devengado, long valorPagado, int upz) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.nacionalidad = nacionalidad;
		this.entregas = entregas;
		this.devengado = devengado;
		
		this.valorPagado = valorPagado;
		this.upz = upz;
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
	 * @return the fNacimiento
	 */
	public int getfNacimiento() {
		return fNacimiento;
	}
	/**
	 * @param fNacimiento the fNacimiento to set
	 */
	public void setfNacimiento(int fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the entregas
	 */
	public int[] getEntregas() {
		return entregas;
	}
	/**
	 * @param entregas the entregas to set
	 */
	public void setEntregas(int[] entregas) {
		this.entregas = entregas;
	}
	/**
	 * @return the devengado
	 */
	public long getDevengado() {
		return devengado;
	}
	/**
	 * @param devengado the devengado to set
	 */
	public void setDevengado(long devengado) {
		this.devengado = devengado;
	}
	/**
	 * @return the valorPagado
	 */
	public long getValorPagado() {
		return valorPagado;
	}
	/**
	 * @param valorPagado the valorPagado to set
	 */
	public void setValorPagado(long valorPagado) {
		this.valorPagado = valorPagado;
	}
	/**
	 * @return the upz
	 */
	public int getUpz() {
		return upz;
	}
	/**
	 * @param upz the upz to set
	 */
	public void setUpz(int upz) {
		this.upz = upz;
	}
	@Override
	public String toString() {
		return "Domiciliario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento="
				+ fNacimiento + ", nacionalidad=" + nacionalidad + ", entregas=" + Arrays.toString(entregas)
				+ ", devengado=" + devengado + ", valorPagado=" + valorPagado + ", upz="
				+ upz + "]";
	}
	
	
	
}
