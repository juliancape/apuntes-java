package BatchSegunda.src.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Trabajo {

    int numero;
    boolean ejecutada;
    ArrayList<Integer> proceso = new ArrayList<>();

    public Trabajo(int numero, boolean ejecutada, ArrayList<Integer> proceso) {
        this.numero = numero;
        this.ejecutada = ejecutada;
        this.proceso = proceso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEjecutada() {
        return ejecutada;
    }

    public void setEjecutada(boolean ejecutada) {
        this.ejecutada = ejecutada;
    }

    public ArrayList<Integer> getProceso() {
        return proceso;
    }

    public void setProceso(ArrayList<Integer> proceso) {
        this.proceso = proceso;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "numero=" + numero +
                ", ejecutada=" + ejecutada +
                ", proceso=" + proceso +
                '}';
    }
}
