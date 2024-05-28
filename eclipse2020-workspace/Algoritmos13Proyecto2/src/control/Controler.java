/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.operacion;
import vista.Ventana;

/**
 *
 * @author Daniel Velasquez, Julian Cardenas
 */
public class Controler implements ActionListener{
    private operacion modelo;
    private Ventana vista;

    public Controler (operacion modelo, Ventana v) {
            this.modelo=modelo;
            this.vista=v;
            this.vista.setcontroller(this);
    }
    
    int cont = 0;
    int cont2 = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(cont == 0){
            if (e.getActionCommand().equals("Explorar") ) {
                //modelo.abrirArchivo();
                modelo.procesoOriginal();
                cont++;
            }
        }else if(cont == 1){
            if(e.getActionCommand().equals("ENCRIPTAR")){
                modelo.procesoEncrypt();
                cont++;
                cont2++;
            }
        }
        if(cont == 2){
            if(e.getActionCommand().equals("DESENCRIPTAR")){
                modelo.procesoDecrypt();
                cont++;
            }
        }
        if(cont2 == 1){
            if(e.getActionCommand().equals("Info")){
                modelo.consultarDataOriginal();
            }
        }
        modelo.verificar();
    }
	
}
