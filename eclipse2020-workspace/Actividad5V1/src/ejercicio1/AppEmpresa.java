package ejercicio1;
/**
 * APP de la empresa
 * @author Julian Cardenas
 * @since 15-10-2020
 * @version 1.0
 *
 */
public class AppEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CARGAR FECHAS
		Fecha fecha1 = new Fecha(22, 10, 2010);
		Fecha fecha2 = new Fecha(10,7,2000);
		Fecha fecha3 = new Fecha(15	, 12, 2007);
		Fecha fecha4 = new Fecha(22, 2, 2019);
		//CARGAR EMPLEADOS FIJOS
		Fijo empleadoFijo1= new Fijo(1012, "Pedro", "Capo", fecha1, 1200000, 2.5);
		Fijo empleadoFijo2= new Fijo(1515, "Benito", "Marco", fecha2, 3000000, 20);
		System.out.println("Empleados Fijos");
		System.out.println(empleadoFijo1);
		System.out.println(empleadoFijo2);
		//CARGA EMPLEADOS A COMISION
		Comision empleadoComision1= new Comision(3333, "Juan", "Perez", fecha3, 300000, 44, 13);
		
		Comision empleadoComision2= new Comision(5555, "Rene", "Garcia", fecha4, 300000, 11, 1);
		System.out.println("Empleados Domiciliarios a Comision");
		System.out.println(empleadoComision1);
		System.out.println(empleadoComision2);
		
		
	}

}
