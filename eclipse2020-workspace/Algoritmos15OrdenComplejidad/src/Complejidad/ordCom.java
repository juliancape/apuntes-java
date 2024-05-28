
package Complejidad;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Daniel Velasquez y Julian Cardenas
 * @since 15-11-2021
 */
public class ordCom {
    //Complejidad O(1) Operacion aritmetica
    public void o1(double n){
        double operacion = n*(n+1)/2;
    }
    public void opO1(){
        ArrayList<Double> numPrueba = new ArrayList<>();
        numPrueba.add(10000.0);
        numPrueba.add(20000.0);
        numPrueba.add(50000.0);
        numPrueba.add(100000.0);
        numPrueba.add(500000.0);
        for (int i = 0; i < numPrueba.size(); i++) {
            //vectorInicio = obtenerHora();
            long inicio = System.nanoTime();
            o1(numPrueba.get(i));
            long fin = System.nanoTime();
            double tiempo = (double) ((fin - inicio)/1000);
            System.out.println(tiempo +" nanosegundos");
            
            //vectorFinal = obtenerHora();
            //calcularTime(vectorInicio,vectorFinal);
            try{ 
                Thread.sleep(2000); 
            }catch(InterruptedException e ){ 
                System.out.println("Thread Interrupted");
            }
        }
        
    }
    
    //Complejidad O(n) Busqueda lineal
    public int on(int[] vector, int dato){

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == dato){
                return i;
            }
        }
        return -1;
    }
    public void opOn(){

        int[] vector1 = new int[1000];
        int[] vector2 = new int[10000];
        int[] vector3 = new int[20000];
        int[] vector4 = new int[50000];
        int[] vector5 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            if(vector1.length>i){
                vector1[i] = (int) (Math.random()*150000);
            }
            if(vector2.length>i){
                vector2[i] = (int) (Math.random()*150000);
            }
            if(vector3.length>i){
                vector3[i] = (int) (Math.random()*150000);
            }
            if(vector4.length>i){
                vector4[i] = (int) (Math.random()*150000);
            }
            if(vector5.length>i){
                vector5[i] = (int) (Math.random()*150000);
            }
        }
        long inicio = System.nanoTime();
        on(vector1, 3);
        long fin = System.nanoTime();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on(vector2, 5);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on(vector3, 7);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on(vector4, 9);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on(vector5, 11);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
    }
    
    //Complejidad O(log n) Busqueda binaria
    public void ologn(int[] numeros) {
    	Arrays.binarySearch(numeros, numeros[numeros.length/2]);
    }
    public void opOlogn() {
    	int[] numeros1000=new int[1000] ;
    	for (int i = 0; i < numeros1000.length; i++) {
			numeros1000[i]= (int) (Math.random()*150000);
		}
    	Arrays.sort(numeros1000);
    	
    	int[] numeros2000=new int[2000] ;
     	for (int i = 0; i < numeros2000.length; i++) {
 			numeros2000[i]= (int) (Math.random()*150000);
 		}
     	Arrays.sort(numeros2000);
    	  int[] numeros3000=new int[3000] ;
       	for (int i = 0; i < numeros3000.length; i++) {
   			numeros3000[i]= (int) (Math.random()*150000);
   		}
       	Arrays.sort(numeros3000);
       	int[] numeros4000=new int[4000] ;
         for (int i = 0; i < numeros4000.length; i++) {
     		numeros4000[i]= (int) (Math.random()*150000);
     	}
         Arrays.sort(numeros4000);
         int[] numeros5000=new int[5000] ;
        	for (int i = 0; i < numeros5000.length; i++) {
    			numeros5000[i]= (int) (Math.random()*150000);
    		}
        	Arrays.sort(numeros5000);
         long inicio;
         long fin;
         double tiempo;
    	 inicio = System.nanoTime();
         ologn(numeros1000);
         fin = System.nanoTime();
         tiempo = (double) ((fin - inicio)/1000);
         System.out.println(tiempo +" nanosegundos");
         
        
     	  inicio = System.nanoTime();
     	 ologn(numeros2000);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
          
        
       	  inicio = System.nanoTime();
       	 ologn(numeros3000);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
        
        
          inicio = System.nanoTime();
          ologn(numeros4000);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos"); 
          
       
       	  inicio = System.nanoTime();
       	  ologn(numeros5000);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
    }
    
    //Complejidad O(n^2) Busqueda por burbuja
    public void on2(int[] vector){
        int aux;
        for(int i = 2; i < vector.length; i++){
            for(int j = 0;j < vector.length-i;j++){
                if(vector[j] > vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }   
            }
        }
    }
    
    public void opOn2(){
        int[] vector1 = new int[1000];
        int[] vector2 = new int[10000];
        int[] vector3 = new int[20000];
        int[] vector4 = new int[50000];
        int[] vector5 = new int[100000];
        for (int i = 0; i < 100000; i++) {
            if(vector1.length>i){
                vector1[i] = (int) (Math.random()*150000);
            }
            if(vector2.length>i){
                vector2[i] = (int) (Math.random()*150000);
            }
            if(vector3.length>i){
                vector3[i] = (int) (Math.random()*150000);
            }
            if(vector4.length>i){
                vector4[i] = (int) (Math.random()*150000);
            }
            if(vector5.length>i){
                vector5[i] = (int) (Math.random()*150000);
            }
        }
        long inicio = System.nanoTime();
        on2(vector1);
        long fin = System.nanoTime();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on2(vector2);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on2(vector3);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on2(vector4);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        inicio = System.nanoTime();
        on2(vector5);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
    }
    
    //Complejidad O(n log n) quick sort
    public int onlognParticion(int arreglo[], int izquierda, int derecha) {
    	int pivote = arreglo[izquierda];
        // Ciclo infinito
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }
    
    public void quicksort(int arreglo[], int izquierda, int derecha) {
    	 if (izquierda < derecha) {
    	        int indiceParticion = onlognParticion(arreglo, izquierda, derecha);
    	        quicksort(arreglo, izquierda, indiceParticion);
    	        quicksort(arreglo, indiceParticion + 1, derecha);
    	    }
    }
    
    public void opOnlogn() {
    	int[] numeros1000=new int[1000] ;
    	for (int i = 0; i < numeros1000.length; i++) {
			numeros1000[i]= (int) (Math.random()*150000);
		}
   
    	
    	int[] numeros2000=new int[2000] ;
     	for (int i = 0; i < numeros2000.length; i++) {
 			numeros2000[i]= (int) (Math.random()*150000);
 		}
     	
    	  int[] numeros3000=new int[3000] ;
       	for (int i = 0; i < numeros3000.length; i++) {
   			numeros3000[i]= (int) (Math.random()*150000);
   		}
       	
       	int[] numeros4000=new int[4000] ;
         for (int i = 0; i < numeros4000.length; i++) {
     		numeros4000[i]= (int) (Math.random()*150000);
     	}
         
         int[] numeros5000=new int[5000] ;
        	for (int i = 0; i < numeros5000.length; i++) {
    			numeros5000[i]= (int) (Math.random()*150000);
    		}
        	
         long inicio;
         long fin;
         double tiempo;
         
    	 inicio = System.nanoTime();
         quicksort(numeros1000, 0, numeros1000.length-1);
         fin = System.nanoTime();
         tiempo = (double) ((fin - inicio)/1000);
         System.out.println(tiempo +" nanosegundos");
         
     	  inicio = System.nanoTime();
     	  quicksort(numeros2000, 0, numeros2000.length-1);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
          
        
       	  inicio = System.nanoTime();
       	  quicksort(numeros3000, 0, numeros3000.length-1);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
        
        
          inicio = System.nanoTime();
          quicksort(numeros4000, 0, numeros4000.length-1);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos"); 
          
       
       	  inicio = System.nanoTime();
       	  quicksort(numeros5000, 0, numeros5000.length-1);
          fin = System.nanoTime();
          tiempo = (double) ((fin - inicio)/1000);
          System.out.println(tiempo +" nanosegundos");
    }
    
    //Complejidad O(a^n) Torres de Hanoi
    public void oan(int n, int origen,  int auxiliar, int destino){
        if(n==1){
            //System.out.println("mover disco de " + origen + " a " + destino);
        }
        else{
            oan(n-1, origen, destino, auxiliar);
            //System.out.println("mover disco de "+ origen + " a " + destino);
            oan(n-1, auxiliar, origen, destino);
        }
    }
    
    public void opOan(){
        int n; //Numero de discos
        int[] vector = new int[5];
        for (int i = 0; i < vector.length; i++) {
            if(i == 0){
                int range = (10 - 5) + 1;
                n = (int)(Math.random() * range) + 5;
                vector[i] = n;
            }
            if(i == 1){
                int range = (15 - 10) + 1;
                n = (int)(Math.random() * range) + 10;
                vector[i] = n;
            }
            if(i == 2){
                int range = (20 - 15) + 1;
                n = (int)(Math.random() * range) + 15;
                vector[i] = n;
            }
            if(i == 3){
                int range = (25 - 20) + 1;
                n = (int)(Math.random() * range) + 20;
                vector[i] = n;
            }
            if(i == 4){
                int range = (30 - 25) + 1;
                n = (int)(Math.random() * range) + 25;
                vector[i] = n;
            }
        }
        //int range = (20 - 10) + 1;
        //n = (int)(Math.random() * range) + 10;
        //oan(n,1,2,3);  //1:origen  2:auxiliar 3:destino
        
        for (int i = 0; i < vector.length; i++) {
            long inicio = System.nanoTime();
            oan(vector[i],1,2,3);  //1:origen  2:auxiliar 3:destino
            long fin = System.nanoTime();
            double tiempo = (double) ((fin - inicio)/1000);
            System.out.println(tiempo +" nanosegundos");
        }
    }
    
    //Complejidad O(n!) permutaciones
    private void onfactorial(String prefix, String str) {
        int n = str.length();
        //if (n == 0) ; //System.out.println(prefix);
         if(n!=0){
            for (int i = 0; i < n; i++)
                onfactorial(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public void opOnfactorial() {
    	String abcde="abcde";
    	String abcdefghij="abcdefghij";
    	String abcdefghijklmnñ="abcdefghijklmnñ";
    	//String abcdefghijklmnñopqrst="abcdefghijklmnñopqrst";
    	
    	long inicio = System.nanoTime();
        onfactorial("", abcde);
        long fin = System.nanoTime();
        double tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
         inicio = System.nanoTime();
        onfactorial("", abcdefghij);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
        
        inicio = System.nanoTime();
        onfactorial("", abcdefghijklmnñ);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        
       /* inicio = System.nanoTime();
        onfactorial("", abcdefghijklmnñopqrst);
        fin = System.nanoTime();
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" nanosegundos");
        */
    }
    
    public void run(){
        System.out.println("Complejidad O(1)");
        opO1();
        
        System.out.println("\nComplejidad O(n)");
        opOn();
        System.out.println("\nComplejidad O(log n)");
        opOlogn();
        
        System.out.println("\nComplejidad O(n^2)");
        opOn2();
        System.out.println("\nComplejidad O(n log n)");
        opOnlogn();
        System.out.println("\nComplejidad O(a^n)");
        opOan();
        System.out.println("\nComplejidad 0(n!)");
        opOnfactorial();
    }
}
