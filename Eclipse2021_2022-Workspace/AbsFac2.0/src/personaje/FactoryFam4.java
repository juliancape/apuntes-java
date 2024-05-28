package personaje;

import partesCuerpo.CabezaFam4;
import partesCuerpo.DorsoFam4;
import partesCuerpo.PiernasFam4;

public class FactoryFam4 implements IAbsFactoryPersonaje{
	
	@Override
	public IPersonaje crearPersonaje() {
		CabezaFam4 c = new CabezaFam4();
		c.copyCabeza();
		DorsoFam4 d = new DorsoFam4();
		d.copyDorso();
		PiernasFam4 p = new PiernasFam4();
		p.copyPiernas();
		return null;
		
	}


}
