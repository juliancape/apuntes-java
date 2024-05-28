package cuentaBanco;

public class Corriente extends Cuenta{

	private long sobreGiro;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 * @param sobreGiro
	 */
	public Corriente(int numeroCuenta, String titular, long saldo, long sobreGiro) {
		super(numeroCuenta, titular, saldo);
		
		this.sobreGiro = sobreGiro ;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		
		if (valor>saldo) {
			this.sobreGiro = valor-saldo;
			this.saldo=(saldo-sobreGiro);
		}
		
		
	}

	@Override
	public String toString() {
		return super.toString()+" Corriente [sobreGiro=" + sobreGiro + "]";
	}

	

	
}
