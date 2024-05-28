package launcher;

import space.Galaxy;
import java.awt.*;
import java.io.IOException;

public class Launcher {
	static int SIZE = 1000;
	static int STARS_TO_DRAW =80000;
	static int STAR_TYPES = 10;
	
	public static void main(String[] args) throws IOException {
		
		Galaxy galaxy = new Galaxy();
		for (int i = 0; i < Math.floor(STARS_TO_DRAW / STAR_TYPES); i++) {
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Green Star", Color.RED);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Red Star", Color.ORANGE);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Blue Star", Color.BLUE);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Cyan Star", Color.CYAN);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Yellow Star", Color.YELLOW);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Pink Star", Color.PINK);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Magenta Star", Color.MAGENTA);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Gray Star", Color.GRAY);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Dark gray Star", Color.DARK_GRAY);
			galaxy.paintStar((int) ((Math.random() * SIZE) )
					,(int) ((Math.random() * SIZE) ),
                    "Light gray Star", Color.LIGHT_GRAY);
			
		}
		galaxy.ovni();
    	galaxy.setSize(SIZE, SIZE);
    	galaxy.setVisible(true);
		
	}
	
}
