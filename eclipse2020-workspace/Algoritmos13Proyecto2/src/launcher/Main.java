/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import control.Controler;
import modelo.operacion;
import vista.Ventana;

/**
 *
 * @author Daniel Velasquez, Julian Cardenas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana();
        operacion op = new operacion(v);
        Controler c = new Controler(op,v);
    }
    
}
