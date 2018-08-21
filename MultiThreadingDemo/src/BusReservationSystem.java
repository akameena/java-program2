import java.util.Scanner;


public class BusReservationSystem {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
         System.out.println("Plaesee enter name");
		String name= scanner.nextLine();
		Scanner scanner1= new Scanner(System.in);
        System.out.println("Plaesee enter seats "+name);
		int seats1= scanner1.nextInt();
		Scanner scanner2= new Scanner(System.in);
        System.out.println("Plaesee enter name");
		String name2= scanner2.nextLine();
		Scanner scanner3= new Scanner(System.in);
        System.out.println("Plaesee enter seats "+name2);
		int seats2= scanner3.nextInt();
		BookTicket runnable= new BookTicket();
		PassengerThread passengerThread= new PassengerThread(runnable, name, seats1);
		PassengerThread passengerThread2= new PassengerThread(runnable, name2, seats2);
		passengerThread.start();
		passengerThread2.start();
		scanner3.close();
		scanner2.close();
		scanner1.close();
		scanner.close();
		
	}

}
