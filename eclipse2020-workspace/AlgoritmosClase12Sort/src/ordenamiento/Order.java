package ordenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {
	private int[] vector;
    private ArrayList<Integer> num = new ArrayList<>();
    private ArrayList<Integer> numMerge= new ArrayList<>();
    private ArrayList<Integer> numInsertion= new ArrayList<>();
    private ArrayList<String> dataTxtMerge= new ArrayList<>();
    private ArrayList<String> dataTxtInsertion= new ArrayList<>();
    private ArrayList<String> texto = new ArrayList<>();
    int cambioLinea = 0;
    public void leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
        	archivo = new File ("C:\\Users\\ASUS FX 505DY R5\\Desktop\\"
        			+ "Cuarto Semestre\\Ordenamiento\\datos1.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null){
                texto.add(linea);
                ArrayList<Integer>numbers = sep(linea);
                for (int i = 0; i < numbers.size(); i++) {
                    num.add(numbers.get(i));
                }
                
            }
            // System.out.println(linea);
            
            

         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    }
    
    public ArrayList<Integer> sep(String linea){
        String[] n = linea.split(";");
        cambioLinea = n.length;
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            numeros.add(Integer.parseInt(n[i]));
        }
        return numeros;
    }
    
    public void accionVector() {
        vector = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            vector[i]=num.get(i);
        }
    }
    
    //MERGE SORT----------
    public void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
            int mitad= vec.length/2;
            int izq[]=Arrays.copyOfRange(vec, 0, mitad);
            int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
            ordenacionMergeSort(izq);
            ordenacionMergeSort(der);
            combinarVector(vec, izq, der);
            
    }
    public void combinarVector(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
            if(i>=izq.length){
                v[k]=der[j];
                j++;
                continue;
            }
            if(j>=der.length){
                v[k]=izq[i];
                i++;
                continue;
            }
            if(izq[i]<der[j]){
                v[k]=izq[i];
                i++;
            }else{
                v[k]=der[j];
                j++;
            }
        }
    }
    public void confMerge(int vec[]){
        for(int i=0;i<vec.length;i++){
            numMerge.add(vec[i]);
        }
    }

    
    //INSERTION SORT-------------
    public void sort(int vec[]){
        int n = vec.length;
        for (int i = 1; i < n; ++i) {
            int key = vec[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
            while (j >= 0 && vec[j] > key) {
                vec[j + 1] = vec[j];
                j = j - 1;
            }
            vec[j + 1] = key;
        }
    }
    public void confInsertion(int vec[]){
        for (int i = 0; i < vec.length; ++i){
            numInsertion.add(vec[i]);
        }
    }
    
    
    public void imprimir(){
        int cont = 0;
        String linea = "";
        for (Integer a : num) {
            System.out.print(a + " ");
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
            }
        }
        System.out.println("\n----------MERGE-------------\n");
        for (Integer a : numMerge) {
            System.out.print(a + " ");
            linea += a + " ";
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
                
                dataTxtMerge.add(linea);
                linea = "";
            }
        }
        System.out.println("\n---------INSERTION-----------------\n");
        for (Integer a : numInsertion) {
            System.out.print(a + " ");
            linea += a + " ";
            cont++;
            if(cont == cambioLinea){
                cont = 0;
                System.out.println();
                
                dataTxtInsertion.add(linea);
                linea = "";
            }
        }
    }
    
    public void generarTxt(){
        try{
            //Crear archivo txt ordenado por Merge
            String ruta1 = "C:\\Users\\ASUS FX 505DY R5\\\\Desktop"  
            		        			+ "\\Cuarto Semestre\\Ordenamiento\\datos1mergesort.txt";
            File archivo1 = new File(ruta1);
            BufferedWriter bw1;
            if(archivo1.exists()) {
                bw1 = new BufferedWriter(new FileWriter(archivo1));
                //bw1.write("El fichero de texto ya estaba creado.");
                System.out.println("El fichero de texto de Merge ya estaba creado.");
            }else {
                bw1 = new BufferedWriter(new FileWriter(archivo1));
                bw1.write("");
                for (int i = 0; i < dataTxtMerge.size(); i++) {
                    bw1.write(dataTxtMerge.get(i));
                    bw1.write("\n");
                }
                System.out.println("Se creo el fichero de texto de Merge.");
            }
            bw1.close();
            
            //Crear archivo txt ordenado por Insertion
            String ruta2 = "C:\\Users\\ASUS FX 505DY R5\\Desktop" 
            		+ "\\Cuarto Semestre\\Ordenamiento\\datos1mergesort.txt";
            File archivo2 = new File(ruta2);
            BufferedWriter bw2;
            if(archivo2.exists()) {
                bw2 = new BufferedWriter(new FileWriter(archivo2));
                //bw2.write("El fichero de texto ya estaba creado.");
                System.out.println("El fichero de texto de Insertion ya estaba creado.");
            }else {
                bw2 = new BufferedWriter(new FileWriter(archivo2));
                bw2.write("");
                for (int i = 0; i < dataTxtInsertion.size(); i++) {
                    bw2.write(dataTxtInsertion.get(i));
                    bw2.write("\n");
                }
                System.out.println("Se creo el fichero de texto de Insertion.");
            }
            bw2.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void run(){
        leer();
        //Merge sort
        accionVector();
        ordenacionMergeSort(vector);
        confMerge(vector);
        
        //Insertion sort
        accionVector();
        sort(vector);
        confInsertion(vector);
        
        //Impresion 
        imprimir();
        
        //Generar txt
        generarTxt();
    }
}
