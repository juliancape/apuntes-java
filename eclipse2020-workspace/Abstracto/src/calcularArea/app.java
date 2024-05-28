package calcularArea;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo objetoCirculo = new Circulo(25);
		objetoCirculo.calcularArea();
		objetoCirculo.calcularPerimetro();
		System.out.println("Circulo");
		System.out.println("Area: "+objetoCirculo.getArea());
		System.out.println("perimetro: "+objetoCirculo.getPerimetro());
		
		Triangulo objetoTriangulo=new Triangulo(20, 15, 25);
		objetoTriangulo.calcularArea();
		objetoTriangulo.calcularPerimetro();
		System.out.println("Triangulo");
		System.out.println("Area: "+objetoTriangulo.getArea());
		System.out.println("perimetro: "+objetoTriangulo.getPerimetro());
		
		Rectangulo objetoRectangulo = new Rectangulo(15, 10);
		System.out.println("Rectangulo");
		objetoRectangulo.calcularArea();
		objetoRectangulo.calcularPerimetro();
		System.out.println("Area: "+objetoRectangulo.getArea());
		System.out.println("perimetro: "+objetoRectangulo.getPerimetro());
		
		
		
		
	}

}
