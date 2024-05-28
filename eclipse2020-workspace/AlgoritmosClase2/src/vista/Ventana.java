package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Controller;

public class Ventana extends JFrame{

	private JLabel label= new JLabel("Julian Cardenas");
	private JButton boton = new JButton("OK");
	private Controller c;
	private Panel panel= new Panel();
	
	//SETEA LA VENTANA QUE ES LA PRINCIPAL
	public Ventana () {
		this.setBounds(10,10,1000,1000);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.initComponets();
		this.setVisible(true);
	
	}

	private void initComponets() {
		
		//setea la posicion del boton y lo agrega a la ventana
		this.boton.setBounds(50, 50, 90, 30);
		this.add(boton);
		this.setBackground(Color.GRAY);
		
		this.label.setBounds(10,150,100,30);
		this.label.setForeground(Color.RED);
		this.add(label);
		
		this.panel.setBounds(0,0,800,800);
		panel.setVisible(true);
		this.add(panel);
		
	}
	
	
	
	public void updateLabel(String s) {
		this.label.setText(s);
	}
	
	//RECIBE EL CONTROLADOR Y LO ENTREGA AL BOTON
	public void setcontroller(Controller cont) {
		this.c= cont;
		this.boton.addActionListener(this.c);
	}
	
	public Panel getPanel() {
		return panel;
	}
	
	
}
