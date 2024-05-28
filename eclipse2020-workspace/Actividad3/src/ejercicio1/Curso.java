package ejercicio1;
/**
 * Clase curso, contenedora, se utilizo el construcotr, metodos set y get
 * @author julian cardenas peñuela
 *@since 2020 09 10
 *@version 01
 */
import java.util.ArrayList;
public class Curso {
	
	private int codigo;
	private String programa;
	private String grupo;
	private Asignatura asignatura;
	private ArrayList<Estudiante> estudiante;
	private Docente docente;
	
	private float promedioCurso;
	private float promedioc2;
	/**
	 * @param codigo
	 * @param programa
	 * @param grupo
	 * @param asignatura
	 * @param docente
	 */
	public Curso(int codigo, String programa, String grupo, Asignatura asignatura, Docente docente) {
		super();
		this.codigo = codigo;
		this.programa = programa;
		this.grupo = grupo;
		this.asignatura = asignatura;
		this.docente = docente;
		
		this.estudiante = new ArrayList<>();
	}
	/**
	 * se crea una  instancia de la clase estudiante dentro de la instancia de la clase curso
	 * @param estudianteId
	 * @param eNombre
	 * @param eApellido
	 * @param c1
	 * @param c2
	 * @param c3
	 */
	public void agregarEstudiante(int estudianteId,String eNombre,String eApellido, float c1, float c2,float c3 ) {
		
		estudiante.add(new Estudiante(estudianteId,eNombre, eApellido, c1, c2, c3));
				
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
	 * @param docente the docente to set
	 */
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	/**
	 * @return the estudiante
	 */
	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}
	/**
	 * @param estudiante the estudiante to set
	 */
	/**
	 * @return the promedioCurso
	 */
	public float getPromedioCurso() {
		setPromedioCurso();
		return promedioCurso;
	}
	/**
	 * Metodo para conseguir el promedio del curso
	 * @param promedioCurso the promedioCurso to set
	 */
	public void setPromedioCurso() {
		for (int i = 0; i < estudiante.size(); i++) {
			this.promedioCurso =  estudiante.get(i).getPromedio()+promedioCurso;
		}
		this.promedioCurso= promedioCurso/estudiante.size();
		
	}
	/**
	 * Metodo para conseguir promedio del corte 2
	 * @return the promedioc2
	 */
	public float getPromedioc2() {
		setPromedioc2();
		return promedioc2;
	}
	/**
	 * @param promedioc2 the promedioc2 to set
	 */
	public void setPromedioc2() {
		int contador=0;
		for (int i = 0; i < estudiante.size(); i++) {
			
			if (estudiante.get(i).getC2()>=3) {
				this.promedioc2 = estudiante.get(i).getC2()+promedioc2;
				contador++;
			}
			
		}
		this.promedioc2 = promedioc2/contador;
	}
	
		
	
}
