package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OperacionMatriz  {
	
	int matriz[][],nFila,nCol;
	int matrizIncidencia[][];
	ArrayList<Integer> arregloIncidencia= new ArrayList();
	String letras[]= {"A","B","C","D","E","F","G","H","I","J"};
	public void tamanio(int fila, int col, ArrayList<Integer> arregloMatriz) {
		nFila=fila;
		nCol=col;
		matriz= new int[nFila][nCol];
		int indice=0;
		
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				matriz[i][j]=arregloMatriz.get(indice);
				indice++;
				
				
			}
		}
		
		boolean adyacencia = true;
		
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < col; j++) {
				if (matriz[i][j]!=matriz[j][i]) {
					adyacencia=false;
				}
			}
		} if (adyacencia==false) {
			System.out.println("La Matriz Ingresada no es Adyacente");
			for (int i = 0; i < fila; i++) {
				for (int j = 0; j < col; j++) {
					matriz[i][j]=0;
				}
			}
		}
	}
	
	public void imprimir() {
		if (matriz!=null) {
			int contCol=0;
		
		int letraFila=0;
		for (int i = 0; i < nCol; i++) {
			System.out.print("   "+letras[i]+" ");
		}System.out.print("\n");
		for (int i = 0; i < nFila; i++) {
			for (int j = 0; j < nCol; j++) {
				if (letraFila==0) {
					System.out.print(letras[i]);
					letraFila++;
				}
				if (contCol==nCol-1) {
					contCol=0;
					
					System.out.println("  "+matriz[i][j]+"  ");
					System.out.print(letras[i+1]);
				}else {
					System.out.print("  "+matriz[i][j]+"  ");
					contCol++;
				}
			}
		}
	}else {
		System.out.println("Matriz Inexistente");
	}
		
	}
	
	public void aristas(int peso) {
		if (peso!=0) {
			boolean encuentroUno=false;
			boolean encuentroDos=false;
			ArrayList<Integer> encuentros= new ArrayList<>();
			for (int i = 0; i < nFila; i++) {
				for (int j = 0; j < nCol; j++) {
					if (matriz[i][j]==peso) {
						if (encuentroUno==true) {
							encuentroDos=true;
							encuentros.add(i);
							encuentros.add(j);
						}
						if (encuentroUno==false) {
							encuentroUno=true;
							encuentros.add(i);
							encuentros.add(j);
						}
					}
				}
			}
			if (encuentroDos==true) {
				System.out.println("La Arista Existe");
				System.out.println("Su Camino es: Fila["+encuentros.get(0)+"] Columna["+encuentros.get(1)+"] <--->"
						+" Fila["+encuentros.get(2)+"] Columna["+encuentros.get(3)+"]");
			}else {
				System.out.println("La Arista no Existe");
			}
		}else {
			System.out.println("Peso Ingresado Incorrecto");
		}
	}
	
	public void  incidencia() {
		if (matriz!=null) {
			for (int i = 0; i < nFila; i++) {
			for (int j = 0; j < nCol; j++) {
				if (matriz[i][j]!=0) {
					arregloIncidencia.add(matriz[i][j]);
				}
			}
		}
		Set<Integer> set = new HashSet<>(arregloIncidencia);
		arregloIncidencia.clear();
		arregloIncidencia.addAll(set);
		matrizIncidencia= new int[nFila][arregloIncidencia.size()];
		
		for (int k = 0; k < arregloIncidencia.size(); k++) {
			for (int i = 0; i < nFila; i++) {
				for (int j = 0; j < nCol; j++) {
					if (matriz[i][j]!=0 ) {
						if (arregloIncidencia.get(k)==matriz[i][j]) {
							matrizIncidencia[i][k]=1;
							
						}
							
					}
				}
				
				
			}
		}
		
		int contCol=0;
		int contLetra=1;
		int letraFila=0;
		for (int i = 0; i < arregloIncidencia.size(); i++) {
			System.out.print("   "+arregloIncidencia.get(i)+" ");
		}System.out.print("\n");
		for (int i = 0; i < nFila; i++) {
			for (int j = 0; j < arregloIncidencia.size(); j++) {
				if (letraFila==0) {
					System.out.print(letras[i]);
					letraFila++;
				}if (contCol==arregloIncidencia.size()-1) {
					contCol=0;
					
					System.out.println("  "+matrizIncidencia[i][j]+"  ");
					if (contLetra<nFila) {
						System.out.print(letras[contLetra]);
						contLetra++;
					}
					
				}else {
					System.out.print("  "+matrizIncidencia[i][j]+"  ");
					contCol++;
				}
				
				
			}
		}
		
		}else {
			System.out.println("Datos Inexisitentes");
		}
		
		
		
		
	}
		public void eliminar() {
			if (!arregloIncidencia.isEmpty()) {
				matriz= null;
				matrizIncidencia=null;
				arregloIncidencia.clear();
				System.out.println("Datos Eliminados");
			}else {
				System.out.println("No Hay Datos Por Eliminar");
			}
			
			
		}
	
}
	
	
	