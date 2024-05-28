package vista;
import javax.swing.*;
import java.awt.*;

import javax.swing.text.AttributeSet.ColorAttribute;

import controlador.Controller;

public class Ventana extends JFrame{
	private JLabel label= new JLabel("");
	private JLabel actual = new JLabel("ESTADO ACTUAL:");
	private FondoPanel fondo = new FondoPanel();
	//botones
	private JButton nuevo = new JButton("NUEVO");
	private JButton preparado = new JButton("PREPARADO");
	private JButton activo = new JButton("ACTIVO");
	private JButton bloqueado =new JButton("BLOQUEADO");
	private JButton terminado = new JButton("TERMINADO");
	
	private Controller c;
	private Panel panel= new Panel();
	
	
	
	
	//SETEA LA VENTANA QUE ES LA PRINCIPAL
	public Ventana () {
		this.setBounds(10,10,1000,1000);
		this.setContentPane(fondo);
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.initComponets();
		this.setVisible(true);
		
	
	}


	
	private void initComponets() {
		
		//setea la posicion del boton y lo agrega a la ventana
		this.nuevo.setBounds(50, 50, 150, 30);
		this.add(nuevo);
		this.preparado.setBounds(50, 250, 150, 30);
		this.add(preparado);
		this.activo.setBounds(350, 250, 150, 30);
		this.add(activo);
		this.bloqueado.setBounds(50, 450, 150, 30);
		this.add(bloqueado);
		this.terminado.setBounds(650, 250, 150, 30);
		this.add(terminado);
		
		Font letra = new Font("Times New Roman", Font.BOLD, 25);
		label.setFont(letra);
		label.setForeground(Color.RED);
		label.setBounds(50,500,900,300);
		this.add(label);
		
		actual.setFont(letra);
		actual.setForeground(Color.RED);
		actual.setBounds(550,10,500,100);
		this.add(actual);		
	}
	
	 class FondoPanel extends JPanel
	    {
	        private Image imagen;
	        
	        @Override
	        public void paint(Graphics g)
	        {
	            imagen = new ImageIcon(getClass().getResource("/imagen/img1.png")).getImage();
	            
	            g.drawImage(imagen,0,0,986,496,this);
	            
	            setOpaque(false);
	            
	            super.paint(g);
	        }
	    }
	
	 public void updateactual(String s) {
		 this.actual.setText(s);
	 }
	
	public void updateLabel(String s) {
		
		String texto="<html>";
		for (int i = 0; i < s.length(); i++) {
			char a=s.charAt(i);
			if (a=='.') {
				texto+=a;
				texto+="<br/>";
				
			}else {
				texto+=a;
			}
			}
		texto+="</html>";
		this.label.setText(texto);
		
	}
	
	//RECIBE EL CONTROLADOR Y LO ENTREGA AL BOTON
	public void setcontroller(Controller cont) {
		this.c= cont;
		this.nuevo.addActionListener(this.c);
		this.preparado.addActionListener(this.c);
		this.activo.addActionListener(this.c);
		this.bloqueado.addActionListener(this.c);
		this.terminado.addActionListener(this.c);
	}
	
	public Panel getPanel() {
		return panel;
	}
	
	
	
	
}
