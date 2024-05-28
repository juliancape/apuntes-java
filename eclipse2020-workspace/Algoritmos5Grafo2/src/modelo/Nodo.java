package modelo;

import vista.Ventana;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class Nodo {
    private Ventana ventana = null;
    public Nodo(Ventana v){
        this.ventana=v;
    }
    
    
    public void valoresEntreNodos(){
    	for (int i = 0; i < ventana.getPanel().getPuntos().size(); i++) {
			ventana.getPanel().getPuntos().get(i);
			
		}
    	
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
            
        	//de A a D
            Linea l1 = new Linea(315,65,115,415);
            //de A a E
            Linea l2 = new Linea(315,65,515,415);
            //de D a E
            Linea l3 = new Linea(115,415,515,415);
            //de B a A
            Linea l4 = new Linea(65,215,315,65);
            //de C a A
            Linea l5 = new Linea(565,215,315,65);
            //de B a D
            Linea l6 = new Linea(65,215,115,415);
            //de C a E
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
            
            ArrayList<Integer> llamado=ventana.getPanel().getValor();
            if (llamado.isEmpty()) {
            	//AB
				llamado.add(5);
				//AC
				llamado.add(3);
				//AD
				llamado.add(7);
				//AE
				llamado.add(10);
				//BD
				llamado.add(14);
				//CE
				llamado.add(2);
				//DE
				llamado.add(8);
			}
            
            
            
            
        }
        ventana.getPanel().repaint();
    }
    
    public void recorrido(String desde, String hasta) {
    	
    	ArrayList<String> fijos= new ArrayList<>();
    	
    	if (desde.equals("A")) {
			if (hasta.equals("B")) {
				
				
			}if (desde.equals("C")) {
				
			}if (desde.equals("D")) {
				
			}if (desde.equals("E")) {
				
			} 
    		
		}if (desde.equals("B")) {
			if (hasta.equals("A")) {
				
			}if (desde.equals("C")) {
				
			}if (desde.equals("D")) {
				
			}if (desde.equals("E")) {
				
			} 
			
		}if (desde.equals("C")) {
			if (hasta.equals("A")) {
				
			}if (hasta.equals("B")) {
				
			}if (desde.equals("D")) {
				
			}if (desde.equals("E")) {
				
			} 
			
		}if (desde.equals("D")) {
			if (hasta.equals("A")) {
				
			}if (hasta.equals("B")) {
				
			}if (desde.equals("C")) {
				
			}if (desde.equals("E")) {
				
			} 
			
		}if (desde.equals("E")) {
			if (hasta.equals("A")) {
				
			}if (hasta.equals("B")) {
				
			}if (desde.equals("C")) {
				
			}if (desde.equals("D")) {
				
			} 
			
		} 
    	
    	
    	
    	
    }
    
   
    	//int letra=ventana.getPanel().getPuntos().get(i).getX();
    	/* //A
    		if ( letra==300) {
    			
    			
    		}//B
    		if (letra==50) {
				
    			
			}//C
    		if (letra==550) {
				
				
			}//D
    		if (letra==100) {
				
				
			}//E
    		else {
			*/	
				
    	
	
		
    	
    
    
}



