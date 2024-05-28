package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Punto;

public class Panel extends JPanel {

	private ArrayList<Punto> puntos= new ArrayList<>();
	
	
	public Panel() {
		this.setBackground(Color.cyan);
		this.setSize(800,800);
		this.setVisible(true);
	}
	
	
	public void paint(Graphics g) {
	
		//Graphics2D g2d=(Graphics2D)g;
		g.clearRect(150,10,1000,1000);
		g.setColor(new Color(15,50,200));
		for (int i = 0; i < puntos.size()-1; i++) {
			g.fillOval(puntos.get(i).getX(),
					puntos.get(i).getY(), 3, 3);
			
			
		}
		
		
		
		
		
		
	}
	public ArrayList<Punto> getPuntos(){
		return this.puntos;
	}
	
	
}
