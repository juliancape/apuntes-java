package expresionLambda;
/**
 * Proggrama principal para probar los distintos tipos de 
 * predicados a la hora de filtrar personas de un listado
 * @author julian Cardenas
 * @since14/03/2021
 * @version 1.0
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	private static List<Persona> filtrar(List<Persona> listaPersonas,
	Predicate<Persona> pAdulto){
		List<Persona> resultado = new ArrayList<>();
		for (Persona persona: listaPersonas) {
			if (pAdulto.test(persona)) {
				resultado.add(persona);
			}
		}
		return resultado;
		
	}
	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("Juan", 20));
		listaPersonas.add(new Persona("Mesa",21 ));
		listaPersonas.add(new Persona("Pa", 55));
		listaPersonas.add(new Persona("Melo", 5));
		listaPersonas.add(new Persona("Mari",34 ));
		Predicate<Persona> pAdulto = p ->p.getEdad() >=18;
		Predicate<Persona> pNombreM= p ->p.getNombre().startsWith("M"); 
		
		List<Persona> adultos= filtrar (listaPersonas, 
		pAdulto.and(pNombreM));
		System.out.println("Listado de personas adultas cuyo nombre"+ 
				"empieza por M");
		for (Persona p : adultos) {
			System.out.println(p);
		}
		
	}
	
	
	
}
