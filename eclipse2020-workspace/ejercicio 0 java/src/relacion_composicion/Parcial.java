package relacion_composicion;
/**
 * 
 * @author julian cardenas
 *@since 2020 09 08
 */
public class Parcial {

	private String asignatura;
	private String docente;
	private Fecha fecha;
	private Hora hora;
	/**
	 * @param asignatura
	 * @param docente
	 */
	public Parcial(String asignatura, String docente) {
		super();
		this.asignatura = asignatura;
		this.docente = docente;
	}
	/**
	 * se crea una  instancia de la clase fecha dentro de la instancia de la clase parcial
	 * @param dia
	 * @param mes
	 * @param year
	 */
	public void agregarFecha(int dia,int mes,int year) {
	this.fecha =new Fecha (dia,mes,year);
   }
	/**
	 * Se crea una  instancia de la clase hora dentro de una instancia de la clase parcial
	 * @param hora del parcial entero
	 * @param minutos minutos del parcial
	 */
	public void agregarHora(int hora,int minutos) {
		this.hora=new Hora(hora,minutos);
		
		
	}
	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}
	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	/**
	 * @return the docente
	 */
	public String getDocente() {
		return docente;
	}
	/**
	 * @param docente the docente to set
	 */
	public void setDocente(String docente) {
		this.docente = docente;
	}
	/**
	 * metodo para obtener una instancia de la clase fecha
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
	 * metodo para obtener una instancia de clase hora
	 * @return the hora
	 */
	public Hora getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(Hora hora) {
		this.hora = hora;
	}
	
}
