package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.A;
import vista.Ventana;

public class Controller implements ActionListener{

	
	private A modelo;
	private Ventana vista;
	
	public Controller (A modelo, Ventana v) {
		this.modelo=modelo;
		this.vista=v;
		this.vista.setcontroller(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String n1=this.vista.getTexto1().getText();
		String n2= this.vista.getTexto2().getText();
		
		int num1= Integer.parseInt(n1);
		int num2= Integer.parseInt(n2);
		
		
		
		modelo.operacion(num1,num2);
		
		
	}

	
	
	
	
}
