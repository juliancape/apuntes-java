package vista3;

import modelo3.Soldado;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    //Lista de puntos
    private ArrayList<Soldado> Ejercito1 = new ArrayList<>();
    private ArrayList<Soldado> Ejercito2 = new ArrayList<>(3);
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        //Generar los puntos fijos
        for (int i = 0; i < Ejercito1.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(Ejercito1.get(i).getX(), Ejercito1.get(i).getY(), 10, 10);
        }
        //g es elmarcador que dibuja los puntos
        g.setColor(new Color(20,0,100));//Color a base de rgb
        //Generar los puntos medios
        for (int i = 0; i < Ejercito2.size(); i++) {
            g.fillOval(Ejercito2.get(i).getX(), Ejercito2.get(i).getY(),10,10);
            
            
        }
    }
    /**
     * Listado de puntos medios
     * @return listado de puntos medios
     */
    public ArrayList<Soldado> getEjercito1(){
        return this.Ejercito1;
    }
    /**
     * Listado de puntos fijos
     * @return listado de puntos fijos
     */
    public ArrayList<Soldado> getEjercito2(){
        return this.Ejercito2;
    }
}