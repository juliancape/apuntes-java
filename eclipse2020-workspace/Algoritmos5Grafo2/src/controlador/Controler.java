package controlador;

import modelo.Nodo;
import vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
//ActionListener para activar la escucha de los eventos
public class Controler implements ActionListener{
    //Conecta el controlador con el modelo
    private Nodo modelo;
    private Ventana vista;
    public Controler(Nodo modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoler(this);
    }
    
    @Override
    //Accion al ejecutar el evento
    public void actionPerformed(ActionEvent e) {
        //modelo.operacion();
        if (e.getActionCommand().equals("Show Grafo")) {
			 modelo.operacion();
		}else {
			String desde=this.vista.getDesde().getText();
			String hasta=this.vista.getHasta().getText();
			modelo.recorrido(desde, hasta);
		}
           
        
    }
}
