/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import vista.Ventana;

/**
 *
 * @author Daniel Velasquez, Julian Cardenas
 */
public class operacion {
    private Ventana ventana = null;
    public operacion(Ventana v){
        this.ventana=v;
    }
    ArrayList<Integer> indices = new ArrayList<>();
    ArrayList<String> relacion = new ArrayList<>();
    String key = "FIUMBAAAAAAAAAAAAAAAAAAA";
    String StringOriginal = "";
    String StringEncriptado = "";
    
    String path = "";
    
    public String abrirArchivo() {
        String aux = "";
        String texto = "";
        try{
            //metodo para cargar la ventana
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            //abrir el archivo seleccionado
            File open = file.getSelectedFile();

            //recorremos el archivo, lo leemos para plasmarlo en el area de texto
            if(open!=null){
                //se muestra la direccion del archivo
                ventana.updateLabelPath(open.getPath());
                FileReader archivos=new FileReader(open);
                BufferedReader leer =new BufferedReader(archivos);
                while((aux=leer.readLine()) != null){
                    texto += aux+ "\n";
                }
                leer.close();
                path = open.getPath();
                relacion.add(key);
                relacion.add(open.getPath());
                ventana.getPanel().getImg().add(open.getPath());
                ventana.getPanel().repaint();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex + "" +
            "\nNo se ha encontrado el archivo",
            "ERROR!", JOptionPane.WARNING_MESSAGE);
        }
        StringOriginal = texto;
        return texto;
    }

    public void verificar(){
        String vef = "";
        if(ventana.getPanel().getHash().size() == 2){
            if(ventana.getPanel().getHash().get(0).equals(ventana.getPanel().getHash().get(1))){
                vef = "Modificacion exitosa";
                ventana.getPanel().getImg().set(1, path);
                ventana.getPanel().repaint();
            }else{
                vef = "Los archivos no son iguales";
            }
        }
        ventana.updateLabelVef(vef);
    }
    
    ArrayList<String> arrayOriginal = new ArrayList<>();
    ArrayList<String> arrayEncriptado = new ArrayList<>();
    public void encriptar() {
        String aux;
        int n = (int)((Math.random()*(5-1))+1);
        String index = "";
        for (int i = 0; i < n; i++) {
            indices.add((int)((Math.random()*((StringOriginal.length()-10)-1))+1));
            if(i == n-1){
                index += indices.get(i)+1 +"";
            }else{
                index += indices.get(i)+1 +", ";
            }
        }
        
        arrayEncriptado.add("[ " + index + " ]");
        for (int i = 0; i < StringOriginal.length(); i++) {
            aux = String.valueOf(StringOriginal.charAt(i));
            arrayOriginal.add(aux);
            int ind = i;
            if(!indices.stream().filter(p->p.equals(ind)).findAny().isPresent()){
                arrayEncriptado.add(aux);
            }else{
                arrayEncriptado.add(key);
                arrayEncriptado.add(aux);
            }
            
        }
        
        //Se llena el StringEncriptado con los datos del arrayEncriptado
        for (int i = 0; i < arrayEncriptado.size(); i++) {
            StringEncriptado += arrayEncriptado.get(i);
        }
    }
    
    public String hash(String txt) {
        //System.out.println("\n"+"HASH ARCHIVOS");
        String toReturnH = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(txt.getBytes("utf8"));
            toReturnH = String.format("%064x", new BigInteger(1, digest.digest()));
            System.out.println(" -> HASH ARCHIVO: " + toReturnH);
            
            return toReturnH;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return toReturnH;
    }
    
    String pathInfo = "";
    public void guardarArchivo() {
        try{
            JOptionPane.showMessageDialog(null,
                     "Guardar txt de informacion del archivo original",
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(file);
            File guarda =file.getSelectedFile();
            if(guarda !=null){
                //guardamos el archivo y le damos el formato directamente
                FileWriter  save = new FileWriter(guarda+".txt");
                save.write("");
                for (int i = 0; i < relacion.size(); i++) {
                    save.write(relacion.get(i));
                    save.write("\n");
                }
                pathInfo = guarda.getPath();
                save.close();
                JOptionPane.showMessageDialog(null,
                     "El archivo se ha guardado Exitosamente",
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,
                "Su archivo no se ha guardado",
                  "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void consultarDataOriginal(){
        ArrayList<String> data = new ArrayList<>();
        try{
            //metodo para cargar la ventana
            File archivo = new File(pathInfo + ".txt");
            if(archivo!=null){
                FileReader fr = new FileReader (archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    data.add(linea);
                }
                br.close();
                JOptionPane.showMessageDialog(null,
                     "Key:                    " + data.get(0) + "\n" + "Path:                  " + data.get(1) + "\n" + "Hash original:  " + data.get(2),
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex + "" +
            "\nNo se ha encontrado el archivo",
            "ERROR!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void saveIE(String estado, String aux){
        try{
            if(estado.equals("decrypt")){
                JOptionPane.showMessageDialog(null,
                     "Guardar imagen desencriptada",
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,
                     "Guardar imagen encriptada",
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            }
            
            JFileChooser file=new JFileChooser();
            file.showSaveDialog(file);
            File newFile =file.getSelectedFile();
            if(newFile !=null){
                //guardamos el archivo y le damos el formato directamente
                FileWriter  save = new FileWriter(newFile+".jpeg");
                save.write("");
                if(aux == null){
                    for (int i = 0; i < arrayEncriptado.size(); i++) {
                        if(i!=arrayEncriptado.size()-1){
                            save.write(arrayEncriptado.get(i));
                        }
                    }
                }else{
                    for (int i = 0; i < aux.length(); i++) {
                        if(i!=aux.length()-1){
                            save.write(String.valueOf(aux.charAt(i)));
                        }
                    }
                    if(estado.equals("decrypt")){
                        ventana.getPanel().getImg().add(newFile.getPath());
                        ventana.getPanel().repaint();
                    }
                }
                save.close();
                JOptionPane.showMessageDialog(null,
                     "La imagen se ha guardado Exitosamente",
                         "Información",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void openImgEncript(){
        String aux = "";
        String textoImgEncript = "";
        try{
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(file);
            File open = file.getSelectedFile();

            if(open!=null){
                FileReader archivos=new FileReader(open);
                BufferedReader leer =new BufferedReader(archivos);
                while((aux=leer.readLine()) != null){
                    textoImgEncript += aux+ "\n";
                }
                textoImgEncript = StringEncriptado;
                desencriptar(modString(textoImgEncript));
                leer.close();
            }
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,ex + "" +
            "\nNo se ha encontrado el archivo",
            "ERROR!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ArrayList<String> modString(String txt){
        int cont = 0;
        ArrayList<String> array = new ArrayList<>();
        String ini = "";
        for (int i = 0; i < txt.length(); i++) {
            if(cont == 0){
                ini += String.valueOf(txt.charAt(i));
                if(String.valueOf(txt.charAt(i)).equals("]")){
                   cont++;
                   array.add(ini);
                }
            }
            else if(String.valueOf(txt.charAt(i)).equals("F")){
                String[] k = key.split("");
                String in = "F";
                int hh = i;
                boolean findKey = false;
                for (int j = 1; j < k.length; j++) {
                    if(String.valueOf(txt.charAt(hh+1)).equals(k[j])){
                        in += String.valueOf(txt.charAt(hh+1));
                        hh++;
                    }
                }
                if(in.equals(key)){
                    i = hh;
                    array.add(in);
                    findKey = true;
                }
                if(!findKey){
                    array.add(String.valueOf(txt.charAt(i)));
                }
            }else{
                array.add(String.valueOf(txt.charAt(i)));
            }
        }
        return array;
    }
    
    public void desencriptar(ArrayList<String> txt) {
        Collections.sort(indices);
        for (int i = 0; i < indices.size(); i++) {
            System.out.print("  BORRADO: "+txt.get(indices.get(i)+1));
            int index = indices.get(i)+1;
            System.out.print(", index: " + index + "\n");
            txt.remove(index);
        }
        txt.remove(0);
        String aux="";
        for (int i = 0; i < txt.size(); i++) {
            aux+=txt.get(i);
        }
        saveIE("decrypt",aux);
        ventana.getPanel().getHash().set(1, hash(aux));
        ventana.getPanel().repaint();
    }
    
    
    public void procesoOriginal(){
        System.out.println("ARCHIVO ORIGINAL");
        abrirArchivo();
        ventana.getPanel().getHash().add(hash(StringOriginal));
        relacion.add(hash(StringOriginal));
        ventana.getPanel().repaint();
    }
    
    public void procesoEncrypt(){
        System.out.println("\nARCHIVO ENCRIPTADO");
        encriptar();
        guardarArchivo();
        ventana.getPanel().getHash().add(hash(StringEncriptado));
        saveIE("encrypt", null);
        ventana.getPanel().repaint();
    }
    
    public void procesoDecrypt(){
        System.out.println("\nARCHIVO DESENCRIPTADO");
        openImgEncript();
        //desencriptar();
        //saveIE("decrypt");
    }
    
    
}
