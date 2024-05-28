package ejercicio1ArrayList;

public class Piloto extends Persona {

	private int horasVuelo;
	//CONSTRUCTOR
	/**
	 * @param id identificacion
	 * @param nombre
	 * @param horasVuelo horas de vuelo del piloto
	 */
	public Piloto(int id, String nombre, int horasVuelo) {
		super(id, nombre);
		this.horasVuelo = horasVuelo;
	}
	//GETS Y SETS
	/**
	 * @return the horasVuelo
	 */
	public int getHorasVuelo() {
		return horasVuelo;
	}

	/**
	 * @param horasVuelo the horasVuelo to set
	 */
	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}

	@Override
	public String toString() {
		return super.toString() + "Piloto [horasVuelo=" + horasVuelo + "]";
	}
	
}
