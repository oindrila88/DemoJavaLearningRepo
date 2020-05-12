package learning.operators;

public class TernaryOperatorIntroductionClass
{
	public static void main(String[] args)
	{
		//Ternary Operator - It is the only Conditional Operator that takes three Operands. It is a one-liner replacement for "If-Else" or "If-Else If-Else" statement. It can also be used to replace Switch-Case block
		
		//Replace "If-Else If-Else" Statement Using Ternary Operator
		//Assign "11" to the Int variable "a" if the value of the Int variable "j" is between 1 and 10 and assign "31" to the Int variable "a" if the value of the Int variable "j" is between 21 and 30 and if the value of the Int variable "j" does not satisfy both the above two conditions then assign "101" to the Int variable "a" Using If-Else Statement
		int j = 15, a = 0;
		
		if (j >= 1 && j <= 10)
			a = 11;
		else if (j >= 21 && j <= 30)
			a = 31;
		else
			a = 101;
		
		System.out.println("The value of the variable \"a\" is : " + a);
		
		//Assign "11" to the Int variable "a" if the value of the Int variable "j" is between 1 and 10 and assign "31" to the Int variable "a" if the value of the Int variable "j" is between 21 and 30 and if the value of the Int variable "j" does not satisfy both the above two conditions then assign "101" to the Int variable Using Ternary Operator
		System.out.println("Replacing \"If-Else If-Else\" Statement Using \"Ternary Operator\"");
		
		a = j >= 1 && j <= 10 ? 11 : j >= 21 && j <= 30 ? 31 : 101;
		
		System.out.println("The value of the variable \"a\" is : " + a);
		
		//Replace Switch-Case Statement Using Ternary Operator
		//Print "11" if the value of the Int variable "k" is 10 and print "31" if the value of the Int variable "k" is 31 and if the value of the Int variable "j" does not satisfy both the above two conditions then print "101" Using Switch-Case Statement
		int k = 30;
		
		switch(k)
		{
			case 10:
				System.out.println("The value to print is '11'" );
				break;
			case 30:
				System.out.println("The value to print is '31'" );
				break;
			default:
				System.out.println("The value to print is '101'" );
				break;
		}
		
		//Print "11" if the value of the Int variable "k" is 10 and print "31" if the value of the Int variable "k" is 31 and if the value of the Int variable "j" does not satisfy both the above two conditions then print "101" Using Ternary Operator
		System.out.println("Replacing \"Switch-Case\" Statement Using \"Ternary Operator\"");
		
		System.out.print("The value to print is : ");
		System.out.print(k == 10? "11" : k ==30 ? "31" : "101");
		System.out.println();
		
		//Is Ternary Operator (?:) Really a Replacement for If-Else
		//There is an object of Object class. It will be instantiated in the "if" block with an Int value if the condition in the "if" statement is True. Otherwise, it will be instantiated in the "else" block with a Double value. Then print the value of that object
		Object obj;
		boolean b = true;
		
		if (b)
			obj = Integer.valueOf(30);
		else
			obj = Double.valueOf(13.89);
		System.out.println("The value of the variable \"obj\" is : " + obj); //30, if True, and, 13.89 if False
		
		//Convert the above code into Ternary Operator
		Object newObj;
		newObj = b ? Integer.valueOf(32) : Double.valueOf(17.56);
		System.out.println("The value of the variable \"newObj\" is : " + newObj); //32.0, if True, and, 17.56 if False
		//In Ternary Operator, the data type of both the values to be assigned are checked. The data type of which value is greater in size, the data type of the result will be of that value's data type
		//Among "Int" and "Double", since the size of "Double" is greater than that of "Int", the data type of the result is "Double"
		//Hence, Ternary Operator is Not At All a Replacement for If-Else
	}
}