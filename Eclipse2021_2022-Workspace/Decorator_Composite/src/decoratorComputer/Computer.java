package decoratorComputer;

import htmlGenerator.Generator;

public class Computer implements IComputer{

	public String personalize() {
		// TODO Auto-generated method stub
		Generator html = new Generator();
		html.htmlImg("base.jpg", "Base computer ");
		return "Base computer ";
	}

}
