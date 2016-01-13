package Assignment3;

//import java.util.Scanner;

public class Palindrome {

	/*public static void main(String[] args) {
		String original = " "; 
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the String to check if it is palindrome");
		original = in.nextLine();

		String rev = reverse(original);
		System.out.println("Revered String = " + rev);          


	    if (original.equals(rev))
		    System.out.println("the string is palindrome");

	    else
			System.out.println("the string is not palindrome");

		in.close();
	}

	    public static String reverse(String s){
		StringBuilder str = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--){
			//System.out.println(s.charAt(i));
			str.append(s.charAt(i));
		}
	    return str.toString();	   

	}
}
	 */


	//2 nd method
	public static void main(String[] args) {

		String original = "madam";       	


		int i;
		int j;
		
		for (i = 0, j=original.length()-1; i <= j; i++,j--){        		
			if (original.charAt(i) != original.charAt(j)){
				break;
			}
		}

		if (i > j){
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not a palindrome");
		}




	}

}