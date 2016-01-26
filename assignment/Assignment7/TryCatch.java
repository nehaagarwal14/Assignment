package Assignment7;

public class TryCatch {

	public static void main(String[] args) {
		String str = null;
		try{
		@SuppressWarnings("null")
		int i = str.length();
		System.out.println("string length is"  + i);
		}
		catch(NullPointerException e){
			e.printStackTrace();
			System.out.println(" Hi exception occurred " );			
		}
		 catch(Exception e){
			 System.out.println("");
		 }
		
		finally{
			System.gc();
		}
		
	}

}
