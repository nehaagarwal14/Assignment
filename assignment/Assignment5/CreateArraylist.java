package Assignment5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CreateArraylist {
	// Create an ArrayList and elements to it
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("john");
		alist.add("mark");
		alist.add("ted");
		alist.add("alex");
		alist.add("bran");
		alist.add("100");
		alist.add(String.valueOf(100));
		// one method to retrieve
		/* for( String s : alist){
			System.out.println(s);
		 }  */
		// second method to retrieve
		for(int i =0;i<alist.size();i++){
			System.out.println(alist.get(i));	        
		}

		// To search an element in the list
		System.out.println("Element at index [0] is " + alist.get(0));
		System.out.println("Element at index [2] is " + alist.get(2));
		System.out.println("Element at index [4] is " + alist.get(4));

		// To print elements using Iterator
		Iterator <String> it = alist.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println( "Using Iterator  " + s); 
		}
		
        // To print elements in reverse using listIterator   		

		ListIterator<String> lt = alist.listIterator(alist.size());
		while (lt.hasPrevious()){
			 String r = lt.previous();
			 System.out.println("Using ListIterator  " +  r);	
		}
	}

}
