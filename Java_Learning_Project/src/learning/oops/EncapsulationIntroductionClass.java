package learning.oops;

public class EncapsulationIntroductionClass
{
	//Encapsulation - "Encapsulation" hides specific information about the "State", or, "Internal Representation" of an Object from the "Consumer" of the concerned Class, and, provides "Publicly Accessible Methods" bound to that Object for "Read-Write Access". In "Encapsulation", "Member Variables" in a Class are hidden from other Classes by using "Private Access Modifier", and, can only be accessed using "Public Member Methods" from other Classes. "Encapsulation" is implemented to avoid accidental changes by the user
	//Advantage of using "Encapsulation" is that, if at any point of time, the "Implementation Details" of any Class needs to be changed, it can be done so without affecting the other Classes that are using the concerned Class
	
	//Variables are made "Private"
	private int age;
	private String firstName;
	private String lastName;
	
	//Methods are made "Public" to access the "Private Methods" from other Classes
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
}