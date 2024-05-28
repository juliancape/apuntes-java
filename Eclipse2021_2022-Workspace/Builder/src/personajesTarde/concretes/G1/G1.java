package personajesTarde.concretes.G1;

import personajesTarde.abstracts.AbstractFactory;
import personajesTarde.abstracts.ICabeza;
import personajesTarde.abstracts.ICuerpo;
import personajesTarde.abstracts.IPies;

public class G1 extends AbstractFactory {

	@Override
	public void crearCabeza() {
		ICabeza c=new CabezaG1();
		c.seleccionarCabeza(getName());
		
		
	}

	@Override
	public void crearCuerpo() {
		ICuerpo c=new CuerpoG1();
		c.seleccionarCuerpo(getName());
	}

	@Override
	public void crearPies() {
		IPies p=new PiesG1();
		p.seleccionarPies(getName());
	}

}
