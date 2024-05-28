/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Controler;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Daniel Velasquez, Julian Cardenas
 */
public class Ventana extends JFrame{
    private Panel panel= new Panel();
    //JLabel
    private JLabel titulo= new JLabel("Encrypt | Decrypt");
    JLabel titlePath= new JLabel("Path: ");
    JLabel path= new JLabel(". . .");
    JLabel vef = new JLabel("");
    //Button
    private JButton explorer = new JButton("Explorar");
    private JButton encriptar = new JButton("ENCRIPTAR");
    private JButton desencriptar = new JButton("DESENCRIPTAR");
    private JButton info = new JButton("Info");
    private Controler control;
    
    public Ventana () {
        this.setBounds(300,0,800,650);
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponets();
        this.setVisible(true);
    }
    
    private void initComponets() {
        //Titulo
	Font letra1 = new Font("SimSun",Font.BOLD, 30);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(letra1);
	titulo.setBounds(250,10,400,58);
	this.add(titulo);
        
        //Botones
        this.encriptar.setBounds(240, 120, 140, 20);
        encriptar.setBackground(Color.RED);
	this.add(encriptar);
        this.desencriptar.setBounds(400, 120, 140, 20);
        desencriptar.setBackground(Color.GREEN);
	this.add(desencriptar);
        this.explorer.setBounds(100, 70, 90, 20);
        explorer.setBackground(Color.LIGHT_GRAY);
	this.add(explorer);
        this.info.setBounds(100, 120, 60, 20);
        info.setBackground(Color.LIGHT_GRAY);
	this.add(info);
        
        //Jlabel
        this.titlePath.setBounds(210, 70, 40,20);
        this.titlePath.setForeground(Color.WHITE);
        this.add(titlePath);
        this.path.setBounds(250, 70, 500,20);
        this.path.setForeground(Color.WHITE);
        this.add(path);
        this.vef.setBounds(330, 550, 200, 40);
        this.vef.setForeground(Color.WHITE);
        this.add(vef);
        
        //Panel
	this.panel.setBounds(100, 160, 600, 360);
        panel.setVisible(true);
        this.add(panel);
    }
    
    /**
    * Metodo para actualizar labels
    * @param s 
    * 
    */
    public void updateLabelPath(String s) {
	this.path.setText(s);
    }
    public void updateLabelVef(String s) {
	this.vef.setText(s);
    }
	
    //RECIBE EL CONTROLADOR Y LO ENTREGA AL BOTON
    public void setcontroller(Controler cont) {
        this.control= cont;
        this.explorer.addActionListener(this.control);
        this.encriptar.addActionListener(this.control);
        this.desencriptar.addActionListener(this.control);
        this.info.addActionListener(this.control);
    }
    
    // Permitir al modelo acceder al panel
    public Panel getPanel(){
        return panel;
    }
}
