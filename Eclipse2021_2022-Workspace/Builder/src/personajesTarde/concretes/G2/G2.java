package personajesTarde.concretes.G2;

import personajesTarde.abstracts.AbstractFactory;
import personajesTarde.abstracts.ICabeza;
import personajesTarde.abstracts.ICuerpo;
import personajesTarde.abstracts.IPies;

public class G2 extends AbstractFactory {

	@Override
	public void crearCabeza() {
		ICabeza c=new CabezaG2();
		c.seleccionarCabeza(getName());
		
		
	}

	@Override
	public void crearCuerpo() {
		ICuerpo c=new CuerpoG2();
		c.seleccionarCuerpo(getName());
	}

	@Override
	public void crearPies() {
		IPies p=new PiesG2();
		p.seleccionarPies(getName());
	}

}
