package Assignment;

public class Recursionfactorial {

	
		
	public static	int recur ( int num){
		
		if (num == 0) {
			return 1;
		    }
		
		else return  num * recur (num-1);
	}

	
	public static void main (String [] args) {
		
		System.out.println("factorial is" + recur(6));
	}
}
