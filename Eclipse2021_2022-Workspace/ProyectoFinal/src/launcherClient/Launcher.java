package launcherClient;

import builder.Combo;
import builder.CombosBuilder;
import composite.Composite;
import composite.Leaf;
import decoratorComputer.Computer;
import decoratorComputer.IComputer;
import html.Generator;
import singleton.SingletonFactura;
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
		
		//Se hace un arbol de productos con el patron composite
		Composite totalProducts = new Composite();
		Leaf computer = new Leaf(1500, selectComputer1.personalize());
		CombosBuilder comboBuilder = new CombosBuilder();
		
		//Se elige un combo(mouse, keyboard, screen) utilizando factory
		Combo combo = comboBuilder.prepareCombo1();
		//Tambien se puede elegir el segundo combo
		//Combo combo = comboBuilder.prepareCombo2();
		Leaf c1 =new Leaf(combo.getCost(), combo.showItems());
		
		
		totalProducts.hijos.add(c1);
		totalProducts.hijos.add(computer);
		
		SingletonFactura factura = SingletonFactura.getInstance("---------FACTURA-------\n"+
				"Especificaciones computador: \n"+selectComputer1.personalize()+
				"\nprecio computador: "+computer.price+
				"\nProductos adicionales: \n"+combo.showItems()+
				"El precio del combo es de: $"+totalProducts.execute());
		
		totalProducts.execute();
        
        html.closeHtml();
	}

}
