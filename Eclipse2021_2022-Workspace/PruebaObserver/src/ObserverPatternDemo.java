
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new AlibabaObserver(subject);

      System.out.println("First state change: 15");	
      subject.setSpecifications("Holaaa");
   }
}
