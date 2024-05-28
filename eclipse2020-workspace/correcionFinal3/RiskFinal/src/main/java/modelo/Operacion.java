/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import vistaR.Ventana;

/**
 *
 * @author User
 */
public class Operacion {
    private Ventana ventana = null;
    public Operacion(Ventana v){
        this.ventana=v;
    }
    
    public void accionInicial(String paisI, String bando){
        if(ventana.getPanel().getPaises().stream().filter(p->p.getPais().equals(paisI)).findAny().isPresent()){
            PuntoPais pais =ventana.getPanel().getPaises().stream().filter(p->p.getPais().equals(paisI)).findAny().get();
            if(bando.equals("Aliados")){
                pais.setPropiedad("Aliados");
                pais.setSoldados(20);
                ventana.getPanel().getPaisesAliados().add(pais);
            }else{
                ventana.getPanel().getPaisesEnemigos().add(pais);
            }
            ventana.getPanel().repaint();
        }
        
    }
    public void accion(String pais1, String pais2, String bando){
        if(bando.equals("Aliados")){
            if(ventana.getPanel().getPaisesAliados().stream().filter(p->p.getPais().equals(pais1)).findAny().isPresent()){
                PuntoPais pais =ventana.getPanel().getPaisesAliados().stream().filter(p->p.getPais().equals(pais1)).findAny().get();
                if(pais.getVecinos().stream().filter(p->p.equals(pais2)).findAny().isPresent()){
                    PuntoPais destino = ventana.getPanel().getPaises().stream().filter(p->p.getPais().equals(pais2)).findAny().get();
                    //
                    
                    destino.setSoldados(5);
                    pais.setSoldados(15);
                    
                    ventana.getPanel().getPaisesAliados().add(destino);
                }else{
                    System.out.println("Pais no disponible para movilizar");
                }
            }else{
                System.out.println("Pais no aliado");
            }
            ventana.getPanel().repaint();
        }
        
    }
    
    public void generarImagenes(){
        Image imgTitle = new ImageIcon("src/main/java/Images/titulo.png").getImage();
        ventana.getPanel().getImgs().add(new Imagenes(imgTitle,0,0,200,400));
        Image imgPlaneta = new ImageIcon("src/main/java/Images/planeta.png").getImage();
        ventana.getPanel().getImgs().add(new Imagenes(imgPlaneta,100,100,200,400));
    }
    public void generarPaisesYVecinos() {
        String [] argentinaVecinos= {"Chile","Bolivia","Paraguay","Brasil","Uruguay"};
        ventana.getPanel().getPaises().add(new PuntoPais("Argentina", 260, 440, 0, "",new ArrayList<String>(Arrays.asList(argentinaVecinos))));
        String [] boliviaVecinos= {"Brasil","Paraguay","Argentina","Chile","Peru"};
        ventana.getPanel().getPaises().add(new PuntoPais("Bolivia", 240, 290, 0, "",new ArrayList<String>(Arrays.asList(boliviaVecinos))));
        String [] brasilVecinos= {"Uruguay","Argentina","Paraguay","Bolivia","Peru","Colombia","Venezuela","Guyana","Suriname","GuyanaFrancesa"};
        ventana.getPanel().getPaises().add(new PuntoPais("Brasil", 370, 230, 0, "",new ArrayList<String>(Arrays.asList(brasilVecinos))));
        String [] chileVecinos= {"Peru","Bolivia","Argentina"};
        ventana.getPanel().getPaises().add(new PuntoPais("Chile", 195, 380, 0, "",new ArrayList<String>(Arrays.asList(chileVecinos))));
        String [] colombiaVecinos= {"Venezuela", "Ecuador", "Peru","Brasil"};
        ventana.getPanel().getPaises().add(new PuntoPais("Colombia", 130, 96, 0, "",new ArrayList<String>(Arrays.asList(colombiaVecinos))));
        String [] ecuadorVecinos= {"Colombia","Peru"};
        ventana.getPanel().getPaises().add(new PuntoPais("Ecuador", 70, 135, 0, "",new ArrayList<String>(Arrays.asList(ecuadorVecinos))));
        String [] guyanaVecinos= {"Venezuela","Brasil","Suriname"};
        ventana.getPanel().getPaises().add(new PuntoPais("Guyana", 316, 84, 0, "",new ArrayList<String>(Arrays.asList(guyanaVecinos))));
        String [] guyanaFrancesaVecinos= {"Suriname","Brasil"};
        ventana.getPanel().getPaises().add(new PuntoPais("GuyanaFrancesa", 390, 74, 0, "",new ArrayList<String>(Arrays.asList(guyanaFrancesaVecinos))));
        String [] paraguayVecinos= {"Brasil","Argentina","Bolivia"};
        ventana.getPanel().getPaises().add(new PuntoPais("Paraguay", 320, 330, 0, "",new ArrayList<String>(Arrays.asList(paraguayVecinos))));
        String [] peruVecinos= {"Ecuador","Colombia","Chile","Bolivia","Brasil"};
        ventana.getPanel().getPaises().add(new PuntoPais("Peru", 115, 195, 0, "",new ArrayList<String>(Arrays.asList(peruVecinos))));
        String [] surinameVecinos= {"Guyana", "Brasil", "GuyanaFrancesa"};
        ventana.getPanel().getPaises().add(new PuntoPais("Suriname", 352, 75, 0, "",new ArrayList<String>(Arrays.asList(surinameVecinos))));
        String [] uruguayVecinos= {"Argentina","Brasil"};
        ventana.getPanel().getPaises().add(new PuntoPais("Uruguay", 350, 430, 0, "",new ArrayList<String>(Arrays.asList(uruguayVecinos))));
        String [] venezuelaVecinos= {"Colombia","Brasil","Guyana"};
        ventana.getPanel().getPaises().add(new PuntoPais("Venezuela", 227, 62, 0, "",new ArrayList<String>(Arrays.asList(venezuelaVecinos))));
        ventana.getPanel().repaint();
    }
}
