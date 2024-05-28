package personajesTarde.abstracts;

public class Builder {
	
	public AbstractFactory crearPersonajeBuilder(String name) {
		AbstractFactory personaje = new AbstractFactory() {
			
			@Override
			public void crearPies() {
				// TODO Auto-generated method stub
				crearPies();
			}
			
			@Override
			public void crearCuerpo() {
				// TODO Auto-generated method stub
				crearCuerpo();
			}
			
			@Override
			public void crearCabeza() {
				// TODO Auto-generated method stub
				crearCabeza();
			}
		};
		return personaje;
		
	}
	

}
