package observer;
import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	   private String specifications;

	   public String getSpecifications() {
	      return specifications;
	   }

	   public void setSpecifications(String specifications) {
	      this.specifications = specifications;
	      notifyAllObservers();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObservers(){
	      for (Observer observer : observers) {
	         observer.update();
	      }
	   } 	
}
