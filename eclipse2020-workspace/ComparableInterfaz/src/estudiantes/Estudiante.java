
package estudiantes;

/**
*Clase Estudiante con los parametros de estudiante
* @author Jennifer Camacho y Julian Cardenas
* @since 16-05-2021
* @version 01
 */
public class Estudiante implements Comparable<Estudiante> {
    
    private String nombre;
    private int id,n1,n2,n3,nf;

    public Estudiante(String nombre, int id, int n1, int n2, int n3, int nf) {
        this.nombre = nombre;
        this.id = id;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nf = (n1+n2+n3)/3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getNf() {
        return nf;
    }
    
    @Override
    public String toString()
    {
        return "Nombre: "+nombre+", Actividad 1:"+n1+", Actividad 2: "+n2+", Actividad 3: "+n3+", Nota final: "+nf;
    } 
    
    
    @Override
    public int compareTo(Estudiante o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
    
    
}
