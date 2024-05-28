package funciones;


public class Ejercicio1 {

	/**
	 * Funcion que retorna la suma entre dos arreglos
	 * @param array1 primer arreglo
	 * @param array2 segundo arreglo
	 * @param i indice
	 * @return returna la suma de los arreglos
	 */
	public static int sumaArray(int[] array1,int[] array2, int i) {
		
		if (i==array2.length-1) {
			return (array2[i]+array1[i]);
		}
			
			return array1[i]+array2[i] + sumaArray(array1,array2, i+1);
			
			
			
			
	}
	
	
	public static int producto(int[] array1,int[] array2, int i) {
		
		if (i==array2.length-1) {
			return (array2[i]*array1[i]);
		}
			return array1[i]*array2[i] * producto(array1,array2, i+1);
		}
		
	
	
	/**
	 *FUNCION EXTRA 
	 * @param array1  primer arreglo
	 * @param array2 segundo arreglo
	 * @param arrayFinal  el areglo resultante de la suma del primero y el segundo
	 * @param i  indice
	 * @return retorna la suma entre el primer arreglo y el segundo
	 */
	/*public static int[] sumaArrays(int[] array1, int[] array2,int[] arrayFinal,int i){
		if (array1.length!=array2.length) {
			return arrayFinal;
			
		}else {
			if (i==5) {
				return arrayFinal;
			}
			arrayFinal[i]=array1[i]+array2[i];
				return sumaArrays(array1,array2,arrayFinal,i+1);
	
		}
	
	}
	*/
}
