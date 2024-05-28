package stars;
import java.awt.*;
public class StarType {
	private String name;
	private Color color;
	public StarType(String name, Color color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	 public void draw(Graphics g, int x, int y) {
	        g.setColor(color);
	        g.fillOval(x - 5, y - 10, 10, 10);
	    }

}
