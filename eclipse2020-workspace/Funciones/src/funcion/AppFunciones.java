package funcion;

import java.util.Arrays;

/**
 * 
 * @author Julian Cardenas
 * @since 27-01-21
 *
 */
public class AppFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Suma "+Funciones.suma1(333, 17));
		
		System.out.println("Potencia "+ Funciones.potencia(3, 2));
		
		int[] array= {10,12,14,16,18,20};
		
		if (Funciones.buscarDato(array, 12)) {
			System.out.println("El numero existe");
		}else {
			System.out.println("El numero no existe");
		}
		
		int[] arrayB = {10,30,15,33,22,50};
		
		System.out.println(Arrays.toString(Funciones.sumaArray(array, arrayB)));
	}

}
