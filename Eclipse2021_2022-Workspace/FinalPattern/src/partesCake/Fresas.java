package partesCake;

import decoratorCake.DecoratorCake;

import decoratorCake.ICake;
import htmlGenerator.HTML;

public class Fresas extends DecoratorCake{
	
	public Fresas(ICake cake) {
		super(cake);
	}

	public String personalizarTorta() {
		return super.cake.personalizarTorta() +decorarFresas();
	}
	
	public String decorarFresas() {
		HTML html = new HTML();
		html.htmlImg("fresas.jpg", "con fresas ");
		return "con fresas ";
	}
	
}
