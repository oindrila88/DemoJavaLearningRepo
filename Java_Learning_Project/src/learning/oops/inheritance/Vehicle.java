package learning.oops.inheritance;

public class Vehicle
{
	//Inheritance - "Inheritance" is the mechanism that allows one Class to acquire all the "Properties" and "Functionalities" of another Class. The "Inheriting Class" is called "Child Class", or, "Sub Class", or, "Derived Class", while the "Inherited Class" is called as "Parent Class", or, "Super Class", or, "Base Class". "Inheritance" provides the idea of "Re-Usability of Code", and, each "Child Class" defines only those "Properties" and "Functionalities", which are unique to it. Rest of the "Properties" and "Functionalities" can be inherited from the "Parent Class". To inherit a Class "extends" keyword is used. In the absence of an "extends" keyword, a Class implicitly inherits the Class "java.lang.Object"
	//The main advantage of using "Inheritance" is that, with "Inheritance" a Class can be created with basic "Properties" and "Functionalities", and, a specialized version of it can also be created by creating Classes that inherit the "Parent Class"
	//What is Inherited to Child Class from Base Class - A "Parent Class" doesn't allow all of its Members to be accessed by "Child Classes". The "Private" Members of a "Parent Class" are not inherited by "Child Classes". Basically, a "Child Class" inherits the "Protected" and "Public" Members, and, "Static" Class Members from the "Parent Class". In addition, the Members with "Default Access Modifier" in the "Parent Class" are inherited by the "Child Classes" only if the two Classes are in the same "Package". Also, if the "Parent Class" and "Child Classes" are defined in separated "Packages", Members with "Default Access Modifier" in the "Parent Class" are not inherited in the "Child Classes"
	//Types of Inheritance -
	//1. Single Inheritance - "Single Inheritance" refers to a "Child" and "Parent" Class Relationship, where a Class extends the another Class
	//2. Multilevel Inheritance - "Multilevel Inheritance" refers to a "Child" and "Parent" Class Relationship, where a "Child" Class extends the "Child" Class. Here, Class "Car" inherits Class "Vehicle", and, Class "ArmoredCar" inherits Class "Car"
	//3. Hierarchical Inheritance - "Hierarchical Inheritance" refers to a "Child" and "Parent" Class Relationship, where more than one Classes extends the same Class. Here, Class "Car" inherits Class "Vehicle", and, Class "Bus" also inherits Class "Vehicle"
	//4. Multiple Inheritance - "Multiple Inheritance" refers to the concept of one Class extending more than one Classes, which means a "Child Class" has two "Parent Classes". Java does not support "Multiple Inheritance"
	
	private int wheels;
	protected String model;
	public static String engineVersion;
	public String companyName;
	
	static
	{
		System.out.println("Initializing the Static String Variable 'engineVersion' inside the 'Static Block' in the 'Parnt Class' 'Vehicle'");
		engineVersion = "BS6";
	}
	
	int[] vehicleArr;
	{
		System.out.println("Initializing the int Array 'vehicleArr' inside the 'Instance Initializer Block' in the 'Parnt Class' 'Vehicle'");
		vehicleArr = new int[6];
		vehicleArr[0] = 12;
		vehicleArr[1] = 14;
		vehicleArr[2] = 16;
		vehicleArr[3] = 18;
		vehicleArr[4] = 20;
		vehicleArr[5] = 22;
	}
	
	public Vehicle()
	{
		System.out.println("No-Argument Constructor of Parent Class 'Vehicle'");
		wheels = 0;
		model = "Vehicle";
		companyName = "Tata";
	}
	
	public Vehicle(int wheels, String model, String companyName)
	{
		System.out.println("Overloaded Constructor of Parent Class 'Vehicle' with 'Wheels', 'Model' and 'CompanyName'");
		this.wheels = wheels;
		this.model = model;
		this.companyName = companyName;
	}
	
	public void start()
	{
		System.out.println("Starting the Vehicle in the Parent Class 'Vehicle'");
	}
	
	public void stop()
	{
		System.out.println("Stopping the Vehicle in the Parent Class 'Vehicle'");
	}
	
	public void honk()
	{
		System.out.println("Honking the Vehicle in the Parent Class 'Vehicle'");
	}
	
	public void vehicleInformation()
	{
		System.out.println("Information of 'Wheels', 'Model' and 'CompanyName' in the Parent Class 'Vehicle'");
		System.out.println("Wheels : " + wheels + " Model : " + model + " CompanyName : " + companyName);
	}
	
	public static void engineVersionInformation()
	{
		System.out.println("Information of 'EngineVersion' in the Parent Class 'Vehicle'");
		System.out.println("EngineVersion : " + engineVersion);
	}
	
	public static void staticVehicleMethod()
	{
		System.out.println("Inside the Static Method 'staticVehicleMethod' in Parent Class 'Vehicle'");
	}
}