package learning.specialTricks;

public class BinaryLiteralPresentationIntroductionClass
{
	public static void main(String[] args)
	{
		//To store Binary value, e.g. 1000, of respective Integral value, e.g. 8, in an Int variable, "0B" or "0b" is placed at the beginning of the Binary value. Placing "0B" or "0b" before any Integral value makes that value a Binary Literal in Java
		int i = 0b1000;
		
		//Since "i" contains a Binary Literal, printing "i" would print the value of the corresponding Integer value, i.e. 8
		System.out.println("Integer Value of the Binary Literal '0b1000' is : " + i);
		
		//While storing a Binary Literal in an Int variable, if the Binary Literal contains many zeros and it becomes troublesome to keep track of it, to count the number of zeros Underscore "_" is used to separate each zero so that users can keep track of the number of zeros. This functionality is added since Java 1.7
		int j = 0b1_0_0_0_0_0_0_0_0_0_0;
		//Print the corresponding Integral value of the Binary Literal "0b1_0_0_0_0_0_0_0_0_0_0". It prints "1024"
		System.out.println("Integer Value of the Binary Literal '0b1_0_0_0_0_0_0_0_0_0_0' is : " + j);
	}
}