package singletonCompra;

public class SingletonTotalCompra {

	private static SingletonTotalCompra single_instane = null;

	public static String resumenCompra;

	private SingletonTotalCompra() {
		System.out.println(resumenCompra);
	}

	public static SingletonTotalCompra getInstance(String resumen) {
		if (single_instane == null) {
			resumenCompra = resumen;
			single_instane = new SingletonTotalCompra();

		}
		return single_instane;
	}

}
