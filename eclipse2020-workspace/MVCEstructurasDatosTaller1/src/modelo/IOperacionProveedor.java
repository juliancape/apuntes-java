package modelo;

public interface IOperacionProveedor {
	public abstract void anexarProveedor(Proveedor unProveedor); //bien
	
	public abstract void listarProveedor(); //bien
	public abstract void consultarProveedor(String id, int opc); //bien
	
	public abstract void actualizarInformacionCliente(String id, String nombre, 
			String  direccion, String apellido, String correoOrganizacion,
			String correoPersonal, String numeroTelefonicoCelular);
	
	public abstract void eliminar(String id, int opc);
	public abstract void ordenar(int opc);
	


}
