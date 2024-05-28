package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Operacion;
import vista.Ventana;

public class Controller implements ActionListener{

	private Operacion modelo;
	private Ventana vista;
	
	public Controller (Operacion modelo, Ventana v) {
		this.modelo=modelo;
		this.vista=v;
		this.vista.setcontroller(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("NUEVO")) {
			modelo.newFlag();
		}
		else if(e.getActionCommand().equals("PREPARADO")) {
			modelo.readyFlag();
		}
		else if(e.getActionCommand().equals("ACTIVO")) {
			modelo.executeFlag();
		}
		else if(e.getActionCommand().equals("BLOQUEADO")) {
			modelo.waitFlag();
		}
		else if(e.getActionCommand().equals("TERMINADO")) {
			modelo.finishFlag();
		}
		
		
	}

}
