import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class lel {

	

        public static void main(String[] args) {
        	 
        	 Queue<Integer> cola=new LinkedList();

             cola.offer(3);

             cola.add(14);

             cola.offer(12);

             cola.add(7);

             cola.offer(10);

             System.out.println("Cola llena: " + cola);

            

           while(cola.remove()!=null){

                 System.out.println(cola.peek());

             }

            while(cola.poll()!=null){

                 System.out.println(cola.peek());

             }

            }
}

