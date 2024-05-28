package cuentaBanco;

public class App  {
	
 
	public static void main (String[] args) {
		
		
		//Ahorro miAhorro = new Ahorro(numeroCuenta, titular, saldo, interes)
		Ahorro miAhorro = new Ahorro(1214, "Jeronimo Gil Ortiz", 500, 0);
		miAhorro.deposito(800);
		System.out.println("Cuenta Ahorro "+miAhorro);
				//Corriente cCorriente= new Corriente(numeroCuenta, titular, saldo, sobreGiro)
		
		Corriente cCorriente= new Corriente(2412, "Ste Sech", 400, 900);
		cCorriente.retiro(700);
		System.out.println("Cuenta Corriente "+cCorriente);
		
		
		
	}
}
