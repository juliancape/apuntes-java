package ejercicio1;
/**
 * Clase del pato que hace quack, vuela y nada
 * @author julian cardenas
 * @since 05-11-2020
 * @version 1
 *
 */
public class FlyQuackSwim extends Duck implements DuckQuack,DuckFly  {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Tu Pato Vuela ");
		
	}

	@Override
	public void Quack() {
		// TODO Auto-generated method stub
		System.out.println("I Say Quack Quack");
	}

	
}
