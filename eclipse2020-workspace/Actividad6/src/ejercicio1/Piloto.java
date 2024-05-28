package ejercicio1;

public class Piloto extends Persona {

	private int nHoras;

	/**
	 * @param id
	 * @param nombre
	 * @param nHoras
	 */
	public Piloto(int id, String nombre, int nHoras) {
		super(id, nombre);
		this.nHoras = nHoras;
	}

	/**
	 * @return the nHoras
	 */
	public int getnHoras() {
		return nHoras;
	}

	/**
	 * @param nHoras the nHoras to set
	 */
	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}
	
	
	
}
