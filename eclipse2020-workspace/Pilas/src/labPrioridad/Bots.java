package labPrioridad;

public class Bots {
 private int codigo;
 private int tipo ;
 private int porVida;
/**
 * @param codigo
 * @param tipo
 * @param porVida
 */
public Bots(int codigo, int tipo, int porVida) {
	super();
	this.codigo = codigo;
	this.tipo = tipo;
	this.porVida = porVida;
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
 * @return the tipo
 */
public int getTipo() {
	return tipo;
}
/**
 * @param tipo the tipo to set
 */
public void setTipo(int tipo) {
	this.tipo = tipo;
}
/**
 * @return the porVida
 */
public int getPorVida() {
	return porVida;
}
/**
 * @param porVida the porVida to set
 */
public void setPorVida(int porVida) {
	this.porVida = porVida;
}
@Override
public String toString() {
	return "Bots [codigo=" + codigo + ", tipo=" + tipo + ", porVida=" + porVida + "]";
}
 
 
 
}
