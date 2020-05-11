package learning.controlStatements;

public class SwitchCaseStatementsIntroductionClass
{
	public static void main(String[] args)
	{
		/* Selection Control Statements */
		/* Switch-Case Statement */
		//To check Multiple Conditions in an efficient manner without using Multiple If-Else Statement, Switch-Case Statement is used
		//Switch block takes implicitly convertible Int values, Strings (Java 1.7 onwards) or Enum variables
		int num = 5;
		
		//Check if the number is equal to "5" without using "break" Statement
		
		/*
		switch (num)
		{
			case 0:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 0");
			case 1:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 1");
			case 2:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 2");
			case 3:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 3");
			case 4:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 4");
			case 5:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 5");
			case 6:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 6");
			case 7:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 7");
			case 8:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 8");
			case 9:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 9");
			case 10:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 10");
		}
		*/
		
		//If "break" is not used in any of the cases, once the case matches, all the cases below it will still be evaluated. To stop that "break" should be used in every cases.
		//Check if the number is equal to "5" using "break" Statement
		switch (num)
		{
			case 0:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 0");
				break;
			case 1:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 1");
				break;
			case 2:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 2");
				break;
			case 3:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 3");
				break;
			case 4:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 4");
				break;
			case 5:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 5");
				break;
			case 6:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 6");
				break;
			case 7:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 7");
				break;
			case 8:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 8");
				break;
			case 9:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 9");
				break;
			case 10:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 10");
				break;
		}
		
		//If the condition to check doesn't match with with any of the provided cases, a default case should be present in the Switch block
		num = 16;
		
		switch (num)
		{
			case 0:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 0");
				break;
			case 1:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 1");
				break;
			case 2:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 2");
				break;
			case 3:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 3");
				break;
			case 4:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 4");
				break;
			case 5:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 5");
				break;
			case 6:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 6");
				break;
			case 7:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 7");
				break;
			case 8:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 8");
				break;
			case 9:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 9");
				break;
			case 10:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to 10");
				break;
			default:
				System.out.println("The variable \"num\" having value '" + num + "' is equal to no value listed in any of the cases");
		}
		
		//Switch block takes Byte because, ultimately the Byte value gets implicitly converted into Integer value
		byte b = 3;
		
		switch(b)
		{
			case 0:
				System.out.println("Byte value is 0");
				break;
			case 1:
				System.out.println("Byte value is 1");
				break;
			case 2:
				System.out.println("Byte value is 2");
				break;
			case 3:
				System.out.println("Byte value is 3");
				break;
			case 4:
				System.out.println("Byte value is 4");
				break;
			case 5:
				System.out.println("Byte value is 5");
				break;
			default:
				System.out.println("Byte value doesn't matches");
		}
		
		//Switch block takes Short because, ultimately the Short value gets implicitly converted into Integer value
		short s = 3001;
				
		switch(s)
		{
			case 3000:
				System.out.println("Short value is 3000");
				break;
			case 3001:
				System.out.println("Short value is 3001");
				break;
			case 3002:
				System.out.println("Short value is 3002");
				break;
			case 3003:
				System.out.println("Short value is 3003");
				break;
			case 3004:
				System.out.println("Short value is 3004");
				break;
			case 3005:
				System.out.println("Short value is 3005");
				break;
			default:
				System.out.println("Short value doesn't matches");
		}
		
		//Switch block using Int
		int i = 76902;
						
		switch(i)
		{
			case 76900:
				System.out.println("Int value is 76900");
				break;
			case 76901:
				System.out.println("Int value is 76901");
				break;
			case 76902:
				System.out.println("Int value is 76902");
				break;
			case 76903:
				System.out.println("Int value is 76903");
				break;
			case 76904:
				System.out.println("Int value is 76904");
				break;
			case 76905:
				System.out.println("Int value is 76905");
				break;
			default:
				System.out.println("Int value doesn't matches");
		}
		
		//Switch block doesn't take Long values
		//Switch block doesn't take Float values
		//Switch block doesn't take Double values
		
		//Switch block takes Character because, ultimately the Character value gets implicitly converted into Integer value
		char c = 'B';
								
		switch(c)
		{
			case 'A':
				System.out.println("Character value is 'A'");
				break;
			case 'B':
				System.out.println("Character value is 'B'");
				break;
			case 'C':
				System.out.println("Character value is 'C'");
				break;
			case 'D':
				System.out.println("Character value is 'D'");
				break;
			case 'E':
				System.out.println("Character value is 'E'");
				break;
			case 'F':
				System.out.println("Character value is 'F'");
				break;
			default:
				System.out.println("Character value doesn't matches");
		}
		
		//Switch block using String
		String str = "Three";
										
		switch(str)
		{
			case "Zero":
				System.out.println("String value is \"Zero\"");
				break;
			case "One":
				System.out.println("String value is \"One\"");
				break;
			case "Two":
				System.out.println("String value is \"Two\"");
				break;
			case "Three":
				System.out.println("String value is \"Three\"");
				break;
			case "Four":
				System.out.println("String value is \"Four\"");
				break;
			case "Five":
				System.out.println("String value is \"Five\"");
				break;
			default:
				System.out.println("String value doesn't matches");
		}
		
		//Multiple Case Statements Having Single Operation
		//Find if the Unitary Digit of a 3-Digit Number is Equal to 3 or 5 or 7 Using the Switch-Case Statement
		int num1 =307;
		int unitDigit = num1 % 100;
		
		switch(unitDigit)
		{
			case 0:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '0'");
				break;
			case 1:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '1'");
				break;
			case 2:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '2'");
				break;
			case 3:
			case 5:
			case 7:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '3' or '5' or '7'");
				break;
			case 4:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '4'");
				break;
			case 6:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '6'");
				break;
			case 8:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '8'");
				break;
			case 9:
				System.out.println("Unitary Digit of the number \"num1\" " + num1 + " is '9'");
				break;
		}
	}
}