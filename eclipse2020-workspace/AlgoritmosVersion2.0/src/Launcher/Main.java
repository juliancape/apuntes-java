package Launcher;

import Controlador.Controler;
import Controlador.Controler2;
import Modelo.Op;
import Vista.Ventana;

/**
 *Main risk
 * @author Daniel y Julian
 * @since 10-08-2021
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // el new llama un metodo de la clase Ventana
        Ventana v = new Ventana();
        Op a = new Op(v);
        
        Controler c = new Controler(a,v);
        Controler2 c2 = new Controler2(a,v);
    }
}
