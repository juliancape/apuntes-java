package control;

import modelo.OperacionMatriz;

import java.util.ArrayList;

import vista.EntradaSalida;
	public class AppMatriz {
	private OperacionMatriz operacion;
	private EntradaSalida lector;
	
	public AppMatriz() {
		this.operacion = new OperacionMatriz();
		this.lector = new EntradaSalida();
	}
	
	public void funcionar() {
		int opcion = 0;
		String menu = "Menu Principal" + "\n"
		+ "Seleccione proceso a realizar:" + "\n"
		+ "1. Crear Matriz Adyacencia" + "\n"
		+ "2. Imprimir Matriz Adyacencia" + "\n"
		+ "3. Informacion Arista" + "\n"
		+ "4. Matriz Incidencia" + "\n"
		+ "5. Eliminar" + "\n"
		+ "6. Salir" + "\n"
		+ "Opción:";
		do {
		lector.imprimirInformacion(menu);
		opcion = lector.leerOpcion();
		switch(opcion) {
		case 1:
			crearMatriz();
		break;
		case 2:
			imprimir();
		break;
		case 3:
			arista();
		break;
		case 4:
			incidencia();
		break;
		case 5:
			eliminarDatos();
		break;
		}
		}while (opcion!=6);
		}
		
	
	public void crearMatriz() {
		ArrayList<Integer> arregloMatriz= new ArrayList<>();
		lector.imprimirInformacion("Ingrese Tamaño Filas");
		int fila=lector.leerOpcion();
		lector.imprimirInformacion("Ingrese Tamaño Columnas");
		int col=lector.leerOpcion();
		
		lector.imprimirInformacion("Matriz: [Tamaño Fila "+fila+", Tamaño Columna "+col+"]");
		int contFila=0;
		int contCol=0;
		int valor;
		for (int i = 0; i < fila*col; i++) {
			lector.imprimirInformacion("Ingrese Elemento. Posicion ["+contFila+"]["+contCol+"]");
			valor=lector.leerOpcion();
			arregloMatriz.add(valor);
			contCol++;
			if (contCol==col) {
				contCol=0;
				contFila++;
			}
		}
		operacion.tamanio(fila, col, arregloMatriz);
		
		
		
	}
	public void arista() {
		lector.imprimirInformacion("Consultar Arista");
		lector.imprimirInformacion("Ingrese el Peso de la Arista que Quiere Consultar");
		int peso= lector.leerOpcion();
		operacion.aristas(peso);
	}
	
	
	public void imprimir() {
		operacion.imprimir();
	}
	
	public void incidencia() {
		operacion.incidencia();
	}
	
	public void eliminarDatos() {
		operacion.eliminar();
	}
	
}

