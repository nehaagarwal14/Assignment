package Assignment8;

public class Dog extends Animal{
	
	
	public void makeDogEat(){		
		eat();
		
	}
   //Protected method can be called by a sub class or any class within the package
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
	}
}
		
	