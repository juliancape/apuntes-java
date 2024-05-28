package ejercicios;
/**
 * s
 * @author Julian Cardenas
 * @since 30-01-21
 *
 */
public class Punto3 {
/**
 * Funcion diferencia entre posicion de matriz
 * @param arrayA areglo principal
 * @param tamaño tamaño del areglo principal
 * @return arreglo secundario
 */
	public static int[] diferencia (int [] arrayA, int tamaño) {
		int[] arrayZ= new int[tamaño-1];
		
		for (int i = 0; i < arrayA.length-1; i++) {
			arrayZ[i]= arrayA[i]-arrayA[i+1];
		}
		
		
		
		
		return arrayZ;
		
		
		
	}
	
}
