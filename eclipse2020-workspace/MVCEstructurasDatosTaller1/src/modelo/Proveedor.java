package modelo;


public class Proveedor implements Comparable<Proveedor> {

	private String identificacion;
	private String nombre;
	private String direccion;
	private String apellido;
	private String correoOrganizacion;
	private String correoPersonal;
	private String numeroTelefonicoCelular;
	
	
	
	
	/**
	 * @param identificacion
	 * @param nombre
	 * @param direccion
	 * @param apellido
	 * @param correoOrganizacion
	 * @param correoPersonal
	 * @param numeroTelefonicoCelular
	 */
	public Proveedor(String identificacion, String nombre, String direccion, String apellido,
			String correoOrganizacion, String correoPersonal, String numeroTelefonicoCelular) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.apellido = apellido;
		this.correoOrganizacion = correoOrganizacion;
		this.correoPersonal = correoPersonal;
		this.numeroTelefonicoCelular = numeroTelefonicoCelular;
	}
	
	
	

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}




	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}




	/**
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}




	/**
	 * @param direccion the dirreccion to set
	 */
	public void setDireccion(String dirreccion) {
		this.direccion = dirreccion;
	}




	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}




	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	/**
	 * @return the correoOrganizacion
	 */
	public String getCorreoOrganizacion() {
		return correoOrganizacion;
	}




	/**
	 * @param correoOrganizacion the correoOrganizacion to set
	 */
	public void setCorreoOrganizacion(String correoOrganizacion) {
		this.correoOrganizacion = correoOrganizacion;
	}




	/**
	 * @return the correoPersonal
	 */
	public String getCorreoPersonal() {
		return correoPersonal;
	}




	/**
	 * @param correoPersonal the correoPersonal to set
	 */
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}




	/**
	 * @return the numeroTelefonicoCelular
	 */
	public String getNumeroTelefonicoCelular() {
		return numeroTelefonicoCelular;
	}




	/**
	 * @param numeroTelefonicoCelular the numeroTelefonicoCelular to set
	 */
	public void setNumeroTelefonicoCelular(String numeroTelefonicoCelular) {
		this.numeroTelefonicoCelular = numeroTelefonicoCelular;
	}

	


	@Override
	public String toString() {
		return "Proveedor [identificacion=" + identificacion + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", apellido=" + apellido + ", correoOrganizacion=" + correoOrganizacion + ", correoPersonal="
				+ correoPersonal + ", numeroTelefonicoCelular=" + numeroTelefonicoCelular + "]";
	}




	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificacion == null) ? 0 :
		identificacion.hashCode());
		return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Proveedor other = (Proveedor) obj;
			if (identificacion == null) {
			if (other.identificacion != null)
				return false;
			} else if (!identificacion.equals(other.identificacion))
				return false;
				return true;
		}




		@Override
		public int compareTo(Proveedor proveedor) {
			// TODO Auto-generated method stub
			return this.identificacion.compareTo(proveedor.identificacion);
		}




	
	
}
