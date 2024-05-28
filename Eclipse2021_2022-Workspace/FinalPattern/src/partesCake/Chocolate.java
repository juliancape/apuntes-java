package partesCake;

import decoratorCake.DecoratorCake;
import decoratorCake.ICake;
import htmlGenerator.HTML;

public class Chocolate extends DecoratorCake{
	
	public Chocolate(ICake cake) {
		super(cake);
	}

	public String personalizarTorta() {
		return super.cake.personalizarTorta() +decorarChocolate();
	}
	
	public String decorarChocolate() {
		HTML html = new HTML();
		html.htmlImg("chocolate.jpg", "con chocolate ");
		return "con chocolate ";
	}
	
}
