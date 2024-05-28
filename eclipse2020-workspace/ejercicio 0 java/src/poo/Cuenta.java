package poo;

/**
 * 
 * @author Julian  cardenas pe�uela
 *@since 2020-08-25
 *@version 02
 */
public class Cuenta {
	private int numero;
	private long saldo;
	private Persona titular;
	/**
	 * @param numero
	 * @param titular
	 */
	public Cuenta(int numero, Persona titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	/**
	 * metodo para tener el numero de la cuenta 
	 * @return the numero de la cuenta para cadda titular
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the saldo
	 */
	public long getSaldo() {
		return saldo;
	}
	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * @return the titular
	 */
	public Persona getTitular() {
		return titular;
	}
	/**
	 * @param titular the titular to set
	 */
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	/**
	 * metodo que realiza los depositos en las cuentas de ahorro 
	 * @param valor a consignar desde programa
	 */
	
	
	public void deposito(long valor) {
		this.saldo += valor;
		this.saldo += (valor*3)/100;
				
	}
	public void retiro(long valor) {
		if (valor>saldo) {
			System.out.println("Pailas fondos insuficientes");
		}else {
			this.saldo -= valor;
		}
		
		
		
	}
	
	
	
}
