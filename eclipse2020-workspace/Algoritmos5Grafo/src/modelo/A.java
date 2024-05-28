package modelo;

import vista.Ventana;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class A {
    private Ventana ventana = null;
    public A(Ventana v){
        this.ventana=v;
    }
    
    public void operacion(){
        if(ventana.getPanel().getLineas().isEmpty()){
            /*Linea l1 = new Linea(300,50,100,400);
            Linea l2 = new Linea(300,50,500,400);
            Linea l3 = new Linea(100,400,500,400);
            Linea l4 = new Linea(50,200,300,50);
            Linea l5 = new Linea(550,200,300,50);
            Linea l6 = new Linea(50,200,100,400);
            Linea l7 = new Linea(550,200,500,400);*/
            
            Linea l1 = new Linea(315,65,115,415);
            Linea l2 = new Linea(315,65,515,415);
            Linea l3 = new Linea(115,415,515,415);
            Linea l4 = new Linea(65,215,315,65);
            Linea l5 = new Linea(565,215,315,65);
            Linea l6 = new Linea(65,215,115,415);
            Linea l7 = new Linea(565,215,515,415);
            
            ventana.getPanel().getLineas().add(l1);
            ventana.getPanel().getLineas().add(l2);
            ventana.getPanel().getLineas().add(l3);
            ventana.getPanel().getLineas().add(l4);
            ventana.getPanel().getLineas().add(l5);
            ventana.getPanel().getLineas().add(l6);
            ventana.getPanel().getLineas().add(l7);
        }
        ventana.getPanel().repaint();
        if(ventana.getPanel().getPuntos().isEmpty()){
            //A
            Punto p1 = new Punto(300,50);
            //B
            Punto p4 = new Punto(50,200);
            //C
            Punto p5 = new Punto(550,200);
            //D
            Punto p2 = new Punto(100,400);
            //E
            Punto p3 = new Punto(500,400);
            
            ventana.getPanel().getPuntos().add(p1);
            ventana.getPanel().getPuntos().add(p2);
            ventana.getPanel().getPuntos().add(p3);
            ventana.getPanel().getPuntos().add(p4);
            ventana.getPanel().getPuntos().add(p5);
        }
        ventana.getPanel().repaint();
    }
    
    
    
    
    
}
