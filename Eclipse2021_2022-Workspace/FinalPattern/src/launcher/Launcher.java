package launcher;

import builder.ComboFiesta;
import builder.CombosFiestaBuilder;
import composite.Composite;
import composite.Leaf;
import decoratorCake.Cake;
import decoratorCake.ICake;
import htmlGenerator.HTML;
import partesCake.Chantilly;
import partesCake.Chocolate;
import partesCake.Fresas;
import singletonCompra.SingletonTotalCompra;
import partesCake.Cerezas;

public class Launcher {
	public static void main(String[] args) {
		
		HTML html = new HTML();
		
		//Patron decorator
		ICake pastelCumpleaños1 = new Cake();
		pastelCumpleaños1 = new Fresas(pastelCumpleaños1);
		pastelCumpleaños1 = new Cerezas(pastelCumpleaños1);
		pastelCumpleaños1 = new Chocolate(pastelCumpleaños1);
		pastelCumpleaños1 = new Chantilly(pastelCumpleaños1);
		
		//Patron composite
		Composite totalCompra = new Composite();
		Leaf cake = new Leaf(1500, pastelCumpleaños1.personalizarTorta());
		
		//Patron factory
		CombosFiestaBuilder adicionalesBuilder = new CombosFiestaBuilder();
		ComboFiesta adicionalesComboFiesta = adicionalesBuilder.comboFiesta2();
		Leaf adicionales =new Leaf(adicionalesComboFiesta.getPrecio(), adicionalesComboFiesta.mostrarAdicionales());
		
		
		totalCompra.hijos.add(cake);
		totalCompra.hijos.add(adicionales);
		
		
		SingletonTotalCompra resumenCompra = SingletonTotalCompra.getInstance("***Resumen Compra***\n"+
				"Torta: \n"+cake.name+
				"\nPrecio Torta: "+cake.price+
				"\nAdicionales: \n"+adicionalesComboFiesta.mostrarAdicionales()+
				"El precio del combo es de: $"+totalCompra.execute());
		
        html.closeHtml();
	}

}
