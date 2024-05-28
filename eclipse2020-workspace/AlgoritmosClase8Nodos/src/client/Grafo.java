package client;

import Nodes.Nodo;

final class Grafo {

	public Nodo llenar() {
		Nodo a= new Nodo("A");
		Nodo b= new Nodo("B");
		Nodo c= new Nodo("C");
		Nodo d= new Nodo("D");
		Nodo f= new Nodo("F");
		Nodo j= new Nodo("J");
		a.agrgarVecinos(b, 15);
		b.agrgarVecinos(c, 20);
		c.agrgarVecinos(f, 5);
		f.agrgarVecinos(j, 22);
		d.agrgarVecinos(j, 1);
		return a;
	}
	public void listar(Nodo a){
		System.out.println(a.imprimirNodos());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grafo miGrafo=new Grafo();
		miGrafo.llenar();
		miGrafo.listar(miGrafo.llenar());
	
		
		
		
		
	}

}
