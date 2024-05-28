package correcion;
/**
 * @since 24-09-2020
 */
import java.util.Arrays;

public class Curso {
	private int codigo;
	private String programa;
	private String grupo;
	private Asignatura asignatura;
	private  Docente docente;
	private Estudiante[] listaEstudiante;
	/**
	 * Constructor
	 * @param codigo de la asignatura
	 * @param progrma nombre del programa
	 * @param grupo grupo del curso
	 * @param asignattura instancia de la clase Asignatura que contiene los datos de la asignatura
	 * @param docente instancia de la clase docente que contiene ls datos del docente 
	 * @param numero es el numero de elementos de arreglos de estudiantes
	 */
	public Curso(int codigo, String progrma, String grupo, Asignatura asignattura, Docente docente, int numero) {
		this.codigo = codigo;
		this.programa = programa;
		this.grupo = grupo;
		this.asignatura= asignatura;
		this.docente= docente;
		//COMPOSICION
		this.listaEstudiante = new Estudiante[numero];
				
	}
	/**
	 * Metodo para assignar los ddatos de los estudiantes
	 * @param estudiante es una isntancia de la clase Estudiante que contiene los datos de un estudiante 
	 */
	public void agregarEstudiante(Estudiante estudiante) {
		for (int i = 0; i < listaEstudiante.length; i++) {
			if (listaEstudiante[i]== null) {
				listaEstudiante[i]= estudiante;
				break;
			}
		}
	}
	public void mostrarArregloEstudiante() {
		double sumaNota=0;
				System.out.println("Notas del curso "+this.codigo + "Programa "+this.programa +"Grupo "+this.grupo + "");
		for (Estudiante estudiante : listaEstudiante) {
			double  notaFinal = ((estudiante.getNotas()[0]*30/100+ estudiante.getNotas()[1]*30/100+ estudiante.getNotas()[2]*40/100));
					sumaNota +=notaFinal;
			System.out.println(estudiante + " "+notaFinal);
		}
		
		System.out.println("El promedio del curso es "+sumaNota/listaEstudiante.length);
	}
	/**
	 * Metodo para mostrar por consola las notas por rango
	 * @param desde nota donde inicia el rango
	 * @param hasa nota donde termina el rango
	 */
	public void mostrarNotasRango (double desde, double hasta) {
		System.out.println("Notas del Curso" + this.codigo + "Programa "+this.programa + "Grupo "+ this.grupo + "");
		System.out.println("Asignatura");
	}

	
	
	
}

