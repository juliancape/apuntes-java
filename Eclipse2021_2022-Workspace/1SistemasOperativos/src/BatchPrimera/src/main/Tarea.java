package BatchPrimera.src.main;

public class Tarea {

    int numero;
    boolean ejecutada;

    public Tarea(int numero, boolean ejecutada) {
        this.numero = numero;
        this.ejecutada = ejecutada;
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

    @Override
    public String toString() {
        return "Tarea{" +
                "numero=" + numero +
                ", ejecutada=" + ejecutada +
                '}';
    }
}