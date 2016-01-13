package Assignment3;

public class ReverseIndividual {

	public static void main(String[] args) {

		String s = "Happy New Year";	
		//String reverse = " " ;

		String [] ar  = s.split(" ");

		for( int i = 0; i<ar.length; i++){
			System.out.println(ar[i]);
		}

		String s1= ar[0];		
		s1 = reverse(s1);
		System.out.print(" ");
	
		String s2 = ar[1];
		s2 = reverse(s2);
		System.out.print(" ");
		
		String s3 = ar[2];
		s3 = reverse (s3);
		System.out.println(" ");
		
		System.out.println("original string is "  + s);
		System.out.println("reversed string is "  + s1 + " " + s2 + " " + s3);


	}	  

	public static String reverse(String s)  { 
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i>=0 ; i--){
			System.out.print(s.charAt(i));
			sb.append(s.charAt(i));
		}
		return sb.toString();     
	}
}
