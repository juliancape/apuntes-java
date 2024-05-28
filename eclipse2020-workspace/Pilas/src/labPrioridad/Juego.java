package labPrioridad;

import java.util.ArrayList;
import java.util.Comparator;

public class Juego {

	private  ArrayList<Bots> listBots;
	private int codigo=100;
	
	
	/**
	 */
	public Juego() {
		
		this.listBots = listBots;
	}
	public void crearList() {
	int elem= (int) (Math.random()*(20-10)+10);
	
	for (int i = 0; i < elem; i++) {
		codigo++;
		listBots.add(new Bots(codigo, 1, (int)(Math.random()*(100-10)+10)));
	}
	}

	public void  ordenar() {
		listBots.sort(Comparator.comparingInt(Bots::getPorVida));
	}

	public void mostrar() {
		listBots.forEach(System.out::println);
	}

	public void mostrar60() {
		listBots.stream().filter(c->c.getPorVida()>60)
		.forEach(System.out::println);
		listBots.stream().count();
	}
	
	
}
