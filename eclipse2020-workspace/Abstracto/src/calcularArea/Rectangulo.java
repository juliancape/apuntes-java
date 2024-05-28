package calcularArea;

public class Rectangulo extends Figura {

	private double ancho;
	private double alto;
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area= this.ancho*this.alto;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=(2*ancho)+(2*alto);
	}
	
	
	
	
	
}
