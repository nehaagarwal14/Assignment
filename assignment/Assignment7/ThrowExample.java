package Assignment7;

public class ThrowExample {

	public static void checkAge(int age){
		if(age < 18){
			throw new ArithmeticException();
		}
		else{
			System.out.println("hello kid");
		}
	}
	
	public static void main(String[] args) {
		try{
		ThrowExample.checkAge(17);
		}
		catch( ArithmeticException e){
			System.out.println("error occurred");
		}
		
	}
}
