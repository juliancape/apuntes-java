package tiempoCompartido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SistemaTiempoCompartido {
	
	public static void main(String[] args) {
		int nJobs;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Sistemas de tiempo compartido"
				+ "\nSistema que soporta 4 usuarios ");
		//Sistema de tiempo compartido para un sistema de 4 users
		System.out.println("Cantidad de trabajos del User1:");
		nJobs= scanner.nextInt();
		User user1= new User(1, nJobs, 0);
		System.out.println("Cantidad de trabajos del User2:");
		nJobs= scanner.nextInt();
		User user2= new User(2, nJobs, 0);
		System.out.println("Cantidad de trabajos del User3:");
		nJobs= scanner.nextInt();
		User user3= new User(3, nJobs, 0);
		System.out.println("Cantidad de trabajos del User4:");
		nJobs= scanner.nextInt();
		User user4= new User(4, nJobs, 0);
		ArrayList<User> users= new ArrayList<>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		
		try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
			Thread.sleep(2*1000);
			System.out.println("Ejecutando programas de forma concurente, espere. ");
			Thread.sleep(3*1000);
			
            procesamiento(users);
    		imprimir(users);
    		Thread.sleep(1*1000);
    		System.out.println("Procesamiento de Jobs finalizado, ya no hay mas jobs por procesar");
    		users.clear();
    		
         } catch (Exception e) {
            System.out.println(e);
         }
		
		
		
		
		
	}
	
	public static void imprimir(ArrayList<User> users) {


		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).toString());
			
		}
	}
	
	
	public static void procesamiento(ArrayList<User> users) {
		double procesamiento=0;
		for (User user : users) {
			procesamiento += user.getnJobs();
		}
		
		for (User user : users) {
			user.setSharingCPU((user.getnJobs()/procesamiento)*100);
		}
	}
	
	
	
	
}
