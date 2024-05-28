package funcion;
/**
 * Funcion recursiva que muestra los datos de un arreglo
 * @author ASUS FX 505DY R5
 *
 */
public class SumatoriaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dato = {1,20,3,40,15,5};
		
		fMuestra(dato,0);
		
	}
	
	public static void fMuestra(int[]array, int i) {
	
		if (i == array.length-1) {
			System.out.println(array[i]);
		}else {
			System.out.println(array[i]);
			fMuestra(array, i + 1);
		}
		
	}

}
