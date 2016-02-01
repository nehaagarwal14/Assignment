package Assignment8;

public class Static {

	static int num;
	static String str;
	String name;

	static{
		num= 97;
		str= "static keyword";	
	}

	public void constructor(String name){
		this.name = name;
		System.out.println("I am constructor");
	}
	static void display(){
		System.out.println("I am in static method");
	}

	public static void main(String[] args) {
		System.out.println("value of num = "  + num);
		System.out.println("value of str = " +  str);
		Static.display();// static method : no object creation is required	

		//constructor needs object creation
		Static s = new Static();
		System.out.println(s.name);



	}
}
