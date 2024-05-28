package ejercicio1;

/**
 * Clase  Fijo donde estan los empleados fijos 
 * @author Julian Cardenas
 * @since 15-10-2020
 * @version 1.0
 *
 */
public class Fijo extends Empleado{
	
	private double nAnios;
    

	/**
	 * @param id identificacion del empleado
	 * @param nombre
	 * @param apellido
	 * @param fecha  fecha de ingreso
	 * @param salarioFijo    salario fijo del empleado
	 * @param nAnios   numero de años que ha estado en la empresa
	 */
	//CONSTRUCTOR
	public Fijo(int id, String nombre, String apellido, Fecha fecha, double salarioFijo, double nAnios) {
		super(id, nombre, apellido, fecha, salarioFijo);
		
		this.nAnios = nAnios;
		calculoSalario();
	}
	//METODOS GET  Y SET
	/**
	 * @return the nAnios
	 */
	public double getnAnios() {
		return nAnios;
	}

	/**
	 * @param nAnios the nAnios to set
	 */
	public void setnAnios(double nAnios) {
		this.nAnios = nAnios;
	}

	@Override
	public String toString() {
		return super.toString()+ " [numero de Anios=" + nAnios + "]";
	}
	//Metodo para calcular el salario a pagar
	public void calculoSalario() {
		if (nAnios<2) {
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

	