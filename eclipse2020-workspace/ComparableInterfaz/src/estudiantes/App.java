package estudiantes;
/**
 *Clase App 
* @author Jennifer Camacho y Julian Cardenas
* @since 16-05-2021
* @version 01
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiantes listEstu= new Estudiantes();
		listEstu.agregarDatos();
		listEstu.ordenarNombre();
		listEstu.ranking();
		listEstu.filtroNf();
		
	}

}
