package cuentaBanco;

public class Ahorro extends Cuenta {
	private long interes;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 * @param interes
	 */
	public Ahorro(int numeroCuenta, String titular, long saldo, long interes) {
		super(numeroCuenta, titular, saldo);
		
		this.interes = interes;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		
		this.interes = (long) (valor*0.03);
		
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public String toString() {
		return super.toString()+" Ahorro [interes=" + interes + "]";
	}
	
	
	
}
