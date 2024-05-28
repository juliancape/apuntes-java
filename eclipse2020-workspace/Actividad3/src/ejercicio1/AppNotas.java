package ejercicio1;
/**
 * Aplicacion notas, donde se llenan los datos 
 * @author julian cardenas peñuela
 *@since 2020 09 10
 *@version 01
 */

import java.util.Scanner;


public class AppNotas {
	

	public static void main(String[] args) {
		
		Scanner leerDato = new Scanner (System.in);
		
		/*
		 * En el siguiente bloque se obtienen los parametros
		 * para la creacion del docente.
		 * 
		 * 
		 */
		
		System.out.println("Ingrese datos del docente");
		System.out.println("ID del docente ");
		int docenteId = leerDato.nextInt();
		System.out.println("Nombre ");
		String dNombre = leerDato.next();
		System.out.println("Profesion ");
		String profesion = leerDato.next();
		
		Docente docente = new Docente(docenteId, dNombre, profesion);
		
		/*
		 * En el siguiente bloque se obtienen los parametros para la creacion de la asignatura
		 * */
		
		System.out.println("Ingrese datos de la asignatura");
		System.out.println("Codigo de  la asignatura");
		int coAsignatura = leerDato.nextInt();
		System.out.println("Denominacion de la asignatura");
		String denominacion = leerDato.next();
		System.out.println("codigo del curso");
		int codigo = leerDato.nextInt();
		System.out.println("Programa del curso");
		String programa = leerDato.next();
		System.out.println("Grupo del curso");
		String grupo = leerDato.next();
		
		Asignatura asignatura =new Asignatura(coAsignatura, denominacion);
		
		/*
		 * Se crea el curso
		 * */
		
		
        Curso curso1 = new Curso(codigo, programa, grupo, asignatura, docente);
	
		
		//Se pregunta por el numero de estudiantes
		System.out.println("Numero estudiantes ");
		int elemento = leerDato.nextInt();
		
		//se llena el vector
		for (int i = 0; i < elemento; i++) {
			System.out.println("ID estudiante "+i);
			int estudianteId = leerDato.nextInt();
			System.out.println("Nombre estudiante ");
			String eNombre = leerDato.next();
			System.out.println("Apelido");
			String eApellido =leerDato.next();
			System.out.println("nota primer corte");
			float c1 = leerDato.nextFloat();
			System.out.println("nota segundo corte");
			float c2 = leerDato.nextFloat();
			System.out.println("nota tercer corte");
			float c3 = leerDato.nextFloat();
			
			curso1.agregarEstudiante(estudianteId, eNombre, eApellido, c1, c2, c3);
			
			
		}
	
				//Se imprime ejercicio numero 1
		System.out.println(codigo +" -- "+ programa+" -- " + grupo+" -- " + dNombre);
		System.out.println("Codigo Nombre Apellido C1   C2   C3   Final");


		
		
		for (int i = 0; i < curso1.getEstudiante().size(); i++) {
			
					
					
			System.out.println(curso1.getEstudiante().get(i).getEstudianteId() +"     "+ curso1.getEstudiante().get(i).geteNombre()
					+ "     "+curso1.getEstudiante().get(i).geteApellido() + "     "+curso1.getEstudiante().get(i).getC1() +"  "+ curso1.getEstudiante().get(i).getC2()
					+ " "+curso1.getEstudiante().get(i).getC3() +" "+curso1.getEstudiante().get(i).getPromedio()+"  "+curso1.getEstudiante().get(i).getAprobado());
			
			
		}
		
		
		System.out.println("        Promedio del curso " + curso1.getPromedioCurso());
		
		//Ejercicio numero 3
		System.out.println("Estudiantes que aprobaron el corte 2");
		System.out.println(codigo +" -- "+ programa+" -- " + grupo+" -- " + dNombre);
		System.out.println(" ");
		
		for (int i = 0; i < curso1.getEstudiante().size(); i++) {
			
			if (curso1.getEstudiante().get(i).getAprobado()=="Aprobado") {
				System.out.println(curso1.getEstudiante().get(i).getEstudianteId()+"     "+ curso1.getEstudiante().get(i).geteNombre()
					+ "     "+curso1.getEstudiante().get(i).geteApellido()+"  "+ curso1.getEstudiante().get(i).getC2());
			}
		}
		System.out.println("      Promedio del corte "+ curso1.getPromedioc2());
		
		
		}

	
}
