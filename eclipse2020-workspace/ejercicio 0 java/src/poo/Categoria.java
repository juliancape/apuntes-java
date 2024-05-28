package poo;

/**
 * Clase
 * @author ASUS FX 505DY R5
 * @since 2020-01-27
 * @version 01
 */


public class Categoria {
 private int codigoCategoria;
 private String descipcionCategoria;
/**
 * @param codigoCategoria
 * @param descipcionCategoria
 */
public Categoria(int codigoCategoria, String descipcionCategoria) {
	super();
	this.codigoCategoria = codigoCategoria;
	this.descipcionCategoria = descipcionCategoria;
}
/**
 * @return the codigoCategoria
 */
public int getCodigoCategoria() {
	return codigoCategoria;
}
/**
 * @param codigoCategoria the codigoCategoria to set
 */
public void setCodigoCategoria(int codigoCategoria) {
	this.codigoCategoria = codigoCategoria;
}
/**
 * @return the descipcionCategoria
 */
public String getDescipcionCategoria() {
	return descipcionCategoria;
}
/**
 * @param descipcionCategoria the descipcionCategoria to set
 */
public void setDescipcionCategoria(String descipcionCategoria) {
	this.descipcionCategoria = descipcionCategoria;
}

 
 
 
}
