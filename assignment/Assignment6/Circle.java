package Assignment6;

public class Circle extends Shape implements ShapeConstants {
		
	int radius;
	public Circle(int radius){
		this.radius = radius;
	}
	
	/*public double GetArea() {		
		return pi *radius *radius;
	}

	  public double GetPerimeter() {		
		return 2 *pi*radius;
	}*/

	@Override
	public double calculateArea() {
		
		return pi *radius *radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 *pi*radius;
	}

	public int setNoOfSides(){
		return 0;
	}
}
	
	


