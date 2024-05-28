package dinamico;

import java.util.ArrayList;

public class ListaPersona {

	ArrayList<Persona> listaPersona;
	
	public listaPerosna() {
		listaPersona = new ArrayList<>();
		
	}
	
	public void agregarPersona(Persona persona) {
		listsPersona.add(persona);
		
	}
	
	public void mostrarLista() {
		for (Persona persona : listaPersona) {
			System.out.println(persona);
		}
	}
	public Persona buscarPersona (int id) {
		Persona p =null;
		for (Persona persona : listaPersona) {
			if (persona.getId() === id) {
				p=persona;
				break;
			}
		}
		return p;
	}
	
	
	public void buscarPersona(Persona persona) {
		listaPersona.remove(persona);
		
	}
	public void borrarPeronsa(Persona perosna) {
		listaPersona.remove(persona);
		
	}
	
	public void borrar (int index) {
		listaPersona.remove(index);
	}
	
	
	
	
	
	
}
