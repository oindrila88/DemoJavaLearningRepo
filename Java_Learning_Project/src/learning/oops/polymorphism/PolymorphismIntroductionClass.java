package learning.oops.polymorphism;

public class PolymorphismIntroductionClass
{
	private int a;
	private double d;	
	private static int i;
	private static double x;
	
	//Polymorphism - "Polymorphism" is an "Object Oriented Programming" feature that allows to perform a single action in different ways
	//Types of Polymorphism -
	//1. Compile-Time Polymorphism - "Polymorphism" that is resolved during "Compile-Time" is known as "Compile-Time Polymorphism", or, "Static Polymorphism". "Method Overloading" can be considered as "Compile-Time Polymorphism"
	//Method Overloading - "Method Overloading" allows to have more than one "Methods" with same "Name" in a Class that differs in "Signature"
	//"Method Overloading" of Instance Methods
	public void setAandB(int a, double d)
	{
		System.out.println("Inside the method : 'setAandB(int, double)'");
		this.a = a;
		this.d = d;
	}
	
	public void setAandB(double d, int a)
	{
		System.out.println("Inside the method : 'setAandB(double, int)'");
		this.d = d;
		this.a = a;
	}
	
	public void showAandB()
	{
		System.out.println("a = " + a + ", d = " + d);
	}
	
	//"Method Overloading" of an Instance Method is not possible with different "Access Modifier", and, "Return Type" having parameters of same "Numbers", and, same "Data Types" in the same "Order"
	/*
	protected int setAandB(int a, double d)
	{
		System.out.println("Inside the method : 'setAandB(int, double)'");
		this.a = a;
		this.d = d;
		return a;
	}
	*/
	
	//"Method Overloading" of Static Methods
	public static void setIandX(int m, double n)
	{
		System.out.println("Inside the 'Static' method : 'setIandX(int, double)'");
		i = m;
		x = n;
	}
	
	public static void setIandX(double n, int m)
	{
		System.out.println("Inside the 'Static' method : 'setIandX(double, int)'");
		i = m;
		x = n;
	}
	
	public static void showIandX()
	{
		System.out.println("i = " + i + ", x = " + x);
	}
	
	//"Method Overloading" of a "Static Method" is not possible with different "Access Modifier", and, "Return Type" having parameters of same "Numbers", and, same "Data Types" in the same "Order"
	/*
	protected static int setIandX(int m, double n)
	{
		System.out.println("Inside the 'Static' method : 'setIandX(int, double)'");
		i = m;
		x = n;
		return i;
	}
	*/
	
	//Two "Methods" (one "Static", and, another "Instance") with the same "Name", having parameters of same "Numbers", and, same "Data Types" in the same "Order", cannot be kept in a Class. Hence, "Method Overloading" is not possible
	/*
	public void setIandX(int m, double n)
	{
		System.out.println("Inside the method : 'setIandX(int, double)'");
		i = m;
		x = n;
	}
	*/
	//2. Run-Time Polymorphism - "Polymorphism" that is resolved during "Run-Time" is known as "Run-Time Polymorphism", or, "Dynamic Polymorphism". "Method Overriding" can be considered as "Run-Time Polymorphism"
}