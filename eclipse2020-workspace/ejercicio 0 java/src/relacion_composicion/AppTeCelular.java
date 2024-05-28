package relacion_composicion;

public class AppTeCelular {

	public static void main(String[] aargs) {
		
		TeCelular miCelular = new TeCelular("LG","FG555",20);
		//otra forma de hacerlo Llamar metodo crearAntena y enviarmos la instancia
		// TeCelular miCelular = new TeCelular("LG","FG555");
		// miCelular.crearAntena(20);
		System.out.println("Primer celular");
		System.out.println("marca " +miCelular.getMarca());
		System.out.println("Modelo " + miCelular.getModelo());
		System.out.println("poteencia " + miCelular.getAntena().getPotencia());
		
		TeCelular miCelular2 = new TeCelular ("Huawei","TR345",15);
		System.out.println("Segundo celular");
		System.out.println("marca " +miCelular2.getMarca());
		System.out.println("Modelo " + miCelular2.getModelo());
		System.out.println("poteencia " + miCelular2.getAntena().getPotencia());
		
	}
	
}
