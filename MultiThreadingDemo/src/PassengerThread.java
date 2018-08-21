
public class PassengerThread extends Thread{
	
	int seats;
	
	public PassengerThread(Runnable runnable, String name, int seats) {
		// TODO Auto-generated constructor stub
		super(runnable, name);
		this.seats= seats;
	}
	
	int getSeats(){
		return seats;
	}

}
