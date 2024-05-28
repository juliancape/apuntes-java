package funcion;

public class BuscarDatoArrayRecursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dato = {1,20,30,40};
		System.out.println(find(dato,20,0));
		
		
		
	}
	public static int find(int array[], int data, int i) {
		if (array[i] ==data) {
			return i;
			
		}if (i==array.length-1) {
			return -1;
		}
		else {
			return find(array,data,i+1);
		}
	}
	
	

}
