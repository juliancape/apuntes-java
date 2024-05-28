package archivosTexto;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				List<Persona> personas=
						Files.lines(Paths.get("persona.txt"))
						.map(l-> new Persona (l.split(":")[0],
								Integer.parseInt(l.split(":")[1])))
						.collect(Collectors.toList());
						
				System.out.println("Personas registradas");		
				personas.stream().forEach(System.out::println);		
						
						
						
			}catch(Exception ex) {
				
			}
				
			
		
		
		
		
		
	}

}
