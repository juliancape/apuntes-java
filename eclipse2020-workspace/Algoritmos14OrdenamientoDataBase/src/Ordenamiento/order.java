/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class order {
	 private int[] vector;
	    private ArrayList<Integer> num = new ArrayList<>();
	    private ArrayList<Integer> numMerge = new ArrayList<>();
	    private ArrayList<Integer> numInsertion = new ArrayList<>();
	    private ArrayList<Integer> numCollections = new ArrayList<>();
	    private ArrayList<String> dataTxtMerge = new ArrayList<>();
	    private ArrayList<String> dataTxtInsertion = new ArrayList<>();
	    private ArrayList<String> dataTxtICollections = new ArrayList<>();
	    int cambioLinea = 0;
	    
	    /*
	     * Metodo para buscar y leer el archivo
	     */
	    public void leer(){
	        File archivo = null;
	        FileReader fr = null;
	        BufferedReader br = null;
	        try{
	            JFileChooser file = new JFileChooser();
	            file.showOpenDialog(file);
	            File open = file.getSelectedFile();
	            if(open!=null){
	                FileReader archivos=new FileReader(open);
	                BufferedReader leer =new BufferedReader(archivos);
	                String linea;
	                while((linea = leer.readLine()) != null){
	                    if(num.isEmpty()){
	                        String[] v = linea.split("");
	                        linea = "";
	                        for (int i = 3; i < v.length; i++) {
	                            linea += v[i];
	                        }
	                    }
	                    ArrayList<Integer>numbers = sep(linea);
	                    for (int i = 0; i < numbers.size(); i++) {
	                        num.add(numbers.get(i));
	                    }
	                }
	                leer.close();
	                open.getPath();
	            }
	        }catch(IOException ex){
	            JOptionPane.showMessageDialog(null,ex + "" +
	            "\nNo se ha encontrado el archivo",
	            "ERROR!", JOptionPane.WARNING_MESSAGE);
	        }
	    }
	    /*
	     * Metodo leer las ";" del archivo csv y separar los numeros
	     */
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
	    
	    //COLLECTION-------------------------
	    public void Collections(int vec[]){
	        List<Integer> list = new ArrayList<>();
	        for (int i=0; i < vec.length; i++){
	            list.add(vec[i]);
	        }
	        Collections.sort(list);
	        for (int i = 0; i < list.size(); i++) {
	            numCollections.add(list.get(i));
	        }
	    }
	    
	    /*
	     * Metodo para imrpimir los resultados del ordenamiento del merge, Insertion y Collections
	     */
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
	        
	        System.out.println("\n---------COLLECTIONS-----------------\n");
	        for (Integer a : numCollections) {
	            System.out.print(a + " ");
	            linea += a + " ";
	            cont++;
	            if(cont == cambioLinea){
	                cont = 0;
	                System.out.println();
	                
	                dataTxtICollections.add(linea);
	                linea = "";
	            }
	        }
	    }
	    
	   public int[] obtenerHora(){
	        LocalDateTime locaDate = LocalDateTime.now();
	        int hours  = locaDate.getHour();
	        int minutes = locaDate.getMinute();
	        int seconds = locaDate.getSecond();
	        int milisegundos = locaDate.getNano();
	        int[] time = new int[4];
	        time[0] = hours;
	        time[1] = minutes;
	        time[2] = seconds;
	        time[3] = milisegundos;
	        return time;
	    }
	    

	    
	    public void run(){
	    	int vectorInicio[]=new int [3];
	    	int vectorFinal[]=new int [3];
	    	String hora="";
	        leer();
	        //Merge sort
	        accionVector();
	        
	       
	        System.out.println("inicio: "+hora);
	        ordenacionMergeSort(vector);
	        confMerge(vector);
	       
	        
	        //Insertion sort
	        accionVector();
	        sort(vector);
	        confInsertion(vector);
	        
	        //Collections
	        accionVector();
	        Collections(vector);     
	        
	        //Impresion 
	        imprimir();
	        
	        //Generar txt
	        //generarTxt();
	    }
	}
