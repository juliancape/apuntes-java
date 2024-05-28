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
		ICake pastelCumplea�os1 = new Cake();
		pastelCumplea�os1 = new Fresas(pastelCumplea�os1);
		pastelCumplea�os1 = new Cerezas(pastelCumplea�os1);
		pastelCumplea�os1 = new Chocolate(pastelCumplea�os1);
		pastelCumplea�os1 = new Chantilly(pastelCumplea�os1);
		
		//Patron composite
		Composite totalCompra = new Composite();
		Leaf cake = new Leaf(1500, pastelCumplea�os1.personalizarTorta());
		
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
