package poo;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class AppTienda {

	
	public static void main(String[] args) {
		
		Scanner leerdato= new Scanner (System.in);
		
		System.out.println("Entrar codigo de la categoria");
		int categoria = leerdato.nextInt();
		System.out.println ("Entrar el  nombre de la categoria");
		String nombre = leerdato.next();
		
		Categoria miCategoria = new Categoria(categoria, nombre);
		
		System.out.println("Digite codigo del producto");
		int codigo= leerdato.nextInt();
		System.out.println("Digite nombre del producto");
		nombre =leerdato.next();
		System.out.println("Digite marca");
		String marca = leerdato.next();
		System.out.println("Digite el precio del producto");
		long precio = leerdato.nextLong();
		System.out.println("Digite el descuento ");
		int descuento = leerdato.nextInt();
		
		Producto producto1 = new Producto(codigo, nombre, marca,precio,descuento,miCategoria);
		
		System.out.println("Categoria" +producto1.getCateogoria().getCodigoCategoria());
		System.out.println("Nombre del producto " +producto1.getCodigoProducto());
		System.out.println("Marca del producto" +producto1.getMarca());
		System.out.println("Precio base " +producto1.getPrecio());
		System.out.println("Porcentaje descuento " +producto1.getDescuento());
		
		long valorDescuento = producto1.getPrecio() * (producto1.getDescuento()/100);
		
				
		long precioFinal = producto1.getPrecio() - valorDescuento;
		
		System.out.println("Precio final = "+precioFinal);
		
	}
	
	
}
