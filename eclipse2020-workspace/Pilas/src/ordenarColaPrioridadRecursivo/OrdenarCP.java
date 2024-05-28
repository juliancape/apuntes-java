package ordenarColaPrioridadRecursivo;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrdenarCP {
private static Queue enteros;

public OrdenarCP() {
	this.enteros=new PriorityQueue<>();
}
	
	
	private static Queue<Integer> ordenar (int[] array){
		for (int i = 0; i < array.length; i++) {
			enteros.add(array[i]);
		}
		return enteros;
	}
	
	public static Queue<Integer> OrdenamientoRecursivo(int[] array,int i){
		if (i<= array.length) {
			return enteros;
		}
		else {
			enteros.add(array[i]);
			return OrdenamientoRecursivo(array, i+1);
		}
		
	}
	
	

}
