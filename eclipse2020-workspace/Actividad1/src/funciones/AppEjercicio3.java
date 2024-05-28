package funciones;
/**
 * Clase que verifica que dos arreglos son iguales o no
 * @author Julian Cardenas Peñuela
 * @since 14-02-2021
 */
import java.util.Arrays;

public class AppEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrayA= {3,2,50,7,8};
		int[] arrayB= {3,2,50,7,8};
		
		
		//int[] arrayA= {6,5,3,4,50};
		//int[] arrayB= {3,2,7,1,50};
		Arrays.sort(arrayA);
	    Arrays.sort(arrayB);
		
		
		System.out.println("¿Los Arreglos son Iguales?");
		System.out.println("Funcion iterativa");
		System.out.println(Ejercicio3.igual(arrayA, arrayB));

		System.out.println("Funcion Recursiva");
		System.out.println(Ejercicio3.igualRecursiva(arrayA, arrayB, 0));
		
	//	System.out.println( Arrays.toString(arrayA));
	}
	


}
