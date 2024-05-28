package bank;

import java.util.Scanner;

public class Main {
	public static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("ingrese el nombre del archivo a buscar");
		String fileName = //leer.next();
		fileName="bank.txt";
		App bank = new App(fileName);
		

	}

}
