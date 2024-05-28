package personaje;

import partesCuerpo.CabezaFam2;
import partesCuerpo.DorsoFam2;
import partesCuerpo.PiernasFam2;

public class FactoryFam2 implements BuilderPersonaje{

	
	@Override
	public AbsFactory crearPersonaje() {
		CabezaFam2 c = new CabezaFam2();
		c.copyCabeza();
		DorsoFam2 d = new DorsoFam2();
		d.copyDorso();
		PiernasFam2 p = new PiernasFam2();
		p.copyPiernas();
		return null;
		
	}


}
