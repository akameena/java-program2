
public class ThreadDemo2 extends Thread{
	public ThreadDemo2(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
	
	public static void main(String[] args) {
		ThreadDemo2 demo2= new ThreadDemo2("Sam");
		ThreadDemo2 demo3= new ThreadDemo2("Martina");
		ThreadDemo2 demo4= new ThreadDemo2("Niks");
		demo2.start();
		demo3.start();
		demo4.start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName()+
				" is started");
	}
	

}
