import java.util.concurrent.Semaphore;

public class App{

	public static void main(String...args)throws InterruptedException {
		Semaphore sem = new Semaphore(0);
		

		sem.acquire();
		
		System.out.println("available Permits: "+sem.availablePermits());
	}

}
