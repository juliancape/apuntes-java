
package appBuses;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
/**
 *Clase ListaBuses con los metodos necesarios para filtrar de acuerdo a lo necesario
 * @author Jennifer Camacho y Julian Cardenas
 * @since 16-05-2021
 * @version 01
 */
public class ListaBuses {
    private static ArrayList<Bus> lista;
    private static int codigo=100;
    private static int nBuses=10;
    
    /*
     * Metodo para crear lista
     */
    public  void crearList() {
	lista= new ArrayList<Bus>();	
	for (int i = 0; i < nBuses; i++) {
            
            lista.add(new Bus("AA",(int)(Math.random()*(9999990-1000000)+1000000 ),(int)(Math.random()*(999-100)+100 ),(int)(Math.random()*(90-20)+10 ),(int)(Math.random()*(90-20)+10 ),
            (int)(Math.random()*(90-20)+10 ),(int)(Math.random()*(90-20)+10 ),(int)(Math.random()*(90-20)+10 ),(int)(Math.random()*(90-20)+10 ),(int)(Math.random()*(90-20)+10 ),0));
		
	
		}
        lista.forEach(System.out::println);
    }
    /*
     * Metodo para ordenar Km
     */
    public  void ordenKm(){
        System.out.println("\nLista Ordenada de mayor a menor km recorridos en la semana");
        lista.sort(Comparator.comparing(Bus::getTotal).reversed());
        lista.forEach(System.out::println);
    
    }
    /**
     * 
     * @param opcion para entrar al case del switch de acuerdo al dia
     */
   public void conseguirDia(int opcion) {
	   switch (opcion) {
	case 1:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km lunes ["+bus.getLun()+"km]");
			}
		
		break;
	case 2:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km Martes ["+bus.getMar()+"km]");
			}
		break;
	case 3:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km Miercoles ["+bus.getMie()+"km]");
			}
		break;
	case 4:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km jueves ["+bus.getJue()+"km]");
			}
		break;
	case 5:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km viernes ["+bus.getVie()+"km]");
			}
		break;
	case 6:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km sabado ["+bus.getSab()+"km]");
			}
		break;
	case 7:
		lista.sort(Comparator.comparing(Bus::getId));
		System.out.println("Lista ordenada por codigo del bus de menor a mayor y su dia respectivo");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". km domingo ["+bus.getDom()+"km]");
			}
		break;
		
		
	default:
		System.out.println("Pailas, solo hay 7 dias en la semana");
	
		break;
	}
	   
   }
    
   /**
    * Metodo para ordenar el total de km
    */
   public void ordenTotalKm() {
	   lista.sort(Comparator.comparing(Bus::getTotal).reversed());
		System.out.println("\nLista ordenada por Km total recorridos por un bus en una semana de mayor a menor");
			for (Bus bus : lista) {
				System.out.println("Codigo bus-->"+bus.getId()+". Total km ["+bus.getTotal()+"km]");
			}
	   
   }
   /**
    * Metodo para conseguir promedio de cada bus de km recorridos en la semana
    */
   public void  conseguirPromedioKm() {
	   int promedio;
	   System.out.println("\nPromedio de km recorridos por cada bus");
	   lista.sort(Comparator.comparing(Bus::getTotal).reversed());
	   for (Bus bus : lista) {
		  promedio=bus.getTotal()/7;
		  System.out.println("Codigo bus-->"+bus.getId()+". Promedio km ["+promedio+"]" );
	}
	  
   }
   
    /**
     * Metodo para conseguir mayor bus con km recorrido a la semana
     */
    public  void mayorKm(){
        System.out.println("\nBus con mayor km recorridos en la semana");
        Optional<Bus> mayor=lista.stream().max((p1,p2)->Integer.compare(p1.getTotal(),p2.getTotal()));
        if(mayor.isPresent()){
            System.out.println("Bus [Conductor: "+ mayor.get().getConductor()+", Numero: "+ mayor.get().getNumero()+ ", NumeroBus: "
                    + ""+mayor.get().getId() + ", Total de Km: "+mayor.get().getTotal()+  "]");
            
        }
    
    }
    
}
