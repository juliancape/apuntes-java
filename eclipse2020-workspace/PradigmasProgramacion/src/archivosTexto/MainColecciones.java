package archivosTexto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import java.util.stream.Collectors;

public class MainColecciones {
private List<Persona> personas;


	public void anexarDatos() {
		System.out.println("Anexar datos I");
		try {
			this.personas=Files.lines(Paths.get("persona.txt"))
				.map(l -> new Persona(l.split(":")[0],
						Integer.parseInt(l.split(":")[1])))
				.collect(Collectors.toList());
		
		} catch (NumberFormatException | IOException e) {
			System.out.println("Error procesando achisvoo:s"+
		     e.getMessage());
			
		}
		System.out.println("Personas del arcchivo: ");
		personas.stream().forEach(System.out::println);
	}
	
	public void anexarDatos2() {
		System.out.println("\nAnexar Datos II");
		try {
			personas.add(new Persona("Fernando", 34));
			
			Files.write(Paths.get("personas2.txt"),
						personas.stream().map(p ->
						p.aArchivo()).collect(Collectors.toList()));
			
		} catch (Exception e) {
			System.out.println("Error procensando el archivo: "+
		e.getMessage());
		}
		System.out.println("Personas del Archivo:");
		personas.stream().forEach(System.out::println);
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainColecciones archivo = new MainColecciones();
		archivo.anexarDatos();
		archivo.anexarDatos2();
		
		
		
		
		
		
		
	}

}
