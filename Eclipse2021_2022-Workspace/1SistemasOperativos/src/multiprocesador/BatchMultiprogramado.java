package multiprocesador;

public class BatchMultiprogramado {
	public static void main(String[] args) {
		Jobs jobs = new Jobs();
		System.out.print("Batch multiprogramado \n");
		jobs.cargarJobs();
		while(jobs.nJobs()) {
			jobs.sistemaCPU();
		}
		System.out.println("No hay mas jobs, proceso finalizado");
		
		
		

	}

}
