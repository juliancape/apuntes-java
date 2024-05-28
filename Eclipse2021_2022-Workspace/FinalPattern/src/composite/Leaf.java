
package composite;
public class Leaf extends Component{

    public Leaf(int price, String name){
        super(price, name);
    }
    @Override
    public int execute() {
        return price;
    }
}
