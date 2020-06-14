package learning.oops;

public class OOPsCallingClass
{
	public static void main(String[] args)
	{
		/*
		//1. OOPs Concept - Encapsulation
		//Creating Object of the Class "EncapsulationIntroductionClass"
		EncapsulationIntroductionClass objEncp = new EncapsulationIntroductionClass();
		
		//Calling "Public Methods" of the Class "EncapsulationIntroductionClass" to access "Private Member Variables" of that Class
		objEncp.setAge(31);
		System.out.println("Age : " + objEncp.getAge());
		
		objEncp.setFirstName("Oindrila");;
		System.out.println("First Name : " + objEncp.getFirstName());
		
		objEncp.setLastName("Bagchi");
		System.out.println("Last Name : " + objEncp.getLastName());
		
		//2. OOPs Concept - Inheritance
		 */
		PolymorphismIntroductionClass obj = new PolymorphismIntroductionClass();
		obj.getA(6, 9.7f);
		PolymorphismIntroductionClass.getA(7.5f, 9);
	}
}