package BatchPrimera.src.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Tarea> listaTareasE = new ArrayList<>();
        ArrayList<Tarea> listaTareasS = new ArrayList<>();
        Batch batch = new Batch();

        for(int i = 0; i<=6; i++){

            Tarea a =new Tarea(i,false);

            listaTareasE.add(a);

        }

        listaTareasE.forEach(System.out::println);

        for(int i = 6; i>=0; i--){

            batch.louder(listaTareasE.get(i));
            listaTareasS.add(listaTareasE.get(i));
            listaTareasE.remove(i);

        }

        listaTareasS.forEach(System.out::println);

    }



}
