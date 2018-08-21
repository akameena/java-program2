
public class StringHandlingDemo {

	public static void main(String[] args) {
		String str= "Nikhil Katkhuria";
		System.out.println(str.length());
		String str1= str.substring(0, 6);
		System.out.println("Substring: "+str1);
		for (int i = 0; i < str.length(); i++) {
			char c= str.charAt(i);
			System.out.println("Value at "+i+" index is: "+c);
		}
		String str2= "        Nikhil    java     ";
		System.out.println(str2.trim());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		str= str.replace("kh", "java");
		System.out.println(str);
		String str3= "Aakash prajapati java";
		String[] ss= str3.split("a", 3);
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}
		String str5= "Nikhil";
		str5= str5.concat(" Hi");
		System.out.println(str5);
	}

}
