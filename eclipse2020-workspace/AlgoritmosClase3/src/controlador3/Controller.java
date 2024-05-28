package controlador3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo3.Op;
import vista3.Ventana;

/**
 * 
 * @author julian cardenas

 *@since 10-08-2021
 *@version 1.0
 */

 public class Controller implements ActionListener{
    //Conecta el controlador con el modelo
    private Op modelo;
    private Ventana vista;
    public Controller(Op modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler(this);
    }
    
    
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        //modelo.operacion();
        String n1 = this.vista.getTexto1().getText();
        String n2 = this.vista.getTexto2().getText();
        
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);
        while (vista.getPanel().getEjercito1().isEmpty()) {
			modelo.operacion(num1,num2);
		
		}

		
        
    }


}
