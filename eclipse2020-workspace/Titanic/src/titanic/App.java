package titanic;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Persona> listaTotal = importarPersonas();
		List<List<Persona>> listaGrande = new ArrayList<List<Persona>>();
		
		//1. Total de Personas
		
		
		System.out.print("1. Total personas: ");
		System.out.println(listaTotal.size());
		
		
		//2. Numero de Adultos
		
		List<Persona> adultos = filtrar(listaTotal, 2, "adulto");
		System.out.print("2. Numero de adultos: ");
		System.out.println(adultos.size());
		listaGrande.add(adultos);
		
		//3. Numero de niños
		
		List<Persona> ninos = filtrar(listaTotal, 2, "niños");
		System.out.print("3. Numero de niños: ");
		System.out.println(ninos.size());
		listaGrande.add(ninos);
		
		//4. Numero de personas de primera clase
		
		List<Persona> primeraClase = filtrar(listaTotal, 1, "1st");
		System.out.print("4. Numero de personas de primera clase: ");
		System.out.println(primeraClase.size());
		listaGrande.add(primeraClase);
		
		//5. Numero de personas de segunda clase
		
		List<Persona> segundaClase = filtrar(listaTotal, 1, "2nd");
		System.out.print("5. Numero de personas de segunda clase: ");
		System.out.println(segundaClase.size());
		listaGrande.add(segundaClase);
		
		//6. Numero de personas de tercera clase
		
		List<Persona> terceraClase = filtrar(listaTotal, 1, "3rd");
		System.out.print("6. Numero de personas de tercera clase: ");
		System.out.println(terceraClase.size());
		listaGrande.add(terceraClase);
		
		//7. Numero de personas de genero masculino de primera clase
		
		List<Persona> primeraClaseHombres = filtrar(primeraClase, 3, "masculino");
		System.out.print("7. Numero de personas de genero masculino de primera clase: ");
		System.out.println(primeraClaseHombres.size());
		listaGrande.add(primeraClaseHombres);
		
		//8. Numero de personas de genero masculino de segunda clase
		
		List<Persona> segundaClaseHombres = filtrar(segundaClase, 3, "masculino");
		System.out.print("8. Numero de personas de genero masculino de segunda clase: ");
		System.out.println(segundaClaseHombres.size());
		listaGrande.add(segundaClaseHombres);
		
		//9. Numero de personas de genero masculino de tercera clase
		
		List<Persona> terceraClaseHombres = filtrar(terceraClase, 3, "masculino");
		System.out.print("9. Numero de personas de genero masculino de tercera clase: ");
		System.out.println(terceraClaseHombres.size());
		listaGrande.add(terceraClaseHombres);
		
		//10. Numero de personas de genero femenino de primera clase
		
		List<Persona> primeraClaseMujeres = filtrar(primeraClase, 3, "femenino");
		System.out.print("10. Numero de personas de genero femenino de primera clase: ");
		System.out.println(primeraClaseMujeres.size());
		listaGrande.add(primeraClaseMujeres);
		
		//11. Numero de personas de genero femenino de segunda clase
		
		List<Persona> segundaClaseMujeres = filtrar(segundaClase, 3, "femenino");
		System.out.print("11. Numero de personas de genero femenino de segunda clase: ");
		System.out.println(segundaClaseMujeres.size());
		listaGrande.add(segundaClaseMujeres);
		
		//12. Numero de personas de genero femenino de tercera clase
		
		List<Persona> terceraClaseMujeres = filtrar(terceraClase, 3, "femenino");
		System.out.print("12. Numero de personas de genero femenino de tercera clase: ");
		System.out.println(terceraClaseMujeres.size());
		listaGrande.add(terceraClaseMujeres);
		
		//13. Numero de niños que se salvaron
		
		List<Persona> ninosSalvados = filtrar(ninos, 4, "si");
		System.out.print("13. Numero de niños que se salvaron: ");
		System.out.println(ninosSalvados.size());
		listaGrande.add(terceraClaseMujeres);
		
		//14.  a) Numero de hombres que se salvaron
		
		List<Persona> hombres = filtrar(listaTotal, 3, "masculino");
		listaGrande.add(hombres);
		List<Persona> hombresSalvados = filtrar(hombres, 4, "si");
		System.out.print("14. a) Numero de hombres que se salvaron: ");
		System.out.println(hombresSalvados.size());
		listaGrande.add(hombresSalvados);
		
		//14.  b) numero de mujeres que se salvaron
		
		List<Persona> mujeres = filtrar(listaTotal, 3, "femenino");
		listaGrande.add(mujeres);
		List<Persona> mujeresSalvadas = filtrar(mujeres, 4, "si");
		System.out.print("    b) Numero de mujeres que se salvaron: ");
		System.out.println(mujeresSalvadas.size());
		listaGrande.add(mujeresSalvadas);
		
		//15. Numero de mujeres salvadas por clase
		
		List<Persona> mujeresSalvadasPc = filtrar(mujeresSalvadas, 1, "1st" );
		listaGrande.add(mujeresSalvadasPc);
		List<Persona> mujeresSalvadasSc = filtrar(mujeresSalvadas, 1, "2nd" );
		listaGrande.add(mujeresSalvadasSc);
		List<Persona> mujeresSalvadasTc = filtrar(mujeresSalvadas, 1, "3rd" );
		listaGrande.add(mujeresSalvadasTc);
		
		System.out.print("15. a) Numero de mujeres de primera clase que se salvaron: ");
		System.out.println(mujeresSalvadasPc.size());
		System.out.print("    b) Numero de mujeres de segunda clase que se salvaron: ");
		System.out.println(mujeresSalvadasSc.size());
		System.out.print("    c) Numero de mujeres de tercera clase que se salvaron: ");
		System.out.println(mujeresSalvadasTc.size());
		
		//Numero de hombres salvados por clase
		
		List<Persona> hombresSalvadosPc = filtrar(hombresSalvados, 1, "1st" );
		listaGrande.add(hombresSalvadosPc);
		List<Persona> hombresSalvadosSc = filtrar(hombresSalvados, 1, "2nd" );
		listaGrande.add(hombresSalvadosSc);
		List<Persona> hombresSalvadosTc = filtrar(hombresSalvados, 1, "3rd" );
		listaGrande.add(hombresSalvadosTc);
		
		System.out.print("    d) Numero de hombres de primera clase que se salvaron: ");
		System.out.println(hombresSalvadosPc.size());
		System.out.print("    e) Numero de hombres de segunda clase que se salvaron: ");
		System.out.println(hombresSalvadosSc.size());
		System.out.print("    f) Numero de hombres de tercera clase que se salvaron: ");
		System.out.println(hombresSalvadosTc.size());
		
		//16. Numero de personal de tipulacion que se salvaron por genero
		
		List<Persona> tripulacion = filtrar(listaTotal, 1, "tripulacion");
		listaGrande.add(hombresSalvadosTc);
		List<Persona> tripulacionSalvada = filtrar(tripulacion, 4, "si");
		listaGrande.add(hombresSalvadosTc);
		List<Persona> tripulacionSalvadaH = filtrar(tripulacionSalvada, 3, "masculino");
		listaGrande.add(hombresSalvadosTc);
		List<Persona> tripulacionSalvadaM = filtrar(tripulacionSalvada, 3, "femenino");
		listaGrande.add(hombresSalvadosTc);
		
		System.out.print("16. a) Numero de hombres de tripulacion que se salvaron: ");
		System.out.println(tripulacionSalvadaH.size());
		
		System.out.print("    b) Numero de nujeres de tripulacion que se salvaron: ");
		System.out.println(tripulacionSalvadaM.size());
		
		// 18 Porcentaje de personas que se salvaron:
		
		List<Persona> salvados = filtrar(listaTotal, 4, "si");
		listaGrande.add(hombresSalvadosTc);
		
		System.out.print("18. Porcentaje de personas que se salvaron: ");
		System.out.println(porcentaje(listaTotal, salvados));
		
		// 19. Porcentaje de personas que se salvaron por género.
		
		System.out.print("19. a) Porcentaje de mujeres que se salvaron: ");
		System.out.println(porcentaje(salvados, mujeresSalvadas));
		
		System.out.print("    b) Porcentaje de hombres que se salvaron: ");
		System.out.println(porcentaje(salvados, hombresSalvados));
		
		//20 Porcentaje de personas que se salvaron por género y por clase.
		
		System.out.print("20. a) Porcentaje de mujeres de primera clase que se salvaron: ");
		System.out.println(porcentaje(mujeresSalvadas, mujeresSalvadasPc));
		System.out.print("    b) Porcentaje de mujeres de segunda clase que se salvaron: ");
		System.out.println(porcentaje(mujeresSalvadas, mujeresSalvadasSc));
		System.out.print("    c) Porcentaje de mujeres de tercera clase que se salvaron: ");
		System.out.println(porcentaje(mujeresSalvadas, mujeresSalvadasTc));
		System.out.print("    d) Porcentaje de hombres de primera clase que se salvaron: ");
		System.out.println(porcentaje(hombresSalvados, hombresSalvadosPc));
		System.out.print("    e) Porcentaje de hombres de segunda clase que se salvaron: ");
		System.out.println(porcentaje(hombresSalvados, hombresSalvadosSc));
		System.out.print("    f) Porcentaje de hombres de tercera clase que se salvaron: ");
		System.out.println(porcentaje(hombresSalvados, hombresSalvadosTc));
		
		//21. Porcentaje de personas que se salvaron de la tripulación por género
		
		System.out.print("21. a) Porcentaje de mujeres de Tripulación que se salvaron: ");
		System.out.println(porcentaje(tripulacionSalvada, tripulacionSalvadaM));
		System.out.print("    b) Porcentaje de mujeres de Tripulación que se salvaron: ");
		System.out.println(porcentaje(tripulacionSalvada, tripulacionSalvadaH));
		
		// 22. Porcentajes Varios:
		
		List<Persona> adultosSalvados = filtrar(adultos, 4, "si");
		listaGrande.add(hombresSalvados);
		List<Persona> salvadosPc = filtrar(primeraClase, 4, "si");
		List<Persona> salvadosSc = filtrar(segundaClase, 4, "si");
		List<Persona> salvadosTc = filtrar(terceraClase, 4, "si");
		List<Persona> muertos = filtrar(listaTotal, 4, "no");
		
		
		
		System.out.print("22. a) Porcentaje de niños que se salvaron: ");
		System.out.println(porcentaje(ninos, ninosSalvados));
		System.out.print("    b) Porcentaje de adultos que se salvaron: ");
		System.out.println(porcentaje(adultos, adultosSalvados));
		System.out.print("    c) Porcentaje de personas de primera clase que se salvaron: ");
		System.out.println(porcentaje(primeraClase, salvadosPc));
		System.out.print("    d) Porcentaje de personas de segunda clase que se salvaron: ");
		System.out.println(porcentaje(segundaClase, salvadosSc));
		System.out.print("    e) Porcentaje de personas de tercera clase que se salvaron: ");
		System.out.println(porcentaje(terceraClase, salvadosTc));
		System.out.print("    f) Porcentaje de personas que no se salvaron: ");
		System.out.println(porcentaje(listaTotal, muertos));
		
		maxMin(listaGrande);
		
		
	}
	
	public static List<Persona> importarPersonas() {
		 
		 List<Persona> listaP = new ArrayList<Persona>();
		 String filename = "Titanic.txt";
		 
		 try {
			listaP = Files.lines(Paths.get(filename))
					.map(l -> new Persona(l.split(",")[0]
							,l.split(",")[1]
							,l.split(",")[2]
							,l.split(",")[3]))
							.collect(Collectors.toList());
			} catch (Exception e) {
				System.out.println("Pailander");
				System.out.println(e);
			}
		  
		 return listaP;
	}
	
	public static List<Persona> filtrar(List<Persona> lP,int categoria,String atributo)
	 {		 
		 
		switch(categoria)
		 {
		 	case 1:
		 		return lP.stream()
						 .filter(p -> p.getCategoria().equals(atributo))
						 .collect(Collectors.toList());		
		 	case 2:
		 		return lP.stream()
						 .filter(p -> p.getEdad().equals(atributo))
						 .collect(Collectors.toList());	
		 	case 3:
		 		return lP.stream()
						 .filter(p -> p.getGenero().equals(atributo))
						 .collect(Collectors.toList());	
		 	case 4:
		 		return lP.stream()
						 .filter(p -> p.getSupervivencia().equals(atributo))
						 .collect(Collectors.toList());	
		 	default:
		 		System.out.println("La categoria no es valida");
		 		return lP;
			 
		 }	 
	 }
	
	public static String porcentaje(List<Persona> listaG, List<Persona> listaP) 
	{
		
		return String.valueOf((float)listaP.size()*100/listaG.size()) + "%";
		
	}
	
	public static void maxMin (List<List<Persona>> lista)
	{
		int max=0;
		int min=99999;
		
		for (List<Persona> list : lista) {
			if(list.size()<min)
			{
				min=list.size();
			}
			if(list.size()>max)
			{
				max=list.size();
			}
		}
		System.out.println("La lista con mas personas fue de Adultos con: "+max+" personas");
		System.out.println("La lista con menos personas fue de Hombres de "
				+ "segunda clase que se salvaron con: "+min+" personas");
	}
	
	

}
