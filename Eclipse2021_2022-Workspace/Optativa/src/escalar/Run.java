package escalar;

import java.util.ArrayList;

public class Run {
	
	public static ArrayList<Terreno> crearMonta�a(ArrayList<Terreno> monta�a){
		monta�a.add(new Terreno(0, 0));
		int x;
		int y;
		for (int i = 0; i < 15; i++) {
			x= (int) ((Math.random()*(20-1))+1);
			y= (int) ((Math.random()*(20-1))+1);
			monta�a.add(new Terreno(x, y));
		}
		monta�a.add(new Terreno(0, 0));
		return monta�a;
	}
	
	public static void posicionarPersona(Terreno persona, ArrayList<Terreno> monta�a, int x, int  y) {
		String msg1= ("Estoy en x ["+ String.valueOf(persona.getX())+"]  "
				+ "y ["+String.valueOf(persona.getY())+"]");
		System.out.println(msg1);
		
		if(y==0) {
			if(persona.getY()<monta�a.get(y+1).getY()) {
				persona.setX(monta�a.get(x+1).getX());
				persona.setY(monta�a.get(y+1).getY());
				x+=1;
				y+=1;
			}
			System.out.println("If 1");
		}else if(y==monta�a.size()-1) {
			if(persona.getY()<monta�a.get(y-1).getY()) {
				persona.setX(monta�a.get(x-1).getX());
				persona.setY(monta�a.get(y-1).getY());
				x-=1;
				y-=1;
			}
			System.out.println("If 2");
		}else {
			if(persona.getY()<monta�a.get(y+1).getY()) {
				persona.setX(monta�a.get(x+1).getX());
				persona.setY(monta�a.get(y+1).getY());
				x+=1;
				y+=1;
			}else if(persona.getY()<monta�a.get(y-1).getY()) {
				persona.setX(monta�a.get(x-1).getX());
				persona.setY(monta�a.get(y-1).getY());
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
			posicionarPersona(persona, monta�a, x, y);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Terreno> monta�a= new ArrayList<>();
		crearMonta�a(monta�a);
		System.out.println(monta�a);
		Terreno persona1= new Terreno(monta�a.get(1).getX(), monta�a.get(1).getY());
		Terreno persona2= new Terreno(monta�a.get(monta�a.size()-1).getX(), 
				monta�a.get(monta�a.size()-1).getY());
		System.out.println("Persona 1");
		posicionarPersona(persona1, monta�a, 1, 1);
		System.out.println("Persona 2");
		posicionarPersona(persona2, monta�a, monta�a.size()-1, monta�a.size()-1);
		
		
		
	}

}
