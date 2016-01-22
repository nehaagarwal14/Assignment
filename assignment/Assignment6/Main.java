package Assignment6;

public class Main {

	public static void main(String[] args) {
	
		Rectangle r = new Rectangle(10,10);
		System.out.println("area " + r.calculateArea());
		System.out.println("parameter " + r.calculatePerimeter());			
		r.setNoOfSides(4);
		System.out.println(r.getNoOfSides());
	}	
}
		
		

	


