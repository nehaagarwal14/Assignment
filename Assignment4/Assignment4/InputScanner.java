package Assignment4;

import java.util.Scanner;

public class InputScanner {
	public static void main(String[] args) {	
	
	int a;
	int b;
	
	System.out.println("Enter the two numbers a & b");
	Scanner sc = new Scanner(System.in);
	
    a = sc.nextInt();
    b=  sc.nextInt();
    
    System.out.println("You entered a = " + a + " and  b = " + b);
    int c = a+b;
    System.out.println("sum of two numbers = " + c);
	
	sc.close();
	
}

}
