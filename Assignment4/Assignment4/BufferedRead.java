
package Assignment4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedRead {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("enter two numbers");			
			int a =Integer.parseInt(bw.readLine());
			
			int b =Integer.parseInt(bw.readLine());
			int c = a-b;
			System.out.println("subtraction of two number c = " + c);
			
		
				

	}

}
