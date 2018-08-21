
public class StringEqualityDemo {
	
	public static void main(String[] args) {
		String str= "Nikhil";
		String str1= "nikhil";
		
		String str2= new String("Nikhil");
		String str3= new String("Nikhil");
		
		System.out.println(str2== str);
		System.out.println(str.equalsIgnoreCase(str1));
		
		String str5= "1234";
		int s= Integer.parseInt(str5);
		System.out.println(s);
		
		Integer integer= Integer.valueOf(str5);
		System.out.println(integer);
		int ss= integer.intValue();
		System.out.println(ss);
		
		int y= 34567;
		Integer integer2= new Integer(y);
		String str7= integer2.toString();
		System.out.println(str7);
	}

}
