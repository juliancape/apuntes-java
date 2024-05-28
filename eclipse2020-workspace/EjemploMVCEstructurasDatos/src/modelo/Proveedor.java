package modelo;

public class Proveedor {

	private String identificacion;
	private String nombre;
	private String apellido;
	private String correoOrganizacion;
	private String correoPersonal;
	private String numeroTelefonicoCelular;
	
	public Proveedor(String identificacion, String nombre, String apellido, String correoOrganizacion,
			String correoPersonal, String numeroTelefonicoCelular) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoOrganizacion = correoOrganizacion;
		this.correoPersonal = correoPersonal;
		this.numeroTelefonicoCelular = numeroTelefonicoCelular;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoOrganización() {
		return correoOrganizacion;
	}

	public void setCorreoOrganización(String correoOrganizacion) {
		this.correoOrganizacion = correoOrganizacion;
	}

	public String getCorreoPersonal() {
		return correoPersonal;
	}

	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}

	public String getNumeroTelefonicoCelular() {
		return numeroTelefonicoCelular;
	}

	public void setNumeroTelefonicoCelular(String numeroTelefonicoCelular) {
		this.numeroTelefonicoCelular = numeroTelefonicoCelular;
	}

	@Override
	
	 
	 public String toString() {
        return  "Identificacion: " + identificacion + 
                "\nNombres: " + nombre + 
                "\nApellidos: " + apellido + 
                "\nCorreo organizacion: " + correoOrganizacion + 
                "\nCorreo personal: " + correoPersonal + 
                "\nNúmero de teléfono celular: " + numeroTelefonicoCelular + "\n";
                
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
		

	
	
}
