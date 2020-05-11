package learning.controlStatements;

public class IfElseElseIfStatementsIntroductionClass
{
	public static void main(String[] args)
	{
		/* Selection Control Statements */
		/* Simple If Statement for Single Condition check (Only True) */
		int n = 10;
		
		//Check if the number is equal to "10"
		if (n == 10)
			System.out.println("The variable \"n\" having value '" + n + "' is equal to 10"); //Executed if the condition is True
		
		/* If-Else Statement for Single Condition check (True and False) */
		int num = 7;
		
		//Check if the number is even or odd. State the condition in if statement
		if (num % 2 == 0)
			System.out.println("The variable \"num\" having value '" + num + "' is Even"); //Executed if the condition is True
		else
			System.out.println("The variable \"num\" having value '" + num + "' is Odd"); //Executed if the condition is False
		
		/* Multiple If-Else Statement for Multiple Conditions check */
		//Even if a particular condition matches, still all the subsequent if statements will be evaluated and also else statement will be evaluated
		int n1 = 11;
		
		//Check if the number is equal to "11"
		if (n1 == 5)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 5"); //Executed if the first condition is True
		if (n1 == 7)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 7"); //Executed if the second condition is True
		if (n1 == 9)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 9"); //Executed if the third condition is True
		if (n1 == 11)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 11"); //Executed if the fourth condition is True
		if (n1 == 13)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 13"); //Executed if the fifth condition is True
		if (n1 == 15)
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to 15"); //Executed if the sixth condition is True
		else
			System.out.println("The variable \"n1\" having value '" + n1 + "' is equal to no value listed"); //Executed if all the conditions are False
		
		/* Nested If-Else Statement for Multiple Conditions check */
		int no1 = 22, no2 = 17, no3 = 26;
		//Check if the number "no1" is smaller than the number "no2"
		if (no1 < no2)
		{
			//Check if the number "no1" is smaller than the number "no3"
			if (no1 < no3)
				System.out.println("The variable \"no1\" having value '" + no1 + "' is Smallest"); //Executed if the nested condition is True
			else
				System.out.println("The variable \"no3\" having value '" + no3 + "' is Smallest"); //Executed if the nested condition is False
		}
		else
		{
			//Check if the number "no2" is smaller than the number "no3"
			if (no2 < no3)
				System.out.println("The variable \"no2\" having value '" + no2 + "' is Smallest"); //Executed if the nested condition is True
			else
				System.out.println("The variable \"no3\" having value '" + no3 + "' is Smallest"); //Executed if the nested condition is False
		}
		
		//Print the smallest number from the three numbers - "no1", "no2", and, "no3"
		
		/* If-Else If Statement for Multiple Conditions check */
		//If a particular condition matches, all the conditions below it will be skipped
		int num1 = 6, num2 = 10, num3 = 8;
		
		//Print the biggest number from the three numbers - "num1", "num2", and, "num3"
		//Check if the number "num1" is greater than both the numbers "num2" and "num3". State the conditions in if statement
		if (num1 > num2 && num1 > num3)
			System.out.println("The variable \"num1\" having value '" + num1 + "' is Biggest"); //Executed if the first condition is True
		else if (num2 > num3)
			System.out.println("The variable \"num2\" having value '" + num2 + "' is Biggest"); //Executed if the above condition is False and this condition is True
		else
			System.out.println("The variable \"num3\" having value '" + num3 + "' is Biggest"); //Executed if both the above conditions are False
	}
}