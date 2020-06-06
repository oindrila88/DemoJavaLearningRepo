package learning.classConcepts;

import java.util.*;

public class StaticIntroductionClass
{
	//Static - The keyword "Static" indicates that the particular Member belongs to a Type itself, rather than to an Instance of that Type, i.e., it can be accessed without reference to any Instance (Object). When a Member of a Class is declared "Static", only one Instance of that "Static" Member is created before any Instances (Objects) of that Class are created, and, is shared across all Instances of that Class. "Static" is a "Non-Access Modifier" in Java which is applicable for the following -
	
	//1. Static Variable - In Java, if a "Variable" is declared "Static", then exactly a Single Copy of that "Variable" is created and shared among all Instances of that Class. It doesn't matter how many Instances (Objects) of that Class are created, there will always be only one copy of that particular "Static Variable" belonging to it. Memory of any "Static Variable" is allocated only once in a particular pool in JVM called "Metaspace" since Java8, when the Class is loaded into the Memory. "Static Variables" are "Class-Level Variables"
	//Unlike "Non-Static Variables", "Static Variables" can be accessed directly in "Static" and "Non-Static" Methods
	static int i;
	static String firstName;
	static String name = "Khanika";
	public static double d = 9.5;
	
	void accessStaticVarFromInstanceMethod(int a)
	{
		System.out.println("Previous value of Static int Variable 'i' in Instance Method 'accessStaticVarFromInstanceMethod' : " + i);
		i = a;
		System.out.println("Newly changed value of Static int Variable 'i' in Instance Method 'accessStaticVarFromInstanceMethod' : " + i);
	}
	
	static void accessStaticVarFromStaticMethod(String name)
	{
		System.out.println("Previous value of Static String Variable 'firstName' in Static Method 'accessStaticVarFromStaticMethod' : " + firstName);
		firstName = name;
		System.out.println("Newly changed value of Static String Variable 'firstName' in Static Method 'accessStaticVarFromStaticMethod' : " + firstName);
	}
	
	//2. Static Method - Similar to "Static Variables", "Static Methods" also belong to a Class, instead of any Instance of that Class, and, so "Static Methods" can be called without creating any Instance (Object) of that Class, in which those reside. "Static Methods" are generally used to perform an operation that is supposed to be shared across all Instances of the Class. "Static Methods" are also widely used to create "Utility" or "Helper" Classes so that those can be obtained without creating a new Instance (Object) of these Classes
	//"Static Methods" in Java are resolved at Compile-Time. Since "Method Overriding" is part of "Run-Time Polymorphism" so, "Static Methods" cannot be Overridden. Hence, "Abstract Methods" cannot be "Static" as it need to be Overridden.
	//As "Static Methods" belong to a Class, instead of any Instance of that Class, "this" or "super" keywords cannot be used in "Static Methods"
	//Instance Methods can access "Static Variables", and, "Static Methods" directly, along with "Instance Variables", and, "Instance Methods", while "Static Methods" can access all "Static Variables", and other "Static Methods", but cannot access "Instance Variables", and, "Instance Methods" directly. Those need some Object Reference to be accessed
	void accessStaticMethodFromInstanceMethod(String name)
	{
		System.out.println("Calling Static Method 'accessStaticVarFromStaticMethod' from Instance Method 'accessStaticMethodFromInstanceMethod'");
		accessStaticVarFromStaticMethod(name);
	}
	
	String lastName = "Chakraborty";
	
	static void accessStaticMethodFromStaticMethod(String name)
	{
		System.out.println("Calling Static Method 'accessStaticVarFromStaticMethod' from Static Method 'accessStaticMethodFromStaticMethod'");
		accessStaticVarFromStaticMethod(name);
		
		//Trying to Refer Instance Variable 'lastName' from Static Method 'accessStaticMethodFromStaticMethod'
		//lastName = "Bagchi"; //Error: "Cannot make a static reference to the non-static field lastName"
		
		//Trying to Call Instance Method 'accessStaticVarFromInstanceMethod' from Static Method 'accessStaticMethodFromStaticMethod'
		//accessStaticVarFromInstanceMethod(8); // Error: "Cannot make a static reference to the non-static method accessStaticVarFromInstanceMethod(int) from the type StaticIntroductionClass"
	}
	
	//3. Static Block - Although "Static Variables" can be initialized directly during declaration, yet, there are situations when multi-line coding needs to be written. In such cases, "Static Block" comes in handy.
	//A "Static Block" is used for initializing "Static Variables", which require additional multi-statement logic other than assignment, or, if the "Static Variables" are error-prone and require "Exception Handling", then "Static Block" is used. This block gets executed only once in the entire Program, when a Class is loaded into JVM. That means, JVM will call the "Static Block" even before creating any Objects of the concerned Class. If any code is written in the "Static Block", first those codes will get executed, and, only after that the control will go to the "Constructor" of the concerned Class
	//It is possible to have more than one "Static Blocks" in a single Class. When that Class is loaded in JVM, all the "Static Blocks" will be called in sequence, and, then the "Constructor" of the concerned Class
	static List<String> names = new ArrayList<>();
	
	static
	{
		System.out.println("Adding different names into the List 'names' in First Static Block");
		names.add("Sangeeta");
		names.add("Bithi");
		names.add("Juthika");
		names.add("Ankita");
	}
		
	static
	{
		System.out.println("Assigning value to Static Variables 'i' and 'firstName' in Second Static Block");
		i = 9;
		firstName = "Debajyoti";
	}
		
	static
	{
		System.out.println("Again assigning value to Static Variables 'i' and 'firstName' in Third Static Block");
		i = 12;
		firstName = "Dola";
	}
	
	static int x, y;
	
	static
	{
		x = 0;
		y = 0;
		System.out.println("Dividing Static Variable 'x' by another Static Variable 'y' in Fourth Static Block");
		
		try
		{
			x = x / y;
		}
		catch (Exception e)
		{
			System.out.println("Exception Occurred : " + e.getMessage());
		}
	}
	
	static
	{
		System.out.println("Fetching all the names from the List 'names' in Fifth Static Block");
		
		for (String name : names)
			System.out.print(name + " ");
		System.out.println();
	}
	
	//Count how many Objects of this Class is created
	//Every time an Object is created, the Constructor of that Class is called. Within the Constructor, the int Variable "count" is incremented by 1. The initial value of the int Variable "count" is 0, by default
	//The problem is that, when the first Object is created, the value of the int Variable "count" is incremented by 1, amounting to 1 in the Constructor. But, when the second, or, subsequent Objects would be created, the value of the int Variable "count" for each Object would be 0 initially, and, then would be incremented by 1 in the Constructor. But, the incremented value would not persist to the next call to the Constructor
	//To solve this problem, "static" int Variable is used so that the value persists across the numerous Constructor calls
	
	static int count; //This Variable counts the number of Objects
	
	public StaticIntroductionClass()
	{
		count++;
		System.out.println("The value of 'count' in Default Constructor is : " + count);
	}
	
	//This Method will print the number of Objects created
	void counter()
	{
		System.out.println("Number of Objects Created is : " + count);
	}
}

class SingletonWithNestedStatic
{	
	String state;
	private static int a;
	static double d;
	
	private SingletonWithNestedStatic()
	{
		
	}
	
	//4. Static Nested Class - Java Programming Specification doesn't allow to declare the Top-Level Class as "Static", only Nested Classes can be made "Static". "Static Nested Classes" can access all "Static Members" of the enclosing Outer Class, including "Private Static Members". "Static Nested Classes" do not have access to any Instance Members of the enclosing Outer Class. It can access Instance Members through an Objects's reference
	//The most widely used approach to create "Singleton Objects" is through "Static Nested Class"
	private static class SingletonHolder
	{
		static final SingletonWithNestedStatic instance = new SingletonWithNestedStatic();
		
		// "Static Nested Classes" can access all "Static Members" of the enclosing Outer Class, including "Private Static Members"
		/*
		private void assignValues()
		{
			a = 6;
			d = 3.6;
		}
		*/
	}
	
	static SingletonWithNestedStatic getInstance()
	{
		System.out.println("Calling the Singleton Object from inside the Static Nested Class 'SingletonHolder'");
		return SingletonHolder.instance;
	}
}