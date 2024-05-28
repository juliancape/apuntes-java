package Nodes;

import java.util.ArrayList;

public class Nodo {

	private String info;
	private boolean visitado;
	private ArrayList<Nodo> vecinos= new ArrayList<>();
	private ArrayList<Integer> pesosVecinos= new ArrayList<>();
	
	public Nodo(String i) {
		info=i;
	}

	public void agrgarVecinos(Nodo k, int peso) {
		vecinos.add(k);
		pesosVecinos.add(peso);
		k.vecinos.add(this);
		k.pesosVecinos.add(peso);
	}

	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}


	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String imprimirNodos() {
		this.visitado=true;
		String  s="\n"+"Estoy en "+info+"\n";
		
		for (int i = 0; i < vecinos.size(); i++) {
			
			s+="("+vecinos.get(i).info+" [W:"+pesosVecinos.get(i)+"])  ";
			if (!vecinos.get(i).visitado) {
				s+=vecinos.get(i).imprimirNodos();
			}		
			
		}
		
		return s;
	}
	
	
	
	
}
