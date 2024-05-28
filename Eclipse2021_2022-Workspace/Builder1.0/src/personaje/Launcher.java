package personaje;

import java.util.Scanner;

public class Launcher {
	
	public static AbsFactory menu(BuilderPersonaje fam) {
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
			fam = new FactoryFam1();
		}else if(x==2) {
			fam = new FactoryFam2();
		}else if(x==3) {
			fam = new FactoryFam3();
		}else if(x==4) {
			fam = new FactoryFam4();
		}else {
			fam = new FactoryFam5();
		}
		return fam.crearPersonaje();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BuilderPersonaje builder=null;
		
		for (int i=0;i<5;i++) {
			AbsFactory p = menu(builder);
			System.out.println("\n");
		}
		//f1.crearCabeza();
		//f1.crearDorso();
		//f1.CrearPiernas();
		
		
	}

}
