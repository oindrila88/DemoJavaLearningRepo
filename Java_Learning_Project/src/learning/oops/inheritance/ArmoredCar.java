package learning.oops.inheritance;

//When a Class is extended, an "IS-A Relationship" is formed. Here, the "ArmoredCar IS-A Car". So, it has all the characteristics of a "Car"

//While "Inheritance" enables to "Reuse Existing Code", sometimes limitations need to be set on "Extensibility" for various reasons. The "final" keyword allows to do exactly that
//"final" keyword is a "Non-Access Modifier", which is used for "Classes", "Methods" and "Variables"
//1. "Classes" marked as "final" can’t be "Extended". "final" keyword in a Class declaration doesn’t mean that the Objects of this Class are "immutable". It means that, the Class just can't be "Extended"
public final class ArmoredCar extends Car
{
	private boolean bulletProofWindows;
	public String companyName;
	
	public ArmoredCar()
	{
		System.out.println("Default Constructor of Child Class 'ArmoredCar' of the Immediate Parent Class 'Car'");
		bulletProofWindows = false;
		companyName = "BMW";
	}
	
	public ArmoredCar(boolean bulletProofWindows, String companyName)
	{
		System.out.println("Overloaded Constructor of Child Class 'ArmoredCar' with 'bulletProofWindows' and 'CompanyName' of the Immediate Parent Class 'Car'");
		bulletProofWindows = true;
		this.companyName = companyName;
	}
	
	public void start()
	{
		System.out.println("Starting the Armored Car in the Child Class 'ArmoredCar' of the Immediate Parent Class 'Car'");
	}
	
	public void stop()
	{
		System.out.println("Stopping the Armored Car in the Child Class 'ArmoredCar' of the Immediate Parent Class 'Car'");
	}
	
	public void honk()
	{
		System.out.println("Honking the Armored Car in the Child Class 'ArmoredCar' of the Immediate Parent Class 'Car'");
	}
    
    public void remoteStartCar()
    {
    	System.out.println("Car can be Started by Remote in the Child Class 'Car' of the Parent Class 'Vehicle'");
    }
    
    public void armoredCarInformation()
	{
		System.out.println("Information of 'BulletProofWindows' and 'CompanyName' in the Child Class 'ArmoredCar' with 'bulletProofWindows' of the Immediate Parent Class 'Car'");
		System.out.println("BulletProofWindows : " + bulletProofWindows + " CompanyName : " + companyName);
	}
    
    public void registerModelInformation()
    {
    	System.out.println("Information of 'Model' in the Child Class 'ArmoredCar' of the Immediate Parent Class 'Car'");
    	System.out.println("Model : " + model);
    }
}