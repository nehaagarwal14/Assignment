package Assignment4;

import java.io.DataInputStream;
import java.io.IOException;


public class DataInput {

	public static void main(String[] args) {
	try{
		
		byte[] d1 = new byte[5];
		byte[]d2= new byte[5];
		System.out.println("enter two values");
		DataInputStream ds = new DataInputStream(System.in);
		ds.read(d1);  
		String a = new String(d1);	
		
		System.out.println("value of a is " + a);
		ds.read(d2);
		String b = new String(d2);
		System.out.println("value of b is  " + b);
		
				
		} catch (NumberFormatException e) {		
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}

	}

}
