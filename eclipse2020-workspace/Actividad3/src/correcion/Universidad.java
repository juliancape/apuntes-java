package correcion;

public class Universidad {
	private Scanner leerdato = new Scanner ()
	private Curso curso;
	/**
	 * 
	 * @param codigo
	 * @param programa
	 * @param rupo
	 * @param numero
	 */
	public Universidad(int codigo, String programa, String grupo, int numero) {
		this.curso = new Curso (codigo, programa, grupo, numero);
	}
}
