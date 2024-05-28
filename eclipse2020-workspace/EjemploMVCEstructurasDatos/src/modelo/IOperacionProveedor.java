package modelo;

public interface IOperacionProveedor {
	public abstract void anexarProveedor(Proveedor unProveedor);
	public abstract void listarProveedor();
	public abstract void consultarProveedor(String id);
	public abstract void borrarLista();


}
