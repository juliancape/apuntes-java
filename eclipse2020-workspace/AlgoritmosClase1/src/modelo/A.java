package modelo;

import vista.Ventana;

public class A {

	private Ventana ventana= null;
	
	public A(Ventana v) {
		this.ventana=v;
	}
	
	
	public void operacion(int num1, int num2) {
		Sumar s=new Sumar();
	int k= s.suma(num1,num2);
	this.ventana.updateLabel(k+"");
	}
	
	
	
	
	
}
