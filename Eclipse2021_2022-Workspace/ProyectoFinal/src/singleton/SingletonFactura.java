package singleton;

public class SingletonFactura {
	
	private static SingletonFactura singleton = null;
	
	public static String factura;
	
	
	private SingletonFactura() {
		System.out.println(factura);
	}
	
	
	public static SingletonFactura getInstance(String resumen) {
		if (singleton == null) {
			factura = resumen;
			singleton = new SingletonFactura();
			
		}
		return singleton;
	}

}
