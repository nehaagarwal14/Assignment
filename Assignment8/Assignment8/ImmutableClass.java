package Assignment8;

public final class ImmutableClass {
	private String Name;
	private int SSN;

	public ImmutableClass(String Name,int SSN){
		this.Name = Name;
		this.SSN = SSN;
	}

	public String getName(){
		return Name;
	}

	public int getSSN(){
		return SSN;
	}	

}

