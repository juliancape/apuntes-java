package personaje;

import partesCuerpo.CabezaFam5;
import partesCuerpo.DorsoFam5;
import partesCuerpo.PiernasFam5;

public class FactoryFam5 implements IAbsFactoryPersonaje{

	
	
	@Override
	public IPersonaje crearPersonaje() {
		CabezaFam5 c = new CabezaFam5();
		c.copyCabeza();
		DorsoFam5 d = new DorsoFam5();
		d.copyDorso();
		PiernasFam5 p = new PiernasFam5();
		p.copyPiernas();
		return null;
		
	}

}
