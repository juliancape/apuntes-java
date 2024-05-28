package control;

import modelo.OperacionProveedor;
import modelo.Proveedor;
import vista.EntradaSalida;
	public class AppAgenda {
	private OperacionProveedor operacion;
	private EntradaSalida lector;
	
	public AppAgenda() {
		this.operacion = new OperacionProveedor();
		this.lector = new EntradaSalida();
	}
	
	public void funcionar() {
		int opcion = 0;
		String menu = "Menu Principal" + "\n"
		+ "Seleccione proceso a realizar:" + "\n"
		+ " 1. Anexar proveedor" + "\n"
		+ " 2. Imprimir Proveedores" + "\n"
		+ " 3. Visualizar Proveedor en Especifico" + "\n"
		+ " 4. Actualizar Informacion del Proveedor" + " \n"
		+ " 5. Borrar Proveedor o proveedores" + " \n"
		+ " 6. Organizar Lista de Proveedores" + " \n"
		+ " 7. Buscar Proveedor a Partir de nombre y Apellido" + "\n"
		+ " 8. Salir" + "\n"
		+ "Opción:";
		do {
		lector.imprimirInformacion(menu);
		opcion = lector.leerOpcion();
		switch(opcion) {
		case 1:
		anexarProveedor();
		break;
		case 2:
		imprimirProveedores();
		break;
		case 3:
		consultarProveedor();
		break;
		case 4:
			actualizar();
			break;
		case 5:
			borrar();
			break;
		case 6:
			organizarpor();
			break;
		case 7:
			buscarNombreCompleto();
		break;
		}
		}while (opcion!=8);
		}
	
	
	
	private void anexarProveedor() {
			String identificacion = "";
			String nombre = "";
			String direccion = "";
			String apellido = "";
			String correoOrganización = "";
			String correoPersonal = "";
			String numeroTelefonicoCelular = "";
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			lector.imprimirInformacion("Nombre: ");
			nombre = lector.leerTexto();
			
			lector.imprimirInformacion("Direccion: ");
			direccion = lector.leerTexto();
		
			lector.imprimirInformacion("Apellido : ");
			apellido = lector.leerTexto();
			lector.imprimirInformacion("Correo Organizacion: ");
			correoOrganización = lector.leerTexto();
			lector.imprimirInformacion("Correo Personal : ");
			correoPersonal = lector.leerTexto();
			lector.imprimirInformacion("Numero celular: ");
			numeroTelefonicoCelular = lector.leerTexto();
			operacion.anexarProveedor(new Proveedor(identificacion, nombre,
			direccion,apellido,correoOrganización,
			correoPersonal,numeroTelefonicoCelular));
		
		/*	operacion.anexarProveedor(new Proveedor("222", "Juan", "A",
					"Cardenas", "orga@", "Perso@", "2304911"));
			
			
			operacion.anexarProveedor(new Proveedor("111", "Andres", "Z",
					"Peñuela", "orga2@", "Perso2@", "3333333"));
			*/
	
	}
	
	private void imprimirProveedores() {
		
		operacion.listarProveedor();
	}
	
	private void borrar() {
		int opc;
		String identificacion="";
		lector.imprimirInformacion("Opcciones: ");
		lector.imprimirInformacion("1. Borrar Primer Proveedor "
				+ "\n2. Borrar Ultimo Proveedor"
				+ " \n3. Borrar Proveedor por Id"
				+ "\n4. Borrar la Lista en su Totalidad");
		opc = lector.leerOpcion();
		//Borrar primer proveedor
		if (opc==1) {
			
			operacion.eliminar("", 1);
		}//Borrar ultimo proveedor
		if (opc==2) {
			operacion.eliminar("", 2);
			
		}//borrar proveedor por id
		if(opc==3) {
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			operacion.eliminar(identificacion, 3);
		}if(opc==4) {
			System.out.println("Se ha Eliminado con Exito la Lista de Proveedores");
			operacion.eliminar("", 4);
		}
		
		
		
	}
	
	private void consultarProveedor() {
		int opc;
		String identificacion = "";
		
		lector.imprimirInformacion("Opcciones: ");
		lector.imprimirInformacion("1. Visualizar Primer Proveedor "
				+ "\n2. Visualizar Ultimo Proveedor"
				+ " \n3. Consultar Proveedor por Id");
		opc = lector.leerOpcion();
		if (opc==1) {
			operacion.consultarProveedor(null,1);
		}if (opc==2) {
			operacion.consultarProveedor(null,2);
		} if (opc==3) {
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			operacion.consultarProveedor(identificacion,3);
		}
	
	}
	
	private void actualizar() {
		lector.imprimirInformacion("Ingrese Identifiacion del Proveedor a actualizar: ");
		String id= lector.leerTexto();
		if (operacion.verificarActualizacion(id)==true) {
		
			String nombre = "";
			String direccion = "";
			String apellido = "";
			String correoOrganizacion = "";
			String correoPersonal = "";
			String numeroTelefonicoCelular = "";
			lector.imprimirInformacion("Identificacion: ");
			lector.imprimirInformacion(id);
			lector.imprimirInformacion("Nombre: ");
			nombre = lector.leerTexto();
			
			lector.imprimirInformacion("Direccion: ");
			direccion = lector.leerTexto();
		
			lector.imprimirInformacion("Apellido : ");
			apellido = lector.leerTexto();
			lector.imprimirInformacion("Correo Organizacion: ");
			correoOrganizacion = lector.leerTexto();
			lector.imprimirInformacion("Correo Personal : ");
			correoPersonal = lector.leerTexto();
			lector.imprimirInformacion("Numero celular: ");
			numeroTelefonicoCelular = lector.leerTexto();
			
			operacion.actualizarInformacionCliente(id, nombre, direccion, apellido,
					correoOrganizacion, correoPersonal, numeroTelefonicoCelular);
			operacion.anexarProveedor(new Proveedor(id, nombre, direccion, apellido,
					correoOrganizacion, correoPersonal, numeroTelefonicoCelular));
			
			
		}
		
	}
	
	public void organizarpor() {
		int opc=0;
		lector.imprimirInformacion("Opcciones: ");
		lector.imprimirInformacion("1. Organizr Proveedor por Nombre "
				+ "\n2. Organizr Proveedor por Apellido");
		opc = lector.leerOpcion();
		if (opc==1) {
			operacion.ordenar(1);
		}if(opc==2) {
			operacion.ordenar(2);
		}else {
			lector.imprimirInformacion("Opccion Elegida Equivocada");
		}
		
	}
	public void buscarNombreCompleto() {
		int opc=0;
		lector.imprimirInformacion("Eliga la Opcion en la Lista");
		operacion.buscar();
		opc=lector.leerOpcion();
		operacion.buscarIndice(opc);
		
	}
	
	
}

