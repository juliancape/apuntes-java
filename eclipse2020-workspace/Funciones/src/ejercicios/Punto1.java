package ejercicios;
/**
 * 
 * @author Julian Cardenas	
 * @since 29-01-21
 *
 */
public class Punto1 {
	
	
	/**
	 * Metodo para buscar un nummero dentro del areglo
	 * @param numero
	 * @param array
	 * @return -1 si se encuentra el dato y "no se encontro" si no esta el dato
	 */
	public static boolean busqueda(int numero, int[] array) {
		boolean estado=false;
		for ( int i = 0; i < array.length; i++) {
			
			if (numero==array[i]) {
				estado=true;
				System.out.println("El numero existe en el indice: " +i);
				break;
			}
			
		}
		
		return estado;
	}
	

}
