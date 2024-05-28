package operacion;

import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {
	private HashMap<String, HashMap<String, Integer>> grafo;
	private String[] vertices= {"A","B","C","D","E","F","G","H","I","J"};
	private int numVertices;
	private int contador;
	
	
	/**
	 * @return the vertices
	 */
	public String[] getVertices() {
		return vertices;
	}

	public Grafo(){
		grafo= new HashMap<String, HashMap<String, Integer>>();
	}
	
	public void crearVertice(String vertice, HashMap<String, Integer> relacion) {
		grafo.put(vertice, relacion);
	}

	/** 
	 * @return the grafo
	 */
	public HashMap<String, Integer> getVerticeGrafo(String vertice) {
		return grafo.get(vertice);
	}
	
	public int tamaño(int tam) {
		numVertices=tam;
		return numVertices;
		
	}
	/*public void agregar(ArrayList<String> etiqueta, ArrayList<Integer> peso) {
		
		for (int i = 0; i < etiqueta.size(); i++) {
			aux.put(etiqueta.get(i), peso.get(i));
			
		}
		
		crearVertice(vertices[contador], aux);
		contador++;
		
	}*/
	public void imprimir() {
		System.out.println("GHOLAAA");
		for (int i = 0; i < numVertices; i++) {
			System.out.println(vertices[i]+"--> "+getVerticeGrafo(vertices[i])+"\n");
		}
	}

	
}
