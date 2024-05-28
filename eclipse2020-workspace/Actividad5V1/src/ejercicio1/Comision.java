package ejercicio1;
/**
 * Clase  comision, donde estan los empleados que trabajan acomision
 * @author Julian Cardenas
 * @since 15-10-2020
 * @version 1.0
 *
 */
public class Comision extends Empleado{
	private int nDomi;
	private float nAnios;
	
	
	
	/**
	 * @param id  identificaion del empleado
	 * @param nombre  
	 * @param apellido
	 * @param fecha
	 * @param salarioFijo    salario fio del empleado
	 * @param nDomi    numero de domicilios
	 * @param nAnios   numeroo de años que ha estado el empleado
	 */
	//CONSTRUCTOR
	public Comision(int id, String nombre, String apellido, Fecha fecha, double salarioFijo, int nDomi, float nAnios) {
		super(id, nombre, apellido, fecha, salarioFijo);
		
		this.nDomi = nDomi;
		this.nAnios = nAnios;
		comisionExtra();
	}
	
	//METODOS GET  Y SET

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
	 * @return the nAnios
	 */
	public float getnAnios() {
		return nAnios;
	}



	/**
	 * @param nAnios the nAnios to set
	 */
	public void setnAnios(float nAnios) {
		this.nAnios = nAnios;
	}

	

	@Override
	public String toString() {
		return super.toString()+ "Comision [Numero de Domicilios=" + nDomi + "]"+ "Numero de Anios=" + nAnios ;
	}


	//Metodo ppara calcular la comision extra
	public void comisionExtra() {
		if (nDomi<32) {
			this.salarioPagar=salarioFijo;
		}
		if (nDomi>=32) {
			this.salarioPagar=salarioFijo+(nDomi*9500);
		}
		
		
		
	}
	

}
