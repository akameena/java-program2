
public class BookTicket implements Runnable{
	int totalSeats= 20;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		PassengerThread passengerThread= (PassengerThread)Thread.currentThread();
		int seats= passengerThread.getSeats();
		book(seats);
		
	}
	
	synchronized void book(int seats){
		System.out.println("Welcome "+Thread.currentThread().getName()+" to Happy Bus");
		if (totalSeats>= seats) {
			System.out.println("Congrats "+Thread.currentThread().getName()+
					" you have booked "+seats+" seats");
			totalSeats= totalSeats-seats;
			
		}
		else {
			System.out.println("Sorry "+Thread.currentThread().getName()+" No tickets avialable");
			
		}
	}

}
