package launcher;

import controlador.Controler;
import modelo.Nodo;
import vista.Ventana;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // el new llama un metodo de la clase Ventana
        Ventana v = new Ventana();
        Nodo a = new Nodo(v);
        
        Controler c = new Controler(a,v);
    }
}
