package bank;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;




public class App {
	public static Scanner leer=new Scanner(System.in);
	public List<TdaLista<Persona>> listaListas;
	private String fileName;
	
	public App(String fileName) {
		super();
		this.listaListas = new ArrayList<TdaLista<Persona>>();
		this.fileName = fileName;
		run(this.fileName,this.listaListas);
	}
	public static void run(String fileName,List<TdaLista<Persona>> listaListas)
	{
		listaListas.add(new TdaLista<Persona>("Lista Principal",importarPersonas(fileName)));
		TdaLista<String>[] opciones=listaOpciones(importarPersonas("bank.txt"));
		elegirFiltro(opciones,listaListas);
		
		mostrarDatosL(listaListas.get(0));
	}
	
	public static List<Persona> importarPersonas(String fileName) {
		 
		 List<Persona> listaP = new ArrayList<Persona>();
		 
		 try {
			listaP = Files.lines(Paths.get(fileName))
					.map(l -> new Persona(l.split(";")[0]
							,l.split(";")[1]
							,l.split(";")[2]
							,l.split(";")[3]
							,l.split(";")[4]
							,l.split(";")[5]
							,l.split(";")[6]
							,l.split(";")[7]
							,l.split(";")[8]
							,l.split(";")[9]
							,l.split(";")[10]
							,l.split(";")[11]
							,l.split(";")[12]
							,l.split(";")[13]
							,l.split(";")[14]
							,l.split(";")[15]
							,l.split(";")[16]))
							.collect(Collectors.toList());
			} catch (Exception e) {
				System.out.println("Pailander");
				System.out.println(e);
			}
		  
		 return listaP;
	}
	
	public static TdaLista<String>[] listaOpciones(List<Persona> listaTotal){
			
			TdaLista<String>[] listaOpciones = new TdaLista[17];
			
			listaOpciones[0] = new TdaLista<String>("Age");
			listaOpciones[1] = new TdaLista<String>("Job");
			listaOpciones[2] = new TdaLista<String>("Marital");
			listaOpciones[3] = new TdaLista<String>("Education");
			listaOpciones[4] = new TdaLista<String>("Default");
			listaOpciones[5] = new TdaLista<String>("Balance");
			listaOpciones[6] = new TdaLista<String>("Housing");
			listaOpciones[7] = new TdaLista<String>("Loan");
			listaOpciones[8] = new TdaLista<String>("Contact");
			listaOpciones[9] = new TdaLista<String>("Day");
			listaOpciones[10] = new TdaLista<String>("Month");
			listaOpciones[11] = new TdaLista<String>("Duration");
			listaOpciones[12] = new TdaLista<String>("Campaign");
			listaOpciones[13] = new TdaLista<String>("Pdays");
			listaOpciones[14] = new TdaLista<String>("Previous");
			listaOpciones[15] = new TdaLista<String>("Poutcome");
			listaOpciones[16] = new TdaLista<String>("Y");
			
			
			
			for (Persona p : listaTotal) {
				if(!listaOpciones[0].getLista().contains(p.getAge())) {
					listaOpciones[0].add(p.getAge());
				}
				if(!listaOpciones[1].getLista().contains(p.getJob())) {
					listaOpciones[1].add(p.getJob());
				}
				if(!listaOpciones[2].getLista().contains(p.getMarital())) {
					listaOpciones[2].add(p.getMarital());
				}
				if(!listaOpciones[3].getLista().contains(p.getEducation())) {
					listaOpciones[3].add(p.getEducation());
				}
				if(!listaOpciones[4].getLista().contains(p.getDefaultt())) {
					listaOpciones[4].add(p.getDefaultt());
				}
				if(!listaOpciones[5].getLista().contains(p.getBalance())) {
					listaOpciones[5].add(p.getBalance());
				}
				if(!listaOpciones[6].getLista().contains(p.getHousing())) {
					listaOpciones[6].add(p.getHousing());
				}
				if(!listaOpciones[7].getLista().contains(p.getLoan())) {
					listaOpciones[7].add(p.getLoan());
				}
				if(!listaOpciones[8].getLista().contains(p.getContact())) {
					listaOpciones[8].add(p.getContact());
				}
				if(!listaOpciones[9].getLista().contains(p.getDay())) {
					listaOpciones[9].add(p.getDay());
				}
				if(!listaOpciones[10].getLista().contains(p.getMonth())) {
					listaOpciones[10].add(p.getMonth());
				}
				if(!listaOpciones[11].getLista().contains(p.getDuration())) {
					listaOpciones[11].add(p.getDuration());
				}
				if(!listaOpciones[12].getLista().contains(p.getCampaign())) {
					listaOpciones[12].add(p.getCampaign());
				}
				if(!listaOpciones[13].getLista().contains(p.getPdays())) {
					listaOpciones[13].add(p.getPdays());
				}
				if(!listaOpciones[14].getLista().contains(p.getPrevious())) {
					listaOpciones[14].add(p.getPrevious());
				}
				if(!listaOpciones[15].getLista().contains(p.getPoutcome())) {
					listaOpciones[15].add(p.getPoutcome());
				}
				if(!listaOpciones[16].getLista().contains(p.getY())) {
					listaOpciones[16].add(p.getY());
				}
				
				for (TdaLista<String> t : listaOpciones) {
					t.getLista().sort(null);
				}
				
				
			}
			return listaOpciones;
	}

	public static void elegirFiltro(TdaLista<String>[] Opciones,List<TdaLista<Persona>> lista)
	{
		int bandera=0,i=0,categoria=0,listaE=0;
		String atributo="";
		do
		{
			System.out.println("Elija una lista para filtrar");
			for(i=0;i<lista.size();i++)
			{
				System.out.println("Digite "+i+" para filtrar la lista: "+lista.get(i).getNombre());
			}
			listaE=leer.nextInt();
			System.out.println("Elija un categoria para realizar el filtro");
			for(i=0;i<Opciones.length;i++)
			{
				System.out.println("Digite "+i+" para filtrar por: "+Opciones[i].getNombre());
			}
			categoria=leer.nextInt();
			for(i=0;i<Opciones[categoria].tamanio();i++)
			{
				System.out.println("Digite "+i+" para filtrar por: "+Opciones[categoria].getLista().get(i));
			}
			atributo=Opciones[categoria].getLista().get(leer.nextInt());
			
			lista=filtrar(lista.get(listaE),categoria+1,atributo,lista,lista.get(listaE).getNombre());
			System.out.println("Desea ver alguna lista?");
			System.out.println("Si.0  / No.1");
			bandera=leer.nextInt();
			if (bandera==0)
			{
				System.out.println("Elija una lista para mostrar");
				for(i=0;i<lista.size();i++)
				{
					System.out.println("Digite "+i+" para filtrar la lista: "+lista.get(i).getNombre());
				}
				mostrarDatosL(lista.get(leer.nextInt()));
			}
			System.out.println("Desea continuar haciendo filtros?");
			System.out.println("Si.0  / No.1");
			bandera=leer.nextInt();
		}while(bandera==0);
	}
	
	public static List<TdaLista<Persona>> filtrar(TdaLista<Persona> lP,int categoria,String atributo
			,List<TdaLista<Persona>> listaListas,String nombre)
	 {		 
		switch(categoria)
		 {
		 	case 1:
		 		
		 		listaListas.add(new TdaLista<Persona>(nombre,lP.getLista()
		 		.stream().filter(p->p.getAge().equals(atributo)).collect(Collectors.toList())));
		 		
		 		break;
		 	case 2:
		 		listaListas.add(new TdaLista<Persona>(nombre,lP.getLista().stream()
						 .filter(p -> p.getJob().equals(atributo))
						 .collect(Collectors.toList())));
		 		//listaListas.get(listaListas.size()-1).setNombre(listaListas.get(listaListas.size()-1).getNombre()+"Filtro: "+atributo);
		 		break;
		 	case 3:
		 		listaListas.add(new TdaLista<Persona>(nombre,lP.getLista().stream()
						 .filter(p -> p.getMarital().equals(atributo))
						 .collect(Collectors.toList())));	
		 		break;
		 	case 4:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getEducation().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 5:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getDefaultt().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 6:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getBalance().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 7:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getHousing().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 8:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getLoan().equals(atributo))
						 .collect(Collectors.toList())));		
		 		break;
		 	case 9:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getContact().equals(atributo))
						 .collect(Collectors.toList())));	
		 		break;
		 	case 10:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getDay().equals(atributo))
						 .collect(Collectors.toList())));	
		 		break;
		 	case 11:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getMonth().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 12:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getDuration().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 13:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getCampaign().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 14:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getPdays().equals(atributo))
						 .collect(Collectors.toList())));
		 		break;
		 	case 15:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getPrevious().equals(atributo))
						 .collect(Collectors.toList())));		
		 		break;
		 	case 16:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getPoutcome().equals(atributo))
						 .collect(Collectors.toList())));	
		 		break;
		 	case 17:
		 		listaListas.add(new TdaLista<Persona>(nombre, lP.getLista().stream()
						 .filter(p -> p.getY().equals(atributo))
						 .collect(Collectors.toList())));	
		 		break;
		 	
		 	default:
		 		System.out.println("La categoria no es valida");
		 		break;
			 
		 }
		listaListas.get(listaListas.size()-1).setNombre
		(listaListas.get(listaListas.size()-1).getNombre()+" Filtro: "+atributo);
		return listaListas;
	 }
	
	public static void mostrarDatosL(TdaLista<Persona> l)
	{
		for (Persona persona : l.getLista()) {
			System.out.println(persona);
		}
		System.out.println("La lista tiene: "+l.getLista().size()+" personas");
		datosArit(l.getLista());
		
	}
	
	public static void datosArit (List<Persona> lista)
	{		

		Optional<Persona> mayor= 
				lista.stream().max((p1,
				p2)->Integer.compare(Integer.parseInt(p1.getAge()),Integer.parseInt(p2.getAge())));
		
		System.out.println("la mayor edad fue:" +mayor );
			
		Optional<Persona> menor= 
				lista.stream().min((p1,
				p2)->Integer.compare(Integer.parseInt(p1.getAge()),Integer.parseInt(p2.getAge())));
		
		System.out.println("la menor edad fue:" +menor );
		
		
			int balanceViviendaMax=
		lista.stream().mapToInt(p->Integer.parseInt(p.getBalance())).summaryStatistics().getMax();
		System.out.println("el mayor balance de vivienda fue:" + balanceViviendaMax );
		
		
		
		int balanceViviendaMin=
				lista.stream().mapToInt(p->Integer.parseInt(p.getBalance())).summaryStatistics().getMin();
		System.out.println("el menor balance de vivienda fue::" + balanceViviendaMin );
		
		
			System.out.println("Personas que se contactaron hace poco tiempo");
			lista.stream().filter(p->p.getMonth().equals("nov")).forEach(System.out::println);
		
		
		
		System.out.println("Personas que se contactaron hace mucho tiempo");
			lista.stream().filter(p->p.getMonth().equals("jan")).forEach(System.out::println);
		
			
		
		
			System.out.println("\nDuracion de ultimo contacto (segundos)");
		
		System.out.println("Clientes que si se contactaron por mas de 600 segundos (10 minutos)");
		lista.stream().filter(p->Integer.valueOf(p.getDuration())>600)
		.forEach(System.out::println);	
		
		System.out.println("----------------------------------");
		
			System.out.println("Numero  de personas que solo tuvieron un contacto durante la campaña");
			int[] g=lista.stream().filter(p->Integer.valueOf(p.getCampaign())==1).mapToInt(p->Integer.parseInt(p.getCampaign())).toArray() ;//.forEach(System.out::println);;
			System.out.println("Cantidad de personas: "+g.length+"\n");			
			
		System.out.println("Mayor numero de contactos durante la campaña a una persona");
		Optional<Persona> campañaPersonaMayorContacto= 
				lista.stream().max((p1,p2)->
				Integer.compare(Integer.valueOf(p1.getCampaign()),Integer.valueOf(p2.getCampaign())));
		System.out.println(campañaPersonaMayorContacto+"\n");
		
			System.out.println("\nnúmero de días que pasaron después de que el cliente fue contactado por última vez desde una campaña anterior ");
		int[] a=lista.stream().filter(p->Integer.valueOf(p.getPdays())==(-1)).mapToInt(p->Integer.parseInt(p.getPdays())).toArray();
			//lista.stream().filter(p->Integer.valueOf(p.getPdays())==-1).forEach(System.out::println);
			System.out.println("La cantidad de personas que no se contactaron fueron: "+a.length);
		System.out.println("\nnúmero de contactos realizados antes de esta campaña y para este cliente");
		
		int nContactosAntesCampañaMax= lista.stream().mapToInt(p->Integer.parseInt(p.getPrevious())).summaryStatistics().getMax();
		System.out.println("Numero de contactos maximos realizados antes de la campaña a una persona "+nContactosAntesCampañaMax);		
		
		System.out.println("Promedio de edad");
		double promedioEdad = lista.stream().mapToInt(p->Integer.parseInt(p.getAge())).summaryStatistics().getAverage();
		System.out.println(promedioEdad);
		
		
	}
}
