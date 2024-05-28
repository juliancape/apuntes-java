package personaje;

import java.util.Scanner;

public class Launcher {
	
	public static IPersonaje menu(IAbsFactoryPersonaje factory) {
		Scanner leer = new Scanner(System.in);
		System.out.println("-------CREAR PERSONAJES-------\n"
				+ "1. Familia1 (Humano)\n"
				+ "2. Familia2 (Alien)\n"
				+ "3. Familia3 (Robot)\n"
				+ "4. Familia4 (Dios)\n"
				+ "5. Familia5 (Amongus)");
		System.out.println("Ingrese opcion: ");
		int x = leer.nextInt();
		if(x==1) {
			factory = new FactoryFam1();
		}else if(x==2) {
			factory = new FactoryFam2();
		}else if(x==3) {
			factory = new FactoryFam3();
		}else if(x==4) {
			factory = new FactoryFam4();
		}else {
			factory = new FactoryFam5();
		}
		return factory.crearPersonaje();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IAbsFactoryPersonaje factory=null;
		
		for (int i=0;i<5;i++) {
			IPersonaje p = menu(factory);
			System.out.println("\n");
		}
		//f1.crearCabeza();
		//f1.crearDorso();
		//f1.CrearPiernas();
		
		
	}

}
