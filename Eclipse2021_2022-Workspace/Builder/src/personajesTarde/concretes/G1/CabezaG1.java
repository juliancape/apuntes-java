package personajesTarde.concretes.G1;

import java.util.Random;

import personajesTarde.abstracts.ICabeza;
import personajesTarde.concretes.FileCopier;

public class CabezaG1 implements ICabeza {

	@Override
	public void seleccionarCabeza(String n) {
		System.out.println("acá copiaré la cabeza de G1 "+n);
		
		
		String dirCabezas="Imagenes/Cabezas/familia1/";
		
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		System.out.println("La cabeza es la "+i);
		FileCopier.getInstance().copia(dirCabezas+i+".jpg", n+"/Cabeza.jpg");
		
	}

}
