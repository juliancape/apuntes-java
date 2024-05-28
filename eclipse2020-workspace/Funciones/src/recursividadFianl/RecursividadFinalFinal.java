package recursividadFianl;

public class RecursividadFinalFinal {

	public static String cadena = "0 1 2 3 4 5 6 7 8 9 A B C D E F";
	public static String[] conversionCadena = cadena.split(" "); 
		
	/**
     * Ejercicio 1
     * Funci�n recursiva que permite sumad los elementos de dos arreglos   
     * @param l1 arreglso de enteros 1
     * @param l2 arreglos de enteros 2
     * @param i indice del elemento donde se inicia la suma debe ser 0
     * @return un entreo con la suma de los dos arreglos
     */
    public static int fSumaArray(int[] l1, int [] l2,int i) {
      if(i > l1.length-1) {
          return 0;
      }else {
          return l1[i]+l2[i] + fSumaArray(l1,l2,(i+1));
      }
    }
    /**
     * Funci�n recursiva que convierte un n�mero entero positivo a cualquiebase 2,8,16
     * @param numero n�mero entero a convetir
     * @param base n�mero enetreo que identifica la base
     * @return una cadena de caracteres con el n�mero convertido a la base pasada como par�metro
     */
    public static String convertirEntero(int numero,int base) {
		if(numero < base) {
			return conversionCadena[numero];
			
		}else {
			return convertirEntero((numero / base),base) + conversionCadena[numero % base];
		}
	}
    /**
     * Funci�n recursiva que compara elemento a elemento dos arreglos de n�meros enteros 
     * @param l1 arregelos de enteros 1
     * @param l2 arreglos de enteros 2
     * @param i indice del primer elemento desde donde inicia la comparaci�n por default debe ser 0 
     * @return true sin los elementos son iguales o false si no son iguales
     */
    public static boolean arrayIguales(int[] l1, int[] l2,int i) {
		if(i == l1.length) {
			return true;
		}else if(l1[i] != l2[i] ) {
			return false;
		}else {
			return arrayIguales(l1,l2,i+1); 
		}
		
	}
    /**
     * Funci�n recursiva que toma dos rerglos de n�meros enteros y suma los elementso de arreglos 1
     * y del arreglos 2 y guarda el resultado en un tercer arreglo
     * @param l1 arreglo 1 de n�meros enteros
     * @param l2 arreglo 2 de n�meros enteros
     * @param i indice del primer elemento desde donde inicia la sumatoria por default debe ser 0 
     * @param l3 arreglo con la sumatorio d elos elementos del arreglso 1 y arreglos 2
     * @return l3 el refalo con la sumatoria
     */
    public static int[] sumaArray(int[] l1, int[] l2,int i,int[] l3) {
		if(i > l1.length-1) {
			return l3;
		}else {
			l3[i] = l1[i] + l2[i];
			return sumaArray(l1,l2,i+1,l3);
		}
	}	
	
	
	
	
}
