/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaR;

import controlador.Controler;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Ventana extends JFrame{
    private JButton boton = new JButton("Iniciar");
    private JButton accion = new JButton("Accion");
    private Controler c;
    //private JLabel risk = new JLabel("Risk");
    private JLabel r = new JLabel("R");
    private JLabel i = new JLabel("I");
    private JLabel s = new JLabel("S");
    private JLabel k = new JLabel("K");
    private JLabel hastaTexto = new JLabel("Hasta:");
    private JTextField desde = new JTextField("");
    private JTextField hasta = new JTextField("");
    
    private Panel panel = new Panel();//Se crea panel y se inicializa

    public JTextField getDesde() {
        return desde;
    }
    public JTextField getHasta() {
        return hasta;
    }
    public void setDesde(JTextField desde) {
        this.desde = desde;
    }
    public void setHasta(JTextField hasta) {
        this.hasta = hasta;
    }
    
    public Ventana(){
        //establece el tamaño de la ventana emergente
        this.setBounds(250, 20, 800, 700);
        this.getContentPane().setBackground(new Color(37, 36, 64));
        //para cerrar la ventana cuando se oprime la x de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        //invoca los componentes para aparecer en la pantalla
        this.initComponents();
        this.setVisible(true);
        
        
    }
    
    private void initComponents(){
        this.panel.setBounds(150,0,650,690);
        this.add(panel);
        
        this.boton.setBounds(10, 20, 120, 30);
        this.boton.setBackground(Color.BLACK);
        this.boton.setForeground(Color.WHITE);
        this.add(boton);
        //this.setBackground(Color.WHITE);
        //this.boton.setForeground(Color.WHITE);
        
        this.accion.setBounds(10,80, 120, 30);
        this.accion.setBackground(Color.RED);
        this.accion.setForeground(Color.WHITE);
        this.add(accion);
        
        //this.setBackground(Color.WHITE);
        //this.boton.setForeground(Color.WHITE);
        
        Font letra1= new Font("Niagara Solid",Font.CENTER_BASELINE,60);
        /*risk.setFont(letra1);
        risk.setForeground(Color.white);
        risk.setBounds(10, 60, 100, 40);
        this.add(risk);*/
        r.setForeground(Color.red);
        r.setFont(letra1);
        r.setBounds(70, 440, 100, 60);
        this.add(r);
        i.setForeground(Color.red);
        i.setFont(letra1);
        i.setBounds(70, 490, 100, 60);
        this.add(i);
        s.setForeground(Color.red);
        s.setFont(letra1);
        s.setBounds(70, 540, 100, 60);
        this.add(s);
        k.setForeground(Color.red);
        k.setFont(letra1);
        k.setBounds(70, 590, 100, 60);
        this.add(k);
        /*hastaTexto.setFont(letra1);
        hastaTexto.setBounds(10, 100, 100, 20);
        hastaTexto.setForeground(Color.white);
        this.add(hastaTexto);*/
        
        /*this.desde.setBounds(75,63,20,20);
        this.desde.setCaretColor(Color.DARK_GRAY);
        this.desde.setForeground(Color.DARK_GRAY);
        this.add(desde);
        this.hasta.setBounds(75,103,20,20);
        this.hasta.setCaretColor(Color.DARK_GRAY);
        this.hasta.setForeground(Color.DARK_GRAY);
        this.add(hasta);*/
    }
    
    public void updateLabel(String s){
    //    this.labelA.setText(s);
    }
    
    //Recibe el controlador y se le entrega al boton
    public void setContoller(Controler cont){
        this.c=cont;
        this.boton.addActionListener(this.c);
        this.accion.addActionListener(this.c);
        this.panel.getBotonArgentina().addActionListener(this.c);
        this.panel.getBotonBolivia().addActionListener(this.c);
        this.panel.getBotonBrasil().addActionListener(this.c);
        this.panel.getBotonChile().addActionListener(this.c);
        this.panel.getBotonColombia().addActionListener(this.c);
        this.panel.getBotonEcuador().addActionListener(this.c);
        this.panel.getBotonGuyana().addActionListener(this.c);
        this.panel.getBotonGuyanaFrancesa().addActionListener(this.c);
        this.panel.getBotonParaguay().addActionListener(this.c);
        this.panel.getBotonPeru().addActionListener(this.c);
        this.panel.getBotonSuriname().addActionListener(this.c);
        this.panel.getBotonUruguay().addActionListener(this.c);
        this.panel.getBotonVenezuela().addActionListener(this.c);
    }
    // Permitir al modelo acceder al panel
    public Panel getPanel(){
        return panel;
    }
}
