package modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;


public class OperacionEstudiante implements IOperacionEstudiante {
	private  String cadena;
	private  Scanner in;
	private  String arreglo[];
	private Estudiante estudiante;
	
	private Map<Integer, Estudiante> mapEstu;
	
	public OperacionEstudiante() {
		this.estudiante = new Estudiante();	
	this.mapEstu = new HashMap<Integer, Estudiante>();
	}
	
	
	public boolean evaluarEstadoColeccion() {
	if(mapEstu.isEmpty()){
	return true;
	}
	return false;
	}
	@Override
	public void leerArchivo(){
	
		try{
			in = new Scanner (new File("./data/archivo.txt"));
			
			while(in.hasNextLine()) {
				this.cadena=in.nextLine();
				generarLista(cadena);
			}

		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
	}
	
	@Override
	public void anexarEstudiante(Estudiante unEstudiante, int clave) {
		
		mapEstu.put(clave, unEstudiante);
		
	}
	@Override
	public void generarLista(String cad) {
		int clave;
		arreglo = cad.split(" ");
		/*System.out.println(arreglo[0]+ " "+arreglo[1]+ " "+arreglo[2]+ " "
		+arreglo[3]+" "+arreglo[4]+" "+arreglo[5]+" "+arreglo[6]+" "
				+arreglo[7]+" "+arreglo[8]);*/
		estudiante.setIdentificacion(arreglo[0]);
		estudiante.setNombre(arreglo[1]);
		estudiante.setApellido(arreglo[2]);
		estudiante.setCorreoInst(arreglo[3]);
		estudiante.setCorreoPer(arreglo[4]);
		estudiante.setNumeroCel(arreglo[5]);
		estudiante.setGenero(arreglo[6]);
		estudiante.setEdad(arreglo[7]);
		estudiante.setPrograma(arreglo[8]);
		clave=Integer.parseInt(arreglo[9]);
		anexarEstudiante(new Estudiante(arreglo[0], arreglo[1], arreglo[2],
				arreglo[3], arreglo[4], arreglo[5], arreglo[6], arreglo[7], arreglo[8]), clave);
		
		//this.estudiante = new //anexarEstudiante(unEstudiante);
		
	}
	
	@Override
	public void listarEstudiante() {
		
			mapEstu.entrySet().stream().forEach(System.out::println);
		
	
	}
	@Override
	public void consultarEstudiante(String identificacion, int opc) {
	
		//Por Id
		if (opc==1) {
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    if (identificacion.equals(entry.getValue().getIdentificacion())) {
					
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
		}//Por Programa
		if (opc==2) {
			System.out.println("Programa Diseño");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getPrograma().equals("diseño")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			System.out.println("Programa Ingenieria");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getPrograma().equals("ingenieria")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}
			System.out.println("Programa Ciencias");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getPrograma().equals("ciencias")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			System.out.println("Programa Derecho");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getPrograma().equals("derecho")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			
		}//por Genero
		if (opc==3) {
			System.out.println("Mujeres");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getGenero().equals("F")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			System.out.println("Hombres");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if (entry.getValue().getGenero().equals("M")) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			
		}//por Rango Edad
		if (opc==4) {
			System.out.println("Menores de edad ");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if ( Integer.parseInt(entry.getValue().getEdad())<18) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}	
			System.out.println("De 18 a 20 Años");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if ( Integer.parseInt(entry.getValue().getEdad())>=18 && Integer.parseInt(entry.getValue().getEdad())<21 ) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}
			System.out.println("21 Años en Adelante");
			for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
			    
				if ( Integer.parseInt(entry.getValue().getEdad())>=21) {
					System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
					
				}
			}
			
		}else if (opc<1 && opc>4) {
			System.out.println("Opccion Elegida Equivocada");
		}
	}
	
	@Override
	public void actualizarInformacionEstudiante(String identificacion, String nombre, String apellido, String correoInst, String correoPer,
			String numeroCel, String genero, String edad, String programa, int clave) {
		for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
		    if (entry.getKey()==clave) {
		    	mapEstu.remove(entry.getKey());
		    	
		    	estudiante= new Estudiante(identificacion, nombre, apellido, correoInst,
		    			correoPer, numeroCel, genero, edad, programa);
		    	mapEstu.put(clave,estudiante );
			}
		}		
	}
	public boolean verificarActualizacion(int clave) {
		boolean boleano=false;
		for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
		    if (clave==entry.getKey()) {
		    	
				boleano=true;
				break;
			}
		}	
		return boleano;
	}

	@Override
	public void eliminar(String id) {
		for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
		    if (id.equals(entry.getValue().getIdentificacion())) {
				System.out.println("Estudiante a Borrar:"
						+ " \nclave=" + entry.getKey() + " /" + entry.getValue());
				mapEstu.remove(entry.getKey());
				break;
			}
		}	
		
		
	}
	
	public void buscar(String apellido) {
		boolean boleano=false;
		for (Map.Entry<Integer, Estudiante> entry : mapEstu.entrySet()) {
		    if (entry.getValue().getApellido().equals(apellido)) {
		    	boleano=true;
		    	System.out.println("clave=" + entry.getKey() + " /" + entry.getValue());
				break;
			}
		}
		if (boleano==false) {
			System.out.println("Estudiante no Encontrado");
		}
	}
	@Override
	public void anexarSiNoExiste(String identificacion, String nombre, String apellido, String correoInst,
			String correoPer, String numeroCel, String genero, String edad, String programa,int clave) {
			mapEstu.putIfAbsent(clave, new Estudiante(identificacion, nombre, apellido,
					correoInst, correoPer, numeroCel, genero, edad, programa));
		
	}
	
 }

	
	