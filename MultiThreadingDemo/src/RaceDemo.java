
public class RaceDemo {
	
	public static void main(String[] args) {
		RunnableDemo demo= new RunnableDemo();
		Thread thread1= new Thread(demo, "Hare");
		Thread thread2= new Thread(demo, "Tortoise");
		thread1.start();
		thread2.start();
		
	}

}


class RunnableDemo implements Runnable{
	String winner= "";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int distance = 1; distance <= 100; distance++) {
			String name= Thread.currentThread().getName();
			System.out.println(name+" has covered "+distance+" mtrs distance");
			if (distance== 30 && Thread.currentThread().getName().equals("Hare") &&
					!winner.equals("Tortoise")) {
				try{
					System.out.println("Hare is sleeping for 3 sec");
				Thread.sleep(3000);
				}
				catch(InterruptedException exception){
					System.out.println(exception);
				}
			}
			winAll(distance);
		}
	}
	
	void winAll(int distance){
		if (distance== 100 && winner == "") {
			winner= Thread.currentThread().getName();
			System.out.println("Winner is: "+winner);
			
		}
		else if (distance== 100 && !winner.equals(Thread.currentThread().getName())) {
			System.out.println("Losser is: "+Thread.currentThread().getName());
		}
	}
	
}