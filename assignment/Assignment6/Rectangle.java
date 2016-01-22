package Assignment6;

public class Rectangle extends Shape {

	public double length,breadth;
	public Rectangle (double l,double b){		
		this.length = l;
		this.breadth = b;

	}
	@Override
	public double calculateArea() {		

		return (length*breadth);
	}

	@Override
	public double calculatePerimeter() {

		return 2*(length +breadth);
	}
    
	
}



