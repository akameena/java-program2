
public class ThreadDemo1 {
	
	public static void main(String[] args) {
		Thread thread= new Thread(){
			public void run() {
				
				System.out.println("Thread is started");
				
			}; 
		};
		thread.start();
	}

}
