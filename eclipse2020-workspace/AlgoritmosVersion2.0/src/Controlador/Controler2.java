/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Op;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class Controler2 implements ActionListener{
    //Conecta el controlador con el modelo
    private Op modelo;
    private Ventana vista;
    public Controler2(Op modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler2(this);
    }
    @Override
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
    	if (vista.getPanel().getEjercito1().size()==0 
    			||vista.getPanel().getEjercito2().size()==0) {
			System.out.println("Juego Finallizado");
		}
    	else if(!vista.getPanel().getEjercito1().isEmpty() || 
                !vista.getPanel().getEjercito2().isEmpty()){
            modelo.ataque(vista.getPanel().getEjercito1().size()
                    ,vista.getPanel().getEjercito2().size());
        }
        else {
			System.out.println("No hay soldados en los ejercitos");
		}
    }
    
}
