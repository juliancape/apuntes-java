package operacion;

import java.io.File;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Clase operaciones hash
 * @author Julian Cardenas y Daniel Velasquez
 *@since 10-2021
 */
public class OperacionHash {

	String archivoString;
	String archivoCompararString;
	
	public void lectura() {
		File archivo;
		byte[] BytesArchivo;
		File archivoComparar;
		byte[] BytesComparar;
		
		try {
			archivo= new File("C:\\Users\\ASUS FX 505DY R5\\Desktop\\Cuarto Semestre"
					+ "\\proyectoscorte2\\GofferAzul.jpeg");
			BytesArchivo=Files.readAllBytes(archivo.toPath());
			archivoComparar= new File("C:\\Users\\ASUS FX 505DY R5\\Desktop\\Cuarto Semestre"
					+ "\\proyectoscorte2\\GofferRojo.jpeg");
			BytesComparar= Files.readAllBytes(archivoComparar.toPath());
			
			
			//System.out.println(Arrays.toString(mapaBytes));
			System.out.println("TAMAÑO BYTES archivo: "+BytesArchivo.length);
			System.out.println("TAMAÑO BYTES archivoComparar: "+BytesComparar.length);
			for (int i = 0; i < BytesArchivo.length; i++) {
				//System.out.print((char)BytesArchivo[i]);
				archivoString += (char)BytesArchivo[i];
			}
			for (int i = 0; i < BytesComparar.length; i++) {
				archivoCompararString += (char) BytesComparar[i];
			}
			
			//System.out.println("Primero "+"\n"+archivoString);
			//System.out.println("Segundo "+"\n"+archivoCompararString);
		}catch (Exception e) {
			System.out.println("Error al entrar al archivo "+ e.getMessage());
		}
	}
	
	public void hash() {
	System.out.println("\n"+"HASH Version 1.0");
		try {
			MessageDigest digest= MessageDigest.getInstance("SHA-256");
			byte[] sha256= digest.digest(archivoString.getBytes(StandardCharsets.UTF_8));
			 byte[] sha256Comparar= digest.digest(archivoCompararString.getBytes(StandardCharsets.UTF_8));
			 System.out.println("ARCHIVO: "+sha256);
			 System.out.println("ARCHIVO COMPARAR: "+sha256Comparar);
			 
			 if (sha256.equals(sha256Comparar)) {
				 System.out.println("El archivo no fue modificado");
	         }else{
	                System.out.println("El archivo fue modificado");
	         }
			 
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void hash2() {
		System.out.println("\n"+"HASH Version 2.0");
		String toReturnOriginal = null;
        String toReturnMod = null;
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    digest.reset();
	    digest.update(archivoString.getBytes("utf8"));
	    toReturnOriginal = String.format("%064x", new BigInteger(1, digest.digest()));
            System.out.println("ARCHIVO: "+toReturnOriginal);
            
            digest.update(archivoCompararString.getBytes("utf8"));
            toReturnMod = String.format("%064x", new BigInteger(1, digest.digest()));
            System.out.println("ARCHIVO COMPARAR: "+toReturnMod);
            
            if(toReturnOriginal.equals(toReturnMod)){
                System.out.println("El archivo no fue modificado");
            }else{
                System.out.println("El archivo fue modificado");
            }
	} catch (Exception e) {
	    e.printStackTrace();
	}


	}
	
	
	
}
