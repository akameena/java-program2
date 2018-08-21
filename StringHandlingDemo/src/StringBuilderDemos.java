
public class StringBuilderDemos {
	
	public static void main(String[] args) {
		StringBuilder builder= new StringBuilder("Hello");
		System.out.println(builder);
		builder.append("java");
		System.out.println(builder);
		System.out.println(builder.capacity());
		builder.append("1234567890");
		builder.append("123");
		System.out.println(builder.capacity());
		builder.insert(3, "koo");
		System.out.println(builder);
		builder.delete(3, 8);
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		String str= "Nikhil java";
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		String str6= builder.toString();
		System.out.println(str6);
		builder.replace(4, 8, str6);
		System.out.println(builder);
	}

}
