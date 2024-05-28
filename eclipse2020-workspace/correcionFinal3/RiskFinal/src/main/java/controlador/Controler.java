/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Operacion;
import modelo.PuntoPais;
import vistaR.Ventana;

/**
 *
 * @author User
 */
public class Controler implements ActionListener{
    private Operacion modelo;
    private Ventana vista;
    public Controler(Operacion modelo, Ventana v){
        this.modelo = modelo;
        this.vista = v;
        this.vista.setContoller(this);
    }
    
    String paisI=null;
    String pais1 = null;
    String pais2 = null;
    int actBegin=1;
    @Override
    public void actionPerformed(ActionEvent e) {
        //if(!vista.getPanel().getPaisesAliados().isEmpty()){
        if(actBegin==0){
            if(e.getActionCommand().equals("Iniciar")){
                
            }
            botonesPaises(e);
            if(e.getActionCommand().equals("Accion")){
                if(pais1!=null && pais2!=null){
                    System.out.println(pais1 + "-" + pais2);
                    modelo.accion(pais1, pais2, "Aliados");
                }
                pais1=null;
                pais2=null;
            }
        }else{
            paisInicial(e);
            modelo.accionInicial(paisI, "Aliados");
        }
        
    }
    
    public void paisInicial(ActionEvent e){
        for (int i = 0; i < vista.getPanel().getPaises().size(); i++) {
            String pais = vista.getPanel().getPaises().get(i).getPais();
            if(e.getActionCommand().equals(pais)){
                paisI=pais;
                actBegin--;
            }
        }
    }
    
    public void botonesPaises(ActionEvent e){
        
        if(e.getActionCommand().equals("Argentina")){
            if(pais1==null){
                pais1="Argentina";
            }else{
                pais2="Argentina";
            }
        }
        if(e.getActionCommand().equals("Bolivia")){
            if(pais1==null){
                pais1="Bolivia";
            }else{
                pais2="Bolivia";
            }
        }
        if(e.getActionCommand().equals("Brasil")){
            if(pais1==null){
                pais1="Brasil";
            }else{
                pais2="Brasil";
            }
        }
        if(e.getActionCommand().equals("Chile")){
            if(pais1==null){
                pais1="Chile";
            }else{
                pais2="Chile";
            }
        }
        if(e.getActionCommand().equals("Colombia")){
            if(pais1==null){
                pais1="Colombia";
            }else{
                pais2="Colombia";
            }
        }
        if(e.getActionCommand().equals("Colombia")){
            if(pais1==null){
                pais1="Colombia";
            }else{
                pais2="Colombia";
            }
        }
        if(e.getActionCommand().equals("Ecuador")){
            if(pais1==null){
                pais1="Ecuador";
            }else{
                pais2="Ecuador";
            }
        }
        if(e.getActionCommand().equals("Guyana")){
            if(pais1==null){
                pais1="Guyana";
            }else{
                pais2="Guyana";
            }
        }
        if(e.getActionCommand().equals("GuyanaFrancesa")){
            if(pais1==null){
                pais1="GuyanaFrancesa";
            }else{
                pais2="GuyanaFrancesa";
            }
        }
        if(e.getActionCommand().equals("Paraguay")){
            if(pais1==null){
                pais1="Paraguay";
            }else{
                pais2="Paraguay";
            }
        }
        if(e.getActionCommand().equals("Peru")){
            if(pais1==null){
                pais1="Peru";
            }else{
                pais2="Peru";
            }
        }
        if(e.getActionCommand().equals("Suriname")){
            if(pais1==null){
                pais1="Suriname";
            }else{
                pais2="Suriname";
            }
        }
        if(e.getActionCommand().equals("Uruguay")){
            if(pais1==null){
                pais1="Uruguay";
            }else{
                pais2="Uruguay";
            }
        }
        if(e.getActionCommand().equals("Venezuela")){
            if(pais1==null){
                pais1="Venezuela";
            }else{
                pais2="Venezuela";
            }
        }
    }
}
