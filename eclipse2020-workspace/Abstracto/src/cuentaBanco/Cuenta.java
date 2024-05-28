package cuentaBanco;

public abstract class Cuenta {

	protected int numeroCuenta;
	protected String titular;
	protected long saldo;
	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(int numeroCuenta, String titular, long saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public abstract void deposito(long valor); 
	
	public abstract void retiro(long valor);
	

	@Override
	public String toString() {
		return "[numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
}
