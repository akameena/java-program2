

public class WrapperClassDemo {
	public static void main(String[] args) {
		String str= "12345";
		int i= Integer.parseInt(str);
		System.out.println(i);

		// Convert String to WO then WO to PDT
		Integer integer= Integer.valueOf(str);
		System.out.println(integer);
		int val= integer.intValue();
		System.out.println(val);

		int x= 900;
		Integer integer2= new Integer(x);
		System.out.println(integer2);
		String ss= integer2.toString();
		System.out.println(ss);

		byte[] b= str.getBytes();
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

	}

}
