package ejercicio1;


/**
 * APP de la empresa
 * @author Julian Cardenas
 * @since 17-10-2020
 * @version 2.0
 *
 */

	
public class AppEmpresa {

	
	private static int nAnios;
	private static double salarioPagar;
	private static int nAños;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int anioActual=2020;
		
	
		//CARGAR FECHAS
		Fecha fecha1 = new Fecha(22, 10, 2010);
		Fecha fecha2 = new Fecha(10,7,2000);
		Fecha fecha3 = new Fecha(15	, 12, 2007);
		Fecha fecha4 = new Fecha(22, 2, 2019);    
		
		//CARGAR EMPLEADOS FIJOS
		Fijo empleadoFijo1= new Fijo(1111, "PEPE", "Velez", fecha1, salarioPagar, 700000, nAnios);
		Fijo empleadoFijo2= new Fijo(2222, "Sech"	, "Bacua", fecha2, salarioPagar, 6000000, nAnios);
		System.out.println("Empleados Fijos");
		System.out.println("Empleado Salario Fijo: "+empleadoFijo1);
		System.out.println("Empleado Salario Fijo: "+empleadoFijo2);
		
		//CARGA EMPLEADOS A COMISION
		Comision empleadoComision1 = new Comision(3333, "Juan", "Torres", fecha3, salarioPagar, 33, nAños);
		Comision empleadoComision2= new Comision(4444, "Maik", "Vercety", fecha4, salarioPagar, 22, nAños);
		System.out.println("Empleados Domiciliarios a Comision");
		System.out.println("Empleados Domiciliario "+empleadoComision1);
		System.out.println("Empleados Domiciliario "+empleadoComision2);
		
		
	}

}
