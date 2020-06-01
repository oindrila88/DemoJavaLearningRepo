package learning.classConcepts;

public class CallingClass
{
	public static void main(String[] args)
	{
		ClassObjectIntroductionClass obj = new ClassObjectIntroductionClass();
	  //|						 | 	 | |  |  | |							  |
	  // ------------------------  	 ---  ---- --------------------------------
	  //			|				  |		|				|
	  //		  Class				Object	New			Constructor
	  //						  Reference	Keyword
		obj.show();
		obj.setX(9);
		System.out.println("Value of x in Class 'ClassObjectIntroductionClass' is : " + obj.getX());
		
		System.out.println("Hash Code Address of the Object 'obj' in Heap Memory : " + obj);
		//Setting an Object Reference to "null" makes the previously pointed Object in Heap Memory eligible for Garbage Collection
		obj = null;
		
		//Re-Initializing the Object
		obj = new ClassObjectIntroductionClass();
		System.out.println("New Hash Code Address of the Object 'obj' in Heap Memory : " + obj);
		
		//Getting the error "The constructor ConstructorIntroductionClass() is undefined" when creating object using implicit Default Constructor and not any explicitly created one while having only Parameterized Constructor in the Class "ConstructorIntroductionClass"
		ConstructorIntroductionClass obj1 = new ConstructorIntroductionClass();
		obj1.displayX();
		obj1 = null;
		
		obj1 = new ConstructorIntroductionClass(6);
		obj1.displayX();
		obj1 = null;
		
		//The Constructor that takes Integer Value is Commented Out. If an Integer Value is passed while creating the Object of the Class "ConstructorIntroductionClass", as no Constructor that takes Integer Value is found, the Integer value is implicitly converted into Double value. As there is a Constructor that takes Double Value, that Constructor is called
		obj1 = new ConstructorIntroductionClass(7.3);
		obj1.displayX();
		obj1 = null;
		
		//Now, the Constructor that takes Double Value is Commented Out. If an Double Value is passed while creating the Object of the Class "ConstructorIntroductionClass", as no Constructor that takes Double Value is found, and the Double value can't be implicitly converted into Integer value, though there is a Constructor that takes Integer Value, that Constructor will not be called and a Compile-Time Error is displayed "The constructor ConstructorIntroductionClass(double) is undefined"
		obj1 = new ConstructorIntroductionClass(9.6);
		obj1.displayX();
		obj1 = null;
		
		//Constructor with Variable Arguments
		obj1 = new ConstructorIntroductionClass(3, 1.7, "Constructor With Variable Argument", "One", "Two", "Three", "Four", "Five");
		obj1.displayX();
	}
}