package relacion_composicion;
/**
 * 
 * @author julian cardenas
 *@since 2020 09 08
 */
import java.util.Scanner;

public class AppParcial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leerDato= new Scanner (System.in);
		
		System.out.println("Cuantos parciales?");
		int elemento= leerDato.nextInt();
		
		
		Parcial[] listaParciales = new Parcial [elemento];
		
		for (int i = 0; i < listaParciales.length; i++) {
			System.out.println("Datos del parcial ");
			System.out.println("Asignatura");
			String asignatura = leerDato.next();
			System.out.println("Docente ");
			String docente = leerDato.next();
			listaParciales[i] = new Parcial (asignatura, docente);
		
			
			System.out.println("datos de la fecha y hora");
			System.out.println("Dia ");
			int dia = leerDato.nextInt();
			System.out.println("Mes");
			int mes = leerDato.nextInt();
			System.out.println("Año");
			int  year = leerDato.nextInt();
			System.out.println("hora ");
			int hora = leerDato.nextInt();
			System.out.println("Minutos");
			int minutos = leerDato.nextInt();
			
			listaParciales[i].agregarFecha(dia, mes, year);
			listaParciales[i].agregarHora(hora, minutos);
		
		}
		
		System.out.println("Lista de  los parciales");	
		for (int i = 0; i < listaParciales.length; i++) {
			System.out.println("Asignatra "+listaParciales[i].getAsignatura());
			System.out.println("docente "+listaParciales[i].getDocente());
			System.out.println("Fecha del dia del parcial " +listaParciales[i].getFecha().getDia()
			+	"Mes" 	+listaParciales[i].getFecha().getMes() +"Año "+listaParciales[i].getFecha().getYear()
			+"Hora" +listaParciales[i].getHora().getHora() +"Minutos" + listaParciales[i].getHora().getMinutos());
			
			
		}
		
		
		
	}

}
