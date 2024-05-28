
package composite;

import java.util.ArrayList;

public class Composite extends Component {
 
    public Composite(int price){
        super(price);
    }
    
    public Composite(){
        super(0);
    }
    public ArrayList<Component> hijos = new ArrayList();
    
    public int execute(){
        price =0;
        for (Component component : hijos) {
			price += component.execute();
		}
        return price;
    }

	@Override
	public String toString() {
		return "Composite [hijos=" + hijos + "]";
	}
    
}