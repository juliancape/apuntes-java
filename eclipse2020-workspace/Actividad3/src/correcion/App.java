package correcion;
/**
 * 
 * @author Julian Cardenas Peñuela
 *
 */
public class App {
     static double[] notas;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso miCurso = new Curso (100,"CCIA","G2",new Asignatura (100,"FDS"),new Docente(1133, "Piro", "ING"),3);
		
		double[] notas = {4.5,3.8,4};
		miCurso.agregarEstudiante(new Estudiante(100,"Juan","Pipo", notas));
		
		miCurso.mostrarArregloEstudiante();
  }
}
	
	/*	
		notas = new double [3];
		agregarNota(4.9);
	
	}
	public static void agregarNota(double nota) {
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]== 0) {
				notas[i]= nota;
				break;
			}
		}
	
*/

	/*double[] notas = {4.2,4.7,3};
		Estudiante nuevoEstudiante= new Estudiante(18138, "Mike", "Perez",notas);
		
		System.out.println(nuevoEstudiante);
		
		Estudiante otroEstudiante = new Estudiante(2020, "Piro", "Makio", notas);
		
		System.out.println(otroEstudiante);
		*/