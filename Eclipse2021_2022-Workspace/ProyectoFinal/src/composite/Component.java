
package composite;

public abstract class Component {
    public int price;
    public String name;
    
    public Component(int price, String name){
        this.price=price;
        this.name=name;
    }
    public abstract int execute();
}
