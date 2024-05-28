package reemplazar;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = "asm bool catch class const_cast delete dynamic_cast explicit export false friend inline mutable namespace new operator private protected public reinterpret_cast static_cast template this throw true try typeid typename using virtual wchar_t";
		String nueva="";
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
				nueva+="\"|\"";
			}else {
				nueva+=frase.charAt(i);
			}
		}
		
		System.out.print(nueva);
		
	}

}
