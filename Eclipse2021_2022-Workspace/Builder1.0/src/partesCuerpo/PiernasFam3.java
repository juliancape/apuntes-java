package partesCuerpo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import personaje.ProducPiernas;

public class PiernasFam3 implements ProducPiernas{

	@Override
	public void copyPiernas() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random()*3 + 1 );
		if (x==1) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam3\\piernas\\p1.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam3\\p.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(x==2) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam3\\piernas\\p2.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam3\\p.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam3\\piernas\\p3.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam3\\p.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
