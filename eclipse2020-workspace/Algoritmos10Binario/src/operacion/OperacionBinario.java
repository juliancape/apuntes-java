package operacion;

import java.io.File;
import java.nio.file.Files;

public class OperacionBinario {

	public static void main(String[] args) {
		File archivo;
		byte[] mapaBytes;
		
		try {
			archivo= new File("C:\\Users\\ASUS FX 505DY R5\\Desktop\\Cuarto Semestre\\go_Coffe.jpeg");
			mapaBytes=Files.readAllBytes(archivo.toPath());
			//System.out.println(Arrays.toString(mapaBytes));
			System.out.println("TAMAÑO BYTES: ");
			System.out.println(mapaBytes.length);
			for (int i = 0; i < mapaBytes.length; i++) {
				System.out.print((char)mapaBytes[i]);
			}
		}catch (Exception e) {
			System.out.println("Error al entrar al archivo "+ e.getMessage());
		}
		
		
		
		
	}
	
}
