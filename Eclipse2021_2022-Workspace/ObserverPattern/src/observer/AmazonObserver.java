package observer;

public class AmazonObserver extends Observer{

	public AmazonObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("amazon.com\n"
				+ "Updated product: "+subject.getSpecifications()+ "\n");
				
	}

}
