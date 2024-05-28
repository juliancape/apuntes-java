package multiprocesador;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jobs {
	private  ArrayList<String> memoriaSecundaria = new ArrayList<>();
	private Queue<String> memoriaPrimaria = new LinkedList();
	private Scanner scanner = new Scanner(System.in);
	
	public  void cargarJobs() {
		System.out.print("Cantidad de trabajos en la Pool Job: ");
		int n = scanner.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("\nJob "+i+": ");
			
			memoriaSecundaria.add(scanner.next());
		}
	}
	
	public boolean nJobs() {
		if (memoriaSecundaria.size()==0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void sistemaCPU() {
		int n;
		System.out.println("Proceso CPU Multiplexado");
		System.out.println("Indique que Job se va seleccionar de la Spooler (memoria secundaria)"
				+ " para cargar en la memoria principal");
		for (int i = 0; i < memoriaSecundaria.size(); i++) {
			System.out.println(i+"-->" + memoriaSecundaria.get(i));
		}
		n = scanner.nextInt();
		System.out.println("Procesando Job "+n);
		memoriaPrimaria.add(memoriaSecundaria.remove(n));
		
		System.out.println("Job "+ memoriaPrimaria.toString() +" cargado y ejecutado con exito en la"
				+ " memoria principal");
		memoriaPrimaria.poll();
		
	}
	
}
