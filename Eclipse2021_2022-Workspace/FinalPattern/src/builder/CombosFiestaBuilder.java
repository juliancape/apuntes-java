package builder;

import pi�ataBuilder.Pi�ataSuperFun;
import velaBuilder.VelaVolcan;
import velaBuilder.VelaNumero;
import bebidaBuilder.Gaseosa;
import bebidaBuilder.Champa�a;
import pi�ataBuilder.Pi�ataSuperCandy;

public class CombosFiestaBuilder {
	
	public ComboFiesta comboFiesta1() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new Pi�ataSuperCandy());
		adicionales.agregarAdicional(new VelaVolcan());
		adicionales.agregarAdicional(new Gaseosa());
		return adicionales;
	}
	public ComboFiesta comboFiesta2() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new Pi�ataSuperFun());
		adicionales.agregarAdicional(new VelaNumero());
		adicionales.agregarAdicional(new Champa�a());
		return adicionales;
	}

	public ComboFiesta comboFiesta3() {
		ComboFiesta adicionales = new ComboFiesta();
		adicionales.agregarAdicional(new Pi�ataSuperFun());
		adicionales.agregarAdicional(new VelaVolcan());
		adicionales.agregarAdicional(new Champa�a());
		return adicionales;
	}
}
