package funcion;
/**
 * PRIMER LABORATORIO - Clase que implementa funciones
 * @author Julian Cardenas
 * @since 27-01-21
 * 
 * 
 *
 */
public class Funciones {

	/**
	 * FUNCION SUMA DOS NUMEROS ENTEROS
	 * @param numero1
	 * @param numero2
	 * @return el resultado de la suma
	 */
	
	public static int suma1(int numero1, int numero2) {
	return numero1 + numero2;
	}
	/**
	 * 
	 * FUNCION POTENCIA ELEVAR UN NUMERO A UNA POTENCIA
	 * @param base numero double
	 * @param potencia numero double
	 * @return el resultado de la potencia (double)
	 */
	public static double potencia(double base, double potencia) {
		return Math.pow(base, potencia);
	}
	/**
	 * Funcion busca un dato en un array
	 * @param array de enteros
	 * @param dato a buscar en el array
	 * @return true si el dato se encontro, false si el dato no se encontro
	 */
	public static boolean buscarDato(int[] array,int dato) {
		 boolean estado=false;
		 
		for (int i = 0; i < array.length; i++) {
			if (array[i]== dato) {
				estado=true;
				
				break;
			}
		
		
		}
		return estado ;
	}
	/**
	 * Funcion para sumar dos arreglos A y B
	 * @param arrayA
	 * @param arrayB
	 * @return
	 */
	public static int[] sumaArray(int[] arrayA, int[] arrayB) {
		int[] arrayC= new int[arrayA.length];
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i]= arrayA[i] + arrayB[i];
		}
		
	
		return arrayC;
	}
	
	
	
	
}
   /*
	 * 
	
	public int suma(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		
		return resultado;
	}
	 */