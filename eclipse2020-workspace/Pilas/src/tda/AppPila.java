package tda;

public class AppPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TDAPila miPila= new TDAPila<>();
		
		miPila.apilar(100);
		miPila.apilar(30);
		miPila.apilar(77);
		
		System.out.println(miPila.tope());
		System.out.println(miPila.desapilar());
		System.out.println(miPila.tamanio());
		System.out.println(miPila.tope());
		System.out.println();
	
	}

}
