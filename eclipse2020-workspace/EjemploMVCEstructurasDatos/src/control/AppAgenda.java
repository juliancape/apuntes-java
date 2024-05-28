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
		+ " 3. Consultar Proveedor" + "\n"
		+ " 4. Borrar Lista proveedores" + "\n"
		+ " 5. Salir" + "\n"
		+ "Opci�n:";
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
		borrarLista();
		break;
		}
		}while (opcion!=5);
		}
	private void anexarProveedor() {
			String identificacion = "";
			String nombre = "";
			String apellido = "";
			String correoOrganizaci�n = "";
			String correoPersonal = "";
			String numeroTelefonicoCelular = "";
			lector.imprimirInformacion("Identificacion: ");
			identificacion = lector.leerTexto();
			lector.imprimirInformacion("Nombre: ");
			nombre = lector.leerTexto();
			lector.imprimirInformacion("Apellido : ");
			apellido = lector.leerTexto();
			lector.imprimirInformacion("Correo Organizacion: ");
			correoOrganizaci�n = lector.leerTexto();
			lector.imprimirInformacion("Correo Personal : ");
			correoPersonal = lector.leerTexto();
			lector.imprimirInformacion("Numero celular: ");
			numeroTelefonicoCelular = lector.leerTexto();
			operacion.anexarProveedor(new Proveedor(identificacion, nombre,
			apellido,
			correoOrganizaci�n,correoPersonal,numeroTelefonicoCelular));
	
	}
	
	private void imprimirProveedores() {
		operacion.listarProveedor();
	}
	
	private void consultarProveedor() {
		String identificacion = "";
		lector.imprimirInformacion("Identificacion: ");
		identificacion = lector.leerTexto();
		operacion.consultarProveedor(identificacion);
	}
	private void borrarLista() {
		operacion.borrarLista();
	}
}

