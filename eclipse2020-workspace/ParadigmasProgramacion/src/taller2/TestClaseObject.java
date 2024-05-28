package taller2;
/**
 * realiza un test a partir de diferentes clases wrapper 
 * @author julian Cardenas
 *@since 14-02-2021
 */
public class TestClaseObject {

	public static void main(String[] args) {
		ClaseObject ob = new ClaseObject (5);
		
		String nombre ="Juan Rodriguez";
		ob.add(nombre);
		String name = (String) ob.get(0);
		System.out.println("Imprimir cadena "+name);
		System.out.println(" "+ob.getClass() );
		
		Integer numero = 12;
		ob.add(numero);
		int n = (Integer) ob.get(1);
		System.out.println("Imprimir objeto Integer "+n);
		
		Double valor = 150.00;
		ob.add(valor);
		double d = (Double) ob.get(2);
		System.out.println("Imprimir objeto Double "+d);
		
		Character letra = 'S';
		ob.add(letra);
		char c= (Character) ob.get(3);
		System.out.println("Imprimir bjeto Character "+c);
		
		Boolean estado=true;
		ob.add(estado);
		boolean b= (Boolean ) ob.get(4);
		System.out.println("Imprimir objeto Boolean "+b);
		
		
		
	}
	
	
}
