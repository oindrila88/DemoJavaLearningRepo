package learning.oops;

//When a Class is extended, an "IS-A Relationship" is formed. Here, the "Car IS-A Vehicle". So, it has all the characteristics of a "Vehicle"
public class Car extends Vehicle
{
	private int numberOfGears;
	static int numberOfDoors;
	public String companyName;
	
	static
	{
		numberOfDoors = 4;
	}
	
	public Car()
	{
		System.out.println("Default Constructor of Child Class 'Car' of the Base Class 'Vehicle'");
		numberOfGears = 0;
		companyName = "Honda";
	}
	
	public Car(int numberOfGears, String companyName)
	{
		System.out.println("Overloaded Constructor of Child Class 'Car' with 'NumberOfGears' and 'CompanyName' of the Base Class 'Vehicle'");
		this.numberOfGears = numberOfGears;
		this.companyName = companyName;
	}
	
	public void start()
	{
		System.out.println("Starting the Car in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void stop()
	{
		System.out.println("Stopping the Car in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void honk()
	{
		System.out.println("Honking the Car in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void openDoors()
	{
		System.out.println("Opening the Door in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void carInformation()
	{
		System.out.println("Information of 'NumberOfGears' and 'CompanyName' in the Child Class 'Car' of the Base Class 'Vehicle'");
		System.out.println("NumberOfGears : " + numberOfGears + " CompanyName : " + companyName);
	}
	
	public static void engineVersionInformation()
	{
		System.out.println("Information of 'NumberOfDoors' in the Child Class 'Car' of the Base Class 'Vehicle'");
		System.out.println("NumberOfDoors : " + numberOfDoors);
	}
}