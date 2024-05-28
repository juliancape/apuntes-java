package ejercicio1;
/**
 * Clase estudiante para generar los atributos del estudiante, se genero un constructor, se utilizaron metodos get y set
 * @author julian cardenas peñuela
 *@since 2020 09 10
 *@version 01
 */
	
public class Estudiante {

	private int estudianteId;
	private String eNombre;
	private String eApellido;
	private float c1;
	private float c2;
	private float c3;
	private float promedio;
	private String aprobado;
	/**
	 * @param estudianteId  identificacion del estudiante
	 * @param eNombre nombre del estudiante
	 * @param eApellido apellido del estudiante
	 * @param c1 corte 1
	 * @param c2 corte 2
	 * @param c3 corte 3
	 */
	public Estudiante(int estudianteId, String eNombre, String eApellido, float c1, float c2, float c3) {
		super();
		this.estudianteId = estudianteId;
		this.eNombre = eNombre;
		this.eApellido = eApellido;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}
	//Gets y sets
	/**
	 * @return the estudianteId
	 */
	public int getEstudianteId() {
		return estudianteId;
	}
	/**
	 * @param estudianteId the estudianteId to set
	 */
	public void setEstudianteId(int estudianteId) {
		this.estudianteId = estudianteId;
	}
	/**
	 * @return the eNombre
	 */
	public String geteNombre() {
		return eNombre;
	}
	/**
	 * @param eNombre the eNombre to set
	 */
	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}
	/**
	 * @return the eApellido
	 */
	public String geteApellido() {
		return eApellido;
	}
	/**
	 * @param eApellido the eApellido to set
	 */
	public void seteApellido(String eApellido) {
		this.eApellido = eApellido;
	}
	/**
	 * @return the c1
	 */
	public float getC1() {
		return c1;
	}
	/**
	 * @param c1 the c1 to set
	 */
	public void setC1(float c1) {
		this.c1 = c1;
	}
	/**
	 * @return the c2
	 */
	public float getC2() {
		return c2;
	}
	/**
	 * @param c2 the c2 to set
	 */
	public void setC2(float c2) {
		this.c2 = c2;
	}
	/**
	 * @return the c3
	 */
	public float getC3() {
		return c3;
	}
	/**
	 * @param c3 the c3 to set
	 */
	public void setC3(float c3) {
		this.c3 = c3;
	}
	//metodo  para sacar promedio estudiante
	/**
	 * @return the promedio
	 */
	public float getPromedio() {
		setPromedio();
		if (promedio>= 3) {
			this.aprobado = "Aprobado";
		}else {
			this.aprobado = "Reprobado";
		}
		return promedio;
	}
	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio() {
		this.promedio = (float) (c1*0.3+c2*0.3+c3*0.4);
	}
	//metodo para ver si el estudiante aprobo o no
	/**
	 * @return the aprobado
	 */
	public String getAprobado() {
		return aprobado;
	}
	/**
	 * @param aprobado the aprobado to set
	 */
	public void setAprobado(String aprobado) {
		this.aprobado = aprobado;
	}
	
	
	
}
