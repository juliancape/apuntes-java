package herenciaPOO;

public class Estudiante extends Persona{
	private int codigoE;
	private float notaFinal;
	
	public Estudiante(String nombre, String apellido, int edad, int codigoE, float notaFinal) {
		super(nombre,apellido,edad);
		
		this.codigoE = codigoE;
		this.notaFinal = notaFinal;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre "+nombre
				+"\nApellido "+apellido + "\ncodigo "+codigoE
				+"\nNota Final "+notaFinal);	
		
		
		
	}
 
 
 
	
	
	
}
