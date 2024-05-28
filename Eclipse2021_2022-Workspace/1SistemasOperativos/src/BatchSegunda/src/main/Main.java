package BatchSegunda.src.main;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {



    public static void main(String[] args) {

        Batch batch =new Batch();

        for (int i = 0; i <= 20; i++) {

            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(0);
            lista.add(0);
            lista.add(0);
            lista.add(0);

            Trabajo a = new Trabajo(i, false, lista);

            batch.batches(a);

        }

        for (int i = 0; i <= 20 ; i++) {

            batch.spooler();

        }

        for (int i = 0; i < 10; i++) {

            batch.procesador();

        }

        batch.getSalida().forEach(System.out::println);

    }

}
