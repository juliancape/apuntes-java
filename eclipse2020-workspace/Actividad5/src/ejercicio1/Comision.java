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
	private int nAños;
	

		
		/**
	 * @param id identifiacion del empleado
	 * @param nombre
	 * @param apellido
	 * @param fecha fecha de ingreso
	 * @param salarioPagar
	 * @param nDomi    numero de domicilios 
	 * @param nAños    numero de años que ha trabajado
	 */
	public Comision(int id, String nombre, String apellido, Fecha fecha, double salarioPagar, int nDomi,
			 int nAños) {
		super(id, nombre, apellido, fecha, salarioPagar);
		this.nDomi = nDomi;
		
		this.nAños = nAños;
		
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
	 * @return the nAños
	 */
	public int getnAños() {
		return nAños;
	}



	//METODOS GET Y SET

	/**
	 * @param nAños the nAños to set
	 */
	public void setnAños(int nAños) {
		this.nAños = nAños;
	}


	//Metodo para calcular años trabajos
	public void aniosTrabajados () {
		  nAños= 2020 - fecha.getAnio();
		
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
		return super.toString()+" salario Fijo=" + salarioMinimo + ", Años Trabajados "
		+nAños+", Comision "+salarioPagar+"]";
	}
		
	

}
