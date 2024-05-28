package taller2Ejemplo3;
/**
 * Clase generica con el metodo de imprimir que recibe
 * cualquier tipo de dato
 * @author Julian Cardenas
 * @since12-02-2021
 *
 */
public class ImprimirGenerico {
	
	public <E> void imprimir (E[] arreglo) {
	
		for (E elemento : arreglo) {
			System.out.println(elemento+ " " );
		}
		System.out.println();
		
	}

}
