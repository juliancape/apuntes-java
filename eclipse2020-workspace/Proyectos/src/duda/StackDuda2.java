package duda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Julian Cardenas
 *@since 05-11-2021
 */
public class StackDuda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1;
		String cadena2;
		String cadena3;
		Scanner leer= new Scanner(System.in);
		ArrayList<String> cadenator= new ArrayList<>();
		
	    //Pedir datos al usuario y validarlos
	    System.out.print("Ingrese primer cadena: ");
	    cadena1 = leer.nextLine();
	    if (cadena1.contains("b")||cadena1.contains("j")||cadena1.contains("Ã±")||cadena1.contains("x")||cadena1.contains("z"))
	    {
	        System.out.println("La cadena contiene caracteres invalidos");
	    }
	    else
	    {
	        System.out.println("\n");
	        System.out.print("Ingrese segunda cadena: ");
	        cadena2 = leer.nextLine();
	        if (cadena2.contains("b")||cadena2.contains("j")||cadena2.contains("ñ")||cadena2.contains("x")||cadena2.contains("z"))
	        {
	            System.out.println("La cadena contiene caracteres invalidos");
	        }
	        else
	        {
	            System.out.println("\n");
	            System.out.print("Ingrese tercer cadena: ");
	            cadena3 = leer.nextLine();
	            if (cadena3.contains("b")||cadena3.contains("j")||cadena3.contains("ñ")||cadena3.contains("x")||cadena3.contains("z"))
	            {
	                System.out.println("La cadena contiene caracteres invalidos");
	            }

	            //dividir la cadena en 4 caracteres y compararlos con las otras cadenas
	            else 
	            {
	                
	            }

	            System.out.println(cadenator);
	        }
	    }
	}
		
	public void operacion(String cadena1,String cadena2, String cadena3, ArrayList<String> cadenator) {
		System.out.println("\n***************************************************");
		String[] partes;
        for (int i=4; i<cadena1.length();i++)
        {
           partes= cadena1.split("(?<=\\G.{" + i + "})");
        }
        
	}

}
