
public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder builder= new StringBuilder("nikhil ");
		System.out.println(builder.capacity());
		
		builder.append(" Java");
		builder.append(" android");
		
		System.out.println(builder);
		String str= "Hello java android";
		for (int i = str.length()-1; i >= 0; i--) {
			char sy= str.charAt(i);
			System.out.print(sy);
		}
		System.out.println();
		builder.reverse();
		System.out.println(builder);
		
		String str1= builder.toString();
		System.out.println(str1);
		
		builder.insert(3, " hello ");
		System.out.println(builder);
		
		builder.delete(4, 8);
		System.out.println(builder);
		System.out.println(builder.hashCode());
		
	}

}
