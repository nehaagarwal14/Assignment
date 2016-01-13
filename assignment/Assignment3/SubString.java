package Assignment3;

public class SubString {

	public static void main(String[] args) {

		String s = "welcome";

		System.out.println(s.length());

		String substr = s.substring(3);
		System.out.println(substr);
		 
		String s1 = s.replace("come","go");
		System.out.println(s1);
		
	} 


     /*  String s = "hello world";
       
       System.out.println(s.length());
       
       String [] ar = s.split(" ");
       
       for(int i=0; i<ar.length; i++){
       
       System.out.println( ar[i]);}
       
       String substr = s.substring(6);
       System.out.println(substr); */

}
