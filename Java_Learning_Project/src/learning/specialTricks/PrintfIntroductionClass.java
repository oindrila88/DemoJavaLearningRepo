package learning.specialTricks;

public class PrintfIntroductionClass
{
	public static void main(String[] args)
	{
		//In the method description of "printf", this method returns an object of PrintStream class
		//This method is equivalent to the "printf" method of C
		int i = 5, j = 4;
		int result = i + j;
		System.out.printf("The addition of %d and %d is : %d", i, j, result);
	}
}