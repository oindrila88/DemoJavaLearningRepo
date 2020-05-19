package learning.arrays;

public class VariableArgumentsIntroductionClass
{
	static public void main(String... args)
	{
		//Pass One Parameter to the Method "show"
		show(4);
		
		//Pass Two Parameter to the Same Method "show"
		show(5, 8);
		
		//If it is not known how many values to pass as Parameter to a Method, instead of writing all possible Overloaded Methods, it is better to send a Variable Argument (VarArgs) as Parameter to the Method. Make sure every Argument sent from the Calling Method would be of the same Data Type
		//Pass Any Number of Parameters to the Same Method "show"
		show(6, 3, 9, 1, 10, 23, 'A');
		
		//When working with VarArgs, JVM always gives priority to the exact signature method. If the exact signature method is not present, only then JVM looks for the VarArgs method
		show(12, 18);
		
		//Pass A String, An Integer and Any Number of Parameters to the Same Method "show"
		show("Oindrila", 63377, 45, 78, 90, 12, 67, 43);
	}
	
	//Method "show" Having One Integer Parameter
	static void show(int a)
	{
		System.out.println("In 'show' Method with One Parameter");
		System.out.println("a = " + a);
	}
	
	//Method "show" Having One Integer Parameter
	static void show(int a, int b)
	{
		System.out.println("In 'show' Method with Two Parameter");
		System.out.println("a = " + a + " b = " + b);
	}
	
	//Method "show" Having VarArgs Parameter
	//To Denote a Parameter as VarArg, Place "..." After the Corresponding Data Type of that Parameter
	static void show(int... arr)
	{
		System.out.println("In 'show' Method with VarArgs Parameter");
		System.out.print("VarArgs Parameters = ");
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	//Method "show" Having Normal Parameters, As Well As VarArgs Parameter
	//To Denote a Parameter as VarArg, Place "..." After the Corresponding Data Type of that Parameter. There can be only one VarArgs Parameter in a Method Signature, and, the VarArgs Parameter should be the last parameter in the Method Signature
	static void show(String s, int i, int... arr)
	{
		System.out.println("In 'show' Method with Normal Parameters, As Well As VarArgs Parameter");
		
		System.out.println("String = " + s);
		System.out.println("Integer = " + i);
		System.out.print("varArgs Parameters = ");
		for(int x : arr)
			System.out.print(x + " ");
		System.out.println();
	}
}