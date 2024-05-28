/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launcher;

import controlador.Controller;
import modelo.Operacion;
import vista.Ventana;

/**
 *
 * @author Juan Diego y Julian Cardenas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana v = new Ventana();
        Operacion op = new Operacion(v);
        Controller c = new Controller(op,v);
    }
    
}
