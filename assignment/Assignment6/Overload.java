package Assignment6;

public class Overload {
	
	public double disp(int a){			
		return a;
	}
	
	public double disp(int a ,int b){		
		return a+b;
		
	}
    
	public double disp(double a){
		
		return a*a;
	}
	
	public double disp(int a,int b,int c) {
		System.out.println("a is " +a+ " b is "+ b+ " c is  " +c);
		return a+b+c;
		
	}
	
	public static void main(String[] args) {
		

		Overload ol = new Overload();
		System.out.println( "a is " + ol.disp(10));	
		
		
		System.out.println("a and b are " + ol.disp(5, 5));
				
		
		System.out.println("double result is " + ol.disp(5.5));
		
		
		System.out.println ("double result is "+ ol.disp(2, 3, 4));			
		
	}
}

