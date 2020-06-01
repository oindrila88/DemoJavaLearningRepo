package learning.classConcepts;

public class StaticIntroductionClass
{
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
	
	//Static Block - "Static Block" is a block of code which is executed when a Class is loaded into JVM. That means, JVM will call the "Static Block" even before calling the "main()" Method. If any code is written in the "Static Block", first those codes will get executed, and, only after that the control will go to the "main()" Method
	static
	{
		System.out.println("Hello World!!!! in Static Block 1");
	}
	
	//It is possible to have more than one "Static Blocks" in a single Class. When that Class is loaded in JVM, all the "Static Blocks" will be called in sequence, and, then the "main()" Method. To initialize "Static Variables" with some values, "Static Block" is used
	static String name;
	public static double d;
	
	static
	{
		name = "Oindrila";
		System.out.println("Name in Static Block 2 : " + name);
	}
	
	static
	{
		d = 6.9;
		System.out.println("'d' in Static Block 3 : " + d);
	}
}