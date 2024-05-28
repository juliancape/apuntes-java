package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OperacionProveedor implements IOperacionProveedor {
	
	private Set<Proveedor> listProveedores;
	
	public OperacionProveedor() {
	this.listProveedores = new HashSet<>();
	}
	public boolean evaluarEstadoColeccion() {
	if(listProveedores.isEmpty()){
	return true;
	}
	return false;
	}
	@Override
	public void anexarProveedor(Proveedor unProveedor) {
	this.listProveedores.add(unProveedor);
	}
	@Override
	public void listarProveedor() {
	if(!evaluarEstadoColeccion()){
	Iterator<Proveedor> iterator = listProveedores.iterator();
	while(iterator.hasNext()) {
	System.out.println(iterator.next());
	}
	} else {
	System.out.println("Lista de proveedores vacia");
	}
	}
	@Override
	public void consultarProveedor(String identificacion) {
	if(!listProveedores.isEmpty()){
	for (Proveedor proveedor : listProveedores) {
	if(identificacion.equals(proveedor.getIdentificacion())){
	System.out.println(proveedor.getNombre()+""
	+proveedor.getApellido()+""
	+proveedor.getNumeroTelefonicoCelular());
	}
	}
	} else {
	System.out.println("Lista de proveedores vacia");
	}
	}
	@Override
	public void borrarLista() {
	if(!listProveedores.isEmpty()){
	this.listProveedores.clear();
	} else {
	System.out.println("Lista de proveedores vacia");
	}
	}
}
	
	
	