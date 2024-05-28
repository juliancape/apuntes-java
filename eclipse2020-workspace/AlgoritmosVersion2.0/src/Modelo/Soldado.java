package Modelo;

/**
 *
 * @author User
 */
public class Soldado {
    //No toda clase del modelo tiene referencia a la vista
    private int x;
    private int y;

    public Soldado(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}
