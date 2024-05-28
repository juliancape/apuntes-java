package ejercicio1;
/**
 * Clase docente para generar los parametros del docente, se utilizo el construcotr, metodos set y get
 * @author julian cardenas peñuela
 *@since 2020 09 10
 *@version 01
 */

public class Docente {

	private int docenteId;
	private String dNombre;
	private String profesion;
	/**
	 * @param docenteId  identificacion del docente
	 * @param dNombre  nombre del docente
	 * @param profesion profesion del docente
	 */
	public Docente(int docenteId, String dNombre, String profesion) {
		super();
		this.docenteId = docenteId;
		this.dNombre = dNombre;
		this.profesion = profesion;
	}
	//Set y get
	/**
	 * @return the docenteId
	 */
	public int getDocenteId() {
		return docenteId;
	}
	/**
	 * @param docenteId the docenteId to set
	 */
	public void setDocenteId(int docenteId) {
		this.docenteId = docenteId;
	}
	/**
	 * @return the dNombre
	 */
	public String getdNombre() {
		return dNombre;
	}
	/**
	 * @param dNombre the dNombre to set
	 */
	public void setdNombre(String dNombre) {
		this.dNombre = dNombre;
	}
	/**
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	
	
}
