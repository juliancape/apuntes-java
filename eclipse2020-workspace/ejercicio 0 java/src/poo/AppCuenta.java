package poo;

public class AppCuenta {

	public static void main(String[]args) {
		
		Persona miPersona =new Persona(1000519298,"Julian", "3208147049");
		
		Cuenta miCuenta = new Cuenta(1020,miPersona);
		
		miCuenta.deposito(30000);
		
		System.out.println("Numero de la cuenta "+miCuenta.getNumero());
		System.out.println("Nombre del titular "+miCuenta.getTitular().getNombre());
		
		System.out.println("saldo a  la fecha "+miCuenta.getSaldo());
		
		
		
	}
	
	
}
