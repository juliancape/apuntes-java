package builder;

import java.util.ArrayList;
public class ComboFiesta {
	private ArrayList<Adicional> adicionales = new ArrayList<Adicional>();
	

	   public void agregarAdicional(Adicional adicional){
	      adicionales.add(adicional);
	   }

	   public int getPrecio(){
	      int precio = 0;
	      
	      for (Adicional adicional : adicionales) {
	         precio += adicional.precio();
	      }		
	      return precio;
	   }

	   public String mostrarAdicionales(){
		  
		  String stringAdicionales = "";
	      for (Adicional adicional : adicionales) {
	         stringAdicionales+= String.format("Adicional :  %s \n",adicional.nombre());
	         stringAdicionales+= String.format("Precio :  %s.\n",Integer.toString(adicional.precio()));
	      }
	     
	      return stringAdicionales;
	   }
	
	
}
