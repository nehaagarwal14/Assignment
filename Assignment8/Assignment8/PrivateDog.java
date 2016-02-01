package Assignment8;

public class PrivateDog {


	private int noofacessmodifiers;
	private boolean isaccessible;
	
	
	private void bark(){
	System.out.println("method is private");
	}
	
	public static void main(String[] args) {
		
	//Priavte methods can be called within class only
	PrivateDog d = new PrivateDog();
	d.bark();
	
	
	}
}
