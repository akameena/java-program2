
public class StringEquality {

	public static void main(String[] args) {
		String str= "Hello";
		String str1= "hello";
		String str2= "Java";
		String str3= new String("Hello");
		String str4= new String("Hello");
		String str5 = new String(str);
		String str6 = str;


		System.out.println(str== str5);
		System.out.println(str== str6);
		System.out.println(str== str1);
		System.out.println(str== str2);
		System.out.println(str3== str4);
		System.out.println(str1== str3);

		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
	}

}
