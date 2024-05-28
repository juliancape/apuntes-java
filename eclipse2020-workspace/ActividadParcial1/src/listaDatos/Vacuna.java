package listaDatos;




import java.time.LocalDate;
import java.util.Date;

import tdaLista.TdaList;
/**
 * Clase Vacuna con las listas
 * @author Jennifer Camacho y Julian Cardenas
 *
 */
public class Vacuna {

	private  static TdaList<Persona> lista= new TdaList();
	private static TdaList<Persona> lista1= new TdaList();
	private TdaList<Persona> lista2= new TdaList();
	private TdaList<Persona> lista3= new TdaList();
	
	
	
	public static final int MAX_ELEMENT =50;
	public static LocalDate date = LocalDate.now();
	Date fecha= new Date();
	
	public void llenarLista() {
		String genero;
		for (int i = 0; i < MAX_ELEMENT; i++) {
			// ano = (int) Math.floor(Math.random()*(1961-1947+1)+1947); 
			int ano= (int) ((Math.random()*(1961 -1947))+1947);
		
			if (ano%2==0) {
				 genero="M";
			}else {
				genero="F";
			}
			
			lista.addFinal(new Persona("Nombre","Apellido",ano,genero));

		}
		
		
	}

	 
		
	 
	
	/**
	 * Metodo para generar la lisa
	 */
	public void generarLista() {
		 int[] estadistica= new int[6];
		for (Persona p : lista.getLista() ) {
	//		lista[i].getNacimiento;
			    //2021-
			if (date.getYear()-p.getNacimiento()>=60 && date.getYear()<=64) {
			//lista1
			 if (p.getGenero()=="M") {
				estadistica[0]++;
			}else {
				estadistica[1]++;
			}
				
			}
			if (date.getYear()-p.getNacimiento()>=65 && date.getYear()<=69) {
				//lista1
				 if (p.getGenero()=="M") {
					 estadistica[2]++;
				}else {
					estadistica[3]++;
				}
			}
			if (date.getYear()-p.getNacimiento()>=70 && date.getYear()<=74) {
				//lista1
				 if (p.getGenero()=="M") {
					 estadistica[4]++;
				}else {
					estadistica[5]++;
				}
			}	
		}
		
		System.out.println("Estadisticas para vacunas bogota");
		System.out.println("Rango     Genero         TotalP");
		System.out.println("60 a 64    "+"M    "+estadistica[0]+"       "+(double) estadistica[0]*100/MAX_ELEMENT);
		System.out.println("60 a 64    "+"F    "+estadistica[1]+"       "+(double) estadistica[1]*100/MAX_ELEMENT);
		System.out.println("65 a 69    "+"M    "+estadistica[2]+"       "+(double) estadistica[2]*100/MAX_ELEMENT);
		System.out.println("65 a 69    "+"F    "+estadistica[3]+"       "+(double) estadistica[3]*100/MAX_ELEMENT);
		System.out.println("70 a 74    "+"M    "+estadistica[4]+"       "+(double) estadistica[4]*100/MAX_ELEMENT);
		System.out.println("70 a 74    "+"F    "+estadistica[5]+"       "+(double) estadistica[5]*100/MAX_ELEMENT);
		
	}
	
	public static void extraerDatos() {
		for (Persona p : lista.getLista()) {
			if (date.getYear()-p.getNacimiento()>=60 && date.getYear()<=64) {
				lista1.addFinal(p);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
