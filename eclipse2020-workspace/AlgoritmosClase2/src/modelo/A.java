package modelo;

/**
 * 
 * @author julian cardenas
 *@since 05-08-2021
 *@version 1.0
 */
import vista.Ventana;

public class A {

	private Ventana ventana= null;
	Punto random = new Punto((int) ((Math.random()*(500-5))+5),
			(int) ((Math.random()*(500-5))+5));
	//Random.util
	
	int dado=0;
	public A(Ventana v) {
		this.ventana=v;
	}
	
	
	public void operacion() {
		Punto p1=new Punto(500, 100);
		Punto p2=new Punto(250, 400);
		Punto p3=new Punto(750, 400);
		
		
		
		ventana.getPanel().getPuntos().add(p1);
		ventana.getPanel().getPuntos().add(p2);
		ventana.getPanel().getPuntos().add(p3);
		
		Punto creado= new Punto(random.getX(), random.getY());
		ventana.getPanel().getPuntos().add(creado);
		ventana.getPanel().repaint();
		
		PuntoMedio p= new PuntoMedio();
		
	
			 Punto nuevo = null;
			dado= (int) ((Math.random()*(4-1))+1);
		
		if (dado==1) {
			
			 nuevo= p.puntoMedio(random, p1);
					
		}
		if (dado==2) {
			
			nuevo= p.puntoMedio(random, p2);
					
		}
		if(dado==3) {
			
			nuevo= p.puntoMedio(random, p3);
					
		}
		random=nuevo;
		ventana.getPanel().repaint();
	
			
	}
	
	
	
	
	
}
