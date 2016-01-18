package Assignment5;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("first");
		alist.add("second");
		alist.add("third");
		alist.add("random");

		System.out.println("arraylist is " + alist);

		String[] strarr = new String[alist.size()];
		alist.toArray(strarr);
		System.out.println("created new array");
		for(String s : strarr)
	    System.out.println(s);
	}

}
