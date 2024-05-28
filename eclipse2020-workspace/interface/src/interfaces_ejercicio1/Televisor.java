package interfaces_ejercicio1;
/**
 * 
 * @author ASUS FX 505DY R5
 *
 */
public class Televisor extends Electrodomestico implements ICalculable, IMostrable{

	private boolean sintonizador;

	/**
	 * @param color
	 * @param precioBase
	 * @param sintonizador
	 */
	public Televisor(String color, long precioBase, boolean sintonizador) {
		super(color, precioBase);
		this.sintonizador = sintonizador;
	}

	@Override
	public long calcularPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase + (this.precioBase * this.IVA/100);
	}
	
	
	
}
