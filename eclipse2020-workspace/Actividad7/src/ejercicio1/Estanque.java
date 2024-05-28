package ejercicio1;
/**
 * Clase Estanque donde estan los patos almacenados en un array
 *  @author julian cardenas
 * @since 05-11-2020
 * @version 1
 *
 */

public class Estanque {
	
	private static Duck[] pato = new Duck[4];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pato[0]= new FlySwim();
		pato[1]= new FlyQuackSwim();
		pato[2]= new QuackSwim();
		pato[3]=new Swim();

		pato[0].swim();
		System.out.println(pato[0]);
	
		
		for (int j = 0; j < pato.length; j++) {
		//	System.out.println(pato[j]);
		}
		
		
	/**
	 * 
	
		FlySwim pato1 = new FlySwim();
		
		pato1.swim();
		pato1.fly("Este Pato Vuela Muy chevere");
		 */
	}
}
