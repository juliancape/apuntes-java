package partesCake;

import decoratorCake.DecoratorCake;
import decoratorCake.ICake;
import htmlGenerator.HTML;

public class Chantilly extends DecoratorCake{
	
	public Chantilly(ICake cake) {
		super(cake);
	}

	public String personalizarTorta() {
		return super.cake.personalizarTorta() +decorarChantilly();
	}
	
	public String decorarChantilly() {
		HTML html = new HTML();
		html.htmlImg("chantilly.jpg", "con chantilly ");
		return "con chantilly ";
	}
	
}
