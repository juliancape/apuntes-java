package funcion;

public class RecursionSumaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,20,3,40,15,5};
		
		System.out.println(sumaArray(array,0));
		
	}

	public static int sumaArray(int[] array,int i) {
		
		if (i==array.length-1) {
			return (array[i]);
		}else {
			return array[i] + sumaArray(array,i+1);
		}
		
		
		
		
	}
	
	
}
