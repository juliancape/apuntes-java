package prioridad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class AppPersonaPrioridad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Persona> colaPersonas = new PriorityQueue<Persona>();
	//	PriorityQueue<Persona> colaPersonas= new PriorityQueue<>();
		
		
		colaPersonas.add(new Persona(344, "Ger", 45, 2));
		colaPersonas.add(new Persona(122, "pacho", 15, 1));
		colaPersonas.add(new Persona(123, "JUAN", 31, 3));
		
		
		while (!colaPersonas.isEmpty()) {
			Persona a= colaPersonas.remove();
			System.out.println(a);
		}
		
		
		PriorityQueue<Integer> colita= new PriorityQueue<Integer>();
		colita.add(34);
		colita.add(12);
		colita.add(45);
		colita.add(66);
		colita.add(34);
		colita.add(7);
		colita.add(-5);
		
		while (!colita.isEmpty()) {
			Integer n= colita.remove();
			System.out.println(n);
		}
		
		
		
		ArrayList<Persona> listaPersonas= new ArrayList<>();
		Collections.sort(listaPersonas);
		
		
	}

}
