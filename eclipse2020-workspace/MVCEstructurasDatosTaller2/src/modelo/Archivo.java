package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Archivo {

	private  String cadena;
	private  Scanner in;
	private  String arreglo[];
	private Estudiante unEstudiante;
	private OperacionEstudiante operacion;

	public Archivo() {
		this.unEstudiante = new Estudiante();
		this.operacion = new OperacionEstudiante();
		}
	
	public void leerArchivo(){
		try{
			in = new Scanner (new File("./data/archivo.txt"));
			
			while(in.hasNextLine()) {
				cadena=in.nextLine();
				generarLista(cadena);
			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		int i=0;
	
	}
	
	public void generarLista(String cad) {
		int clave=0;
		arreglo = cad.split(" ");
		/*System.out.println(arreglo[0]+ " "+arreglo[1]+ " "+arreglo[2]+ " "
		+arreglo[3]+" "+arreglo[4]+" "+arreglo[5]+" "+arreglo[6]+" "
				+arreglo[7]+" "+arreglo[8]);*/
		unEstudiante.setIdentificacion(arreglo[0]);
		unEstudiante.setNombre(arreglo[1]);
		unEstudiante.setApellido(arreglo[2]);
		unEstudiante.setCorreoInst(arreglo[3]);
		unEstudiante.setCorreoPer(arreglo[4]);
		unEstudiante.setNumeroCel(arreglo[5]);
		unEstudiante.setGenero(arreglo[6]);
		unEstudiante.setEdad(arreglo[7]);
		unEstudiante.setPrograma(arreglo[8]);
		clave=Integer.parseInt(arreglo[9]);
		
		this.unEstudiante = new Estudiante(arreglo[0], arreglo[1], arreglo[2],
				arreglo[3], arreglo[4], arreglo[5], arreglo[6], arreglo[7], arreglo[8]);
		
		operacion.anexarEstudiante(unEstudiante, clave);
		
		
	}
	
	
}
