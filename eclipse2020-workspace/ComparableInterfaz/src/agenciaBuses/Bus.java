package agenciaBuses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public  class Bus implements Comparable<Bus>{
	
	private Conductor conductor;
	private int numero;
	private ArrayList km= new ArrayList();
	
	/**
	 * @param conductor
	 * @param numero
	 * @param km
	 * @param prioridad
	 */
	public Bus(Conductor conductor, int numero, ArrayList km) {
		super();
		this.conductor = conductor;
		this.numero = numero;
		this.km = km;
	
	}
	/**
	 * @return the conductor
	 */
	public Conductor getConductor() {
		return conductor;
	}
	
	/**
	 * @param conductor the conductor to set
	 */
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	/**
	 * @return the numero
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
	 * @return the km
	 */
	public ArrayList getKm() {
		return km;
	}
	/**
	 * @param km the km to set
	 */
	public void setKm(ArrayList km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		
	
		return "Bus [conductor=" + conductor + ", numero=" + numero + ", km=" + km + "]";
		
	
	}
	
	
	public int compareTo(Bus bus) {
		
		
		
	/*	if (this.km<bus.getKm()) {
			return 1;
		}else if (this.km>bus.getKm()) {
			return -1;
		}else {
			return 0;
		}
		*/
		return 0;
	}

	
	

}
