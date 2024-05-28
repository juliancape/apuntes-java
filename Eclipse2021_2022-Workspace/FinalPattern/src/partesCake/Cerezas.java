package partesCake;

import decoratorCake.DecoratorCake;

import decoratorCake.ICake;
import htmlGenerator.HTML;

public class Cerezas extends DecoratorCake{
	
	public Cerezas(ICake cake) {
		super(cake);
	}

	public String personalizarTorta() {
		return super.cake.personalizarTorta() +decorarCerezas();
	}
	
	public String decorarCerezas() {
		HTML html = new HTML();
		html.htmlImg("cerezas.jpg", "con cerezas ");
		return "con cerezas ";
	}
	
}
