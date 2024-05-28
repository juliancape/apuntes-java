package modelo;

import java.util.ArrayList;

import vista.Ventana;

public class Operacion {
	
	private Ventana ventana= null;
	public Operacion(Ventana v){
        this.ventana=v;
    }
	private String texto="";
	private ArrayList<String> flags= new ArrayList<>();
	
	public void showInfo() {
		System.out.println(texto);
		ventana.updateLabel(texto);
	}
	
	public void newFlag() {
		flags.clear();
		texto="";
		if(flags.size()!= 0) {
			
			flags.add("ERROR.");
			texto ="ERROR.";
		}else{
			System.out.println("new flag entro");
			flags.add("Nuevo");
			texto += "Proceso creado [NUEVO]. \n";
		}
		
		if (!texto.equals("ERROR.")) {
			ventana.updateactual("ESTADO ACTUAL: [NEW]");
		}else {
			ventana.updateactual("ERROR.");
		}
		
	}
	
	public void readyFlag() {
		if(flags.get(flags.size()-1).equals("Nuevo")) {
			System.out.println("nuevo a preparado");
			flags.add("Preparado");
			texto += "Proceso ha sido aceptado [PREPARADO]. \n";
		}else if(flags.get(flags.size()-1).equals("Bloqueado")) {
			System.out.println("bloqueado a preparado");
			flags.add("Preparado");
			texto += "Proceso ha finalizado la espera del evento [PREPARADO]. \n";
		}else if(flags.get(flags.size()-1).equals("Activo")) {
			System.out.println("activo a preparado");
			flags.add("Preparado");
		}
		else {
			flags.add("ERROR.");
			texto ="ERROR.";
		}
		
		if (!texto.equals("ERROR.")) {
			ventana.updateactual("ESTADO ACTUAL: [READY]");
		}else {
			ventana.updateactual("ERROR.");
		}
		
	}
	
	public void executeFlag() {
		if(flags.get(flags.size()-1).equals("Preparado")) {
			System.out.println("preparado a activo");
			flags.add("Activo");
			texto += "Proceso ejecutando instrucciones [ACTIVO]. \n";
		}else {
			flags.add("ERROR.");
			texto ="ERROR.";
		}
		
		if (!texto.equals("ERROR.")) {
			ventana.updateactual("ESTADO ACTUAL: [EXECUTE]");
		}else {
			ventana.updateactual("ERROR.");
		}
		
	}
	
	public void waitFlag() {
		if(flags.get(flags.size()-1).equals("Activo")) {
			System.out.println("activo  a bloqueado");
			flags.add("Bloqueado");
			texto += "Proceso espera un evento [Bloqueado]. \n";
		}else {
			flags.add("ERROR.");
			texto ="ERROR.";
		}
		
		if (!texto.equals("ERROR.")) {
			ventana.updateactual("ESTADO ACTUAL: [WAIT]");
		}else {
			ventana.updateactual("ERROR.");
		}
	}
	
	public void finishFlag() {
		System.out.println(flags.get(flags.size()-1));
		if (flags.get(flags.size()-1).equals("Activo") ||
				flags.get(flags.size()-1).equals("Bloqueado")) {
			System.out.println("ac/bloc a finish");
			flags.add("Terminado");
			texto +="Proceso ha finalizado [TERMINADO]. \n";
		}else if(flags.get(flags.size()-1).equals("Nuevo")) {
			System.out.println("nuevo a finish");
			flags.add("Terminado");
			texto +="Proceso ha sido rechazado [TERMINADO]. \n";
		}
		else {
			flags.add("ERROR.");
			texto ="ERROR.";
		}
		if (!texto.equals("ERROR.")) {
			ventana.updateactual("ESTADO ACTUAL: [FINISH]");
		}else {
			ventana.updateactual("ERROR.");
		}
		showInfo();
		
	}

}
