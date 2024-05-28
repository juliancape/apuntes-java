package ejercicios;

public class Ejercicio4 {
	
	
	/**
	 * METODO PARA BUSCAR EN QUE POSICION ESTA UN NUMERO EN UN AREGLO
	 * @param array arreglo primario 
	 * arrayB areglo secundario con el dato que se encontro una o repetidas veces
	 * @param n el dato a buscar
	 *  j es el contador para definir el tamaño del arreglo
	 * @return el areglo secundario que retorna los valores donde esta la posicion del dato a buscar
	 */
	public static int[] busqueda(int[] array, int n) {

		int j=0;
		
		for (int i = 0; i < array.length; i++) {
			if (n==array[i]) {
			j++;
			}
			
		}
		
		int[] arrayB = new int[j];
		int posicion=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]==n) {
				arrayB[posicion]=(i+1);
				posicion++;				
			}
		}
		
		return arrayB ;
	}

}
