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
		
		//If the Constructor of the Class "AccessModifiersIntroductionClass" was made Private, the Compile-Time Error "The constructor AccessModifiersIntroductionClass() is not visible" is Displayed
		AccessModifiersIntroductionClass obj2 = new AccessModifiersIntroductionClass();
		//Trying to access Private Members from outside the Class gives a Compile-Time Error
		/*
		obj2.a = 5; //Compile-Time Error: "The field AccessModifiersIntroductionClass.a is not visible"
		obj2.display(4); //Compile-Time Error: "The method display() from the type AccessModifiersIntroductionClass is not visible"
		*/
		
		//Trying to access Default Members of the Class "AccessModifiersIntroductionClass" from outside the Class, but, within the same Package
		obj2.b = 5.4;
		obj2.display(1.9);
		
		//Trying to access Public Members of the Class "AccessModifiersIntroductionClass" from outside the Class, but, within the same Package
		obj2.name = "Rama";
		obj2.show("Premanshu");
		
		//Five Objects of the Class "StaticIntroductionClass" is created. Hence the Method "counter" would print Five as the number of Objects created 
		StaticIntroductionClass sObj = new StaticIntroductionClass();
		StaticIntroductionClass sObj1 = new StaticIntroductionClass();
		StaticIntroductionClass sObj2 = new StaticIntroductionClass();
		StaticIntroductionClass sObj3 = new StaticIntroductionClass();
		StaticIntroductionClass sObj4 = new StaticIntroductionClass();
		
		sObj2.counter();
		
		//Trying to access Default Static Variable "name" assigned in a "Static Block" in the Class "StaticIntroductionClass", from outside the Class, but, within the same Package
		System.out.println("Value of Default Static Variable 'name' is : " + StaticIntroductionClass.name + " in the same Package 'learning.classConcepts'");
		
		//Trying to access Public Static Variable "d" assigned in a "Static Block" in the Class "StaticIntroductionClass", from outside the Class, but, within the same Package
		System.out.println("Value of Public Static Variable 'd' is : " + StaticIntroductionClass.d + " in the same Package 'learning.classConcepts'");
	
		//Instantiating the Outer Class "NestedClassIntroductionClass"
		NestedClassIntroductionClass oObj = new NestedClassIntroductionClass();
		
		//Accessing the Inner Class Method "show()" through the Outer Class Method "accessInnerClass()"
		oObj.accessInnerClass();
		
		//Access Private Instance Members of Outer Class using Non-Private Inner Class
		//Using the Object of the Outer Class, Object of the Inner Class can be instantiated
		NestedClassIntroductionClass.Inner_AccessPrivate_NestedClassIntroductionClass pObj = oObj.new Inner_AccessPrivate_NestedClassIntroductionClass();
		System.out.println("Displaying value of the Private Member 'name' from the Class 'CallingClass'" + pObj.getPrivateName());
		
		//Calling the Method containing the Method-Local Inner Class using the Object of the Outer Class
		oObj.show();
		
		//Calling the Methods of the Anonymous Inner Class, that Extends an Abstract Class, using the Object of the Outer Class
		oObj.objDemoAbstract.setA(38);
		oObj.objDemoAbstract.getA();
		
		//Calling the Methods of the Anonymous Inner Class, that Extends a Non-Abstract Class, using the Object of the Outer Class
		oObj.objDemoClass.setB(54);
		oObj.objDemoClass.getB();
		
		//Calling the Methods of the Anonymous Inner Class, that Implements an Interface, using the Object of the Outer Class
		oObj.objDemoInterface.getFirstName();
		oObj.objDemoInterface.getLastName();
		
		//Calling the Methods of the Interface from a Method that takes an Object of that Interface as Parameter. While calling that Method, Anonymous Inner Class is Defined as the "Method Argument", and, the Method is called using the Object of the Outer Class
		oObj.printDemoInterfaceMethods
		(
			new DemoInterface()
			{
				@Override
				public String getFirstName()
				{
					System.out.println("Returning the value of 'firstName' from the 'getFirstName' method of the Anonymous Inner Class of the Interface 'DemoInterface' from 'CallingClass' : " + firstName);
					return firstName;
				}

				@Override
				public String getLastName()
				{
					System.out.println("Returning the value of 'lastName' from the 'getLastName' method of the Anonymous Inner Class of the Interface 'DemoInterface' from 'CallingClass' : " + lastName);
					return lastName;
				}
			}
		);
		
		//Instantiating a "Static Nested Class" is a bit different from instantiating an "Inner Class". Calling Method from Static Nested Class "NestedStaticDemo" of the Outer Class "NestedClassIntroductionClass"
		NestedClassIntroductionClass.NestedStaticDemo staticObj = new NestedClassIntroductionClass.NestedStaticDemo();
		staticObj.displayCity("Kolkata");
	}
}