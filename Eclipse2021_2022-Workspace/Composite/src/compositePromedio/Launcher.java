package compositePromedio;

public class Launcher {
    public static void main(String[] args){
        Composite notasEstudiante1 = new  Composite();
        Composite notasEstudiante2 = new  Composite();
        Composite notasFacultad = new  Composite();
        
        Leaf nota1Estudiante1 = new Leaf(5);
        Leaf nota2Estudiante1 = new Leaf(4);
        Leaf nota3Estudiante1 = new Leaf(3);

        Leaf nota1Estudiante2 = new Leaf(3);
        Leaf nota2Estudiante2 = new Leaf(2);
        Leaf nota3Estudiante2 = new Leaf(4);
        
        notasEstudiante1.hijos.add(nota1Estudiante1);
        notasEstudiante1.hijos.add(nota2Estudiante1);
        notasEstudiante1.hijos.add(nota3Estudiante1);
        
        notasEstudiante2.hijos.add(nota1Estudiante2);
        notasEstudiante2.hijos.add(nota2Estudiante2);
        notasEstudiante2.hijos.add(nota3Estudiante2);
        
        notasFacultad.hijos.add(notasEstudiante1);
        notasFacultad.hijos.add(notasEstudiante2);
        
        System.out.println("Promedio estudiante1: "+ (notasEstudiante1.execute()/notasEstudiante1.hijos.size()));
        System.out.println("Promedio estudiante2: "+ (notasEstudiante2.execute()/notasEstudiante2.hijos.size()));
        
        //System.out.println("Promedio de la facultad: "+ notasFacultad.execute()/notasFacultad.hijos.size());
        
    }
}
