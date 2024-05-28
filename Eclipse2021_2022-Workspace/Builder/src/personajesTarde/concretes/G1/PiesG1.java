package personajesTarde.concretes.G1;

import java.util.Random;

import personajesTarde.abstracts.IPies;
import personajesTarde.concretes.FileCopier;

public class PiesG1 implements IPies{

	@Override
	public void seleccionarPies(String n) {
		System.out.println("acá copiaré los pies de "+n);
		
		
		String dirPies="Imagenes/Piernas/familia1/";
		
		Random r=new Random();
		int i=r.nextInt(2);
		i++;
		System.out.println("Los pies es la "+i);
		FileCopier.getInstance().copia(dirPies+i+".jpg", n+"/Pies.jpg");
		
		
	}

}
