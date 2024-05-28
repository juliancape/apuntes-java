package personaje;

import partesCuerpo.CabezaFam1;
import partesCuerpo.DorsoFam1;
import partesCuerpo.PiernasFam1;

public class FactoryFam1 implements BuilderPersonaje{


	@Override
	public AbsFactory crearPersonaje() {
		// TODO Auto-generated method stub
		CabezaFam1 c = new CabezaFam1();
		c.copyCabeza();
		DorsoFam1 d = new DorsoFam1();
		d.copyDorso();
		PiernasFam1 p = new PiernasFam1();
		p.copyPiernas();
		return null;
	}


}
