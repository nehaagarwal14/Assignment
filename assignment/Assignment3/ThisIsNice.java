package Assignment3;

public class ThisIsNice {

	public static void main(String[] args) {
		String s = "this is nice";
		String [] ar = s.split(" ");

		String s1= "";

		for(int i = 0 ; i< ar.length ; i++) {		
			ar[i] = ar[i] + (i+1);
			// System.out.println(ar[i]);
			s1 += ar[i]+ " ";
		}

		System.out.println("Original string = " + s );
		System.out.println("Updated string = " + s1);
	}
}
