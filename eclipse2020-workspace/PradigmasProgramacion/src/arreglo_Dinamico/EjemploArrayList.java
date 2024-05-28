package arreglo_Dinamico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definicion de un ArrayList
		List <String> lista= new ArrayList<String>();
		ArrayList <String> lista1= new ArrayList<>();
		
		lista.add("PO");
		lista.add("PI");
		lista.add("PE");
		lista.add("PA");
		lista.add("PU");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("\n Segund Impresion");
		
		for (String lst : lista) {
			System.out.println(lst);
		}
		
		System.out.println("\n Tercera Impresion");
		
		Iterator<String> it = lista.iterator() ;
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
