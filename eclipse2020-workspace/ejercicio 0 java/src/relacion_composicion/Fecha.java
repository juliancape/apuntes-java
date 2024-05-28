package relacion_composicion;
/**
 * 
 * @author julian cardenas peñuela
 *@since 2020 09 08
 */
public class Fecha {
	private int dia;
	private int mes;
	private int year;
	/**
	 * @param dia
	 * @param mes
	 * @param year
	 */
	public Fecha(int dia, int mes, int year) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}
	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}
	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
