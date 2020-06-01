package learning.classConcepts;

public class ConstructorIntroductionClass
{
	int x;
	double y;
	String s;
	
	//Point 1: Constructor is a Special Member Method of the Class, which has the same name as the Class name
	
	//Point 2: Every time an Object of any Class needs to be created, the Constructor needs to be used. It will communicate with the JVM that it wants to create an Object. How much space is required will be given by the Constructor.
	//So Constructor will be used to allocate Heap Memory to an Object
	
	//Point 3: Even if no explicit Constructor is created for a Class, there will be an implicit Constructor for every Class, called a "Default Constructor"
	
	//Point 4: Constructor will never return anything. So no need to mention any Return Type
	
	//Point 5: Constructor is used to initialize any Member Variables of a Class in an Object
	
	//Point 6: A Constructor can't be called for an Object Instance already created. Every time an Object is created, it will call the Constructor by itself automatically
	
	//Point 7: There can be multiple Constructors having different Parameters in a Class. This is called "Constructor Overloading", a part of "Polymorphism"
	
	//Point 8: If there is a Parameterized Constructor in a Class, there should also be a Default Constructor defined in the same Class
	
	public ConstructorIntroductionClass(int i)
	{
		System.out.println("Inside Integer Constructor");
		x = i;
	}
	
	public ConstructorIntroductionClass(double d)
	{
		System.out.println("Inside Double Constructor");
		x = (int)d;
	}
	
	//Constructor with Variable Arguments
	public ConstructorIntroductionClass(int i, double j, String k, String ...l)
	{
		x = i;
		y = j;
		s = k;
		System.out.println("Variable Arguments in Constructor : ");
		for(String st : l)
			System.out.print(st + " ");
		System.out.println("");
	}
	
	public ConstructorIntroductionClass()
	{
		x = 2;
	}
	
	void displayX()
	{
		System.out.println("Value of 'x' is : " + x);
	}
}