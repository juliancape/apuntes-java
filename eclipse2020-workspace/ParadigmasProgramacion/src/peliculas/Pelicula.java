package peliculas;

public class Pelicula {

	private String titulo;
    private String director;
    private String estreno;
    
    public Pelicula(String titulo, String director, String estreno)
    {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }
    
   public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	String getEstreno() {
		return estreno;
	}

	public void setEstreno(String estreno) {
		this.estreno = estreno;
	}
	public String toString()
    {
        return titulo + " (" + director + ", " + estreno + ")";
    }
	
}


    

