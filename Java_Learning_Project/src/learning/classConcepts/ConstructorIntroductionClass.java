package learning.classConcepts;

public class ConstructorIntroductionClass
{
	private int x;
	double y;
	String s;
	
	//Point 1: "Constructor" is a "Special Member Method" of the Class, which has the same name as the Class name
	
	//Point 2: Every time an Object of any Class needs to be created, the "Constructor" needs to be used. It will communicate with the JVM that it wants to create an Object. How much space is required will be given by the "Constructor".
	//So "Constructor" will be used to allocate Heap Memory to an Object
	
	//Point 3: Even if no explicit "Constructor" is created for a Class, there will be an implicit "No-Argument Constructor" for every Class, called a "Default No-Argument Constructor". The "Default No-Argument Constructor" will simply set all "Instance Variables" to the respective default values, based on the corresponding Data Type of each "Instance Variable"
	
	//Point 4: "Constructor" will never return anything. So no need to mention any Return Type
	
	//Point 5: "Constructor" is used to initialize any "Member Variables" of a Class in an Object
	
	//Point 6: A "Constructor" can't be called for an Object, or, Instance already created. Every time an Object is created, it will call the "Constructor" by itself automatically
	
	//Point 7: If there is a "Parameterized Constructor" in a Class, there should also be a "No-Argument Constructor" defined in the same Class. The type of "Constructor" that takes no argument is called a "No-Argument Constructor"
	
	//Point 8: Every "Constructor" that does not call another "Constructor" of the same Class, calls its "Parent Constructor", whether it was written explicitly, or, inserted by the JVM, through "super()"
	
	//Constructor Overloading - There can be multiple "Constructors" having different Parameters in a Class. This is called "Constructor Overloading", a part of "Polymorphism". A Class can have many "Constructors", as long as the "Number of Parameters" and "Data Type of the Parameters" in each "Constructor" is different
	
	//Benefit of using "Constructor" - The real benefit of using "Constructor" is that, it helps maintain "Encapsulation" when injecting "State" into the Object
	
	//Instance Initializer Block - Although "Instance Variables" of a Class can be initialized directly during declaration, yet, there are situations when extra operations need to be performed while initializing the "Instance Variables". In such cases, "Instance Initializer Block" comes in handy. "Instance Initializer Block" runs every time a new Instance of a Class is created
	//"Instance Initializer Block" contains the code to initialize the "Instance Variables" of a Class, which might be common part of various Constructors of that Class. The content of "Instance Initializer Block" is executed each time before the content of any "Constructor" of the concerned Class is executed
	//It is possible to have more than one "Instance Initializer Blocks" in a single Class. In that case, all the "Instance Initializer Blocks" will be called in sequence, and, then the "Constructor" of the concerned Class
	int[] arr;
	{
		System.out.println("Initializing the int Array 'arr' with values inside the First 'Instance Initializer Block'");
		arr = new int[6];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		arr[5] = 12;
	}
	
	{
		System.out.println("Displaying all the values of int Array 'arr' inside the Second 'Instance Initializer Block'");
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
	
	//No-Argument Constructor
	public ConstructorIntroductionClass()
	{
		System.out.println("Inside the 'Non-Argument Constructor'");
		x = 2;
	}
	
	//Constructor Chaining - "Constructor Chaining" is the process of calling one "Constructor" from another "Constructor" with respect to the current Object
	//What is the need of "Constructor Chaining" -
	//1. Access the Properties - "Constructor Chaining" is used to access the "Properties" of any other "Constructor" in the same Class, or, in another Class from a "Constructor"
	//2. Code Optimization - Using "Constructor Chaining", "Code Optimization" is achieved. It means, the lines of codes get reduced
	//3. Easy Maintenance - Using "Constructor Chaining" the code can be maintained easily, because, if the common functionalities are kept in the "Super Class Constructor", then if needed, changes need to be made only in the "Super Class Constructor"
	//4. Memory Will Get Reduced - If the same code will repeat at multiple places, then more Memory will be used. To avoid this, "Constructor Chaining" is used to access the same code. Hence, less Memory is used
	
	//Rules of "Constructor Chaining" -
	//The "this()" expression should always be the first line of the "Constructor", otherwise the Compilation Error will occur
	//There should be at-least be one "Constructor" without the "this()" expression
	//"Constructor Chaining" can be achieved in any order
	
	//"Constructor Chaining" can be done in two ways -
	//1. Within the Same Class - It can be done using "this()" keyword for "Constructors" in the same Class
	public ConstructorIntroductionClass(int x)
	{
		this();
		System.out.println("Inside the 'Constructor with Integer'");
		this.x = x;
	}
	
	public ConstructorIntroductionClass(double y)
	{
		System.out.println("Inside the 'Constructor with Double'");
		this.y = y;
	}
	
	//"this" keyword is a reference to the "Current Instance" of any Class. Usage of "this" keyword -
	//Constructor with Variable Arguments
	
	public ConstructorIntroductionClass(int x, double y, String s, String ...l)
	{
		//A. Referencing Constructors of the Same Class - From a "Constructor", "this()" can be used to call a different "Constructor" of the same Class. Here, "this(int)" is used for the "Constructor Chaining" to reduce the "Code Usage"
		this(x);
		System.out.println("Inside the 'Constructor with Variable Arguments'");
		
		//B. Disambiguating Field Shadowing - "this" keyword is useful for "Disambiguating Instance Variables" from "Local Parameters". The most common reason is when there are "Constructor Parameters" with the same "Name" as "Instance Fields"
		this.x = x;
		this.y = y;
		this.s = s;
		
		//C. Passing "this" as a Parameter - Following is the "displayValuesOfCurrentInstance() Method". To invoke the "Method", "this" is passed as a reference to the "Current Instance"
		displayValuesOfCurrentInstance(this);
		//or
		//displayValuesOfCurrentInstance(returnCurrentInstance());
		
		System.out.println("Variable Arguments in Constructor : ");
		for(String st : l)
			System.out.print(st + " ");
		System.out.println("");
	}
	
	void displayX()
	{
		System.out.println("Value of 'x' is : " + x);
	}
	
	//
	public ConstructorIntroductionClass returnCurrentInstance()
	{
		
		//D.Referencing Methods of the Same Class - From a "Constructor" or "Method", "this" keyword can be used to call a different "Method" of the same Class. Here, method "displayX()" is called from the method "returnCurrentInstance()"
		//this.displayX();
		
		//E. Returning "this" - "this" keyword can also be used to return the "Current Instance" of the Class  from a "Method"
		return this;
	}
	
	void displayValuesOfCurrentInstance(ConstructorIntroductionClass constructorIntroductionClass)
	{
		System.out.println("'displayValuesOfCurrentInstance()' Method is Called from the Constructor of the Current Instance : ");
		System.out.println("Value of 'x' in the Current Instance : " + this.x);
		System.out.println("Value of 'y' in the Current Instance : " + this.y);
		System.out.println("Value of 's' in the Current Instance : " + this.s);
	}
	
	class Inner_ConstructorIntroductionClass
	{
		private int x;
		double y;
		String s;
		
		public Inner_ConstructorIntroductionClass()
		{
			//F. Using "this" Keyword Within the Inner Class - "this" keyword can be used to access the "Outer Class Instance" from within the "Inner Class"
			x = ConstructorIntroductionClass.this.x;
			y = ConstructorIntroductionClass.this.y;
			s = ConstructorIntroductionClass.this.s;
		}
		
		void show()
		{
			System.out.println("Inside the 'show' Method of the Inner Class 'Inner_ConstructorIntroductionClass'");
			System.out.println("Value of 'x' inside the Inner Class 'Inner_ConstructorIntroductionClass' is : " + x);
			System.out.println("Value of 'y' inside the Inner Class 'Inner_ConstructorIntroductionClass' is : " + y);
			System.out.println("Value of 's' inside the Inner Class 'Inner_ConstructorIntroductionClass' is : " + s);
		}
	}
	
	//2. From Child Class to Parent Class: It can be done using "super()" keyword to call "Constructor" of the  "Parent Class" from the "Child Class"
	//"Constructor Chaining" occurs through "Inheritance". A "Child Class" Constructor’s task is to call "Parent Class's" Constructor first. This ensures that creation of "Child Class's" object starts with the initialization of the Data Members of the "Parent Class". There could be any numbers of Classes in "Inheritance Chain". Every "Constructor" calls up the "Chain" till Class at the top is reached
	//By default, "No-Argument Constructor" of the immediate "Parent Class" is called from any of the "Constructors" ("No-Argument", or, "Parameterized") of the "Child Class", unless any particular "Parameterized Constructor" of the "Parent Class" is explicitly called
}