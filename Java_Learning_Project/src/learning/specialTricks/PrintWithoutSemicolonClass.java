package learning.specialTricks;

public class PrintWithoutSemicolonClass
{
	public static void main(String[] args)
	{
		//Directly not possible asmissing a semicolon ";" at the end of any valid statement will give error
		//println() method returns void, i.e. nothing, while printf() method returns an object of PrintStream class
		//Put printf() method inside an "if" statement to check if the printf() method returns "null"
		//"if" statement doesn't use a semicolon ";" at the end. Hence, no a semicolon ";" is used at all
		
		//printf() method will return an object of PrintStream class and will come out of the "if" block as the condition will be False. But the most important thing is that the text "Oindrila Chakraborty Bagchi" will be printed without using any semicolon ";"
		if (System.out.printf("Oindrila Chakraborty Bagchi") == null)
		{
			
		}
	}
}