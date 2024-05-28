package lambda;
/**
 * Sintaxis expresion lambda en java
 * @author Julian cardenas
 * @since 10/03/21
 *@version 1.0
 */
public class EjemploLambda1 {
		public interface IOperacion{
		public abstract double calcularResultado(double x, double y);
		}
	public double operar() {
		IOperacion unaOperacion = (x,y) -> (x*y);
		return unaOperacion.calcularResultado(7,4);
	}
	public static void main(String[] srgs) {
		EjemploLambda1 obj= new EjemploLambda1();
		System.out.println(obj.operar());
	}
	
	
}
