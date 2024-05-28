package taller2;
/**
 * Clase generica parametrizada con el metodo que
 * recibe cualquier tipo de arreglo y lo imprime
 * @author Julian Cardenas
 *@version 14-02-2021
 * @param <E>
 */
public class ImpresionGenerica <E>{

	/**
	 * 
	 * @param arreglo
	 */
	public void imprimir(E[] arreglo) {
		for (E elemento : arreglo) {
			System.out.println(elemento+" ");
		}
		System.out.println();
	}
	
	
	
}
