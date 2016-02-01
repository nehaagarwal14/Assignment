package Assignment8;

import Assignment7.AmTest;

public class AccesModifier {
	
	
	public static void main(String[] args) {
		System.out.println("public class from package assignmet8");
		
		AmTest obj = new AmTest();
		System.out.println(obj.str = "hello");
		obj.show();
	}
			
	}


