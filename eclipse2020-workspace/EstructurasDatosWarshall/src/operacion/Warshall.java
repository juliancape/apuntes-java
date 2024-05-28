package operacion;

import java.util.Scanner;

public class Warshall {
    private int[][] matriz;
    private int tamMatriz;
    
    public void leerMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño matriz");
        tamMatriz= sc.nextInt();
        matriz = new int [tamMatriz+1][tamMatriz+1];
        for (int i = 1; i <=tamMatriz; i++) {
            for (int j = 1; j <=tamMatriz; j++) {
                matriz[i][j]=0;
            }
        }
        int adjunto = 0;
        for(int i=1; i <=tamMatriz; i++) {
            System.out.println("Adjunto del vertice: "+i);
            adjunto= sc.nextInt();
            while(adjunto!=99) {
                matriz[i][adjunto]=1;
                System.out.println("Adjunto del vertice: "+i);
                adjunto= sc.nextInt();
            }
        }
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
    
    public void warshall() {
        for(int k=1; k<= tamMatriz; k++) {
            for(int i=1; i<= tamMatriz; i++) {
                if(i!=k) {
                    if(matriz[i][k]==1) {
                        for(int j =1; j<= tamMatriz; j++) {
                            //if(matriz[k][j]==1{
                            if(matriz[i][j]==0) {
                                matriz[i][j] = matriz[k][j];
                            }
                        }
                    }
                }
            }
            imprimirMatriz();
        }
        imprimirMatriz();
    }
    
    public boolean estaConectada() {
        boolean estado = true;
        System.out.println();
        for(int i=1; i<= tamMatriz; i++) {
            for(int j=1 ;j <=tamMatriz; j++) {
                if(matriz[i][j]==0) {
                    estado=false;
                    return estado;
                }
            }
        }
        return estado;
    }
    
    /**1.
     * 
     */
    
    public static void main(String[] args) {
        Warshall objw = new Warshall();
        objw.leerMatriz();
        objw.imprimirMatriz();
        objw.warshall();
        if(objw.estaConectada()) {
            System.out.println("Grafo fuertemente conectado");
        }else {
            System.out.println("Grafo no es fuertemente conectado");
        }
    }
}
