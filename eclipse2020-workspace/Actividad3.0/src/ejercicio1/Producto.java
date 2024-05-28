package ejercicio1;
/**
 * Clase Producto que contiene todas las especificaciones del producto
 * @author Julian Cardenas Peñuela
 * @since 04-10-2020
 *@version 1.0
 *
 */
public class Producto {
	private  int codigo;
	private String descripcion;
	private double precio;
	private int cantidad;
	private Fecha vencimiento;
	/**
	 * @param codigo del producto
	 * @param descripcion del producto
	 * @param precio del producto
	 * @param cantidad del producto
	 * @param vencimiento   Fecha de venciminto dia mes año
	 */
	//CONSTRUCTOR
	public Producto(int codigo, String descripcion, double precio, int cantidad, Fecha vencimiento) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidad = cantidad;
		this.vencimiento = vencimiento;
	}
	//GETS Y SETS
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * @return the vencimiento
	 */
	public Fecha getVencimiento() {
		return vencimiento;
	}
	/**
	 * @param vencimiento the vencimiento to set
	 */
	public void setVencimiento(Fecha vencimiento) {
		this.vencimiento = vencimiento;
	}
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidad + ", vencimiento=" + vencimiento + "]";
	}
	
	
	
	
	
	
}
