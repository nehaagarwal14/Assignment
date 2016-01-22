package Assignment6;

public abstract class Shape {	

	int noOfSides;
	double area;
	double perimeter;

	public Shape(){
		System.out.println("shape constructor");
	}
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public int getNoOfSides() {
		return noOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}	
	

}
