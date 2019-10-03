public class Connection {

	private static Connection instance = new Connection();
	private int connections = 0;
	
	public static Connection getInstance(){
		return instance;
	}
	
	public void connect(){
		synchronized (this){
			connections++;
			Systm.out.println("connections: "+connections);
		}
			
			try Thread.sleep;catch(InterruptedException e){};

		synchronized(){
		
		}
	
	}
	
	

}

