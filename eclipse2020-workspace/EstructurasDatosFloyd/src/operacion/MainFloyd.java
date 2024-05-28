package operacion;

import java.util.Scanner;

public class MainFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tamMatriz=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Tamaño matriz ");
		tamMatriz=sc.nextInt();
		Floyd gf= new Floyd(tamMatriz);
		gf.leerDatos();
		gf.imprimirMatriz();
		gf.imprimirRecorrido();
		gf.generarFloyd();
		gf.imprimirMatriz();
		gf.imprimirRecorrido();
		sc.close();
		
	}

}
