0package herencia;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fecha fecha = new Fecha(8, 11, 2020);
			
			Perecedero miProductoP = new Perecedero(123, "Leche", 2500, fecha);
			
			NoPerecedero miProductoN= new NoPerecedero(321, "Jabon", 1550, "REY");
			
			System.out.println(miProductoP);
			
			System.out.println(miProductoN);
			
			System.out.println("imprime los datos del arreglo");
			
			Producto[] arregloProductos= new Producto[4];
			arregloProductos[0]= miProductoP;
			arregloProductos[1]= miProductoN;
			
			Perecedero miProductoP1 = new Perecedero(100, "Pan", 500, fecha);
			arregloProductos[2] =miProductoP1;
			
			for (Producto producto : arregloProductos) {
				System.out.println(producto);
			}
			
	}

}
