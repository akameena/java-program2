import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListandLinkedListDiff {
public static void main(String[] args) {
	ArrayList<Integer> arrayList=
			new ArrayList<Integer>();
	LinkedList<Integer> linkedList=
			new LinkedList<Integer>();
	long currentTime= System.currentTimeMillis();
	for (int i = 0; i < 100000; i++) {
		arrayList.add(i);
		
	}
	for (int i = 0; i < 100000; i++) {
	
		arrayList.get(0);
	}
	long updatedTime= System.currentTimeMillis();
	long time= updatedTime- currentTime;
	System.out.println("Time taken by array list to find data: "+time);

	long currentTime1= System.currentTimeMillis();
	for (int i = 0; i < 100000; i++) {
		linkedList.add(i);
		
	}
	for (int i = 0; i < 100000; i++) {
		linkedList.get(0);
	}
	long updatedTime1= System.currentTimeMillis();
	long time1= updatedTime1- currentTime1;
	System.out.println("Time taken by linked list to find data: "+time1);

	
	
	
}
}