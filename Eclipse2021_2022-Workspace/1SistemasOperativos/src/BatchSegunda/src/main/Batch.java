package BatchSegunda.src.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Batch {

    ArrayList<Trabajo> conjuntoTrabajo = new ArrayList<>();
    ArrayList<Trabajo> salida = new ArrayList<>();
    Random random = new Random();
    Queue<Trabajo> spooler = new LinkedList();


    void batches(Trabajo trabajo){

        conjuntoTrabajo.add(trabajo);

    }

    void spool(Trabajo trabajo, Trabajo trabajo1){

        int i=0;
        int j=0;

        do {

            int o;

            if (trabajo.proceso.get(trabajo.proceso.size()-1)==1){

                o=2;

            }else if(trabajo1.proceso.get(trabajo1.proceso.size()-1)==1){

                o=1;

            }else{

                o = (int) (Math.random() * 2) + 1;

            }

            if(o == 1 && trabajo.proceso.get(trabajo.proceso.size()-1)!=1){

                trabajo.proceso.set(i,1);
                i++;

            }else if(o==2 && trabajo1.proceso.get(trabajo1.proceso.size()-1)!=1){

                trabajo1.proceso.set(j,1);
                j++;

            }

            if(trabajo.proceso.get(trabajo.proceso.size()-1)==1 && trabajo1.proceso.get(trabajo1.proceso.size()-1)==1){

                trabajo.ejecutada = true;
                trabajo1.ejecutada = true;

            }


            System.out.println("Proceso del trabajo "+ trabajo.numero+" es: "+ trabajo.proceso.toString());
            System.out.println("Proceso del trabajo "+ trabajo1.numero+" es: "+ trabajo1.proceso.toString());


        }while((trabajo.ejecutada==false) && (trabajo1.ejecutada==false));


    }

    void spooler(){

        spooler.add(conjuntoTrabajo.remove(0));

    }

    void procesador(){

        Trabajo uno = spooler.poll();
        Trabajo dos = spooler.poll();

        spool(uno,dos);

        salida.add(uno);
        salida.add(dos);

    }

    public ArrayList<Trabajo> getConjuntoTrabajo() {
        return conjuntoTrabajo;
    }

    public void setConjuntoTrabajo(ArrayList<Trabajo> conjuntoTrabajo) {
        this.conjuntoTrabajo = conjuntoTrabajo;
    }

    public ArrayList<Trabajo> getSalida() {
        return salida;
    }

    public void setSalida(ArrayList<Trabajo> salida) {
        this.salida = salida;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Queue<Trabajo> getSpooler() {
        return spooler;
    }

    public void setSpooler(Queue<Trabajo> spooler) {
        this.spooler = spooler;
    }
}
