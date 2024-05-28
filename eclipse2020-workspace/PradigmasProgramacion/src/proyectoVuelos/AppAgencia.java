package proyectoVuelos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AppAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion boeing = new Avion("Boeing",15,2011);
		Avion airbus = new Avion("Airbus",20,1988);
		Avion fokker = new Avion("Fokker",10,2003);
		Avion hombre = new Avion("Hombres",20,2021);
		Avion mujer  = new Avion("Mujeres",20,2021);
		
		List<Pasajero> listaPasajeros = importarPasajeros();
		
		//Imprimir la lista de Pasajeros
		
		System.out.println("Lista Todos los Pasajeros:\n");
		
		listaPasajeros.stream().forEach(p -> System.out.println(p.toString()));
		System.out.println();
		
		//Separan segun los rangos de edad
		
		List<Pasajero> menores = filtrarEdad(listaPasajeros,0,18);
		List<Pasajero> mayores = filtrarEdad(listaPasajeros,65,120);
		List<Pasajero> adultos = filtrarEdad(listaPasajeros,18,65);
		
		//Se imprimen todos los grupos poblacionales
		
		//Lista de pasajeros menores
		System.out.println("Lista Menores de Edad:\n");
		
		menores.stream().forEach(p -> System.out.println(p));
		
		//Lista de pasajeros adultos
		System.out.println("\nLista de Adultos: \n");
		
		adultos.stream().forEach(p -> System.out.println(p));
		
		//Lista de Pasajeros Adultos Mayores
		System.out.println("\nLista de Adultos Mayores: \n");
		
		mayores.stream().forEach(p -> System.out.println(p));
		System.out.println();
		//Separa hombres de mujeres
		
		List<Pasajero> hombres = filtrarHombres(listaPasajeros);
		List<Pasajero> mujeres = filtrarMujeres(listaPasajeros);
		
		
		//Lista de pasajeros hombres
		System.out.println("\nLista de Hombres: \n");
				
		hombres.stream().forEach(p -> System.out.println(p));
				
		//Lista de pasajeros mujeres
		System.out.println("\nLista de Mujeres: \n");
				
		mujeres.stream().forEach(p -> System.out.println(p));
		System.out.println("\nSeparacion de los vuelos\n");
		
		//Se crean y muestran los vuelos segun un criterio de pasajeros
		
		Vuelo vueloJovenes = crearVuelo("Bogota","Mariquita",boeing,menores);
		System.out.println(vueloJovenes);
		
		Vuelo vueloAdultos = crearVuelo("Bogota","Anapoima",airbus,adultos);
		System.out.println(vueloAdultos);
		
		Vuelo vueloMayores = crearVuelo("Bogota","Melgar",fokker,mayores);
		System.out.println(vueloMayores);
		
		Vuelo vueloHombres = crearVuelo("Bogota","Cali",hombre,hombres);
		System.out.println(vueloHombres);
		
		Vuelo vueloMujeres = crearVuelo("Bogota","Manizales",mujer,mujeres);
		System.out.println(vueloMujeres);
		System.out.println("\nMedia de los vuelos\n");
		//Se calcula y muestra la media de cada Vuelo	
		
		System.out.println("Media menores:"+media(menores));
		System.out.println("Media Adultos:"+media(adultos));
		System.out.println("Media Mayores:"+media(mayores));
		System.out.println("Media Hombres:"+media(hombres));
		System.out.println("Media Mujeres:"+media(mujeres));
		
		System.out.println("\nMayores de los vuelos\n");
		
		//Se calcula y muestra el mayor  segun su edad
		
		System.out.println("Mayor de los Menores:"+mayorPasajero(menores));
		System.out.println("Mayor de los Adultos:"+mayorPasajero(adultos));
		System.out.println("Mayor de los Mayores:"+mayorPasajero(mayores));
		System.out.println("Mayor de los Hombres:"+mayorPasajero(hombres));
		System.out.println("Mayor de los Mujeres:"+mayorPasajero(mujeres));
		
		System.out.println("\nMenores de los vuelos\n");
		//Se calcula y muestra el menor  segun su edad
		
		System.out.println("Menor de los Menores:"+menorPasajero(menores));
		System.out.println("Menor de los Adultos:"+menorPasajero(adultos));
		System.out.println("Menor de los Mayores:"+menorPasajero(mayores));
		System.out.println("Menor de los Hombres:"+menorPasajero(hombres));
		System.out.println("Menor de los Mujeres:"+menorPasajero(mujeres));
		
		System.out.println();
		
		//Se agregan 3 pasajeros nuevos a la tabla de datos
		
		listaPasajeros=agregarPasajero(new Pasajero(6666,"Lulita",99,"f"),listaPasajeros);
		listaPasajeros=agregarPasajero(new Pasajero(7777,"Lolito",9,"m"),listaPasajeros);
		listaPasajeros=agregarPasajero(new Pasajero(8888,"Lolita",49,"f"),listaPasajeros);
		
		//Se muestra nuevamente la lista general 
		
		System.out.println("Lista Todos los Pasajeros:\n");
		
		listaPasajeros.stream().forEach(p -> System.out.println(p.toString()));
		System.out.println();
				
	}
	
	//Metodo para importar los pasajeros a partir de un archvo de texto plano .txt 
	
	 public static List<Pasajero> importarPasajeros() {
		 
		 List<Pasajero> listaP = new ArrayList<Pasajero>();
		 
		 try {
			listaP = Files.lines(Paths.get("pasajeros2.txt"))
					.map(l -> new Pasajero(Integer.parseInt(l.split(":")[0])
							,l.split(":")[1]
							,Integer.parseInt(l.split(":")[2])
							,l.split(":")[3])).collect(Collectors.toList());
			} catch (Exception e) {
				System.out.println("Pailander");
			}
		 
		 
		 return listaP;
	}
	
	 
	public static List<Pasajero> agregarPasajero (Pasajero p, List<Pasajero> lista) 
	{		 
		 lista.add(p);
		 return lista;		 
	 }
	
	
	 public static Vuelo crearVuelo(String ciudadSalida, String ciudadLlegada, Avion avion,List<Pasajero> listaP)
	 {
		 Pasajero[] listaX=new Pasajero[avion.getCapacidad()] ;
			for (int i=0;i<listaX.length;i++)
			{
				if (i==listaP.size())
				{
					break;
				}
				listaX[i]=listaP.get(i);
				
			}			
			return new Vuelo(ciudadSalida,ciudadLlegada,avion,listaX);
	 }
	 
	 
	 public static double media(List<Pasajero> pasajeros)
	 {
		 OptionalDouble media = pasajeros.stream().mapToInt(p->p.getEdad()).average();
		 return media.getAsDouble();
	 }
	 
	 
	 public static Pasajero mayorPasajero(List<Pasajero> pasajeros)
	 {
		 Optional<Pasajero> mayor = pasajeros.stream().min((p2,p1)->Integer.compare(p1.getEdad(),p2.getEdad()));
		 return mayor.get();
	 }
	 
	 
	 public static Pasajero menorPasajero(List<Pasajero> pasajeros)
	 {
		 Optional<Pasajero> menor = pasajeros.stream().max((p1,p2)->Integer.compare(p2.getEdad(),p1.getEdad()));
		 return menor.get();
	 }
	 
	 
	 public static List<Pasajero> filtrarEdad(List<Pasajero> lP, int menor , int mayor)
	 {
			 return lP.stream()
				 .filter(p -> p.getEdad()>menor && p.getEdad()< mayor)
				 .collect(Collectors.toList());
	 }
	 
	 
	 public static List<Pasajero> filtrarHombres(List<Pasajero> lP){
		 
		 return lP.stream()
				 .filter(p -> p.getGenero().equals("m"))
				 .collect(Collectors.toList());
		 
	 }
	 
	 public static List<Pasajero> filtrarMujeres(List<Pasajero> lP){
		 
		 return lP.stream()
				 .filter(p -> p.getGenero().equals("f"))
				 .collect(Collectors.toList());		 
	 }
	 
		
		
		
	

}
