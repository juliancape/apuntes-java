
package estudiantes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *Clase con los metodos para la filtracion necesaria
* @author Jennifer Camacho y Julian Cardenas
* @since 16-05-2021
* @version 01
 */
public class Estudiantes {
    private static ArrayList<Estudiante> listaEstudiantes= new ArrayList<>();
   /**
    * Agregar datos
    */
    public void agregarDatos() {
    	listaEstudiantes.add(new Estudiante("Daniela Manrique",1000505465,45,32,12,0));
        listaEstudiantes.add(new Estudiante("Juan Bautista",1001234564,13,39,50,0));
        listaEstudiantes.add(new Estudiante("Maria Martinez",1000506382,44,37,45,0));
        listaEstudiantes.add(new Estudiante("Pablo Diaz",1000584582,32,25,37,0));
        listaEstudiantes.add(new Estudiante("Camilo Suarez",1000505891,35,42,48,0));
        
        System.out.println("Lista Original");
        listaEstudiantes.forEach(System.out::println);
    }
    /**
     * Ordenar por nombre
     */
    public static void ordenarNombre (){
        System.out.println("\nLista ordenada Alfabeticamente");
        Collections.sort(listaEstudiantes);
        listaEstudiantes.forEach(System.out::println);
    
    }
    /**
     * ranking de notas
     */
    public static void ranking(){
    
        System.out.println("\nRanking de estudiantes de acuerdo a la calificacion de la actividad 1 de mayor a menor");
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getN1).reversed());
        listaEstudiantes.forEach(System.out::println);
        System.out.println("\nRanking de estudiantes de acuerdo a la calificacion de la actividad 2 de mayor a menor");
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getN2).reversed());
        listaEstudiantes.forEach(System.out::println);
        System.out.println("\nRanking de estudiantes de acuerdo a la calificacion de la actividad 3 de mayor a menor");
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getN3).reversed());
        listaEstudiantes.forEach(System.out::println);
        System.out.println("\nRanking de estudiantes de acuerdo a la calificacion final de mayor a menor");
        listaEstudiantes.sort(Comparator.comparing(Estudiante::getNf).reversed());
        listaEstudiantes.forEach(System.out::println);
        
    }
    /**
     * Filtrar nota final
     */
    public static void filtroNf(){
     
        System.out.println("\nEstudiantes con nota final entre 0 y 10:");
        listaEstudiantes.stream().filter(p->p.getNf()>=0 && p.getNf()<=10).forEach(p -> System.out.println(p));
        System.out.println("Estudiantes con nota final entre 11 y 20:");
        listaEstudiantes.stream().filter(p->p.getNf()>=11 && p.getNf()<=20).forEach(p -> System.out.println(p));
        System.out.println("Estudiantes con nota final entre 21 y 30:");
        listaEstudiantes.stream().filter(p->p.getNf()>=21 && p.getNf()<=30).forEach(p -> System.out.println(p));
        System.out.println("Estudiantes con nota final entre 31 y 40:");
        listaEstudiantes.stream().filter(p->p.getNf()>=31 && p.getNf()<=40).forEach(p -> System.out.println(p));
        System.out.println("Estudiantes con nota final entre 41 y 50:");
        listaEstudiantes.stream().filter(p->p.getNf()>=41 && p.getNf()<=50).forEach(p -> System.out.println(p));
    
    }
        
}
