
package composite;

import java.util.ArrayList;

import htmlGenerator.HTML;

public class Composite extends Component {
 
    public Composite(int price, String name){
        super(price, name);
    }
    
    public Composite(){
        super(0, "");
    }
    public ArrayList<Component> hijos = new ArrayList();
    
    public int execute(){
    	HTML html = new HTML();
        price =0;
        for (Component component : hijos) {
			price += component.execute();
			html.htmlText(component.name);
		}
        
        html.htmlPrice(price);
        return price;
    }

	@Override
	public String toString() {
		return "Composite [hijos=" + hijos + "]";
	}
    
}