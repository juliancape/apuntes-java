package decoratorCake;

import htmlGenerator.HTML;

public class Cake implements ICake{

	public String personalizarTorta() {
		// TODO Auto-generated method stub
		HTML html = new HTML();
		html.htmlImg("pastel.jpg", "Torta basica ");
		return "Torta basica ";
	}

}
