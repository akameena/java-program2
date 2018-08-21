import java.lang.Thread.State;




public class THreadJoinDemo {
	static Thread thread1, thread2;
	
	public static void main(String[] args) {
		MyDemo demo= new MyDemo();
		thread1= new Thread(demo, "Passenger Train");
		thread2= new Thread(demo, "Bullet Train");
		thread1.start();
		while(true){
			java.lang.Thread.State state= thread1.getState();
			java.lang.Thread.State state2= thread2.getState();
			System.out.println("Passenger Train State: "+state+" Bullet Train State: "+state2);
			if (state.equals(State.TERMINATED) && state2.equals(State.TERMINATED)) {
				break;
			}
		}
	}

}

class MyDemo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread().getName().equals("Passenger Train")) {
			java.lang.Thread.State state= THreadJoinDemo.thread1.getState();
			java.lang.Thread.State state2= THreadJoinDemo.thread2.getState();
			System.out.println("Passenger Train State: "+state+" Bullet Train State: "+state2);
		
			try {
				THreadJoinDemo.thread2.start();
				System.out.println("Passenger Train Please Wait and bullet to pass");
				THreadJoinDemo.thread2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.lang.Thread.State state1= THreadJoinDemo.thread1.getState();
			java.lang.Thread.State state21= THreadJoinDemo.thread2.getState();
			System.out.println("Passenger Train State: "+state1+" Bullet Train State: "+state21);
		
		}
	}
	
}
