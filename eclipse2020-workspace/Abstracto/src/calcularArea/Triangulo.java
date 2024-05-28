package calcularArea;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	private double hipotenusa;

	/**
	 * @param base
	 * @param altura
	 * @param hipotenusa
	 */
	public Triangulo(double base, double altura, double hipotenusa) {
		super();
		this.base = base;
		this.altura = altura;
		this.hipotenusa = hipotenusa;
	}
	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = (this.base*this.altura)/2;
		
		
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= base+altura+hipotenusa;
	}
	
	
	
	
}
