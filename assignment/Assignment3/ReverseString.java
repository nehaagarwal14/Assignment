package Assignment3;

public class ReverseString {

	public static void main(String[] args) {
		int i;

		String original = "hello world";
		System.out.println(original);
		//System.out.println(original.length());

		for (i = original.length()-1; i>=0; i--){
			char reverse = original.charAt(i);
			System.out.print(reverse);
		}
	}
}
