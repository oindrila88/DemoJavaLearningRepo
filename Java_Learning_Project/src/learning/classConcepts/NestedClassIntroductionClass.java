package learning.classConcepts;

public class NestedClassIntroductionClass
{
	//Nested Class - Writing a Class within another Class is allowed in Java. The Class written within is called the "Nested Class", and, the Class that holds the "Nested Class"is called the "Outer Class". It provides a compelling way of grouping elements that are only going to be used in one place, this helps to keep code more organized and readable
	
	//"Nested Classes" are divided into two types -
	//1. Non-Static Nested Class - "Non-Static Nested Classes" are a "Security Mechanism" in Java. It is known that, a Class cannot be associated with the "Private Access Modifier", but if the Class is a Member of another Class, then the "Nested Class" can be made Private, and, this is also used to access the Private Instance Members of concerned Outer Class. "Non-Static Nested Classes" are of three types depending on how and where the Classes are defined. These are -
	//A. Inner Class - Creating an "Inner Class" is quite simple. A Class just needs to be written within another Class. Unlike a Class, an "Inner Class" can be private, and, once an "Inner Class" is declared Private, it cannot be accessed from outside the Outer Class using its Object 
	
	//There cannot be any "Static Member" in an "Inner Class", because an "Inner Class" is implicitly associated with an Object of its corresponding Outer Class. So the "Inner Class" cannot define any "Static Member" for itself, unless it is initialized with a Constant Expression, i.e., "final" is used with that Member
	
	//A Member inside an "Inner Class" shadows any Member of the enclosing scope, i.e., of the Outer Class that have the same name
	
	//The following "Inner Class" is made Private and is accessed through a Method of its Outer Class
	int x = 6;
	
	private class Inner_NestedClassIntroductionClass
	{
		int x = 8;
		final static float f = 5.9f;
		
		void show()
		{
			System.out.println("Inside the 'show' Method of the Inner Class 'Inner_NestedClassIntroductionClass'");
			System.out.println("Value of 'x' inside the Inner Class 'Inner_NestedClassIntroductionClass' is : " + x);
			System.out.println("Value of Constant Static float Variable 'f' inside the Inner Class 'Inner_NestedClassIntroductionClass' is : " + f);
		}
	}
	
	void accessInnerClass()
	{
		Inner_NestedClassIntroductionClass obj = new Inner_NestedClassIntroductionClass();
		obj.show();
	}
	
	//Access Private Instance Members of Outer Class using Non-Private Inner Class - An Inner Class can be used to access the Private Instance Members of the concerned Outer Class. In that case, the Private Instance Members of the concerned Outer Class need to be returned from a Method within the Inner Class
	private String name;
	
	public NestedClassIntroductionClass()
	{

	}
	
	public NestedClassIntroductionClass(String name)
	{
		this.name = name;
	}
	
	class Inner_AccessPrivate_NestedClassIntroductionClass
	{
		public String getPrivateName()
		{
			System.out.println("Returning the Private Member 'name' from the Inner Class 'Inner_AccessPrivate_NestedClassIntroductionClass'");
			return name;
		}
	}
	
	//B. Method-Local Inner Class - In Java, a Class can be written inside a Method, and, this will be a Local Type Class. Like a regular Local Variable, the "Scope" of such Inner Class is restricted within the concerned Method. A "Method-Local Inner Class" can be instantiated only within the Method, where the Inner Class is defined
	
	//There cannot be any "Static Member" in a "Method-Local Inner Class", because a "Method-Local Inner Class" is implicitly associated with an Object of the Outer Class which contains the Outer Method where the "Method-Local Inner Class" is specified. So the "Method-Local Inner Class" cannot define any "Static Member" for itself, unless it is initialized with a Constant Expression, i.e., "final" is used with that Member
	
	//A Member inside an "Method-Local Inner Class" shadows any Member of the enclosing scope, i.e., of the Outer Method, or, of the Outer Class that have the same name
	static int i = 0;
	
	void show()
	{
		int a = 34;
		
		//Method-Local Inner Class
		class showMethodInner_NestedClassIntroductionClass
		{
			final static int v = 7;
			int a = 56;
			
			void show()
			{
				System.out.println("Inside the 'show' Method of the Method-Local Inner Class 'showMethodInner_NestedClassIntroductionClass'");
				System.out.println("Value of 'a' inside the Method 'show()' of Method-Local Inner Class 'showMethodInner_NestedClassIntroductionClass' is : " + a);
				System.out.println("Value of Constant Static int Variable 'v' inside the Method 'show()' of Method-Local Inner Class 'showMethodInner_NestedClassIntroductionClass' is : " + v);
			}
		}
		
		showMethodInner_NestedClassIntroductionClass innerObj = new showMethodInner_NestedClassIntroductionClass();
		innerObj.show();
	}
	
	//C. Anonymous Inner Class - An Inner Class declared without a Class name is known as an "Anonymous Inner Class". "Anonymous Inner Classes" are declared and instantiated at the same time to create only a Single Object. Generally, "Anonymous Inner Class" is used to override the Method of a Class, or, an Interface. "Anonymous Inner Classes" are useful in writing "Implementation Classes" for "Listener Interfaces" in Graphics Programming. Based on declaration and behaviour, three types of "Anonymous Inner Classes" can be created
	//i. Anonymous Inner Class that Extends a Class - Without implementing any named Class, i.e., to directly create only a Single Object of an "Abstract", or "Concrete" Class, "Anonymous Inner Class" is used
	
	//Anonymous Inner Class that Extends an Abstract Class
	DemoAbstract objDemoAbstract = new DemoAbstract()
	{
		@Override
		void setA(int a)
		{
			System.out.println("Inside the 'setA' Method of the Anonymous Inner Class of the Abstract Class 'DemoAbstract'");
			System.out.println("Previous value of 'a' " + this.a + " is now replaced with the new value : " + a);
			this.a = a;
		}

		@Override
		int getA()
		{
			System.out.println("Returning the value of 'a' from the 'getA' Method of the Anonymous Inner Class of the Abstract Class 'DemoAbstract' : " + this.a);
			return this.a;
		}
	};
	
	//Anonymous Inner Class that Extends a Concrete Class
	DemoClass objDemoClass = new DemoClass()
	{
		void setB(int b)
		{
			System.out.println("Inside the 'setB' method of the Anonymous Inner Class of the Concrete Class 'DemoClass'");
			System.out.println("Previous value of 'a' " + this.b + " is now replaced with the new value : " + b);
			this.b = b;
		}

		int getB()
		{
			System.out.println("Returning the value of 'b' from the 'getB' Method of the Anonymous Inner Class of the Concrete Class 'DemoClass' : " + this.b);
			return this.b;
		}
	};
	
	//ii. Anonymous Inner Class that Implements an Interface - Without implementing any named Class, i.e., to directly create only a Single Object of an "Interface", "Anonymous Inner Class" is used
	DemoInterface objDemoInterface = new DemoInterface()
	{
		@Override
		public String getFirstName()
		{
			System.out.println("Returning the value of 'firstName' from the 'getFirstName' Method of the Anonymous Inner Class of the Interface 'DemoInterface' : " + firstName);
			return firstName;
		}

		@Override
		public String getLastName()
		{
			System.out.println("Returning the value of 'lastName' from the 'getLastName' Method of the Anonymous Inner Class of the Interface 'DemoInterface' : " + lastName);
			return lastName;
		}
	};
	
	//iii. Anonymous Inner Class as "Method / Constructor Argument" - If a Method , or, a Constructor accepts an Object of an "Interface", an "Abstract" Class, or, a "Concrete" Class, then the "Interface" is implemented, "Abstract" or "Concrete" Class is extended and that Object is passed to the Method. In all the three cases, an "Anonymous Inner Class" is passed as an Argument to the concerned Method or Constructor
	void printDemoInterfaceMethods(DemoInterface demo)
	{
		demo.getFirstName();
		demo.getLastName();
	}
	
	//2. Static Nested Class - A "Static Nested Class" is a Nested Class which is a "Static Member" of the Outer Class. It can be accessed without instantiating the Outer Class, using other "Static Members". "Static Nested Classes" do not have access to any Instance Members of the enclosing Outer Class. It can access Instance Members through an Objects's reference
	static String city = "Bhubaneswar";
	
	static class NestedStaticDemo
	{
		String city = "";
		
		void displayCity(String city)
		{
			this.city = city;
			System.out.println("Displaying the value of 'city' from the 'displayCity' Method of the Static Nested Class : " + city);
		}
	}
}

abstract class DemoAbstract
{
	int a = 23;
	
	abstract void setA(int a);
	abstract int getA();
}

class DemoClass
{
	int b = 33;
	
	void setB(int b)
	{
		this.b = b;
	}
	
	int getB()
	{
		return b;
	}
}

interface DemoInterface
{
	String firstName = "Oindrila";
	String lastName = "Bagchi";
	
	String getFirstName();
	String getLastName();
}