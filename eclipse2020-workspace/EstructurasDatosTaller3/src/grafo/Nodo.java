package grafo;

import java.util.ArrayList;
import java.util.HashMap;

public class Nodo {

	
	private String[] vertices= {"A","B","C","D","E","F","G","H","I","J"};
	private  int cantidad;
	HashMap<String, Integer> aux= new HashMap<String, Integer>();
	HashMap<String, HashMap<String, Integer>> miGrafo=
			new HashMap<String, HashMap<String, Integer>>();
	private int contador=0;
	
	/**
	 * @return the vertices
	 */
	public String[] getVertices() {
		return vertices;
	}

	public void crearVertice(String vertice, HashMap<String, Integer> relacion) {
		miGrafo.put(vertice, relacion);
		aux= new HashMap<String, Integer>();
	}
	public HashMap<String, Integer> getVerticesGrafo(String vertice){
		return miGrafo.get(vertice);
	}
	
	
	public void agregar(ArrayList<String> etiqueta, ArrayList<Integer> peso) {
		
		for (int i = 0; i < etiqueta.size(); i++) {
			aux.put(etiqueta.get(i), peso.get(i));
			
		}
		
		crearVertice(vertices[contador], aux);
		contador++;
		
	}
	
	public void imprimir() {
		for (int i = 0; i < contador; i++) {
			System.out.println(vertices[i]+"--> "+getVerticesGrafo(vertices[i])+"\n");
		}
	}
	
			
	
}
