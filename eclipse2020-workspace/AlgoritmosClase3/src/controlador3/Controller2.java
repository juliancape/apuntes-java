package controlador3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo3.Op;
import vista3.Ventana;

public class Controller2 implements ActionListener {

	 //Conecta el controlador con el modelo
    private Op modelo;
    private Ventana vista;
    public Controller2(Op modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler2(this);
    }
    
    
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        //modelo.operacion();
       
       if (!vista.getPanel().getEjercito1().isEmpty()
        		||!vista.getPanel().getEjercito2().isEmpty()) {
        	modelo.ataque(vista.getPanel().getEjercito1().size()
        			, vista.getPanel().getEjercito2().size());
			
		}
        int tam1=vista.getPanel().getEjercito1().size();
        int tam2=vista.getPanel().getEjercito2().size();
        System.out.println(tam1+""+tam2);
        
     // modelo.actualizar(tam1,tam2);
        vista.getPanel().repaint();
        
			
		
        
    }

	
}
