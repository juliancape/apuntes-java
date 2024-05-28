package funciones;

public class Ejercicio3 {

	
	 /**
	  * Funcion iterativa que verifica si dos arreglos son iguales
	  * @param array1 primer arreglo
	  * @param array2 segundo arreglo
	  * @return retorna true si los arreglos son iguales y false si son diferentes
	  */
	 public static boolean igual(int[] array1, int[]array2) {
		 boolean estado=false;
		
		int j=0;
		 for (int i = 0; i < array1.length; i++) {
			if (array1[i]==array2[i]) {
				j++;
				if (j==array1.length ) {
					estado=true;
				}
			}
		}
		 
		
		return estado; 
	 }

	 
	 /**
	  * Funcion recursiva que verifica si dos arreglos son iguales
	  * @param array1 primer arreglo
	  * @param array2 segundo arreglo
	  * @return retorna true si los arreglos son iguales y false si son diferentes
	  */
	 public static boolean igualRecursiva(int[] array1, int[]array2,int pos) {
		boolean estado= true;
		
		 
		 if (array1[pos]!=array2[pos]) {
			estado=false;
			 return estado;
		}
		 if (pos==array1.length-1) {
			return estado;
		}
		 
		 return igualRecursiva(array1, array2, pos+1);
		 
		 
	 }
}
