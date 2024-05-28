package interfaces_ejercicio1;
/**
 * 
 * @author ASUS FX 505DY R5
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televisor miTelevisor= new Televisor("Rojo Facha", 5000000, true);
		
		System.out.println(miTelevisor + " Precio con IVA "+miTelevisor.calcularPrecio());
		
		
		
		
		
	}

}
