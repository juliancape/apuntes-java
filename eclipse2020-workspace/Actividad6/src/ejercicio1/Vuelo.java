package ejercicio1;

public class Vuelo {

	private int nVuelo;
	private String cSalida;
	private String cLlegada;
	private Piloto datosP;
	private Puesto[] nPuesto;
	/**
	 * @param nVuela
	 * @param cSalida
	 * @param cLlegada
	 * @param datosP
	 * @param nPuesto
	 */
	public Vuelo(int nVuela, String cSalida, String cLlegada, Piloto datosP, Puesto[] nPuesto, int numero) {
		super();
		this.nVuelo = nVuela;
		this.cSalida = cSalida;
		this.cLlegada = cLlegada;
		this.datosP = datosP;
		this.nPuesto = nPuesto;
		//Crea una instancia de la clase Estudiante, es un array estático  
		this.nPuesto =new Puesto[numero];
	}
	
	public void agregarPasajero(Puesto puesto) {
		
		for (int i = 0; i < nPuesto.length; i++) {
			if (nPuesto[i] == null) {
				nPuesto[i] = puesto ;
				break;	
 			}
		}
		}
		
	
	
	
	
	/**
	 * @return the nVuela
	 */
	public int getnVuela() {
		return nVuelo;
	}
	/**
	 * @param nVuela the nVuela to set
	 */
	public void setnVuela(int nVuela) {
		this.nVuelo = nVuela;
	}
	/**
	 * @return the cSalida
	 */
	public String getcSalida() {
		return cSalida;
	}
	/**
	 * @param cSalida the cSalida to set
	 */
	public void setcSalida(String cSalida) {
		this.cSalida = cSalida;
	}
	/**
	 * @return the cLlegada
	 */
	public String getcLlegada() {
		return cLlegada;
	}
	/**
	 * @param cLlegada the cLlegada to set
	 */
	public void setcLlegada(String cLlegada) {
		this.cLlegada = cLlegada;
	}
	/**
	 * @return the datosP
	 */
	public Piloto getDatosP() {
		return datosP;
	}
	/**
	 * @param datosP the datosP to set
	 */
	public void setDatosP(Piloto datosP) {
		this.datosP = datosP;
	}
	/**
	 * @return the nPuesto
	 */
	public Puesto[] getnPuesto() {
		return nPuesto;
	}
	/**
	 * @param nPuesto the nPuesto to set
	 */
	public void setnPuesto(Puesto[] nPuesto) {
		this.nPuesto = nPuesto;
	}
	
	
	
	
	
}
