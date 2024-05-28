package funciones;

import java.util.Arrays;

public class AppEjercicio1 {
/**
 * Clase que suma dos arreglos enteros indice por indice y retorna la suma como arreglo
 * @author Julian cardenas
 * @since 12-02-2021
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] l1= {6,2,3,4,50};
		int[] l2= {3,2,7,1,50};
		int[] total = {0,0,0,0,0}; 
		
		System.out.println(Arrays.toString(l1));
		System.out.println(Arrays.toString(l2));
		System.out.println("SUMA");
		System.out.println(Ejercicio1.sumaArray(l1, l2, 0));
		System.out.println("PRODUCTO");
		System.out.println(Ejercicio1.producto(l1, l2, 0));
		//System.out.println(Arrays.toString(Ejercicio1.sumaArrays(l1,l2,total,0)));

	}
	
}	
	



