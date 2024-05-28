package peliculas;
import java.util.*;
import java.util.function.*;
import java.util.Comparator;
import java.util.function.Consumer;

public class Ejercicio {

	public static void main(String[] args) 
	{
		List<Pelicula> peliculas = new ArrayList<>();
		peliculas.add(new Pelicula("E.T.", "Steven Spielberg", "1982"));
		peliculas.add(new Pelicula("Avatar", "James Cameron", "2009"));
		peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", "1998"));
		peliculas.add(new Pelicula("Origen", "Christopher Nolan", "2010"));
		peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", "1997"));
		Consumer <Pelicula> imprimir = System.out::println;
	
		System.out.println("lista en desorden");
		mostrar(peliculas,imprimir);
		System.out.println();
		
		
		peliculas.sort((p1,p2)->p2.getEstreno().compareTo(p1.getEstreno()));
		
		
		System.out.println("lista en orden por año de estreno");
		mostrar(peliculas,imprimir);
		System.out.println();
		
		Comparator<Pelicula> cDirector= (p1,p2)->p1.getDirector().compareTo(p2.getDirector());
		Comparator<Pelicula> cTitulo= (p1,p2)->p1.getTitulo().compareTo(p2.getTitulo());

		System.out.println("lista ordenada primero por nombre del director y de ser iguales por titulo de la pelicula");
		peliculas.sort(cDirector.thenComparing(cTitulo));
		mostrar(peliculas,imprimir);
	}
	static void mostrar(List<Pelicula> peliculas,Consumer c)
    {
		for (Pelicula pelicula : peliculas) {
			c.accept(pelicula);
		}
    }
}