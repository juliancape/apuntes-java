package operacionAreglo;

import java.util.ArrayList;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arregloNumeros= new ArrayList<>();
		arregloNumeros.add(3);
		arregloNumeros.add(2);
		arregloNumeros.add(1);
		arregloNumeros.add(0);
		arregloNumeros.add(3);
		arregloNumeros.add(2);
		arregloNumeros.add(1);
		
		                            //HASHMAP
	/*	 arregloNumeros.add(3);
		 arregloNumeros.add(1);
		 arregloNumeros.add(2);
		 arregloNumeros.add(4);
		 arregloNumeros.add(1);
		 arregloNumeros.add(4);*/
		 
		/* arregloNumeros.add(3);
		 arregloNumeros.add(4);
		 arregloNumeros.add(0); //1
		 arregloNumeros.add(0);
		 arregloNumeros.add(2);
		 arregloNumeros.add(0);
		 arregloNumeros.add(5);*/
		 
		 Arreglo a= new Arreglo();
		 System.out.println( arregloNumeros.toString());
		 
		 
		 if (a.camino(arregloNumeros)==true) {
			System.out.println("Proceso completado");
		}if (a.camino(arregloNumeros)==false) 
			System.out.println("Error");
		 
			
		
		 
	}
	
	public boolean camino(ArrayList<Integer> arregloNumeros) {
		boolean booleano=false;
		int aumento=0;
		int cont=0;
		for (int i = 0; i <arregloNumeros.size() ; i+=aumento) {
			
			if (arregloNumeros.get(i)!=0 ) {
				
				aumento=arregloNumeros.get(i);
				if ((i+aumento)>=arregloNumeros.size()) {
					
					System.out.println("11111");
					aumento= (i+aumento)-arregloNumeros.size();
					booleano=true;
					}	
					
				}	
			if (arregloNumeros.get(i)==0) {
				
				System.out.println("BBBB");
				cont++;
				
						arregloNumeros.get(i-cont);
						//aumento=arregloNumeros.get(i-cont);
						
						if (i-cont+aumento>=arregloNumeros.size()) {
							System.out.println("CCC");
							aumento= (i-cont+aumento)-arregloNumeros.size();
							booleano=true;
					}else {
						
					} 
				}
			
			
		}
		
		return booleano;
	}
	
	

}
