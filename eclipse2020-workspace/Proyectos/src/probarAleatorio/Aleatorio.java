package probarAleatorio;
/**
 * @author Julian
 * @since 10-06-2021
 * @version 1.0
 */
import java.util.ArrayList;
public class Aleatorio {

	public static void main(String[] args) {
		

		System.out.println("------------ALEATORIOS-------------");
		ArrayList<Integer> listaAleatorios= new ArrayList<>();
		
		for (int i = 0; i < 15; i++) {
			// Retorna un número aleatorio entre min (incluido) y max (excluido)
			              //(int) ((Math.random()*(max-min))+min);
			
			int aleatorio2= (int) ((Math.random()*(14-1))+1);
			listaAleatorios.add(aleatorio2);
		}
		System.out.println(listaAleatorios);
		
		
		int a=5;
		int b=2;
		int c;
		c=a=b;
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 import java.util.OptionalInt;
		  
		  
		 System.out.println("PROCESOS con Stream y Lambda");
		listaAleatorios.stream().filter(p->p.byteValue()>=10).forEach(System.out::println);;
		
		OptionalInt maximo= listaAleatorios.stream().mapToInt(p->p.byteValue()).max();
		int x=maximo.getAsInt();
		System.out.println("El numero maximo dentro del ArrayList de aleatorios es: "+x);
	
        
	
		for (int i = 0; i < 15; i++) {
			
			
			double aleatorio=  ((Math.random()*(7 -1))+1);
			System.out.println(aleatorio);
		}
	
	
	*/
	
	
	}
	

}
