package actividad3Profesor;

import java.util.Arrays;

public class Curso {
	private int codigo;
	private String programa;
	private String grupo;
	private Asignatura asignatura;
	private Docente docente;
	private Estudiante[] arregloEstudiante;
	/**
	 * Constructor 
	 * @param codigo de la asignatura
	 * @param programa nombre del programa 
	 * @param grupo grupo de curso
	 * @param asignatura instancia de la clase Asignatura que contine los datos de la asignatura
	 * @param docente instancia de la clase Docente que contiene los datos del docente
	 * @param numero es el numero de elementos de arraglos de estudiantes 
	 */
	public Curso(int codigo,String programa, String grupo,int numero) {
		this.codigo = codigo;
		this.programa = programa;
		this.grupo = grupo;
		//Crea una instancia de la clase Estudiante, es un array est�tico  
		this.arregloEstudiante =new Estudiante[numero];
	}
	/**
	 * M�todo para asignara los datos de los estduiante a las instancia del arreglos de clase Estudiante
	 * @param estudiante es una instancia de la clase Estdiante que contine los datos de un estudiante
	 */
	public void agregarEstudiante(Estudiante estudiante) {
		
		for (int i = 0; i < arregloEstudiante.length; i++) {
			if (arregloEstudiante[i] == null) {
				arregloEstudiante[i] = estudiante;
				break;
 			}
		}
		
	}
	/**
	 * M�todo para mostar por consola todos los estudiantes del cursos con las notas del corte 1
	 * corte 2, corte 3 y la nota definitiva.
	 */
	public void mostrarArregloEstudiante() {
		double sumaNota=0;
		System.out.println("Notas del Curso " + this.codigo + " Programa " + this.programa + " Grupo " + this.grupo);
		System.out.println("Asignatura " + this.asignatura + " Docente " + this.docente);
		
		
		
		for (Estudiante estu : arregloEstudiante) {
			
			double notaFinal = ((estu.getNotas()[0]*30/100 + estu.getNotas()[1]*30/100 + estu.getNotas()[2]*40/100));
			
			sumaNota += notaFinal;
			
			System.out.println(estu + " "+ notaFinal);
		}
		
		System.out.println("El promedio del Curso es " + sumaNota/arregloEstudiante.length);
		
	}
	/**
	 * M�todo para mostrar por consola las notas por rango
	 * @param desde nota donde incia el rango
	 * @param hasta nota donde termina el rango
	 */
	public void mostrarNotasRango(double desde, double hasta) {
		System.out.println("Notas del Curso " + this.codigo + " Programa " + this.programa + " Grupo " + this.grupo);
		System.out.println("Asignatura " + this.asignatura + " Docente " + this.docente);
		
		double sumaNota=0;
		
		int nEstu = 0;
		
		for (Estudiante estu : arregloEstudiante) {
			double notaFinal = ((estu.getNotas()[0]*30/100 + estu.getNotas()[1]*30/100 + estu.getNotas()[2]*40/100));
			
			if (notaFinal >= desde && notaFinal <= hasta ) {
			
				sumaNota += notaFinal;
				
				System.out.println(estu + " "+ notaFinal);
				
				nEstu++;
			}
		}
		System.out.println("El Promedio del Curso es " + sumaNota/nEstu);
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Estudiante buscarEstudiante(int buscarEstu) {
		 
		Estudiante estudiante=null;
		for (Estudiante estu : arregloEstudiante) {
			if (buscarEstu == estu.getId())
			{
				//estudiante=estu;
				System.out.println("Datos del Estudiante: "+ estu);
				break;
			} else {
				System.out.println("No se Encontro el Estudiante");
				break;
			}
			
		}
		return estudiante;
		
		
	}
	
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the programa
	 */
	public String getPrograma() {
		return programa;
	}
	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	/**
	 * @return the grupo
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * @param grupo the grupo to set
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * @return the asignatura
	 */
	public Asignatura getAsignatura() {
		return asignatura;
	}
	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
		
	/**
	 * @return the docente
	 */
	public Docente getDocente() {
		return docente;
	}
	/**
	 * M�todo para agregar una instancia de la clase Docente
	 * @param docente the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	/**
	 * @return the arregloEstudiante
	 */
	public Estudiante[] getArregloEstudiante() {
		return arregloEstudiante;
	}
	/**
	 * @param arregloEstudiante the arregloEstudiante to set
	 */
	public void setArregloEstudiante(Estudiante[] arregloEstudiante) {
		this.arregloEstudiante = arregloEstudiante;
	}
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", programa=" + programa + ", grupo=" + grupo + "]";
	}
	
	
}
