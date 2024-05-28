package herencia;

public class Producto {

	protected int codigo;
	protected String nombre;
	protected int precio;
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Producto(int codigo, String nombre, int precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
