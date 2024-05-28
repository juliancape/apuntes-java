package colecciones;
/**
 * Funciones para una lista lista
 * @author Jeniffer Camacho y julian Cardenas
 * @since 10-03-2021
 *
 */
public class Funciones {

	public Integer[] numero;
	public int tamanio;
	public Funciones() {
	this.numero = new Integer[15];
	this.tamanio=0;	
	}
	
	
	/**
	 * Metodo para saber si la lista esta vacio
	 * @return true si no esta vacia, false si esta vacia
	 */
	public boolean vacia() {
		boolean estado=false;
		if (tamanio==0) {
			estado=true;
		}
		
		return estado;
		
	}
	
	/**
	 * Metodo para retornar el tamaño de la lista
	 * @return
	 */
	public int tamaño() {
		return this.tamanio;
	}
	/**
	 * agregar dato al inicio
	 * @param dato numero a agregar
	 */
	public void agregarInicio(int dato) {
		if (tamanio==0) {
			this.numero[0]=dato;
			
		}else {
			
			for (int i = numero.length; i >0; i--) {
				if (numero[i-1]!=null) {
					numero[i]=numero[i-1];
					
				}
				
			}
			this.numero[0]=dato;
			
		}
			
	}
	
		
	/**
	 * Agregar dato al final
	 * @param dato numero a agregar
	 */
	public void agregarFinal(int dato) {
		if (tamanio==0) {
			this.numero[0]=dato;
			//this.tamanio++;
		}else {
			
			for (int i = 1; i < numero.length; i++) {
				if (numero[i]==null) {
					this.numero[i]=dato;
					 break;
				}
			}
			
		}this.tamanio++;
	}
	/**
	 * Metodo para modificar un indice
	 * @param index indice doonde se remplaza el dato
	 * @param elemento que se quiere insertar
	 */
	public void modificar(int index, int dato) {
		if (tamanio>index) {
			numero[index]=dato;
		}else {
			System.out.println("No se puede modificar");
		}
		
		
	}
	/**
	 * buscar dato
	 * @param dato elemento a buscar
	 * @return retorna true si se encuntra el dato, false si no se encontro
	 */
	public boolean consulta (int dato) {
		boolean estado=false;
		int a=1;
		for (int i = 0; i < tamanio; i++) {
			
			if (dato==numero[i]) {
				
				System.out.println("Dato "+dato+ " encontrado "+a+" vez");
				a++;
				estado=true;
			}
			}if (estado=false) {
				System.out.println("Dato no ennconntrado");
			}
				
			return estado;
	}
	/**
	 * metodo consultar dato inicio
	 */
	public void consultaInicio() {
		if (tamanio==0) {
			System.out.println("No hay elementos en la lista");
		}else {
		System.out.println("El primer dato de la lista es: "+numero[0]);	
		}
		
	}
	/**
	 * Metodo cosultar dato final
	 */
	public void consultarFinal() {
		int a=0;
		for (int i = 0; i < numero.length; i++) {
			
			if (numero[i]==null) {
				a=numero[i-1];
				break;
			}
		}
		System.out.println("El ultimo dato de la lista es: "+ (a));
	}
	
	/**
	 * Metodo mostrar lista
	 */
	public void mostrar() {
		for (int i = 0; i < numero.length; i++) {
		
			if (numero[i]!=null) {
				System.out.println(numero[i]);
			}
			
		}
	}
	
	
	
	
	
}
