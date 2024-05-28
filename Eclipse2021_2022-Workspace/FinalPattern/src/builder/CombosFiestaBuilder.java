package builder;

import piñataBuilder.PiñataSuperFun;
import velaBuilder.VelaVolcan;
import velaBuilder.VelaNumero;
import bebidaBuilder.Gaseosa;
import bebidaBuilder.Champaña;
import piñataBuilder.PiñataSuperCandy;

public class CombosFiestaBuilder {
	
	public ComboFiesta comboFiesta1() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new PiñataSuperCandy());
		adicionales.agregarAdicional(new VelaVolcan());
		adicionales.agregarAdicional(new Gaseosa());
		return adicionales;
	}
	public ComboFiesta comboFiesta2() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new PiñataSuperFun());
		adicionales.agregarAdicional(new VelaNumero());
		adicionales.agregarAdicional(new Champaña());
		return adicionales;
	}

	public ComboFiesta comboFiesta3() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new PiñataSuperFun());
		adicionales.agregarAdicional(new VelaVolcan());
		adicionales.agregarAdicional(new Champaña());
		return adicionales;
	}
}
