package ejercicios;

import java.util.Arrays;

public class AppEjercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array= {1,2,4,2,3};
		int n=2;
		
		System.out.println(Arrays.toString(array));
		int[] arrayB= Ejercicio4.busqueda(array, n);
		System.out.println(Arrays.toString(arrayB));
	}

}
