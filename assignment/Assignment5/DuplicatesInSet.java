package Assignment5;

//import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesInSet {

	public static void main(String[] args) {
    int [] arr = { 1,1,2,3,4,5,6,7,7};
    HashSet<Integer> myset = new HashSet<Integer>();
    
    for(int i =0; i<arr.length ; i++) {
    	if (myset.add(arr[i]) == false){
    		System.out.println("Duplicate element " + arr[i]);
    	}
    }
    
    /*// To remove duplicates from ArrayList
    ArrayList<Integer> alist = new ArrayList<Integer>();
    alist.add(2);
    alist.add(3);
    alist.add(3);  
    for (Integer t : alist){
    	System.out.println(t);
    }
    
    HashSet<Integer> myset = new HashSet<Integer>();
    myset.addAll(alist);
    alist.clear();
   alist.addAll(myset);
   for( Integer i : alist){
	   System.out.println(i);
   }*/
    
    
	}

}
