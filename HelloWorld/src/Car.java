import java.io.FileNotFoundException;
import java.io.FileReader;


public class Car {
static int price= 90;
	public static void main(String[] args) {
		System.out.println("Hi nikhil");
	  Car car= new Car();
	  System.out.println(price);
	  try {
		FileReader fileReader= new FileReader("a.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
