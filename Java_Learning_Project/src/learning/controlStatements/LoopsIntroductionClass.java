package learning.controlStatements;

public class LoopsIntroductionClass
{
	public static void main(String[] args)
	{
		//Iteration Control Statements
		//To perform same task repeatedly in Java, Iteration block, i.e., Loops are used
		//In java, 4 types of Loops are available - 1. While 2. Do-While 3. For 4. ForEach
		//Any Loop has three parts - A. Initialization B. Condition C. Increment
		
		//1. While Loop - First checks the condition, then executes the associated Iteration block only if the condition turns out to be True
		//Print all the numbers from 1 till 10 using While Loop
		
		//A. Initialize the counter variable
		int countWhile = 1;
		
		System.out.println("Value in While Loop :");
		
		//B. Provide the condition in the While loop
		while(countWhile < 10)
		{
			System.out.println("Value is : " + countWhile);
			//C. Increment the counter variable by 1
			countWhile++;
		}
		
		//Print all the numbers from 1 till infinity, i.e., infinite loop using While Loop
		//Here, don't need to check any condition. The Iteration block needs to be run every time. While loop always looks for condition to be "True". So, in place of condition, pass "True" in While loop
		/*
		//A. Initialize the counter variable
		int infiniteCountWhile = 1;
		boolean b = true;
		
		System.out.println("Value in Infinite While Loop :");
		
		while(b)
		{
			System.out.println("Value is : " + infiniteCountWhile);
			//C. Increment the counter variable by 1
			infiniteCountWhile++;
		}
		*/
		
		//2. Do-While Loop - First Iteration block is executed, even if the condition turns out to be False. Then the associated condition is checked 
		//Print all the numbers from 1 till 10 using Do-While Loop
		
		//A. Initialize the counter variable With a Value Less Than 10
		int countDoWhile = 1;
		
		System.out.println("Value in Do-While Loop Where Condition is True :");
			
		do
		{
			System.out.println("Value is : " + countDoWhile);
			//C. Increment the counter variable by 1
			countDoWhile++;
		}while(countDoWhile < 10); //B. Provide the condition in the Do-While loop
		
		//A. Initialize the counter variable With a Value Greater Than 10
		countDoWhile = 14;
				
		System.out.println("Value in Do-While Loop Where Condition is False :");
					
		do
		{
			System.out.println("Value is : " + countDoWhile);
			//C. Increment the counter variable by 1
			countDoWhile++;
		}while(countDoWhile < 10); //B. Provide the condition in the Do-While loop
		
		//3. For Loop - All the three parts of a Loop - A. Initialization B. Condition C. Increment can be written in a single line
		//Print all the numbers from 1 till 10 using For Loop
		System.out.println("Value in For Loop :");
		
		for (int countFor = 1; countFor < 10; countFor++)
			System.out.println("Value is : " + countFor);
		
		//For Loop With A. Initialization and C. Increment in different line
		//A. Initialize the counter variable
		int countFor = 1;
		
		System.out.println("Value in For Loop With A. Initialization and C. Increment in different line :");
		
		for (;countFor < 10;)
		{
			System.out.println("Value is : " + countFor);
			//C. Increment the counter variable by 1
			countFor++;
		}
		
		//For Loop With A. Initialization in different line
		//A. Initialize the counter variable
		countFor = 1;
				
		System.out.println("Value in For Loop With A. Initialization in different line :");
				
		for (;countFor < 10; countFor++)
			System.out.println("Value is : " + countFor);
		
		//For Loop With C. Increment in different line						
		System.out.println("Value in For Loop With C. Increment in different line :");
						
		for (countFor = 1; countFor < 10;)
		{
			System.out.println("Value is : " + countFor);
			//C. Increment the counter variable by 1
			countFor++;
		}
	}
}