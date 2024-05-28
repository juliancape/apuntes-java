package client;
/**
 * Decorator and Observer pattern exercise
 * @author juliancape
 * @since 27-10-2022
 **/


import decoratorComputer.Computer;
import decoratorComputer.IComputer;
import observer.AlibabaObserver;
import observer.AmazonObserver;
import observer.MercadoLibreObserver;
import observer.Subject;
import thingsComputer.DedicatedGraphics;
import thingsComputer.ExtensionRAM;
import thingsComputer.ExtensionSSD;
import thingsComputer.LiquidRefrigeration;

public class Launcher {
	public static void main(String[] args) {
		
		//personalize computer with decorator pattern
		IComputer selectComputer1 = new Computer();
		//observator pattern
		Subject subject = new Subject();
		new AlibabaObserver(subject);
	    new AmazonObserver(subject);
	    new MercadoLibreObserver(subject);
		
		selectComputer1 = new DedicatedGraphics(selectComputer1);
		selectComputer1 = new ExtensionRAM(selectComputer1);
		
		System.out.println("---------First change computer------------");	
	    subject.setSpecifications(selectComputer1.personalize());
	    
		selectComputer1 = new ExtensionSSD(selectComputer1);
		selectComputer1 = new LiquidRefrigeration(selectComputer1);
	
		
		System.out.println("----------Second change computer----------");	
	    subject.setSpecifications(selectComputer1.personalize());

	    
	}
	
	
}
