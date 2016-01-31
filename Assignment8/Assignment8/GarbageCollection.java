package Assignment8;

public class GarbageCollection {

	public static void main(String[] args) {
		
		StringBuffer greet = new StringBuffer("hello");
		System.out.println(greet);
		greet = null;
		System.gc();
		System.out.println(greet);
	}

}
