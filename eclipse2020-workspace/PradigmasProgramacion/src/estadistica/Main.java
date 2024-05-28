package estadistica;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> listaPersonas = new ArrayList<>();
		 listaPersonas.add(new Persona("Isabel", 7));
		 listaPersonas.add(new Persona("Laura", 4));
		 listaPersonas.add(new Persona("Alirio", 41));
		listaPersonas.add(new Persona("Ricardo", 41));
		 listaPersonas.add(new Persona ("Pedro",27));
		 listaPersonas.add(new Persona ("Juan",29));
		 listaPersonas.add(new Persona ("Mario",17));
		 listaPersonas.add(new Persona ("Laura",21));
		 listaPersonas.add(new Persona ("Veronica",22));
		 
	 
		 
		int sumaE= listaPersonas.stream()
				.map(p -> p.getEdad())
				.reduce(0,(e1,e2) -> e1+e2);
		System.out.println(sumaE);
		 
		 
	}

}
