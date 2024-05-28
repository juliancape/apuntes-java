package taller2;
/**
 * una clase de prueba en donde se utilizan
 * objetos de tipos String, Double e Integer, 
 * para probar la clase genérica 
 * @author Julian Cardenas
 * @since 15-02-2021
 */
public class PruebaImprimirGenericosClase {

	public static void main(String[] args) {
		
		Integer [] integers = {1,2,3,4,5};
		Double [] doubles= {1.3,2.4,4.5};
		String [] strings = {"uno","dos","tres"};
		
		ImpresionGenerica<Integer> imprimirIntegers =
				new ImpresionGenerica<Integer>();
		imprimirIntegers.imprimir(integers);

		
		
		ImpresionGenerica<Double> imprimirDoubles= new
				ImpresionGenerica<Double>();
		imprimirDoubles.imprimir(doubles);
		
		ImpresionGenerica<String > imprimirStrings = new
				ImpresionGenerica<String>();
		imprimirStrings.imprimir(strings);
	
	}
	
	
	
}
