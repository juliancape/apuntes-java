package ejercicio1;

import java.util.Scanner;


/**
 * Clase Tienda que contiene al cliente y al producto
 * @author Julian Cardenas Peñuela
 * @since 04-10-2020
 *@version 1.0
 *
 */
public class Tienda {
	private Scanner leerDato =new Scanner(System.in);
	
	int numero=0;
	private Cliente[] listaClientes ;
	private Producto[] listaProductos ;
	private int numClientes;
	private int numProductos;
	private int codigo;
	 
	
	/**
	 * 
	 * @param numero cantidad de espacios en el arreglo, en este caso puse 10
	 */
	//CONSTRUCTOR DE TIENDA
	public Tienda( int numero) {
		super();
		
		this.numero = numero;
		this.listaClientes = new Cliente[numero];
		this.listaProductos = new Producto[numero];
	}



	/**
	 * Método menu de opciones para acceso a las opciones del programa
	 */
	public void run() {
		int opc = 0;
		boolean salir=false;
		while(!salir) {
			System.out.println("Tienda Surtidora la 23");
			System.out.println("1. Registrar Cliente ");
			System.out.println("2. Agregar Producto");
			System.out.println("3. Buscar Producto por Codigo ");
			System.out.println("4. Mostrar Catalogo");
			System.out.println("5. Mostrar Clientes");
			
			System.out.println("6. Salir");
			System.out.print("Entrar una de las opciones");
			opc = leerDato.nextInt();
			switch (opc) {
				case 1:
					registrarCliente(listaClientes);
					break;
				case 2:
					agregarProducto(listaProductos);
					;break;
				case 3:
					buscarProducto(codigo);
					;break;
				case 4:
					mostrarCatalogo(listaProductos);
					;break;
				case 5:
					mostrarClientes(listaClientes);
					break;
				
				case 6:salir=true;break;	
				default: 
					System.out.println("Solo números entre 1 y 7");
					break; 
		   }
			
			}
		}
		
	//METODOS DE LAS OPCIONES DEL MENU

	private void registrarCliente(Cliente[] listaCliente) {
		// TODO Auto-generated method stub
	
			
			
			System.out.println("Agregar Cliente");
			System.out.println("Indentificacion del cliente");
			int id= leerDato.nextInt();
			System.out.println("Nombre ");
			String nombre= leerDato.next();
			System.out.println("Apellido");
			String apellido = leerDato.next();
			System.out.println("Telefono");
			int telefono = leerDato.nextInt();
			System.out.println("Correo");
			String correo= leerDato.next();
			System.out.println("Dia de nacimiento");
			int dia = leerDato.nextInt();
			System.out.println("Mes de nacimiento");
			int mes = leerDato.nextInt();
			System.out.println("Año de nacimiento");
			int anio = leerDato.nextInt();
			Fecha nacimiento = new Fecha(dia, mes, anio);
			listaClientes[numClientes] = new Cliente(id, nombre, apellido, telefono, correo, nacimiento);
			
			this.numClientes++;
		
	}
			private void agregarProducto(Producto[] listaProductos) {
				System.out.println("Codigo del producto");
				int codigo = leerDato.nextInt();
				System.out.println("Descripcion");
				String descripcion = leerDato.next();
				System.out.println("Precio");
				double precio = leerDato.nextDouble();
				System.out.println("Cantidad");
				int cantidad = leerDato.nextInt();
				
				System.out.println("Fecha de vencimiento");
				System.out.println("Dia");
				int dia = leerDato.nextInt();
				System.out.println("Mes");
				int mes = leerDato.nextInt();
				System.out.println("Año");
				int anio = leerDato.nextInt();
				Fecha vencimiento = new Fecha(dia, mes, anio);
				listaProductos[numProductos] = new Producto(codigo, descripcion, precio, cantidad, vencimiento);
				
				this.numProductos++;
				
			}
			
				private void buscarProducto(int codigo) {
					System.out.println("Ingrese codigo  de producto a buscar ");
					codigo = leerDato.nextInt();
					
					for (Producto producto : listaProductos) {
						if (codigo==producto.getCodigo()) {
							
							System.out.println("Datos del Producto " );
							System.out.println("Producto [codigo=" + producto.getCodigo() + ", descripcion=" + producto.getDescripcion() 
							+ ", precio=" + producto.getPrecio() + ", cantidad="
				+ producto.getCantidad() + ", vencimiento Dia-Mes-Año=" + producto.getVencimiento().getDia() +"-"+producto.getVencimiento().getMes()+"-"+producto.getVencimiento().getAnio()+ "]");
							
							break;
						}else {
							System.out.println("No se encontro el Producto");
							break;
						}
					}
				}
			
				private void mostrarCatalogo(Producto[] listaProductos){
					System.out.println("Catalogo de Productos");
					System.out.println("Codigo    Descripcion    Precio de Venta");
					for (int i = 0; i < numProductos; i++) {
						System.out.println(listaProductos[i].getCodigo() + "         "+ listaProductos[i].getDescripcion() +"              "+listaProductos[i].getPrecio());
					
					}
					
				}
				private void mostrarClientes(Cliente[] listaClientes) {
					System.out.println("Lista de Clientes");
					System.out.println("Datos");
					for (int i = 0; i < numClientes; i++) {
						System.out.println("Cliente [id=" + listaClientes[i].getId() + ", nombre=" + listaClientes[i].getNombre() 
								+ ", apellido=" + listaClientes[i].getApellido() + ", telefono=" + listaClientes[i].getTelefono()
								+ ", correo=" + listaClientes[i].getCorreo() 
								+ ", nacimiento Dia-Mes-Año=" + listaClientes[i].getNacimiento().getDia() +
								"-"+listaClientes[i].getNacimiento().getMes()+"-"+listaClientes[i].getNacimiento().getAnio()+ "]");
					}
					
					System.out.println("Numero Total de Clientes ["+numClientes +"]");
					
					
				}
	
	

	
	
	
	
	

}
