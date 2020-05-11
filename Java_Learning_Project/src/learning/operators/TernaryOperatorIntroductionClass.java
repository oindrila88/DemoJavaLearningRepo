package learning.operators;

public class TernaryOperatorIntroductionClass
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		//Is Ternary Operator (?:) Really a Replacement for If-Else
		//There is an object of Object class. It will be instantiated in the "if" block with an Int value if the condition in the "if" statement is True. Otherwise, it will be instantiated in the "else" block with a Double value. Then print the value of that object
		Object obj;
		
		if (true)
			obj = Integer.valueOf(30);
		else
			obj = Double.valueOf(13.89);
		System.out.println("The value of the variable \"obj\" is : " + obj); //30, if True, and, 13.89 if False
		
		//Convert the above code into Ternary Operator
		Object newObj;
		newObj = true? Integer.valueOf(32) : Double.valueOf(17.56);
		System.out.println("The value of the variable \"newObj\" is : " + newObj); //32.0, if True, and, 17.56 if False
		//In Ternary Operator, the data type of both the values to be assigned are checked. The data type of which value is greater in size, the data type of the result will be of that value's data type
		//Among "Int" and "Double", since the size of "Double" is greater than that of "Int", the data type of the result is "Double"
		//Hence, Ternary Operator is Not At All a Replacement for If-Else
	}
}