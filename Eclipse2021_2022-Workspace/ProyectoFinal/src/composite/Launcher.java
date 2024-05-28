package composite;

public class Launcher {
    public static void main(String[] args){
        Composite combo = new Composite();
    	Composite hamburguesa = new Composite();
        
        Leaf tomate = new Leaf(200, "tomate");
        Leaf carne = new Leaf(200, "carne");
        Leaf tocino = new Leaf(250, "tocino");
        Leaf pan = new Leaf(200, "pan");
        
        Leaf papas = new Leaf(100, "papas");
        Leaf gaseosa = new Leaf(150, "gaseosa");
        
  
        hamburguesa.hijos.add(tomate);
        hamburguesa.hijos.add(carne);
        hamburguesa.hijos.add(tocino);
        hamburguesa.hijos.add(pan);
        
        combo.hijos.add(hamburguesa);
        combo.hijos.add(papas);
        combo.hijos.add(gaseosa);
        
        
        System.out.println("El precio del combo [Hamburguesa, Papas, Gaseosa] es de: $"+combo.execute());
        
        
    }
}
