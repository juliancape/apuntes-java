package escalar;

import java.util.ArrayList;

public class Run {
	
	public static ArrayList<Terreno> crearMontaña(ArrayList<Terreno> montaña){
		montaña.add(new Terreno(0, 0));
		int x;
		int y;
		for (int i = 0; i < 15; i++) {
			x= (int) ((Math.random()*(20-1))+1);
			y= (int) ((Math.random()*(20-1))+1);
			montaña.add(new Terreno(x, y));
		}
		montaña.add(new Terreno(0, 0));
		return montaña;
	}
	
	public static void posicionarPersona(Terreno persona, ArrayList<Terreno> montaña, int x, int  y) {
		String msg1= ("Estoy en x ["+ String.valueOf(persona.getX())+"]  "
				+ "y ["+String.valueOf(persona.getY())+"]");
		System.out.println(msg1);
		
		if(y==0) {
			if(persona.getY()<montaña.get(y+1).getY()) {
				persona.setX(montaña.get(x+1).getX());
				persona.setY(montaña.get(y+1).getY());
				x+=1;
				y+=1;
			}
			System.out.println("If 1");
		}else if(y==montaña.size()-1) {
			if(persona.getY()<montaña.get(y-1).getY()) {
				persona.setX(montaña.get(x-1).getX());
				persona.setY(montaña.get(y-1).getY());
				x-=1;
				y-=1;
			}
			System.out.println("If 2");
		}else {
			if(persona.getY()<montaña.get(y+1).getY()) {
				persona.setX(montaña.get(x+1).getX());
				persona.setY(montaña.get(y+1).getY());
				x+=1;
				y+=1;
			}else if(persona.getY()<montaña.get(y-1).getY()) {
				persona.setX(montaña.get(x-1).getX());
				persona.setY(montaña.get(y-1).getY());
				x-=1;
				y-=1;
			}
			System.out.println("If 3");
		}
		String msg2= ("Me movi x ["+ String.valueOf(persona.getX())+"]  "
				+ "y ["+String.valueOf(persona.getY())+"]");
		System.out.println(msg2);
		
		char [] cadena1 = msg1.toCharArray();
		String n1="";
		for (int i = 0; i < cadena1.length; i++) {
			if(Character.isDigit(cadena1[i])) {
				n1+=cadena1[i];
			}
			
		}
		char [] cadena2 = msg2.toCharArray();
		String n2="";
		for (int i = 0; i < cadena2.length; i++) {
			if(Character.isDigit(cadena2[i])) {
				n2+=cadena2[i];
			}
		}
		if(!n2.equals(n1)) {
			posicionarPersona(persona, montaña, x, y);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Terreno> montaña= new ArrayList<>();
		crearMontaña(montaña);
		System.out.println(montaña);
		Terreno persona1= new Terreno(montaña.get(1).getX(), montaña.get(1).getY());
		Terreno persona2= new Terreno(montaña.get(montaña.size()-1).getX(), 
				montaña.get(montaña.size()-1).getY());
		System.out.println("Persona 1");
		posicionarPersona(persona1, montaña, 1, 1);
		System.out.println("Persona 2");
		posicionarPersona(persona2, montaña, montaña.size()-1, montaña.size()-1);
		
		
		
	}

}
