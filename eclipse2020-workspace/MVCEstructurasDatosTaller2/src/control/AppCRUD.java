package control;

import modelo.OperacionEstudiante;

import java.util.Map;

import modelo.Estudiante;
import vista.EntradaSalida;
	public class AppCRUD {
	private OperacionEstudiante operacion;
	private EntradaSalida lector;
	
	public AppCRUD() {
		this.operacion = new OperacionEstudiante();
		this.lector = new EntradaSalida();
	}
	
	public void funcionar() {
		int opcion = 0;
		String menu = "Menu Principal" + "\n"
		+ "Seleccione proceso a realizar:" + "\n"
		+ " 1. Anexar Estudiantes" + "\n"
		+ " 2. Imprimir Estudiantes" + "\n"
		+ " 3. Visualizar Estudiante en Especifico" + "\n"
		+ " 4. Actualizar Informacion del Estudiante" + " \n"
		+ " 5. Borrar Estudiante" + " \n"
		+ " 6. Anexar estudiante si no Existe una Misma Clave"+ " \n"
		+ " 7. Buscar Estudiante por Apellido" + "\n"
		+ " 8. Salir" + "\n"
		+ "Opción:";
		do {
		lector.imprimirInformacion(menu);
		opcion = lector.leerOpcion();
		switch(opcion) {
		case 1:
		anexarEstudiante();
		break;
		case 2:
		imprimirEstudiante();
		break;
		case 3:
		consultarEstudiante();
		break;
		case 4:
			actualizar();
			break;
		case 5:
			borrar();
			break;
		case 6:
			anexarSiNoExiste();
			break;
		case 7:
			buscarPorApellido();
		break;
		}
		}while (opcion!=8);
		}
	
	
	
	private void anexarEstudiante() {
			int opc;
			lector.imprimirInformacion("Opcciones: ");
			lector.imprimirInformacion("1. Ingresar datos del archivo.txt "
					+ "\n2. Ingresar manualmente un estudiante");
			opc = lector.leerOpcion();
			
			if(opc==2) {
			String identificacion = "";
			String nombre = "";
			String apellido = "";
			String correoInst = "";
			String correoPer = "";
			String numeroCel="";
			String genero="";
			String edad="";
			String programa = "";
			int clave=0;
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			lector.imprimirInformacion("Nombre: ");
			nombre = lector.leerTexto();
			lector.imprimirInformacion("Apellido : ");
			apellido = lector.leerTexto();
			lector.imprimirInformacion("Correo Institucional: ");
			correoInst = lector.leerTexto();
			lector.imprimirInformacion("Correo Personal : ");
			correoPer = lector.leerTexto();
			lector.imprimirInformacion("Numero celular: ");
			numeroCel = lector.leerTexto();
			lector.imprimirInformacion("Genero");
			genero = lector.leerTexto();
			lector.imprimirInformacion("Edad");
			edad = lector.leerTexto();
			lector.imprimirInformacion("Programa");
			programa = lector.leerTexto();
			lector.imprimirInformacion("INGRESE SU CLAVE (ninguna clave puede estar repetida)");
			clave=lector.leerOpcion();
			
			operacion.anexarEstudiante(new Estudiante(identificacion, nombre,
					apellido, correoInst, correoPer, numeroCel, genero, edad, programa),clave);
			
			}else {
				operacion.leerArchivo();
			}
	
	}
	
	private void imprimirEstudiante() {
		
		operacion.listarEstudiante();
	}
	
	private void consultarEstudiante() {
		int opc;
		String identificacion = "";
		
		lector.imprimirInformacion("Opcciones: ");
		lector.imprimirInformacion("1. Visualizar Estudiante por  ID "
				+ "\n2. Visualizar Estudiantes de un Programa"
				+ " \n3. Visualizar Estudiantes por Genero"
				+ "\n4. Visualizar Estudiantes por Rango de Edad");
		opc = lector.leerOpcion();
		if (opc==1) {
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			operacion.consultarEstudiante(identificacion,3);
		
		}if (opc==2) {
			operacion.consultarEstudiante(null,2);
		} if (opc==3) {
			operacion.consultarEstudiante(null, 3);
			}else if(opc==4) {
			operacion.consultarEstudiante(null, 4);
		}
	
	}
	
	private void borrar() {
		String identificacion="";
		lector.imprimirInformacion("Borrar Estudiante por ID");
		
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			operacion.eliminar(identificacion);
		
	}
	private void actualizar() {
		lector.imprimirInformacion("Ingrese CLAVE del Estudiante a actualizar: ");
		int clave= lector.leerOpcion();
		operacion.verificarActualizacion(clave);
		if (operacion.verificarActualizacion(clave)==true) {
		
			String identificacion = "";
			String nombre = "";
			String apellido = "";
			String correoInst = "";
			String correoPer = "";
			String numeroCel="";
			String genero="";
			String edad="";
			String programa = "";
			
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			lector.imprimirInformacion("Nombre: ");
			nombre = lector.leerTexto();
			lector.imprimirInformacion("Apellido : ");
			apellido = lector.leerTexto();
			lector.imprimirInformacion("Correo Institucional: ");
			correoInst = lector.leerTexto();
			lector.imprimirInformacion("Correo Personal : ");
			correoPer = lector.leerTexto();
			lector.imprimirInformacion("Numero celular: ");
			numeroCel = lector.leerTexto();
			lector.imprimirInformacion("Genero");
			genero = lector.leerTexto();
			lector.imprimirInformacion("Edad");
			edad = lector.leerTexto();
			lector.imprimirInformacion("Programa");
			programa = lector.leerTexto();
			operacion.actualizarInformacionEstudiante(identificacion, nombre,
					apellido, correoInst, correoPer, numeroCel, genero,
					edad, programa,clave);
			
		}else {
			lector.imprimirInformacion("El Estudiante con esa Clave no Existe");
		}
		
		
	}
	public void buscarPorApellido() {
		String apellido="";
		lector.imprimirInformacion("Ingrese el Apellido del Estudiante");
		apellido=lector.leerTexto();
		operacion.buscar(apellido);
		
	}
	public void anexarSiNoExiste() {
		String identificacion = "";
		String nombre = "";
		String apellido = "";
		String correoInst = "";
		String correoPer = "";
		String numeroCel="";
		String genero="";
		String edad="";
		String programa = "";
		int clave=0;
		lector.imprimirInformacion("Identificacion: ");
		identificacion = lector.leerTexto();
		lector.imprimirInformacion("Nombre: ");
		nombre = lector.leerTexto();
		lector.imprimirInformacion("Apellido : ");
		apellido = lector.leerTexto();
		lector.imprimirInformacion("Correo Institucional: ");
		correoInst = lector.leerTexto();
		lector.imprimirInformacion("Correo Personal : ");
		correoPer = lector.leerTexto();
		lector.imprimirInformacion("Numero celular: ");
		numeroCel = lector.leerTexto();
		lector.imprimirInformacion("Genero");
		genero = lector.leerTexto();
		lector.imprimirInformacion("Edad");
		edad = lector.leerTexto();
		lector.imprimirInformacion("Programa");
		programa = lector.leerTexto();
		lector.imprimirInformacion("INGRESE SU CLAVE (ninguna clave puede estar repetida)");
		clave=lector.leerOpcion();
		operacion.anexarSiNoExiste(identificacion, nombre, apellido, correoInst, correoPer, numeroCel, genero, edad, programa, clave);
		
	}
	
	
}

