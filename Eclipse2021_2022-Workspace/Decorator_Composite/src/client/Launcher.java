package client;

import composite.Composite;
import composite.Leaf;
import decoratorComputer.Computer;
import decoratorComputer.IComputer;
import htmlGenerator.Generator;
import thingsComputer.DedicatedGraphics;
import thingsComputer.ExtensionRAM;
import thingsComputer.ExtensionSSD;
import thingsComputer.LiquidRefrigeration;

public class Launcher {
	public static void main(String[] args) {
		
		Generator html = new Generator();
		
		//Se personaliza el computador con el patron decorator
		IComputer selectComputer1 = new Computer();
		selectComputer1 = new DedicatedGraphics(selectComputer1);
		selectComputer1 = new ExtensionRAM(selectComputer1);
		selectComputer1 = new ExtensionSSD(selectComputer1);
		selectComputer1 = new LiquidRefrigeration(selectComputer1);
		
		//Se hace un combo de productos con el patron composite
		Composite combo = new Composite();
		Leaf computer = new Leaf(1500, selectComputer1.personalize());
		Leaf mouse = new Leaf(50, "Mouse");
		Leaf screen = new Leaf(300, "screen");
		Leaf keyBoard = new Leaf(500, "keyBoard");
		
		combo.hijos.add(computer);
		combo.hijos.add(mouse);
		combo.hijos.add(screen);
		combo.hijos.add(keyBoard);
		
		System.out.println("El precio del combo es de: $"+combo.execute());
        
        html.closeHtml();
	}

}
