package space;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import stars.Star;
import stars.StarFactory;
import stars.StarType;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Galaxy extends JFrame{

	public Galaxy() {
		
		this.setLayout(null);
		

	}
	private List<Star> stars = new ArrayList<>();
	JLabel jLabel1 = new JLabel();
	public void paintStar(int x, int y, String name, Color color) {
		StarType type = StarFactory.getStarType(name, color);
		Star star = new Star(x, y, type);
		stars.add(star);
	}
	
	public void paint(Graphics graphics) {
        for (Star star : stars) {
            star.draw(graphics);
        }
        
    }
	public void ovni() {
		File file = new File("C:\\Users\\golden\\Downloads\\ovni.png");
        BufferedImage bufferedImage;
		try {
			bufferedImage = ImageIO.read(file);
			ImageIcon imageIcon = new ImageIcon(bufferedImage);
			JLabel jLabel = new JLabel();
			
			jLabel.setIcon(imageIcon);
			jLabel.setBounds(300, 300, 400, 300);
			add(jLabel);
			jLabel.setVisible(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
	}
}
