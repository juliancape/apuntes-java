package personaje;

import partesCuerpo.CabezaFam3;
import partesCuerpo.DorsoFam3;
import partesCuerpo.PiernasFam3;

public class FactoryFam3 implements IAbsFactoryPersonaje{

	
	@Override
	public IPersonaje crearPersonaje() {
		CabezaFam3 c = new CabezaFam3();
		c.copyCabeza();
		DorsoFam3 d = new DorsoFam3();
		d.copyDorso();
		PiernasFam3 p = new PiernasFam3();
		p.copyPiernas();
		return null;
		
	}


}
