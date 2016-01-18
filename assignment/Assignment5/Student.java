package Assignment5;

public class Student implements Comparable<Object> {

	int age;
	String name;
	
	public void student (int age,String name)
	{
    this.age = age;
    this.name = name;}
    
   public int compareTo (Object o){
    	Student s = (Student)o;
    	if(age == s.age)
    		return 0;
    	else if(age <s.age)
    		return 1;
    	else
    		return -1 ;       
    }
		
	
	}


