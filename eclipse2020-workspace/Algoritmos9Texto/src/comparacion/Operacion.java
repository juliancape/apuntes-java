/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacion;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *Lectura y 
 * @author Julian Cardenas y Daniel Velasquez
 * @since 09-2021
 */
public class Operacion {
    private ArrayList<String> texto1 = new ArrayList<>();
    private ArrayList<String> texto2 = new ArrayList<>();
    private Map<String,String> codAcNucleico = new HashMap<>();
    private Map<String,String> codAminoacido = new HashMap<>();
    private int leerPor=0;
    
    //C:\Users\User\Downloads\sequence.fasta
    public void leer(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        if (leerPor==0) {
            try {
                   // Apertura del fichero y creacion de BufferedReader para poder
                   // hacer una lectura comoda (disponer del metodo readLine()).
                   archivo = new File ("C:\\\\Users\\\\ASUS FX 505DY R5\\\\Desktop\\\\Cuarto Semestre\\\\sequences.fasta");
                   fr = new FileReader (archivo);
                   br = new BufferedReader(fr);

                   // Lectura del fichero
                   String linea;
                   while((linea=br.readLine())!=null) // System.out.println(linea);
                   texto1.add(linea);

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

            leerPor++;
            leer();
        }else {
            try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               archivo = new File ("C:\\\\Users\\\\ASUS FX 505DY R5\\\\Desktop\\\\Cuarto Semestre\\\\sequences2.fasta");
               fr = new FileReader (archivo);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String linea;
               while((linea=br.readLine())!=null) // System.out.println(linea);
               texto2.add(linea);

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
    }
    
    public void codigosBio(){
        codBio();
        Map<String,String> biosANText1 = new HashMap<>();
        Map<String,String> biosAText1 = new HashMap<>();
        Map<String,String> biosANText2 = new HashMap<>();
        Map<String,String> biosAText2 = new HashMap<>();
        ArrayList<String> txt1 = new ArrayList<>();
        ArrayList<String> txt2 = new ArrayList<>();
        
        for (int i = 1; i < texto1.size(); i++) {
            if(!texto2.get(i).startsWith(">")){
                String[] s = texto1.get(i).split("");
                for (int j = 0; j < s.length; j++) {
                    String word = s[j];
                    txt1.add(word);
                    if(codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                        if(!biosANText1.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                            biosANText1.put(codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getKey(),
                                    codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getValue());

                        }
                    }
                    if(codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                        if(!biosAText1.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                            biosAText1.put(codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getKey(),
                                    codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getValue());

                        }
                    }
                }
            }
        }
        
        for (int i = 1; i < texto2.size(); i++) {
            if(!texto2.get(i).startsWith(">")){
                String[] s = texto2.get(i).split("");
                for (int j = 0; j < s.length; j++) {
                    String word = s[j];
                    txt2.add(word);
                    if(codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                        if(!biosANText2.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                            biosANText2.put(codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getKey(),
                                    codAcNucleico.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getValue());

                        }
                    }
                    if(codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                        if(!biosAText2.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().isPresent()){
                            biosAText2.put(codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getKey(),
                                    codAminoacido.entrySet().stream().filter(e->e.getKey().equals(word)).findAny().get().getValue());

                        }
                    }
                }
            }
        }
        
        System.out.println("-----------------------------------------------------------\n"
                + "-----------------------------------------------------------");
        System.out.println("Total data texto 1 " + txt1.size());
        System.out.println("Acidos nucleicos texto 1");
        for (Map.Entry<String, String> entry : biosANText1.entrySet()) {
            String b = entry.getKey();
            float count = (float)txt1.stream().filter(p->p.equals(b)).count();
            float por = (count*100)/txt1.size();
            System.out.println("* " + entry + " hay " + count + ", " + por + " %");
        }
        //biosANText1.entrySet().stream().forEach(System.out::println);
        System.out.println("Aminoacidos texto 1");
        for (Map.Entry<String, String> entry : biosAText1.entrySet()) {
            System.out.println("* " + entry);
        }
        //biosAText1.entrySet().stream().forEach(System.out::println);
        System.out.println("\nTotal data texto 2 " + txt2.size());
        System.out.println("Acidos nucleicos texto 2");
        //biosANText2.entrySet().stream().forEach(System.out::println);
        for (Map.Entry<String, String> entry : biosANText2.entrySet()) {
            String b = entry.getKey();
            float count = (float)txt2.stream().filter(p->p.equals(b)).count();
            float por = (count*100)/txt2.size();
            //int count = (int)txt2.stream().filter(p->p.equals(b)).count();
            System.out.println("* " + entry + " hay " + count + ", " + por + " %");
        }
        System.out.println("Aminoacidos texto 2");
        for (Map.Entry<String, String> entry : biosAText2.entrySet()) {
            System.out.println("* " + entry);
        }
        //biosAText2.entrySet().stream().forEach(System.out::println);
        nivelSim(txt1, txt2);
    }
    
    public void nivelSim(ArrayList<String> txt1, ArrayList<String> txt2){
        int tam = 0;
        float sum = 0;
        if(txt1.size()>txt2.size()){
            tam = txt2.size();
        }else{
            tam = txt1.size();
        }
        for (int i = 0; i < tam; i++) {
            if(txt1.get(i).equals(txt2.get(i))){
                sum++;
            }
        }
        float por = (sum*100)/tam;
        System.out.println("\nDe " + tam + " data analizada, " + (int)sum + " son equivalentes: " + por + "%");
    }
    
    public void codBio(){
        //Map<String,String> codAcNucleico = new HashMap<>();
        codAcNucleico.put("A", "Adenosina");
        codAcNucleico.put("C", "Citosina");
        codAcNucleico.put("G", "Guanina");
        codAcNucleico.put("T", "Timina");
        codAcNucleico.put("U", "Uracilo");
        codAcNucleico.put("R", "Purina: G A");
        codAcNucleico.put("Y", "Pirimidina: T C");
        codAcNucleico.put("K", "Cetona: G T");
        codAcNucleico.put("M", "Grupo Amino: A C");
        codAcNucleico.put("S", "Interacción fuerte: G C");
        codAcNucleico.put("W", "Interacción debil: A T");
        codAcNucleico.put("N", "Cualquiera: A G C T");
        codAcNucleico.put("X", "Mascara");
        
        //Map<String,String> codAminoacido = new HashMap<>();
        codAminoacido.put("A", "Alanina");
        codAminoacido.put("B", "Asparagina");
        codAminoacido.put("C", "Cisteina");
        codAminoacido.put("D", "Acido aspartico");
        codAminoacido.put("E", "Acido glutamico");
        codAminoacido.put("F", "Fenilalanina");
        codAminoacido.put("G", "Glicina");
        codAminoacido.put("H", "Histidina");
        codAminoacido.put("I", "Isoleucina");
        codAminoacido.put("K", "Lisina");
        codAminoacido.put("L", "Leucina");
        codAminoacido.put("M", "Metionima");
        codAminoacido.put("N", "Asparagina");
        codAminoacido.put("O", "Pirrolisina");
        codAminoacido.put("P", "Prolina");
        codAminoacido.put("Q", "Glutamina");
        codAminoacido.put("R", "Arginina");
        codAminoacido.put("S", "Serina");
        codAminoacido.put("T", "Treonina");
        codAminoacido.put("U", "Selenocisteina");
        codAminoacido.put("V", "Valina");
        codAminoacido.put("W", "Triptofano");
        codAminoacido.put("Y", "Tirosina");
        codAminoacido.put("Z", "Glutamina");
        codAminoacido.put("X", "Cualquiera");
    }
    
    public void imprimir(){
        for (String a : texto1) {
            System.out.println(a + "         largo: " + a.length()); 
        }
        System.out.println("-----------------------------------------------------------\n"
                + "-----------------------------------------------------------");
        for (String a : texto2) {
            System.out.println(a + "         largo: " + a.length()); 
        }
    }
    
    public void run(){
        leer();
        imprimir();
        codigosBio();
    }
    
}
