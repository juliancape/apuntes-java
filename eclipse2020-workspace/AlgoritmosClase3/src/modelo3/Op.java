package modelo3;

import java.util.Random;

import vista3.Ventana;

/**
 * 
 * @author julian cardenas
 *@since 10-08-2021
 *@version 1.0
 */
public class Op {
	private Ventana ventana = null;
    public Op(Ventana v){
        this.ventana=v;
    }
    
    public void operacion(int n1, int n2){
    //    this.ventana.updateLabel("Ejercito 1: " + n1 + "  "
      //  		+ "   -     Ejercito 2: " + n2);
        
        Random r = new Random();
        for (int i = 0; i < n1; i++) {
            ventana.getPanel().getEjercito1().add(new Soldado(r.nextInt(550),r.nextInt(550)));
            
        }
         for (int i = 0; i < n2; i++) {
            ventana.getPanel().getEjercito2().add(new Soldado(r.nextInt(550),r.nextInt(550)));
        }

        
        ventana.getPanel().repaint();
    }
    
    
    public void ataque(int n1, int n2) {
    	
    	 this.ventana.updateLabel("");
    	 this.ventana.updateLabel(("Ejercito 1: " + n1 + "  "
        		+ "   -     Ejercito 2: " + n2));
    	 int suma=n1+n2;
    	 Random r = new Random();
    	 int dado=r.nextInt(suma);
    	
    	 if (n1>n2) {
    		 
    		 //Ataque para n1
			if (dado>=n2) {
				ventana.getPanel().getEjercito2()
				.remove(r.nextInt(ventana.getPanel().getEjercito2().size()));
				
			}//Ataque para n2
			else {
				ventana.getPanel().getEjercito1()
				.remove(r.nextInt(ventana.getPanel().getEjercito1().size()));
				
			}
		}else if (n2>n1) {
			//Ataque para n2
			if (dado>=n1) {
				ventana.getPanel().getEjercito1()
				.remove(r.nextInt(ventana.getPanel().getEjercito1().size()));
				
			}//Ataque para n1
			else {
				ventana.getPanel().getEjercito2()
				.remove(r.nextInt(ventana.getPanel().getEjercito2().size()));
				
			}
		}else {
			//Ataque para n1 -- Genera un true
			if (r.nextBoolean()) {
				ventana.getPanel().getEjercito2()
				.remove(r.nextInt(ventana.getPanel().getEjercito2().size()));
				
			}//Ataque para n2 -- False
			else {
				ventana.getPanel().getEjercito1()
				.remove(r.nextInt(ventana.getPanel().getEjercito1().size()));
				
			}
			
		}

			
    	 ventana.repaint();    	 
    }
    
   
    
}
