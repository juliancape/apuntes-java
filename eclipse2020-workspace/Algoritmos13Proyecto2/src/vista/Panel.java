/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Stroke;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Daniel Velasquez, Julian Cardenas
 */
public class Panel extends JPanel{
    private ArrayList<String> hash = new ArrayList<>();
    private ArrayList<String> img = new ArrayList<>();
    
    public Panel(){
	this.setBackground(Color.white);
        this.setSize(600, 360);
        this.setVisible(true);
    }
	    
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g.clearRect(0, 0, 600, 360);
        float grosor = 10;
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(new BasicStroke(grosor));
        g2.setColor(Color.DARK_GRAY);
        g.drawRect(0, 0, 600, 360);
        g2.setStroke(oldStroke);
        
        for (int i = 0; i < hash.size(); i++) {
            if(i == 0){
                g.setColor(Color.BLACK);
                String[] h = hash.get(i).split("");
                int mitad = 0;
                if(h.length%2 == 0){
                    mitad = h.length/2;
                }else{
                    mitad = (h.length+1)/2;
                }
                String part1 = "";
                String part2 = "";
                for (int j = 0; j < h.length; j++) {
                    if(j<=mitad){
                        part1 += h[j];
                    }else{
                        part2 += h[j];
                    }
                }
                g.drawString(part1, 20, 330);
                g.drawString(part2, 20, 345);
            }else{
                g.setColor(Color.BLACK);
                String[] h = hash.get(i).split("");
                int mitad = 0;
                if(h.length%2 == 0){
                    mitad = h.length/2;
                }else{
                    mitad = (h.length+1)/2;
                }
                String part1 = "";
                String part2 = "";
                for (int j = 0; j < h.length; j++) {
                    if(j<=mitad){
                        part1 += h[j];
                    }else{
                        part2 += h[j];
                    }
                }
                g.drawString(part1, 320, 330);
                g.drawString(part2, 320, 345);
            }
        }
        
        for (int i = 0; i < img.size(); i++) {
            if(i == 0){
                g.setColor(Color.BLACK);
                Image fondo = new ImageIcon(img.get(i)).getImage();
                g.drawImage(fondo, 20, 10, 280, 280, this);
                setOpaque(false);
            }else{
                g.setColor(Color.BLACK);
                Image fondo = new ImageIcon(img.get(i)).getImage();
                g.drawImage(fondo, 320, 10, 275, 280, this);
                setOpaque(false);
            }
        }
    }

    public ArrayList<String> getHash() {
        return hash;
    }
    public ArrayList<String> getImg() {
        return img;
    }
}
