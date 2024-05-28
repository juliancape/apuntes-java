package ejercicios;

import java.util.Arrays;

public class Ejercicio3Recursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int[] arrayA= {1};
		int[] arrayA= {5,10,2,8,3,5};
		
		System.out.println(Arrays.toString(arrayA));
		int[] arrayZ= diferencia(arrayA, 6);
		System.out.println(Arrays.toString(arrayZ));
		
		
		
		
	}
	
	public static int[] diferencia (int [] arrayA, int tamaño) {
		int[] arrayZ= new int[tamaño-1];
		if (arrayA.length==1) {
			System.out.println("No se puede realizar la operacion");
			
		}else {
			int i=0;
		if (i<=arrayA.length-1) {
			System.out.println(arrayZ[i]);
			diferencia(arrayA, tamaño);
			arrayZ[i]= arrayA[i]-arrayA[i+1];
			i++;
		}
		/*	for (int i = 0; i < arrayA.length-1; i++) {
				
				arrayZ[i]= arrayA[i]-arrayA[i+1];
			}
			diferencia
		
	*/
		}  return arrayZ;
	}
		

}
