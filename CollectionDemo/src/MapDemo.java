import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class MapDemo {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap=
				new HashMap<String, Integer>();
		hashMap.put("key1", 123);
		hashMap.put("key2", 1233);
		hashMap.put("key4", 1234);
		hashMap.put("key6", 1235);
		hashMap.put("key3", 123);
		hashMap.put("key1", 123);
		hashMap.put("key2", 123);
		
		System.out.println(hashMap);
		System.out.println("---------------------------------------");
		TreeMap<String, Integer> treeMap=
				new TreeMap<String, Integer>();
		treeMap.put("key1", 123);
	    treeMap.put("key2", 1233);
	    treeMap.put("key4", 1234);
	    treeMap.put("key6", 1235);
	    treeMap.put("key3", 123);
	    treeMap.put("key1", 123);
	    treeMap.put("key2", 123);
	    System.out.println(treeMap);
	    
	    LinkedHashMap<String, Integer> hashMap2=
	    		new LinkedHashMap<>();
	    hashMap2.put("Key1", 123);
	    hashMap2.put("Key3", 1213);
	    hashMap2.put("Key2", 1223);
	    System.out.println(hashMap2);
	    
	    Integer integer= hashMap.get("key1");
	    System.out.println(integer);
	  
	   
	    Set<Entry<String, Integer>> set= hashMap.entrySet();
	    Iterator<Entry<String, Integer>> iterator= set.iterator();
	    
	    while(iterator.hasNext()){
	    	Entry<String, Integer> entry= iterator.next();
	    	System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
	    }
	}

}
