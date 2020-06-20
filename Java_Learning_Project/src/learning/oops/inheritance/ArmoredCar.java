package learning.oops.inheritance;

//When a Class is extended, an "IS-A Relationship" is formed. Here, the "ArmoredCar IS-A Car". So, it has all the characteristics of a "Car"
public class ArmoredCar extends Car
{
	private boolean bulletProofWindows;
	public String companyName;
	
	public ArmoredCar()
	{
		System.out.println("Default Constructor of Child Class 'ArmoredCar' of the Immediate Base Class 'Car'");
		bulletProofWindows = false;
		companyName = "BMW";
	}
	
	public ArmoredCar(boolean bulletProofWindows, String companyName)
	{
		System.out.println("Overloaded Constructor of Child Class 'ArmoredCar' with 'bulletProofWindows' and 'CompanyName' of the Immediate Base Class 'Car'");
		bulletProofWindows = true;
		this.companyName = companyName;
	}
	
	public void start()
	{
		System.out.println("Starting the Armored Car in the Child Class 'ArmoredCar' of the Immediate Base Class 'Car'");
	}
	
	public void stop()
	{
		System.out.println("Stopping the Armored Car in the Child Class 'ArmoredCar' of the Immediate Base Class 'Car'");
	}
	
	public void honk()
	{
		System.out.println("Honking the Armored Car in the Child Class 'ArmoredCar' of the Immediate Base Class 'Car'");
	}
    
    public void remoteStartCar()
    {
    	System.out.println("Car can be Started by Remote in the Child Class 'Car' of the Base Class 'Vehicle'");
    }
    
    public void armoredCarInformation()
	{
		System.out.println("Information of 'BulletProofWindows' and 'CompanyName' in the Child Class 'ArmoredCar' with 'bulletProofWindows' of the Immediate Base Class 'Car'");
		System.out.println("BulletProofWindows : " + bulletProofWindows + " CompanyName : " + companyName);
	}
    
    public void registerModelInformation()
    {
    	System.out.println("Information of 'Model' in the Child Class 'ArmoredCar' of the Immediate Base Class 'Car'");
    	System.out.println("Model : " + model);
    }
}