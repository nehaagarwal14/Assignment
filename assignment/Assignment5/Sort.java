package Assignment5;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//import java.util.List;
import java.util.Set;

public class Sort {

	public static void main(String[] args, int Comparator) {

		/*HashMap <Integer,String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(5, "c");
		hm.put(9, "d");
		hm.put(7, "e");
		hm.put(3, "b");
		hm.put(2, "m");
		
		ArrayList<String> list = new ArrayList<String>();
		
		Set<Entry<Integer, String>> set = hm.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer,String> me = (Entry<Integer, String>)iterator.next();
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());	
			list.add(me.getValue());
		}
		
		System.out.println("Before Sorting");
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));	        
		}			
        Collections.sort(list);
        System.out.println("After Sorting");
		
        for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));	        
		}*/
        
		// Second method
		HashMap <Integer,String> Student = new HashMap<>();
		Student.put(1, "jack");
		Student.put(5, "carl");
		Student.put(9, "david");
		Student.put(7, "elf");
		Student.put(3, "ben");
		Student.put(2, "mack");
		
		for (Map.Entry<Integer, String> s :Student.entrySet()){
			System.out.println(s.getKey() + " " + s.getValue());					
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("jack");
		list.add("carl");
		list.add("david");
		list.add("elf");
		list.add("ben");
		list.add("mack");
		System.out.println("before sorting");
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("sorted list");
		Collections.sort(list);
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
			
    	}  		
	}	   
}
