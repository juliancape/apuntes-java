package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> listnumero= new HashSet<>();
		Set<String> listaNombres= new TreeSet<>();
		
		listaNombres.add("PEPE");
		listaNombres.add("colombia");
		listaNombres.add("colombia");
		listaNombres.add("pepe");
		listaNombres.add("julian");
		listaNombres.add("J");
		
		listnumero.add(3);
		listnumero.add(1);
		
		listnumero.add(1);
		System.out.println(listnumero);
		System.out.println(listaNombres);
		
		
	}

}
