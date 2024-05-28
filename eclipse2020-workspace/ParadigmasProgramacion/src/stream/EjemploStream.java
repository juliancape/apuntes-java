package stream;

import java.util.ArrayList;
import java.util.List;

public class EjemploStream {
	private List<String> lista;
	private List<String> numero;
	
	public EjemploStream( ) {
		this.lista= new ArrayList<>();
		this.numero= new ArrayList<>();
	}
	
	public void llenarArray() {
		lista.add("Ciencias");
		lista.add("Artificial");
		lista.add("Colombia");
	}
	
	public void filtrar() {
		lista.stream().filter(c->c.startsWith("C"))
		.forEach(System.out::println);
		//.forEach(c->system.out.println(c));
	}
	
	public void ordenar() {
		lista.stream().sorted((x,y)-> 
		y.compareTo(x)).forEach(System.out::println);
	}
	
	public void  aplicarMap() {
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
	}
	
	public void limitarSalida() {
		lista.stream()
		.limit(2)
		.forEach(System.out::println);
	}
	
	public void contarElementos() {
		long cantidad= lista.stream().count();
		System.out.println("Cantidad "+cantidad);
	}
	
}
