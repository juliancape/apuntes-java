package appBuses;

public class Bus implements Comparable<Bus>{
    private String conductor;
private int numero, id,lun,mar,mie,jue,vie,sab,dom,total;
/**
*Clase Bus con los parametros de bus, metodos get y set, toString e interfaz Comparable<Bus>
* @author Jennifer Camacho y Julian Cardenas
* @since 16-05-2021
* @version 01
*/
public Bus(String conductor, int numero, int id, int lun, int mar, int mie, int jue, int vie, int sab, int dom,int total) {
   this.conductor = conductor;
   this.numero = numero;
   this.id = id;
   this.lun = lun;
   this.mar = mar;
   this.mie = mie;
   this.jue = jue;
   this.vie = vie;
   this.sab = sab;
   this.dom = dom;
   this.total=lun+mar+mie+jue+vie+sab+dom;
}

public String getConductor() {
   return conductor;
}

public int getNumero() {
   return numero;
}

public int getId() {
   return id;
}

public int getLun() {
   return lun;
}

public int getMar() {
   return mar;
}

public int getMie() {
   return mie;
}

public int getJue() {
   return jue;
}

public int getVie() {
   return vie;
}

public int getSab() {
   return sab;
}

public int getDom() {
   return dom;
}


public void setConductor(String conductor) {
   this.conductor = conductor;
}

public void setNumero(int numero) {
   this.numero = numero;
}

public void setId(int id) {
   this.id = id;
}

public void setLun(int lun) {
   this.lun = lun;
}

public void setMar(int mar) {
   this.mar = mar;
}

public void setMie(int mie) {
   this.mie = mie;
}

public void setJue(int jue) {
   this.jue = jue;
}

public void setVie(int vie) {
   this.vie = vie;
}

public void setSab(int sab) {
   this.sab = sab;
}

public void setDom(int dom) {
   this.dom = dom;
}

public int getTotal() {
   return total;
}

public void setTotal(int total) {
   this.total = total;
}



@Override
public String toString() {
	

	return "Bus [Conductor: " + conductor + ", Numero: " + numero + ", NumeroBus: " +id + " ]"
                   +"  Km [Lunes: "+lun+", Martes: "+mar+", Miercoles: "+mie+", Jueves: "+jue+", Viernes: "+vie+", Sabado: "+sab+", Domingo: "+dom+", Total: "+total+" ]";
	

}


public int compareTo(Bus bus) {
	
	  return this.conductor.compareToIgnoreCase(bus.conductor);

}

}