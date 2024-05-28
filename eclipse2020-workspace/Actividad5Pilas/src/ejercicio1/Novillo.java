package ejercicio1;

/**
 * Clase donde se crea al novillo con el parametro peso, metodos set y get
 * @author  Jennifer Camacho y Julian Cardenas
 * @since 10-04-21
 *
 */
public class Novillo {

	private Integer peso;
	//private Integer categoria;
	/**
	 * @param peso
	 */
	public Novillo(Integer peso) {
		
		this.peso = peso;
		//this.categoria= generarCategoria(this.peso);
	}
	
	/* public Integer generarCategoria(Integer peso) {
		Integer tipoEstablo=0;
		
		if (peso>=200 && peso<=350) {
			tipoEstablo=1;
		} if (peso>=351 && peso<=450) {
			tipoEstablo=2;
		} 
		return tipoEstablo;
	}
	*/
	
	/**
	 * @return the peso
	 */
	public Integer getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
}

	