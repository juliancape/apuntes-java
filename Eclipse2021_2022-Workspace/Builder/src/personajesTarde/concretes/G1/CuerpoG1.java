package personajesTarde.concretes.G1;

import java.util.Random;

import personajesTarde.abstracts.ICuerpo;
import personajesTarde.concretes.FileCopier;

public class CuerpoG1 implements ICuerpo{

	@Override
	public void seleccionarCuerpo(String n) {
		System.out.println("acá copiaré el cuerpo de "+n);
		
		
		String dirCuerpos="Imagenes/Dorsos/familia1/";
		
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		System.out.println("El Cuerpo es la "+i);
		FileCopier.getInstance().copia(dirCuerpos+i+".jpg", n+"/Cuerpo.jpg");
	}

}
