package colecciones;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funciones numeros = new Funciones();
		
		numeros.agregarFinal(10);
		numeros.agregarFinal(13);
		numeros.agregarFinal(2);
		numeros.agregarFinal(11);
		
		numeros.mostrar();
		System.out.println("----------");
		numeros.agregarInicio(5);
		
		numeros.modificar(3, 100);
		numeros.consultaInicio();
		numeros.consultarFinal();
		numeros.mostrar();
		
		numeros.consulta(100);
		
		
	}

}
