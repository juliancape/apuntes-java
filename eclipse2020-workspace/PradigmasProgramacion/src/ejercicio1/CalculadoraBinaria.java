package ejercicio1;
/**
 * Clase CalculadoraBinaria que determina cuantas veces se utilizo los botones
 * @author Julian Cardenas Peñuela
 *@since 02-02-2021
 */
public class CalculadoraBinaria {
	/**
	 * Funcion que recibe como parametro dos numeros y determina cuantas veces utilizo 
	 * los botones para llegar de "a" hasta "b".
	 * @param a numero inicial
	 * @param b numero a donde se quiere llegar
	 * @return el resutado de la cantidad de "botones" oprimidos
	 */
	public static int minimosPasos(int a, int b) {
		
		int resta=-2;
		int suma=3;
		int resultado=0;
		int igual=0;
		
		if (a>b) {
			
			if(a%2==0 && b%2==0) {
				for (int i = 1; i < 100; i++) {
					
					igual=a+i*resta;
					
					
					if (igual==b) {
						resultado=i;
					}
				}
			}
			if (a%2==0 && b%2!=0) {
				
				a=3+a;
				for (int i = 1; i < 100; i++) {
					
					igual=a+i*resta;
					
					if (igual==b) {
						resultado=i+1;
					}
				}
			}
			if (a%2!=0 && b%2==0) {
				a=3+a;
				for (int i = 1; i < 100; i++) {
					
					igual=a+i*resta;
					
					if (igual==b) {
						resultado=i+1;
					}
				}
				
				
			}if (a%2!=0 && b%2!=0) {
					for (int i = 1; i < 100; i++) {
					
					igual=a+i*resta;
					
					
					if (igual==b) {
						resultado=i;
					}
				}
			}
			
			
		}
		
		
		if (a<b) {
	
			if(a%2==0 && b%2==0) {
				
			
				if (a%3==0 && b%3==0) {
					for (int i = 1; i < 100; i++) {
						igual=a+i*suma;
						if (igual==b) {
							resultado=i;
						}
					}
				}
				
				if (a%3==0 && b%3!=0) {
					
					for (int i = 1; i < 100; i++) {
						
						igual=(a+resta)+i*suma;
						if (igual==b) {
							resultado=i+1;
						
						}
						
					}
				}
				
				if (a%3!=0 && b%3==0) {
						for (int i = 1; i < 100; i++) {
							igual=(a-4)+i*suma;
							if (igual==b) {
								resultado=i+2;
							}
						}	
					
						
					
						}
					}
					
					
				}
				if (a%3!=0 && b%3!=0) {
					for (int i = 1; i < 100; i++) {
						igual=(a-2)+i*suma;
						if (igual==b) {
							resultado=i+1;
				}
		
			}
			
			
			
			if (a%2==0 && b%2!=0) {
				for (int i = 1; i < 100; i++) {
					igual=(a+suma)+i*resta;
					if (igual==b) {
						resultado=i+1;
					}
				}
				
			}
			if (a%2!=0 && b%2==0) {
				
				if (a%3!=0 && b%3!=0) {
					for (int i = 1; i < 100; i++) {
						igual = a+i*suma;
						if (igual==b) {
							resultado=i;
						}
					} 
				}else {
					for (int i = 1; i < 100; i++) {
					igual=(a-4)+i*suma;
					if (igual==b) {
							resultado=i+2;
				}
				
				
						
						}
				}
				
				
				
			}
			if (a%2!=0 && b%2!=0) {
				
				for (int i = 1; i < 100; i++) {
					igual=a+(i*suma);
					if (igual==b) {
						resultado=i;
					}
					int exept=(a+resta)+(i*suma);
					if (exept==b) {
						resultado=i+1;
					}
					
					
				}
			}
			
		}
		
		return resultado;
	}
	
	
	
}
