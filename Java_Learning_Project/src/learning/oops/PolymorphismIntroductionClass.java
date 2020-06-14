package learning.oops;

public class PolymorphismIntroductionClass
{
	static final int x = 5;
	final double d = 12.78;
	static int i;
	static
	{
		i = 8;
		System.out.println("i = " + i);
		System.out.println("x = " + x);
	}
	
	public void getA(int a, float b)
	{
		final int m;
		//static final double d = 9.4; //"Final" variable can't be "Static" in "Instance Method"
		m = 8;
		System.out.println("m = " + m);
	}
	
	public static void getA(float b, int a)
	{
		final double t;
		//static final double d = 9.4; //"Final" variable can't be "Static" in "Static Method"
		t = 4.5;
		System.out.println("t = " + t);
	}
	
	//Method Overloading not possible with different Access Modifier, and, Return Type having parameters of same numbers, and, same data types in the same order
	/*
	private int getA(int a, float b)
	{
		return 0;
	}
	*/
}