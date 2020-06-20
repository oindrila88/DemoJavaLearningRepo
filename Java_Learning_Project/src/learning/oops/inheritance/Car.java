package learning.oops.inheritance;

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
		//Calling "Parent Class" "No-Argument Constructor" from "Child Class" using "super()"
		//super();
		System.out.println("Overloaded Constructor of Child Class 'Car' with 'NumberOfGears' and 'CompanyName' of the Base Class 'Vehicle'");
		this.numberOfGears = numberOfGears;
		this.companyName = companyName;
	}
	
	//Method Overriding - The ability of a "Child Class" to "Override" a "Method" allows a Class to inherit from its "Parent Class" whose "Behavior" is "Close Enough" and then to modify "Behavior" as needed. The "Overridden Method" has the same "Name", "Number", "Type of Parameter(s)", and "Return Type" as the "Method" that it "Overrides". An "Overridden Method" can also return a "SubType" of the "Type" returned by the "Method" that it "Overrides". This "SubType" is called a "CoVariant Return Type"
	//"Method Overriding" is also known as "Dynamic Method Dispatch". "Dynamic Method Dispatch" is a process in which a call to an "Overridden Method" is resolved at Run-Time, thats why it is called "Run-Time Polymorphism"
	
	//The "Access Modifier" of an "Overridden Method" can allow more, but not less access than the "Method" that it "Overrides". For example, a "protected" Instance "Method" in the "Parent Class" can be made "public", but not "private", in the "Child Class"
	//protected void start()
	//Compile-Time Error: "Cannot reduce the visibility of the inherited method from Vehicle"
	
	//Trying to change an Instance "Method" in the "Parent Class" to a "Static" "Method" in the "Child Class", and vice versa will throw a "Compile-Time error"
	//public static void start()
	//Compile-Time Error: "This static method cannot hide the instance method from Vehicle"
	//Override the 'start()' method of the Base Class 'Vehicle' in the Child Class 'Car'
	public void start()
	{
		System.out.println("Overriding the 'start()' method in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	//In a "Child Class", "Methods" inherited from the "Parent Class" can be overloaded. Such "Overloaded Methods" neither "Hide" nor "Override" the "Parent Class" Instance "Methods". These are new "Methods", unique to the "Child Class"
	public void stop(int a)
	{
		System.out.println("Stopping the Car in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	//Override the 'honk()' method of the Base Class 'Vehicle' in the Child Class 'Car'
	public void honk()
	{
		//If both the "Parent Class" and "Child Class" define a "Method" with the same name, still both of the "Methods" can be accessed from the "Child Class". However, the intent must be made clear to Java regarding which version of the "Methods" to call, by prefixing the "Method" with the keywords "this" or "super"
		//"this" keyword refers to the current Instance in which it is used
		//"super" keyword refers to the immediate "Parent Class" Instance
		//Calling "Parent Class" version of the "Method" "honk()" from "Child Class" using "super.honk()"
		super.honk();
		System.out.println("Overriding the 'honk()' method in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void openDoors()
	{
		System.out.println("Opening the Door in the Child Class 'Car' of the Base Class 'Vehicle'");
	}
	
	public void carInformation()
	{
		System.out.println("Information of 'NumberOfGears' and 'CompanyName' in the Child Class 'Car' of the Base Class 'Vehicle'");
		System.out.println("NumberOfGears : " + numberOfGears + " CompanyName : " + companyName);
		
		//If both the "Parent Class" and "Child Class" define a "Variable" with the same name, still both of the "Variables" can be accessed from the "Child Class". However, the intent must be made clear to Java regarding which version of the "Variable" to call, by prefixing the "Variable" with the keywords "this" or "super"
		//"this" keyword refers to the current Instance in which it is used
		//"super" keyword refers to the immediate "Parent Class" Instance
		//Calling "Parent Class" version of the "Variable" "companyName" from "Child Class" using "super.companyName"
		System.out.println("'CompanyName' of Base Class 'Vehicle' accessed from Child Class 'Car' : " + super.companyName);
	}
	
	public static void noOfDoorsInformation()
	{
		System.out.println("Information of 'NumberOfDoors' in the Child Class 'Car' of the Base Class 'Vehicle'");
		System.out.println("NumberOfDoors : " + numberOfDoors);
	}
	
	//If a "Child Class" defines a "Static Method" with the same "Signature" as a "Static Method" in the "Parent Class", then the "Static Method" in the "Child Class" hides the one in the "Parent Class"
	//"Static Method" 'staticVehicleMethod()' of the Base Class 'Vehicle' is hidden by the "Static Method" 'staticVehicleMethod()' of the Child Class 'Car'
	public static void staticVehicleMethod()
	{
		System.out.println("Hiding the Static Method 'staticVehicleMethod' of the Base Class 'Vehicle' inside the Child Class 'Car'");
	}
}