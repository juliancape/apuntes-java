package builder;

import java.util.ArrayList;
import java.util.List;

import html.Generator;

public class Combo {
	private ArrayList<Item> items = new ArrayList<Item>();
	

	   public void addItem(Item item){
	      items.add(item);
	   }

	   public int getCost(){
	      int cost = 0;
	      
	      for (Item item : items) {
	         cost += item.price();
	      }		
	      return cost;
	   }

	   public String showItems(){
		  
		  String toStringItems = "";
	      for (Item item : items) {
	         toStringItems+= String.format("Item :  %s \n",item.name());
	         toStringItems+= String.format("Price :  %s.\n",Integer.toString(item.price()));
	      }
	     
	      return toStringItems;
	   }
	
	
}
