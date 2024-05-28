package ejercicio1;



/**
 * Clase  Fijo donde estan los empleados fijos 
 * @author Julian Cardenas
 * @since 17-10-2020
 * @version 2.0
 *
 */
public class Fijo extends Empleado{
	
	private double salarioFijo;
	private int nAnios;
	
		/**
	 * @param id   identificacion del empleado
	 * @param nombre    
	 * @param apellido
	 * @param fecha  fecha de ingres
	 * @param salarioPagar   salario a pagar
	 * @param salarioFijo salario fijo
	 * @param nAnios    numero de años que ha  trabajado
	 */
	public Fijo(int id, String nombre, String apellido, Fecha fecha, double salarioPagar, double salarioFijo,
			int nAnios) {
		super(id, nombre, apellido, fecha, salarioPagar);
		
		this.salarioFijo = salarioFijo;
		this.nAnios = nAnios;
		aniosTrabajados ();
		calculoSalario();
		
	
	
	}
		
	//METODOS GET Y SET
	

	/**
	 * @return the salarioFijo
	 */
	public double getSalarioFijo() {
		return salarioFijo;
	}


	/**
	 * @param salarioFijo the salarioFijo to set
	 */
	public void setSalarioFijo(double salarioFijo) {
		this.salarioFijo = salarioFijo;
	}


	@Override
	public String toString() {
		return super.toString()+" salarioFijo=" + salarioFijo +" "
				+ ", años trabajados "+nAnios+", Salario a pagar "+salarioPagar+" ]";
	}

	
	//Metodo para calcular años trabajos
	public void aniosTrabajados () {
		 nAnios= 2020 - fecha.getAnio();
		 
	
	}
	//Metodo para calcular el salario a pagar
	public void calculoSalario() {
		
		
		if (nAnios<2) 
		{
			this.salarioPagar= salarioFijo;
		}
		if (nAnios>=2 && nAnios<4) {
			this.salarioPagar= salarioFijo+(salarioFijo*0.05);
		}
		if (nAnios>=4 && nAnios<8) {
			this.salarioPagar= salarioFijo+(salarioFijo*0.1);
		}
		if (nAnios>=8 && nAnios<=15 ) {
			this.salarioPagar= salarioFijo+(salarioFijo*0.15);
		}
		if (nAnios>15) {
			this.salarioPagar= salarioFijo+(salarioFijo*0.2);
		}
		
		
	}
	
	
	
}

	