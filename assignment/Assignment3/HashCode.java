package Assignment3;

public class HashCode {

	public static void main(String[] args) {
	Strins s = "hello";
	System.out.println("before" + s.hashCode());
	
	s = s + "world";
	System.out.println("after" + s.hashCode());
	
	StringBuffer buff = new Stringbuffer(s);
	System.out.println("before" + buff.hashCode());
	
	buff= buff.append("world");
	System.out.println("after" + buff.hashCode());

	}

}
