package modelo;

/**
 *
 * @author User
 */
public class Punto {
    //No toda clase del modelo tiene referencia a la vista
    private int x;
    private int y;

    public Punto(int x, int y) {
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
