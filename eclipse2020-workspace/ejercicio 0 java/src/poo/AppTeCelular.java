package poo;
import java.util.Scanner;
public class AppTeCelular{
	
	

	public static void main(String[] args) {
		
		
		Scanner leerdato=new Scanner(System.in);
		System.out.println("Entrar el id ");
		int id= leerdato.nextInt();
		System.out.println("Entrar el color ");
		String color= leerdato.next();
		System.out.println("Entrar el modelo ");
		String modelo= leerdato.next();
		System.out.println("Entrar la marca");
		String marca= leerdato.next();
		
				//miCelular = objeto
		TeCelular miCelular =new TeCelular(id,color,modelo,marca);
		
		System.out.println("Codigo "+miCelular.getId());
		System.out.println("Color "+miCelular.getColor());
		System.out.println("Modelo "+miCelular.getModelo());
		System.out.println("Marca "+miCelular.getMarca());
		
		
		TeCelular otroCelular =new TeCelular (4020, "Negro","g7","LG");
		
		System.out.println("Codigo "+otroCelular.getId());
		System.out.println("Color "+otroCelular.getColor());
		System.out.println("Modelo "+otroCelular.getModelo());
		System.out.println("Marca "+otroCelular.getMarca());
		
		
		otroCelular.setColor("amarillo");
		
		System.out.println("Codigo "+otroCelular.getId());
		System.out.println("Color "+otroCelular.getColor());
		System.out.println("Modelo "+otroCelular.getModelo());
		System.out.println("Marca "+otroCelular.getMarca());
		
		
	}
}

