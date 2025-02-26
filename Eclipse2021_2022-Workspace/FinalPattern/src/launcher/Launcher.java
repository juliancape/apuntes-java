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
		ICake pastelCumpleaņos1 = new Cake();
		pastelCumpleaņos1 = new Fresas(pastelCumpleaņos1);
		pastelCumpleaņos1 = new Cerezas(pastelCumpleaņos1);
		pastelCumpleaņos1 = new Chocolate(pastelCumpleaņos1);
		pastelCumpleaņos1 = new Chantilly(pastelCumpleaņos1);
		
		//Patron composite
		Composite totalCompra = new Composite();
		Leaf cake = new Leaf(1500, pastelCumpleaņos1.personalizarTorta());
		
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
