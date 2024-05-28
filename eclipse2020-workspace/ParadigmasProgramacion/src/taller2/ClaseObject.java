package taller2;
/**
 * Clase que registra objetos 
 * en los arreglos y los retorna a un un objeto 
 * @author julian Cardenas
 *@since 14-02-2021
 */
public class ClaseObject {

	private Object[] arrayList;
	private int i;
	
	public ClaseObject (int z) {
		this.arrayList=new Object[z];
		this.i=0;
	}
	
	public Object get (int i) {
		return arrayList[i];
		
	}
	
	public void add(Object obj) {
		this.arrayList[i] = obj;
		i++;
	}
	
}

