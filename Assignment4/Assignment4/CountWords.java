package Assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) {


       int totalnoofwords = 0;
	try{
            FileReader fr = new FileReader("c://users/dell/testfile.txt");
			
			BufferedReader br = new BufferedReader(fr);
			String line;			
			
				while((line=br.readLine())!=null)
				{		
					System.out.println("Read line " + line);
					String[] wordsarr = line.split(" ");
					totalnoofwords += wordsarr.length;

				}
			} catch (IOException e) {			
				e.printStackTrace();
			}
			System.out.println("Total no of words = " + totalnoofwords);

	}

}
