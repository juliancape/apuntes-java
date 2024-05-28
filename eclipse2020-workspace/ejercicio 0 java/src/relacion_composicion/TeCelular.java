package relacion_composicion;

public class TeCelular {

	private String marca;
	private String modelo;
	private Antena antena;
	
	
	public TeCelular(String marca, String modelo, int potencia) {
	
	this.marca = marca;
		this.modelo = modelo;
		//SE IMPLEMENTA UNA RELACION DE COMPOSICION
		this.antena = new Antena(potencia);
	
	}
	
	
	/**
	 * Metodo para obtener la marca del telefono
	 * @return the marca es dato de tipo String con la marca del telefono
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * Metodo para obtener
	 * @return the antena es una instancia de la clase Antena
	 */
	public Antena getAntena() {
		return antena;
	}
	/**
	 * @param antena the antena to set
	 */
	public void setAntena(Antena antena) {
		this.antena = antena;
	}
	
	
}
