package interface_funcion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Persona> listaPersonas= new ArrayList <Persona>();
	
		listaPersonas.add(new Persona("Pedro",27));
		listaPersonas.add(new Persona("papa",22));
		listaPersonas.add(new Persona("trox",5));
		listaPersonas.add(new Persona("grand",78));
		listaPersonas.add(new Persona("XD",44));
		// FORMA 1 DE IMPRIMIR
		Consumer <Persona> imprimir = p-> System.out.println(p);

		for (Persona persona : listaPersonas) {
			imprimir.accept(persona);
		}
		System.out.println("----------------");
		// FORMA 2 DE IMPRIMIR
		Consumer <Persona> imprimir1 = System.out::println;
		procesar(listaPersonas,imprimir1);
		
		System.out.println("--------------");

	/*	BiFuncion <List<Persona>,Integer,List<Persona>> minEdad= (lista,edad)->{
			List<Persona> resultado = new ArrayList<>();
			for (Persona persona : Lista) {
				if (persona.getEdad()>=18) {
					resultado.add(perso+na);
				}
			}
			return resultado;
		};
		*/
/*		List<Persona> mayorEdad = minEdad.apply(listaPersonas,18);
		for (Persona persona : mayorEdad) {
			System.out.println(persona);
		}
		
		*/
		//Funcion que imprima las personas separadas por coma
/*
		Funcion<List<Persona>,String > listaAString= lista ->{
			String resultado= "";
			for (int i = 0; i < lista.size(); i++) {
				if(i<lista.size()-1) {
					resultado+= lista-get(i).get.nombre()+",";
				}else {
					resultado+= lista.get(i).getnombre();
				}
			}
			return resultado;
		};
		for (Persona persona : listaAString) {
			System.out.println(persona);
		}
		
		*/
		
		
		
	}
	private static void procesar(List<Persona> listaPersonas, Consumer<Persona> Consumer) {
		for (Persona persona : listaPersonas) {
			Consumer.accept(persona);
		}
	}

}
