package Assignment5;

import java.util.Scanner;

import java.util.HashMap;

import java.util.Map.Entry;


public class SearchKey {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(100, "john");
		hm.put(101, "jack");
		hm.put(102, "keth");
		hm.put(103, "mark");
		hm.put(104, "david");
		hm.put(105, "sam");

		for(Entry<Integer, String> m : hm.entrySet()){
			System.out.println( m.getKey() + " " + m.getValue());

		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to check if present");
		int k = sc.nextInt();

		// Set <Integer> set = hm.keySet();
		String l="";
		//for( Integer i : set){
		if( hm.containsKey(k)){
			l= hm.get(k);	
		}
		System.out.println( l);    
		//}
		sc.close();
	}
}
