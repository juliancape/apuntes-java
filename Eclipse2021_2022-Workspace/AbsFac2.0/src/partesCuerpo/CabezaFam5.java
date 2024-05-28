package partesCuerpo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import personaje.ProducCabeza;

public class CabezaFam5 implements ProducCabeza{

	public void copyCabeza() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random()*3 + 1 );
		if (x==1) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam5\\cabeza\\c1.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam5\\c.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(x==2) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam5\\cabeza\\c2.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam5\\c.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam5\\cabeza\\c3.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam5\\c.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
