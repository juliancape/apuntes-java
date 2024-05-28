package personajesTarde.concretes.G2;

import java.util.Random;

import personajesTarde.abstracts.ICuerpo;
import personajesTarde.concretes.FileCopier;

public class CuerpoG2 implements ICuerpo {

	@Override
	public void seleccionarCuerpo(String n) {
		System.out.println("acá copiaré el cuerpo de " + n);


		String dirCuerpos = "Imagenes/Dorsos/familia2/dorso";

		Random r = new Random();
		int i = r.nextInt(2);
		i++;
		i = i + 3;
		System.out.println("El Cuerpo es la " + i);
		FileCopier.getInstance().copia(dirCuerpos + i + ".jpg", n + "/Cuerpo.jpg");

	}

}
