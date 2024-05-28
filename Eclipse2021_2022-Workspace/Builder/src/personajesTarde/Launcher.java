package personajesTarde;

import java.util.Scanner;


import personajesTarde.abstracts.AbstractFactory;
import personajesTarde.abstracts.Builder;
import personajesTarde.concretes.FileCopier;
import personajesTarde.concretes.Utils;
import personajesTarde.concretes.G1.G1;
import personajesTarde.concretes.G2.G2;

public class Launcher {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("nombre personaje");
		String n=sc.nextLine();
		System.out.println("Grupo de personaje");
		int i=Integer.parseInt(sc.nextLine());
		Builder g;
		
		AbstractFactory[] gs= {
				new G1(),new G2()
		};
		i--;
		if(i>=gs.length||i<0) {
			i=gs.length-1;
		}
		g=gs[i];
		g.crearPersonaje(n);
		
		
		
	}
	

}
