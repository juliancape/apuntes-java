package ejercicio1;

/**
 * Clase Domicilio con los parametros del domicilio
 * @author Jeniffer Camacho y julian Cardenas
 * @since 28-05-2021
 *@version1
 */
public class Domicilio {

	private int idDomi;
	private Reparto reparto;
	private boolean confirmacion;
	private int dia;
	/**
	 * @param idDomi
	 * @param reparto
	 * @param confirmacion
	 * @param dia
	 */
	public Domicilio(int idDomi, Reparto reparto, boolean confirmacion, int dia) {
		super();
		this.idDomi = idDomi;
		this.reparto = reparto;
		this.confirmacion = confirmacion;
		this.dia = dia;
	}
	/**
	 * @return the idDomi
	 */
	public int getIdDomi() {
		return idDomi;
	}
	/**
	 * @param idDomi the idDomi to set
	 */
	public void setIdDomi(int idDomi) {
		this.idDomi = idDomi;
	}
	/**
	 * @return the reparto
	 */
	public Reparto getReparto() {
		return reparto;
	}
	/**
	 * @param reparto the reparto to set
	 */
	public void setReparto(Reparto reparto) {
		this.reparto = reparto;
	}
	/**
	 * @return the confirmacion
	 */
	public boolean isConfirmacion() {
		return confirmacion;
	}
	/**
	 * @param confirmacion the confirmacion to set
	 */
	public void setConfirmacion(boolean confirmacion) {
		this.confirmacion = confirmacion;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	@Override
	public String toString() {
		return "Domicilio [idDomi=" + idDomi + ", reparto=" + reparto + ", confirmacion=" + confirmacion + ", dia="
				+ dia + "]";
	}
	
	
	
	
	
	
	
}
