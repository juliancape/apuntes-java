package calcularArea;

public class Circulo extends Figura{
	
	private double radio;

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
						//numero y potencia
		this.area = (Math.PI * Math.pow(radio, 2));
		
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = (2*Math.PI)*radio;
		
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
	
	
	
	
}
