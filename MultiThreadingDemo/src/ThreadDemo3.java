
public class ThreadDemo3 {
	
	public static void main(String[] args) {
		Demo demo= new Demo();
		Thread thread= new Thread(demo, "John");
		Thread thread2= new Thread(demo, "Sam");
		Thread thread3= new Thread(demo, "Martin");
		thread.start();
		thread2.start();
		thread3.start();
		
	}

}

class Demo implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub\
		Thread thread= Thread.currentThread();
		System.out.println(thread);
		String name= thread.getName();
		System.out.println(name+ " is started");
	}
}
