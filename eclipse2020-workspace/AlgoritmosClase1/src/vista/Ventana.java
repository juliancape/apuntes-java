package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.Controller;

public class Ventana extends JFrame{

	private JLabel label= new JLabel("Hola");
	private JButton boton = new JButton("OK");
	private Controller c;
	private JTextField texto1= new JTextField();
	private JTextField texto2= new JTextField();
	
	
	/**
	 * @return the texto1
	 */
	public JTextField getTexto1() {
		return texto1;
	}

	/**
	 * @param texto1 the texto1 to set
	 */
	public void setTexto1(JTextField texto1) {
		this.texto1 = texto1;
	}

	/**
	 * @return the texto2
	 */
	public JTextField getTexto2() {
		return texto2;
	}

	/**
	 * @param texto2 the texto2 to set
	 */
	public void setTexto2(JTextField texto2) {
		this.texto2 = texto2;
	}

	public Ventana () {
		this.setBounds(10,10,400,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.initComponets();
		this.setVisible(true);
		
		
		
		
		
	}

	private void initComponets() {
		
		label.setBounds(10,10,58,58);
		this.add(label);
		
		this.boton.setBounds(50, 50, 90, 30);
		this.add(boton);
		
		this.texto1.setBounds(10,200,90,40);
		this.texto2.setBounds(10,280,90,40);
		this.add(texto1);
		this.add(texto2);
		
		
	}
	
	public void updateLabel(String s) {
		this.label.setText(s);
	}
	
	//RECIBE EL CONTROLADOR Y LO ENTREGA AL BOTON
	public void setcontroller(Controller cont) {
		this.c= cont;
		this.boton.addActionListener(this.c);
	}
	
	
	
}
