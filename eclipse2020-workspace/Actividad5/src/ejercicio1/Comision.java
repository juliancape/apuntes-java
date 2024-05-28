package ejercicio1;
/**
 * Clase  comision, donde estan los empleados que trabajan acomision
 * @author Julian Cardenas
 * @since 17-10-2020
 * @version 2.0
 *
 */
public class Comision extends Empleado{
	private int nDomi;
	//private final int SALARIOMINIMO =300000  ASI ES COMO SE ESCRIBE NO COMO ESTA ABAJO 
	private float salarioMinimo = 300000;
	private int nA�os;
	

		
		/**
	 * @param id identifiacion del empleado
	 * @param nombre
	 * @param apellido
	 * @param fecha fecha de ingreso
	 * @param salarioPagar
	 * @param nDomi    numero de domicilios 
	 * @param nA�os    numero de a�os que ha trabajado
	 */
	public Comision(int id, String nombre, String apellido, Fecha fecha, double salarioPagar, int nDomi,
			 int nA�os) {
		super(id, nombre, apellido, fecha, salarioPagar);
		this.nDomi = nDomi;
		
		this.nA�os = nA�os;
		
		aniosTrabajados();
		comisionExtra();
	}
		

	/**
	 * @return the nDomi
	 */
	public int getnDomi() {
		return nDomi;
	}



	/**
	 * @param nDomi the nDomi to set
	 */
	public void setnDomi(int nDomi) {
		this.nDomi = nDomi;
	}


	/**
	 * @return the nA�os
	 */
	public int getnA�os() {
		return nA�os;
	}



	//METODOS GET Y SET

	/**
	 * @param nA�os the nA�os to set
	 */
	public void setnA�os(int nA�os) {
		this.nA�os = nA�os;
	}


	//Metodo para calcular a�os trabajos
	public void aniosTrabajados () {
		  nA�os= 2020 - fecha.getAnio();
		
	}

	//Metodo para calcular la comision extra
	public void comisionExtra() {
		if (nDomi<32) {
			this.salarioPagar=salarioMinimo;
		}
		if (nDomi>=32) {
			this.salarioPagar=salarioMinimo+(nDomi*9500);
		}
		
		
	}



	@Override
	public String toString() {
		return super.toString()+" salario Fijo=" + salarioMinimo + ", A�os Trabajados "
		+nA�os+", Comision "+salarioPagar+"]";
	}
		
	

}
