import java.util.Collections;
import java.util.LinkedList;


public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> linkedList=
				new LinkedList<>();
		linkedList.add("Hi");
		linkedList.add("Hi2");
		linkedList.add("Hi3");
		linkedList.add("Hi4");
		linkedList.add("Hi5");
		System.out.println(linkedList);
		System.out.println(linkedList.size());
		Collections.synchronizedList(linkedList);
		
	}

}
