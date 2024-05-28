package ejercicio1;
/**
 * Clase Reaparto con los parametros del reparto
 * @author Jeniffer Camacho y julian Cardenas
 * @since 28-05-2021
 *@version1
 */
public class Reparto {

	private int nReparto;
	private String descripcion;	
	private String datosCliente;
	private int upz;
	/**
	 * @param nReparto
	 * @param descripcion
	 * @param fecha
	 * @param datosCliente
	 * @param entrega
	 * @param upz
	 */
	public Reparto(int nReparto, String descripcion, String datosCliente, int upz) {
		super();
		this.nReparto = nReparto;
		this.descripcion = descripcion;
		this.datosCliente = datosCliente;
		this.upz = upz;
	}
	/**
	 * @return the nReparto
	 */
	public int getnReparto() {
		return nReparto;
	}
	/**
	 * @param nReparto the nReparto to set
	 */
	public void setnReparto(int nReparto) {
		this.nReparto = nReparto;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the datosCliente
	 */
	public String getDatosCliente() {
		return datosCliente;
	}
	/**
	 * @param datosCliente the datosCliente to set
	 */
	public void setDatosCliente(String datosCliente) {
		this.datosCliente = datosCliente;
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
		return "Reparto [nReparto=" + nReparto + ", descripcion=" + descripcion + ", datosCliente=" + datosCliente
				+ ", upz=" + upz + "]";
	}
	
	
	
	
	
	
	
	
	
}
