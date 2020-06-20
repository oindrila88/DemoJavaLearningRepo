package learning.oops.encapsulation;

public class EncapsulationCallingClass
{
	public static void main(String[] args)
	{
		//Creating Object of the Class "EncapsulationIntroductionClass"
		EncapsulationIntroductionClass objEncp = new EncapsulationIntroductionClass();
				
		//Calling "Public Methods" of the Class "EncapsulationIntroductionClass" to access "Private Member Variables" of that Class
		objEncp.setAge(31);
		System.out.println("Age : " + objEncp.getAge());
			
		objEncp.setFirstName("Oindrila");;
		System.out.println("First Name : " + objEncp.getFirstName());
				
		objEncp.setLastName("Bagchi");
		System.out.println("Last Name : " + objEncp.getLastName());
	}
}