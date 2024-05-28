package ejercicio1;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase AppDomicilios con las estructuras de datos del Domicilio, Reparto y Domiciliario
 * @author Jeniffer Camacho y julian Cardenas
 * @since 28-05-2021
 *@version1
 */
public class AppDomicilios {

	private ArrayList<Domiciliario> listDomiciliarios;
	private Queue<Reparto> colaReparto;
	private Queue<Domicilio> colaDomicilio;
	private Scanner leerDato= new Scanner(System.in);
	
	
	
	/**
	 * @param listDomiciliarios lista domiciliario
	 * @param colaReparto cola reparto
	 * @param colaDomicilio cola domicilio
	 */
	public AppDomicilios() {
		super();
		this.listDomiciliarios = new ArrayList<Domiciliario>();
		this.colaReparto = new LinkedList<>();
		this.colaDomicilio = new LinkedList<>();
	}

	/*
	 * Metodo para crear un domiciliario nuevo
	 */
	public Object nuevoDomiciliario() {
		
		System.out.println("Ingrese Identificacion ");
		int id= leerDato.nextInt();
		System.out.println("Ingrese Nombre ");
		String nombre= leerDato.next();
		System.out.println("Ingrese Apellido");
		String apellido= leerDato.next();
		System.out.println("Ingrese Año de Nacimiento");
		int fNacimiento= leerDato.nextInt();
		System.out.println("Ingrese Nacionalidad");
		String nacionalidad=  leerDato.next();
		
		System.out.println("Ingrese UPZ \nLas siguientes upz "
				+ "estan ocupadas y no se pueden repetir");
		int[] upzOcupadas= listDomiciliarios.stream()
				.mapToInt(p->p.getUpz()).toArray();
		for (int i : upzOcupadas) {
			System.out.print("["+i+"]  ");
		}
		int upz=leerDato.nextInt();
		for (int i = 0; i < upzOcupadas.length; i++) {
			if (upz==upzOcupadas[i]) {
			System.out.println("ERROR. Escriba nuevamente los datos");
			return nuevoDomiciliario();
			
		}
		}
		int[] entregas= {0,0,0,0,0,0,0};
		long devengado=0;
		long valorPagado=0;
		
		listDomiciliarios.add(new Domiciliario(id, nombre, apellido, fNacimiento, nacionalidad
				, entregas, devengado, valorPagado, upz));
		
	
		System.out.println("Lista de Domiciliarios");
		listDomiciliarios.forEach(System.out::println);
		return 0;
	}
	
	
	
	/*
	 * Metodo para importar domiciliarios de un archivo txt
	 */
	public  List<Domiciliario> importarListaDomiciliarios(String fileName) {
	
	
	int[] dias= new int[] {0,0,0,0,0,0,0};
	
	
	try {
		listDomiciliarios= (ArrayList<Domiciliario>) Files.lines(Paths.get(fileName))
				.map(l-> new Domiciliario(Integer.parseInt(l.split(";")[0]),
						l.split(";")[1], l.split(";")[2],
						Integer.parseInt(l.split(";")[3]),
						l.split(";")[4],dias, Long.parseLong(l.split(";")[5]),
						Long.parseLong(l.split(";")[6]), 
						Integer.parseInt(l.split(";")[7])))
						.collect(Collectors.toList());
	} catch (Exception e) {
		System.out.println("F");
	}
	
	System.out.println("Lista de  Domiciliarios");
	listDomiciliarios.forEach(System.out::println);
	return listDomiciliarios;
	
}

	/*
	 * Metodo para agregar repartos
	 */
	public void agregarRepartos() {
		System.out.println("Referencia");
		int nReparto=leerDato.nextInt();
		System.out.println("UPZ");
		int upz= leerDato.nextInt();
		System.out.println("Descripcion del producto");
		String descripcion=leerDato.next();
		System.out.println("Datos del cliente");
		String datosCliente= leerDato.next();
		
		colaReparto.add(new Reparto(nReparto, descripcion, datosCliente, upz));
		
		
	}
	
	/*
	 * Metodo para Asignar reparto a cada domiciliario
	 */
	public Queue<Reparto> asignarReparto() {
					
					int cantidad=colaReparto.size();
					for (int i = 0; i < cantidad; i++) {
						if (listDomiciliarios.stream().anyMatch(p->p.getUpz()==colaReparto.peek().getUpz())) {
							int id=0;
							int dia=(int) (((Math.random()*(1 -8))+8));
							int[] aux= {0,0,0,0,0,0,0};
							
							for (Domiciliario domiciliario : listDomiciliarios) {
								
								
								if (domiciliario.getUpz()==colaReparto.peek().getUpz()) {
									
									id=domiciliario.getId();
								aux[dia-1]+=1;
								domiciliario.setEntregas(aux);
								
								}
						
								
							}
						
						colaDomicilio.add(new Domicilio(id
								, new Reparto(colaReparto.peek().getnReparto(),
								colaReparto.peek().getDescripcion(), colaReparto.peek().getDatosCliente(),
								colaReparto.peek().getUpz()), true, dia));
	
						colaReparto.poll();
					}
						else {
							System.out.println("Lo sentimos, no hay cobertura de domicilios para la UPZ "
									+ colaReparto.peek().getUpz()+".   DOMICILIO CANCELADO");
						}
					}
					
					
				/*	System.out.println("----------");
					listDomiciliarios.forEach(System.out::println);
					System.out.println("-----------");*/
					System.out.println("Cola de Domicilios");
					colaDomicilio.forEach(System.out::println);
			
					return colaReparto;
			}
			

	/*
	 * Informe 1
	 */
	public void mostrar1(){
        
		
        for(Domiciliario domiciliario: listDomiciliarios){
            int[]a=domiciliario.getEntregas();
            int total=0;
           
            for(int i:a){
            	if (i!=0) {
					total+=1;
				}
                
            
            }
          int precio=total*60000;
          domiciliario.setValorPagado(precio-40000);
          domiciliario.setDevengado(precio);
        
        }
        System.out.println("Informe semanal 1:    (Descuento de 40mil)");
       Comparator<Domiciliario> id=(p1,p2)->Integer.compare(p1.getId(), p2.getId());
        listDomiciliarios.stream().sorted(id).forEach(System.out::println);
        
    

    
    }
	/*
	 * Informe 2	
	 */
	public void mostrar2() {
		
		 for(Domiciliario domiciliario: listDomiciliarios){
	            int[]a=domiciliario.getEntregas();
	            int total=0;
	           
	            for(int i:a){
	            	if (i!=0) {
						total+=1;
					}
	                
	            
	            }
	          int precio=total*60000;
	          domiciliario.setValorPagado(precio-40000);
	          domiciliario.setDevengado(precio);
	        
	        }
		
		System.out.println("Inofrme semanal 2:    (Descuento de 40mil)");
		 Comparator<Domiciliario> upz=(p1,p2)->Integer.compare(p1.getUpz(), p2.getUpz());
	        listDomiciliarios.stream().sorted(upz).forEach(System.out::println);
	        System.out.println("Entregas  domiciliario semanal");
	        for (Domiciliario domiciliario : listDomiciliarios) {
				int[] aux=domiciliario.getEntregas();
				int cont=0;
				for (int i = 0; i < 7; i++) {
					if (aux[i]!=0) {
						cont+=aux[i];
					}
				}
				
				System.out.println("ID="+domiciliario.getId()+" Entregas en la semana="+cont);
				
	        	
			}
		
	}
		
		
	/*
	 * Metodo para el menu	
	 */
	public void menu(){
        int b=0;
       do{
           System.out.println("Ingrese el numero de acuerdo al siguiente menu");
           System.out.println("1.Importar domiciliarios del archivo txt.\n"
                   + "2.Crear un nuevo domiciliario.\n"
                   + "3.Agregar un solo reparto.\n"
                   + "4.Agregar varios repartos automaticamente.\n"
                   + "5.Asignar reparto a cada domiciliario.\n"
                   + "6.Mostrar lista de pagos semanal, ordenada por numero de identificacion."
                   + "\n7.Mostrar lista de pagos semanal, ordenada por UPZ\n");
           int a=leerDato.nextInt();
           
           switch(a){
                case 1:
                   importarListaDomiciliarios("domiciliario.txt");
                   break;
                case 2:
                	nuevoDomiciliario();
                	break;
                 
                case 3:
                   agregarRepartos(); 
                   break;
                
                case 4:
                   agregarRepartosRapido();
                   break;
                case 5:
                   asignarReparto();
                   break;
                case 6:
                   mostrar1();
                   break;
                case 7:
                   mostrar2();
                   break;
                default:  
                    System.out.println("Numero incorrecto");

           }
           System.out.println("Desea realizar otro procedimiento");
           System.out.println("1.SI\n"
                   + "2.NO\n");
           b=leerDato.nextInt();
  
       
       }while(b==1);

        }
    

	/**
	 * Metodo para Agregar Repartos
	 */
	public void agregarRepartosRapido() {
			
		colaReparto.add(new Reparto(111, "carro", "Juan", 2));
		colaReparto.add(new Reparto(333, "camiseta", "Julian", 1));
		colaReparto.add(new Reparto(444, "pc", "Jennifer", 3));
		
		
		System.out.println("Cola de Repartos inicial");
		colaReparto.forEach(System.out::println);
		
		
	}
	

	
}
