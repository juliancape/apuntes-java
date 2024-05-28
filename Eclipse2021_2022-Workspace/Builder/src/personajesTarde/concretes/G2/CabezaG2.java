package personajesTarde.concretes.G2;

import java.util.Random;

import personajesTarde.abstracts.ICabeza;
import personajesTarde.concretes.FileCopier;

public class CabezaG2 implements ICabeza {

	@Override
	public void seleccionarCabeza(String n) {

		System.out.println("acá copiaré la cabeza de G2 " + n);


		String dirCabezas = "Imagenes/Cabezas/familia2/";

		Random r = new Random();
		int i = r.nextInt(2);
		i++;
		i=i+3;
		System.out.println("La cabeza es la " + i);
		FileCopier.getInstance().copia(dirCabezas + i + ".jpg", n + "/Cabeza.jpg");
	}

}
