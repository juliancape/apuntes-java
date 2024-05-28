package builder;

import html.Generator;
import keyBoardBuilder.KeyboardMechanical;
import keyBoardBuilder.KeyboardMembrane;
import mouseBuilder.MouseGamer;
import mouseBuilder.MouseWireless;
import screenBuilder.Screen4k;
import screenBuilder.Screen8k;

public class CombosBuilder {
	
	public Combo prepareCombo1() {
		Combo combo = new Combo();
		combo.addItem(new KeyboardMembrane());
		combo.addItem(new MouseGamer());
		combo.addItem(new Screen4k());
		return combo;
	}
	public Combo prepareCombo2() {
		Combo combo = new Combo();
		combo.addItem(new KeyboardMechanical());
		combo.addItem(new MouseWireless());
		combo.addItem(new Screen8k());
		return combo;
	}

}
