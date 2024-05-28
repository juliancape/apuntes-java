package personajesTarde.abstracts;

import java.io.File;

import personajesTarde.concretes.Utils;

public abstract class AbstractFactory {

	private String name;
	
	
	public abstract void crearCabeza();
	public abstract void crearCuerpo();
	public abstract void crearPies();
	
	
	
	
	private void crearCarpeta() {
		System.out.println("creé carpeta de nombre: "+name);
		File directorio = new File(Utils.URL_FOLDER+name);
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
	}
	
	public String getName() {
		return name;
	}
}
