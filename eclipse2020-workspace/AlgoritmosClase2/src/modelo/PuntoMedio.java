package modelo;
/**
 * 
 * @author julian cardenas
 *@since 05-08-2021
 *@version 1.0
 */
public class PuntoMedio {

	public Punto puntoMedio(Punto generado, Punto referencia) {
		
		
		int x= (generado.getX()+referencia.getX())/2;
		int y= (generado.getY()+referencia.getY())/2;
		
		
		
		
		return new Punto(x, y);
	}
}
