package taller2Ejemplo3;
/**
 *una clase deprueba en donde
 * se utilizan objetos de tipos String,
 Double e Integer,para probar el método genérico
 * @author Julian Cardenas
 * @since 14-02-2021
 *
 */
public class PruebaImprimirGenericos {

	public static void main(String[] args) {
		ImprimirGenerico ig = new ImprimirGenerico();
		Integer [] integers = {1,2,3,4,5};
		Double [] doubles= {1.3,2.4,4.5};
		String [] strings = {"uno","dos","tres"};
		
		ig.imprimir(integers);
		ig.imprimir(doubles);
		ig.imprimir(strings);
		
		
	}
	
	
}
