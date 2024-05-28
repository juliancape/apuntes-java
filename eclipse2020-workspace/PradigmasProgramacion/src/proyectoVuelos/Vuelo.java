package proyectoVuelos;


public class Vuelo {

	private String ciudadSalida;
	private String ciudadLlegada;
	private Avion avion;
	private Pasajero[] listaPasajeros;
	
	public Vuelo(String ciudadSalida, String ciudadLlegada, Avion avion, Pasajero[] listaP) {
		
		this.ciudadSalida = ciudadSalida;
		this.ciudadLlegada = ciudadLlegada;
		this.avion = avion;
		this.listaPasajeros = listaP;
	}

	public String getCiudadSalida() {
		return ciudadSalida;
	}

	public void setCiudadSalida(String ciudadSalida) {
		this.ciudadSalida = ciudadSalida;
	}

	public String getCiudadLlegada() {
		return ciudadLlegada;
	}

	public void setCiudadLlegada(String ciudadLlegada) {
		this.ciudadLlegada = ciudadLlegada;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero[] getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(Pasajero[] listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	@Override
	public String toString() {
		return "Vuelo [ciudadSalida=" + ciudadSalida + ", ciudadLlegada=" + ciudadLlegada + ", avion=" + avion
				+ ", listaPasajeros=" + Arrays.toString(listaPasajeros) + "]";
	}
	
	
}
