package herencia;

public class Perecedero extends Producto {

	private Fecha fecha;

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param fecha
	 */
	public Perecedero(int codigo, String nombre, int precio, Fecha fecha) {
		//PASO DE PARAMETROS A 
		super(codigo, nombre, precio);
		this.fecha = fecha;
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

	@Override
	public String toString() {
		return super.toString()+"Perecedero fecha [" + fecha + "]";
	}
	
	
	
}
