package ejercicios;
/**
 * Clase Ejercicio2 que determina si un numero es perfecto o no
 * @author Julian C
 * @since 31-01-21
 *
 */
public class Ejercicio2 {

	/**
	 * FUCION PERFECTO QUE DETERMINA SI UN NUMERO ES PERFECTO
	 * @param numero el valor a determinar si es perfecto o no
	 * @return el total de la suma de los divisores del numero
	 */
	public static int perfecto(int numero) {
		int total=0;
		int mitad=numero/2;
		System.out.println("El numero recibido es ->"+numero);
		for (int i = 1; i <= mitad; i++) {
			if (numero%i==0 ) {
				System.out.println(i);
				total+=i;
			}
		}
		if (total==numero) {
			System.out.println("El numero si es perfecto");
		}else {
			System.out.println("El numero no es perfecto porque la suma"
					+ " de sus  divisores es: ");
		}
		
		
		return total;
		
	}
}
