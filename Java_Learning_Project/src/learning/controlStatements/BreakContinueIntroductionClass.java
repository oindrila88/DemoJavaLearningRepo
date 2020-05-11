package learning.controlStatements;

public class BreakContinueIntroductionClass
{
	public static void main(String[] args)
	{
		//Branching Statements - Statements that are used to jump from a statement to another statement, thereby transferring the flow of the execution
		/* 1. Unlabeled Break */
		//A. To come out from an inner loop when a condition is met, "Break" statement is used. If there is any surrounding outer loop, control goes to the corresponding statement inside that outer loop
		
		//Outer loop iterates from 1 to 4. Inner loop iterates from 1 to 4. Come out from the inner loop when value of the inner loop is checked to be 3 inside it
		System.out.println("Unlabeled Break Using Loop :");
		
		for (int i = 1; i <= 4; i++)
		{
			System.out.print("i = " + i + " ");
			for (int j = 1; j <= 4; j++)
			{
				if (j == 3)
					break; //Unlabeled Break
				System.out.print("j = " + j + " ");
			}
			System.out.println();
		}
		
		//B. To come out of any Switch block when a condition is met, "Break" statement is used.
		//If the value of the variable "c" matches with the character "O", the control comes out from the Switch block
		System.out.println("Unlabeled Break Using Switch Block :");
		
		char c = 'O';
		
		switch(c)
		{
			case 'M':
				System.out.println("Character value is 'M'");
				break;
			case 'N':
				System.out.println("Character value is 'N'");
				break;
			case 'O':
				System.out.println("Character value is 'O'");
				break;
			case 'P':
				System.out.println("Character value is 'P'");
				break;
			case 'Q':
				System.out.println("Character value is 'Q'");
				break;
			case 'R':
				System.out.println("Character value is 'R'");
				break;
			default:
				System.out.println("Character value doesn't matches");
		}
		
		/* 2. Labeled Break */
		//If there are multiple loops and the control needs to be forced out from the outer loop while the code is being executed in innermost loop, Labeled Break is used
		//In this case, each loop needs to be labeled by any non-reserved keyword in Java as identifier, followed by a colon ":". The colon ":" defines that the preceding keyword is a label
		//Outer loop iterates from 1 to 4. Inner loop iterates from 1 to 4. Come out from the outer loop when the value of the outer loop is checked to be 3 inside the inner loop
		System.out.println("Labeled Break Using Loop :");
		
		loop1:
		for (int i = 1; i <= 4; i++)
		{
			System.out.print("i = " + i + " ");
			loop2:
			for (int j = 1; j <= 4; j++)
			{
				if (i == 3)
					break loop1; //Labeled Break
				System.out.print("j = " + j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* 3. Unlabeled Continue */
		//To jump to the next iteration with the next counter value and skip the remaining codes of the current iteration in any loop, "Continue" statement is used
		//Outer loop iterates from 1 to 4. Inner loop iterates from 1 to 4. Continue the inner loop with the next counter value when value of the inner loop is checked to be 3 inside it
		System.out.println("Unlabeled Continue Using Loop :");
		
		for (int i = 1; i <= 4; i++)
		{
			System.out.print("i = " + i + " ");
			for (int j = 1; j <= 4; j++)
			{
				if (j == 3)
					continue; //Unlabeled Continue
				System.out.print("j = " + j + " ");
			}
			System.out.println();
		}
		
		//If there are multiple loops and the control needs to be forcibly start the outer loop with the next counter value while the code is being executed in innermost loop, and, and skip the remaining codes of the current iteration in the innermost loop, Labeled Continue is used
		//In this case, each loop needs to be labeled by any non-reserved keyword in Java as identifier, followed by a colon ":". The colon ":" defines that the preceding keyword is a label
		//Outer loop iterates from 1 to 4. Inner loop iterates from 1 to 4. Continue the outer loop with the next counter value when value of the outer loop is checked to be 3 inside the inner loop
		System.out.println("Labeled Continue Using Loop :");
		
		loop1:
		for (int i = 1; i <= 4; i++)
		{
			System.out.print("i = " + i + " ");
			loop2:
			for (int j = 1; j <= 4; j++)
			{
				if (i == 3)
					continue loop1; //Labeled Continue
				System.out.print("j = " + j + " ");
			}
			System.out.println();
		}
		
	}
}