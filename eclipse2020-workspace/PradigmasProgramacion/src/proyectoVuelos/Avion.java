package proyectoVuelos;

import agenciaViajes.Override;
import agenciaViajes.String;

public class Avion {

	private String marca;
	private int capacidad;
	private int modelo;
	
	public Avion(String marca, int capacidad, int modelo) {

		this.marca = marca;
		this.capacidad = capacidad;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Avion [marca=" + marca + ", capacidad=" + capacidad + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
}
