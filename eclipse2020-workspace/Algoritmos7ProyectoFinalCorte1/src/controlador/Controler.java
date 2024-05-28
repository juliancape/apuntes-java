/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Operacion;
import modelo.PuntoPais;
import vistaR.Ventana;

/**
 *
 * @author User
 */
public class Controler implements ActionListener{
    private Operacion modelo;
    private Ventana vista;
    public Controler(Operacion modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoller(this);
    }
    
    String pais1 = null;
    String pais2 = null;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Iniciar")){
            if(vista.getPanel().getPaises().isEmpty()){
                modelo.generarPaisesYVecinos();
             
            }
        }
        if(e.getActionCommand().equals("Colombia")){
            System.out.println("colombia hp");
            /*modelo.generarImagenes();
            vista.getPanel().getImgs().remove(vista.getPanel().getImgs().get(0));
            vista.getPanel().repaint();*/
        }
        if (e.getActionCommand().startsWith("V")) {
			System.out.println(e.getActionCommand().getClass());
		}
    }
}
