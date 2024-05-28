package partesCuerpo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import personaje.ProducDorso;

public class DorsoFam1 implements ProducDorso{

	public void copyDorso() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random()*3 + 1 );
		if (x==1) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam1\\dorso\\d1.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam1\\d.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(x==2) {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam1\\dorso\\d2.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam1\\d.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			Path source = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\partesCuerpo\\fam1\\dorso\\d3.png");
			Path target = Paths.get("C:\\Users\\ASUS FX 505DY R5\\Downloads\\personajes\\fam1\\d.png");
			try {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
