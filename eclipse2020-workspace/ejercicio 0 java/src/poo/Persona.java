package poo;
	/**
	 * Programa la clase persona para crear objetos
	 * @author julian cardenas peñuela 
	 *@since 2020-08-25
	 *
	 */
public class Persona {
	
		private int id;
		private  String  nombre; 
		private String telefono;
		/**
		 * construtor de la clase persona
		 * @param id identificacion del titular de la cuenta
		 * @param nombre
		 * @param telefono
		 */
		public Persona(int id, String nombre, String telefono) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.telefono = telefono;
		}
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
		/**
		 * 
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * metodo para optener nombre del titular de la cuenta
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * @return the telefono
		 */
		public String getTelefono() {
			return telefono;
		}
		/**
		 * @param telefono the telefono to set
		 */
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		
}
