package modelo;

public interface IOperacionEstudiante {
	public abstract void anexarEstudiante(Estudiante unEstudiante, int clave); 
	public abstract void listarEstudiante();
	public abstract void leerArchivo();
	public abstract void generarLista(String cad);
	public abstract void consultarEstudiante(String id, int opc); 
	public abstract void anexarSiNoExiste(String identificacion, String nombre, String apellido, String correoInst, String correoPer,
			String numeroCel, String genero, String edad, String programa,int clave);
	public abstract void actualizarInformacionEstudiante(String identificacion, String nombre, String apellido, String correoInst, String correoPer,
			String numeroCel, String genero, String edad, String programa, int clave);
	public abstract void eliminar(String id);
}
