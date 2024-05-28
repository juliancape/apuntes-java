package observer;

public class MercadoLibreObserver extends Observer{

	public MercadoLibreObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("mercadolibre.com\n"
				+ "Updated product: "+subject.getSpecifications()+ "\n");
	}

}
