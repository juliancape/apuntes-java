package BatchPrimera.src.main;

import java.util.LinkedList;
import java.util.Queue;

public class Batch {

    Queue<Tarea> memoria = new LinkedList();

    void louder (Tarea tarea){

        memoria.add(tarea);
        System.out.println("Tarea "+ tarea.numero +" ejecutada: "+tarea.ejecutada);
        procesador(tarea);
        System.out.println("Tarea "+ tarea.numero +" ejecutada: "+tarea.ejecutada);
        memoria.poll();

    }

    void procesador(Tarea tarea){

        tarea.ejecutada = true;

    }

}