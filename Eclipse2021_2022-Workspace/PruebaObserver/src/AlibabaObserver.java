
public class AlibabaObserver extends Observer{

   public AlibabaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + subject.getSpecifications() ); 
   }
}