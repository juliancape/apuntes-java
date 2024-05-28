package ejercicios;

import java.util.Arrays;

public class AppEjercicio3 {

	public static void main(String[] args) {
		
		int[] arrayA= {5,10,2,8,3,5};
	
		System.out.println(Arrays.toString(arrayA));
		int[] arrayZ= Punto3.diferencia(arrayA, 6);
		System.out.println(Arrays.toString(arrayZ));
		
	}
	
}
