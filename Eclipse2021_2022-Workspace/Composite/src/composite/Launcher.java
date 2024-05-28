package composite;

public class Launcher {
    public static void main(String[] args){
        Composite combo = new Composite();
    	Composite hamburguesa = new Composite();
        
        Leaf tomate = new Leaf(200);
        Leaf carne = new Leaf(200);
        Leaf tocino = new Leaf(250);
        Leaf pan = new Leaf(200);
        
        Leaf papas = new Leaf(100);
        Leaf gaseosa = new Leaf(150);
        
        Composite salsas = new Composite();
        Leaf salsaTomate = new Leaf(10);
        Leaf salsaMayonesa = new Leaf(10);
        salsas.hijos.add(salsaTomate);
        salsas.hijos.add(salsaMayonesa);
  
        hamburguesa.hijos.add(tomate);
        hamburguesa.hijos.add(carne);
        hamburguesa.hijos.add(tocino);
        hamburguesa.hijos.add(pan);
        hamburguesa.hijos.add(salsas);
        
        combo.hijos.add(hamburguesa);
        combo.hijos.add(papas);
        combo.hijos.add(gaseosa);
        
        
        System.out.println("El precio del combo [Hamburguesa, Papas, Gaseosa] es de: $"+combo.execute());
        /**
        for (int i = 0; i < combo.hijos.size(); i++) {
			System.out.println(combo.toString());
		}**/
    }
}
