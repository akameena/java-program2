
public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		ThreadGroup group= new ThreadGroup("allGroup");
		MyRunnable myRunnable= new MyRunnable();
		Thread thread1= new Thread(group, myRunnable,"T1");
		Thread thread2= new Thread(group, myRunnable,"T2");
		Thread thread3= new Thread(group, myRunnable,"T3");
		Thread thread4= new Thread(group, myRunnable,"T4");
		Thread thread5= new Thread(group, myRunnable,"T5");
		Thread thread6= new Thread(group, myRunnable,"T6");
		Thread thread7= new Thread(group, myRunnable,"T7");
		Thread thread8= new Thread(group, myRunnable,"T8");
		Thread thread9= new Thread(group, myRunnable,"T9");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread4.setPriority(Thread.NORM_PRIORITY);
		thread5.setPriority(Thread.NORM_PRIORITY);
		thread6.setPriority(7);
		thread7.setPriority(Thread.MIN_PRIORITY);
		thread8.setPriority(Thread.MIN_PRIORITY);
		thread9.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
	
		
	}

}

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.yield();
		System.out.println("Name: "+Thread.currentThread().getName()+
				" State: "+Thread.currentThread().getState()+
				" Priority: "+Thread.currentThread().getPriority()+
				" Group: "+Thread.currentThread().getThreadGroup());
	}
	
}
