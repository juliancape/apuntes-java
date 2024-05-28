package controlador;
/**
 * 
 * @author julian cardenas
 *@since 05-08-2021
 *@version 1.0
 */
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
		for (int i = 0; i < 10000; i++) {
			modelo.operacion();
		}
		
		
		
	}

	
	
	
	
}
