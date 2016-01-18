package Assignment5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
 

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101, "john");
		hm.put(102, "mark");
		hm.put(103, "bell");
		hm.put(104, "ron");
		hm.put(105, "jack");
		
		for(Entry<Integer,String> m : hm.entrySet()){			
			System.out.println(m.getKey() +" " + m.getValue());		
		}
		// To retrieve keys
		Set<Integer> s = hm.keySet(); 
		for( Integer i :s){
			System.out.println("key is " + i);
		}
		// To retrieve values
		Collection<String> l = hm.values();
		for(String k : l){
			System.out.println("value is " + k);
		}
        // To return value for particular key
		
		System.out.println("value for 101 key is  " + hm.get(101));
		
		//To iterate using Iterator
		
		Set<Entry<Integer, String>> set = hm.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while( iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
