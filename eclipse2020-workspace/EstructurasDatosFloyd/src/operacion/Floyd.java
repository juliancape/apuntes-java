package operacion;

import java.util.Scanner;

public class Floyd {

	private int[][] matriz;
	private int tamMatriz;
	private int[][] recorridos;
	
	public Floyd(int tamMatriz) {
		this.tamMatriz= tamMatriz;
		matriz = new int[tamMatriz+1][tamMatriz+1];
		recorridos= new int[tamMatriz+1][tamMatriz+1];
	}
	
	public void inicializar() {
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				if (i==j) matriz[i][j]=0;
				else matriz[i][j]=99;
			}
		}
		
	
		for (int i = 1; i <= tamMatriz; i++) {
			for (int j = 1; j <= tamMatriz; j++) {
				recorridos[i][j]=j;
			}
		}
		
		
	}
	
	public void leerDatos() {
		inicializar();
		int adjunto=0;
		int costo=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < tamMatriz; i++) {
			System.out.println("Adyacente al vertice "+i);
			adjunto=sc.nextInt();
			while(adjunto!=99) {
				System.out.println("DIGITE COSTO");
				costo= sc.nextInt();
				matriz[i][adjunto]=costo;
				System.out.println("Para terminar  digite adyacente 99");
				System.out.println("Digite adyacente ");
				adjunto=sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void imprimirMatriz() {
		 
		        System.out.println();
		        for(int i=1; i <= tamMatriz; i++) {
		            for(int j = 1; j<=tamMatriz;j++) {
		                System.out.print("\t"+matriz[i][j]);
		            }
		            System.out.println();
		        }
	}
	public void imprimirRecorrido() {
		 
        System.out.println();
        for(int i=1; i <= tamMatriz; i++) {
            for(int j = 1; j<=tamMatriz;j++) {
                System.out.print("\t"+recorridos[i][j]);
            }
            System.out.println();
        }
}
	
	public void generarFloyd() {
		for (int k = 1; k <= tamMatriz; k++) {
			for (int i = 1; i <= tamMatriz; i++) {
				if (matriz[i][k]!=99 && matriz[i][k]!=0) {
					for (int j = 1; j <= tamMatriz; j++) {
						if (j!=k) {
							if (matriz[i][k]+matriz[k][j]<matriz[i][j]) {
								matriz[i][j]=matriz[i][k]+matriz[k][j];
								recorridos[i][j]=k;
							}
						}
					}
				}
			}
			System.out.println("k:"+k);
			imprimirMatriz();
			
			System.out.println("Recorrido "+k);
			imprimirRecorrido();
		}
	}
	
	
}
