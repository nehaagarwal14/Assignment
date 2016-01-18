package Assignment5;

public class Enum {

	public enum Months { 
		JANUARY,FEBURARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,
		DECEMBER}
	 public static void main(String[] args) {
		 for(Months m :Months.values())
		 {
			 System.out.println(m);
		 }
		 
	  Months mon1 = Months.JANUARY;
	  System.out.println(mon1);
	  Months mon2 = Months.FEBURARY;
	  System.out.println(mon2);
	  Months mon3 = Months.MARCH;
	  System.out.println(mon3);
	  Months mon4 = Months.APRIL;
	  System.out.println(mon4);
		
	}
	
		
	}
	
   