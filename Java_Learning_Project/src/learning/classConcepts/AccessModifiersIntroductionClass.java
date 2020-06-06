package learning.classConcepts;

public class AccessModifiersIntroductionClass
{	
	//There are two types of Modifiers in Java :
	//1. Access Modifiers - The Access Modifiers in Java specifies the "Accessibility" or "Scope" of a Field, Method, Constructor or Class. The "Access Level" of Fields, Methods, Constructors or Classes can be changed by applying the Access Modifiers on those. Access Modifiers are used to "Encapsulate" the "State of an Object". There are 4 types of Access Modifiers in Java. These are -
	//A. Private - The "Access Level" of a "Private Modifier" is only within the Class. It cannot be accessed from outside the Class. The "Private Modifier" can be applied on Fields, Methods, and, Constructors. This Modifier cannot be applied on Classes
	private int a;
	
	//If a Constructor of any Class is made Private, Object of that Class cannot be created from outside that Class
	/*
	private AccessModifiersIntroductionClass()
	{
		a = 2;
	}
	*/
	
	private void display(int a)
	{
		this.a = a;
		System.out.println("Value of Private int Variable 'a' is : " + a + " in Private Method 'display'");
	}
	
	//B. Default - The "Access Level" of a "Default Modifier" is only within the Package. It cannot be accessed from outside the Package. If no "Access Level" is specified on a Field, Method, Constructor or Class, it will be the "Default Modifier". This Modifier provides more accessibility than Private, but, it is more restricted than Protected and Public
	double b;
	
	void display(double b)
	{
		this.b = b;
		System.out.println("Value of Default double Variable 'b' is : " + b + " in Default Overloaded Method 'display'");
	}
	
	//C. Protected - The "Access Level" of a "Protected Modifier" is within the Package, and, outside the Package through Child Class, i.e., "Inheritance". If there is no Child Class, then it cannot be accessed from outside the Package. The "Protected Modifier" can be applied on Fields, Methods, and, Constructors. This Modifier cannot be applied on Classes. This Modifier provides more accessibility than the "Default Modifier"
	protected int c;
	
	protected void show(int c)
	{
		this.c = c;
		System.out.println("Value of Protected int Variable 'c' is : " + c + " in Protected Method 'show'");
	}
	
	//D. Public - The "Access Level" of a "Public Modifier" is everywhere. It can be accessed from within the Class, outside the Class, within the Package,and, outside the Package. "Public Modifier" has the widest "Scope" among all other Modifiers
	public String name;
	
	public void show(String name)
	{
		this.name = name;
		System.out.println("Value of Public String Variable 'name' is : " + name + " in Public Method 'show'");
	}
	
	//"Private Modifier" can only be used with "Inner Classes"
	
	//2. Non-Access Modifiers - There are many Non-Access Modifiers, such as, "final", "static", "abstract", "synchronize", "native", "volatile", "transient" etc
}