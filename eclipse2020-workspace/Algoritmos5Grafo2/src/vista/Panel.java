package vista;

import modelo.Punto;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Linea;

/**
 *
 * @author User
 */
public class Panel extends JPanel{
    //Lista de puntos
    private ArrayList<Punto> puntos = new ArrayList<>();
    private ArrayList<Integer> valor = new ArrayList<>();
    private ArrayList<Linea> lineas = new ArrayList<>();
            
    public Panel(){
        this.setBackground(Color.white);
        this.setSize(1000, 1000);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.clearRect(0,0,1000,1000);
        for(int i=0; i<lineas.size(); i++){
            g.setColor(Color.BLACK);
            g.drawLine(lineas.get(i).getX1(), lineas.get(i).getY1(), lineas.get(i).getX2(), lineas.get(i).getY2());
        }
        for (int i = 0; i < puntos.size(); i++) {
            g.setColor(Color.red);
            g.fillOval(puntos.get(i).getX(), puntos.get(i).getY(),30,30);
        }
        g.setColor(Color.BLACK);
        g.drawString("A", 315,65);
        g.drawString("B", 65,215);
        g.drawString("C", 565,215);
        g.drawString("D", 115,415);
        g.drawString("E", 515,415);
        //AB
        g.drawString("5", 200, 120);
        //AC
        g.drawString("3", 423,120);
        //AE
        g.drawString("10", 422, 250);
        //AD
        g.drawString("7", 200, 250);
        //BD
        g.drawString("14", 70, 330);
        //CE
        g.drawString("2", 549, 330);
        //DE
        g.drawString("8", 315, 440);
        
        /*
         Linea l2 = new Linea(315,65,515,415);
            Linea l3 = new Linea(115,415,515,415);
            Linea l4 = new Linea(65,215,315,65);
            Linea l5 = new Linea(565,215,315,65);
            Linea l6 = new Linea(65,215,115,415);
            Linea l7 = new Linea(565,215,515,415);
        */
    }
    /**
     * Listado de puntos medios
     * @return listado de puntos medios
     */
    public ArrayList<Punto> getPuntos(){
        return this.puntos;
    }
    /**
     * Listado de puntos fijos
     * @return listado de puntos fijos
     */

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

	/**
	 * @return the valor
	 */
	public ArrayList<Integer> getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	

    
    
    
  /*  public ArrayList<Punto> getPuntosFijos() {
       // return puntosFijos;
    }*/
    
    
    
}
