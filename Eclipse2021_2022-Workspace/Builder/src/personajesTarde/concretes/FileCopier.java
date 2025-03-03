package personajesTarde.concretes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopier {
	
	private static FileCopier instance=null;
	
	private FileCopier() {
		
	}
	
	public static FileCopier getInstance() {
		if(instance==null) {
			instance = new FileCopier();
		}
		
		return instance;
	}
	
	

	public void copia (String ficheroOriginal, String ficheroCopia)
	{
		ficheroCopia=Utils.URL_FOLDER+ficheroCopia;
		ficheroOriginal=Utils.URL_FOLDER+ficheroOriginal;
		try
		{
                        // Se abre el fichero original para lectura
			FileInputStream fileInput = new FileInputStream(ficheroOriginal);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
			
			// Se abre el fichero donde se hará la copia
			FileOutputStream fileOutput = new FileOutputStream (ficheroCopia);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
			
			// Bucle para leer de un fichero y escribir en el otro.
			byte [] array = new byte[1000];
			int leidos = bufferedInput.read(array);
			while (leidos > 0)
			{
				bufferedOutput.write(array,0,leidos);
				leidos=bufferedInput.read(array);
			}

			// Cierre de los ficheros
			bufferedInput.close();
			bufferedOutput.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
