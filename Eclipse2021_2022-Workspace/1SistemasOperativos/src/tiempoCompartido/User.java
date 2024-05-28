package tiempoCompartido;


public class User {
	int id;
    int nJobs;
    double sharingCPU;
	public User(int id, int nJobs, double sharingCPU) {
		super();
		this.id = id;
		this.nJobs = nJobs;
		this.sharingCPU = sharingCPU;
	}
	
	public int getnJobs() {
		return nJobs;
	}

	public void setnJobs(int nJobs) {
		this.nJobs = nJobs;
	}

	public double getSharingCPU() {
		return sharingCPU;
	}
	public void setSharingCPU(double sharingCPU) {
		this.sharingCPU = sharingCPU;
	}
	@Override
	public String toString() {
		return "User [id=" +"User"+ id + ", nJobs=" + nJobs + ", Sheduling CPU= " + sharingCPU + "%]";
	}
	
}
	