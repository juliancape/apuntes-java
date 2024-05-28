package modelo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class OperacionProveedor implements IOperacionProveedor {
	
	private Set<Proveedor> listProveedores;
	
	public OperacionProveedor() {
	this.listProveedores = new TreeSet<>();
	}
	/**
	 * @return the listProveedores
	 */
	public Set<Proveedor> getListProveedores() {
		return listProveedores;
	}
	/**
	 * @param listProveedores the listProveedores to set
	 */
	
	
	
	
	
	public void setListProveedores(Set<Proveedor> listProveedores) {
		this.listProveedores = listProveedores;
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
	public void consultarProveedor(String identificacion, int opc) {
	
		//Primer cliente
		if (opc==1) {
			if (!listProveedores.isEmpty()) {
			for (Proveedor proveedor : listProveedores) {
				System.out.println(proveedor.toString());
				break;
			}
			}else {
				System.out.println("Lista de proveedores vacia");
			}
		}//Ultimo cliente
		if (opc==2) {
			if (!listProveedores.isEmpty()) {
				
			String id="";
				for (Proveedor proveedor : listProveedores) {
					id=proveedor.getIdentificacion();
				}
				for (Proveedor proveedor : listProveedores) {
					if (id.equals(proveedor.getIdentificacion())) {
						System.out.println(proveedor.toString());
					}
				}
				
				
			}else {
				System.out.println("Lista de proveedores vacia");
			}
		}//Consultar informacion del cliente a partir de la identificacion
		if(opc==3) {
			boolean estado=false;
			if(!listProveedores.isEmpty()){
				for (Proveedor proveedor : listProveedores) {
					if(identificacion.equals(proveedor.getIdentificacion())){
						System.out.println(proveedor.toString());
						estado=true;
					}
				}if (estado==false) {
					System.out.println("No se Encuentra Proveedor con esa ID");
				}
			} else {
				System.out.println("Lista de proveedores vacia");
			}
		}
	}
	
	@Override
	public void actualizarInformacionCliente(String id, String nombre, 
			String  direccion, String apellido, String correoOrganizacion,
			String correoPersonal, String numeroTelefonicoCelular) {
		
		if (!listProveedores.isEmpty()) {
			for (Proveedor proveedor : listProveedores) {
				
				if (id.equals(proveedor.getIdentificacion())) {
					
					proveedor.setIdentificacion(id);
					proveedor.setNombre(nombre);
					proveedor.setDireccion(direccion);
					proveedor.setApellido(apellido);
					proveedor.setCorreoOrganizacion(correoOrganizacion);
					proveedor.setCorreoPersonal(correoPersonal);
					proveedor.setNumeroTelefonicoCelular(numeroTelefonicoCelular);
				    /*anexarProveedor(new Proveedor(id, nombre, direccion, apellido,
							correoOrganizacion, correoPersonal, numeroTelefonicoCelular));
					*/System.out.println("Proveedor Actualizado");
				}
				
			}
		}else {
			System.out.println("Lista de proveedores vacia");
			
		}
		
		
		
	}
	public boolean verificarActualizacion(String id) {
		boolean boleano=false;
		if (!listProveedores.isEmpty()) {
			for (Proveedor proveedor : listProveedores) {
				if (id.equals(proveedor.getIdentificacion())) {
				boleano=true;
				}
			}if (boleano==false) {
			System.out.println("No se encuentra el proveedor con la ID ingresada");
		}
			
		}else {
			System.out.println("Lista de proveedores vacia");
			
		}
		
		return boleano;
	}
	
	@Override
	public void eliminar(String id, int opc) {
			
		if (!listProveedores.isEmpty()) {
			
			//Borrar primer cliente
			if (opc==1) {
			for (Proveedor proveedor : listProveedores) {
				listProveedores.remove(proveedor);
				break;
			}
			
			}//Borrar datos ultimo cliente
			if (opc==2) {
				
				String aux="";
				for (Proveedor proveedor : listProveedores) {
					aux=proveedor.getIdentificacion();
				}
				for (Proveedor proveedor : listProveedores) {
					if (aux.equals(proveedor.getIdentificacion())) {
						listProveedores.remove(proveedor);
					}
				}
				
			}//borrar datos a partir de su id
			if (opc==3) {
				boolean boleano=false;
				for (Proveedor proveedor : listProveedores) {
					if (id.equals(proveedor.getIdentificacion())) {
						
						System.out.println("AAAAAAAAA");
						listProveedores.remove(proveedor);
						boleano=true;
					}
				}
				if (boleano==false) {
					System.out.println("El Proveedor con la ID Ingresada no Existe");
				}
			
			}
			//Borrar lista en totalidad
			if(opc==4) {
				this.listProveedores.clear();	
				
			}
		}else {
			System.out.println("Lista de proveedores vacia");
		}
	}
	@Override
	public void ordenar(int opc) {
		if (!listProveedores.isEmpty()) {
			//Organizar por nombre
			if (opc==1) {
				
				Object[] nombresOrdenados=listProveedores.stream().map(p->p.getNombre()).sorted().toArray();
				
				ArrayList<String> arrayNombres= new ArrayList<String>();
				for (Object object : nombresOrdenados) {
					arrayNombres.add((String) object);
				}
				do {
						for (Proveedor proveedor : listProveedores) {
						if (proveedor.getNombre().equals(arrayNombres.get(0))) {
							System.out.println(proveedor.toString());
									
							}
					}	
								arrayNombres.remove(0);
								
					
					} while (!arrayNombres.isEmpty());
					
			}//Organizr por apellido
			if (opc==2) {
				
				Object[] nombresOrdenados=listProveedores.stream().map(p->p.getApellido()).sorted().toArray();
				
				ArrayList<String> arrayApellidos= new ArrayList<String>();
				for (Object object : nombresOrdenados) {
					arrayApellidos.add((String) object);
				}
				do {
						for (Proveedor proveedor : listProveedores) {
						if (proveedor.getApellido().equals(arrayApellidos.get(0))) {
							System.out.println(proveedor.toString());
									System.out.println(arrayApellidos.size());
								
							}
					}	
						arrayApellidos.remove(0);
								
					
					} while (!arrayApellidos.isEmpty());
				
				}	
			}else {
			System.out.println("Lista de proveedores vacia");
		}
		
	}
	
	public void buscar() {
		if (!listProveedores.isEmpty()) {
			int i=0;
			for (Proveedor proveedor : listProveedores) {
				System.out.println("["+i+"] "+proveedor.getNombre()+
						" "+proveedor.getApellido());
				i++;
			}
		}else {
			System.out.println("Lista de proveedores vacia");
		}
	}
	public void buscarIndice(int indice) {
		if (!listProveedores.isEmpty()) {
			int i=0;
		
		if (indice==0) {
			for (Proveedor proveedor : listProveedores) {
				System.out.println(proveedor.toString());
				break;
			}
		}if (indice>0 && indice< listProveedores.size()){
			do {
				for (Proveedor proveedor : listProveedores) {
					if (i==indice) {
						System.out.println(proveedor.toString());
						
					}
					i++;
				}break;
			} while (i!=indice);
		}else {
			System.out.println("Numero de proveedor Incorrecto");
		}
		
		}else {
			System.out.println("Lista de proveedores vacia");
		}
	}
	
}
	
	
	