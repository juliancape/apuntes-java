package funcion;

import java.util.Scanner;

public class PotenciaRecursiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Scanner teclado = new Scanner(System.in);
		int n=2;
		int elevado=2;
	//	int resultado=potencia(n, elevado);
		System.out.println(potencia(n, elevado));
		
		
		
		
	}
	public static int potencia(int n, int elevado) {
		if (elevado==0) {
		 return 1;
		}
		else {
			return n* potencia(n, elevado-1 );
		}
		
	}

}
