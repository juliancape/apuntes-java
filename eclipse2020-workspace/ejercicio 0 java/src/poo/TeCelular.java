package poo;

public class TeCelular {
	private int id;
	private String color;
	private String modelo;
	private String marca;

	public TeCelular() {
		
		
		
	}
							//son variables locales
	public TeCelular (int id, String color, String modelo, String marca) {
	
		//this Es un referenciador variabe de instancia
		    
		this.id = id;
		this.color=color;
		this.modelo=modelo;
		this.marca= marca;
	}
		
	//retornando un entero
	public int getId() {
		return this.id;
	}
	
	public void setId (int id) {
		this.id=id;
		
	}
	//retornando un string
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
		
	}
	
public String getModelo() {
	return this.modelo;
}

public void setModelo(String modelo) {
	this.modelo=modelo;
	
}
	public String getMarca( ) {
		return this.marca;
	}
	public void setMarca(String marca) {
		 this.marca=marca;
	}
	
}
