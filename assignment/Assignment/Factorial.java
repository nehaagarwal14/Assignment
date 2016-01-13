package Assignment;

public class Factorial {

	public int factorial(int num) {
		
		int fact = num;
		for (int i=num-1; i>1; i--) {
			fact = fact*i;
			
		}
	
	    return fact;
}


public static void main (String [] args) {
	 Factorial fact = new Factorial();
	int  result = fact.factorial(6);
	
	System.out.println("the factorial is" + result);
	
	
	
}
}