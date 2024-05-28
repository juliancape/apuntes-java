package ejemplo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EjemploArrayList {

	private String[] pandemias; 
	private List<String> lista;
    // List<String> lista new ArrayList<String>()
	// ArrayList<String> lista new ArrayList<String>()
	// Integer Double Character
	
	public EjemploArrayList() {
		this.pandemias = new String [] {"La peste negra", 
        "Gripe española", "Gripe asiática", 
		"La gripe de Hong Kong","Ebola","VIH","SARS"};
		this.lista = new ArrayList<String>();
	}

	public void copiarDatos() {
		for (int i = 0; i < pandemias.length; i++) {
			lista.add(pandemias[i]);
		}
	}

	public void imprimirLista1() {
		System.out.println("Primera Impresion");
		for (String lst : lista) {
			System.out.println(lst);
		}
	}

	public void imprimirLista2() {
		System.out.println("Segunda Impresion");
		for (int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}


	public void imprimirLista3() {
		System.out.println("Tercera Impresion");
		Iterator<String> it= lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void imprimirLista4() {
		System.out.println("Cuarta Impresion");
		lista.forEach(System.out::println);
	}


	public void convertirMayusculas1() {
		System.out.println("Quinta Impresion");
		for (int i = 0; i < lista.size(); i++) {
			lista.set(i, lista.get(i).toUpperCase());
		}
		for (String cadena : lista) {
			System.out.println(cadena);
		}
	}
	
	public void convertirMayusculas2() {
		System.out.println("Sexta Impresion");
		lista.replaceAll(String::toUpperCase);
		lista.forEach(System.out::println);
	}



	



	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void main(String[] args) {
		List <Integer> lista;
		lista = new ArrayList<>();
		//agregar dato
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		//salida de datos
		//System.out.println(lista);
		for (Integer lst : lista) {
		System.out.println(lst);
		}
		System.out.println("Borrar");
		//remover datos
		lista.remove(3);
		for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		}
		//actualizar datos
		System.out.println("Actualizar");
		lista.set(1, 45);
		for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		}
		ArrayList<String> lstNombre = new ArrayList<>();
		lstNombre.add("Santiago");
		lstNombre.add("Mario");
		lstNombre.add("Laura");
		//System.out.println(lstNombre);
	*/	
	}
	
	

