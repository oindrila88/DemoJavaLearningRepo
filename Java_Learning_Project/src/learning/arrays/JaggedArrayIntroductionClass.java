package learning.arrays;

public class JaggedArrayIntroductionClass
{
	public static void main(String[] args)
	{
		//Jagged Array - Containing Arrays of different length. Jagged Arrays are also Multi-Dimensional Arrays
		
		/* Initialization of Two Dimensional Jagged Array */
		//Two Dimensional Jagged Array Literal - In a situation, where each of the rows containing Arrays of different length are already known, Two Dimensional Jagged Array Literals can be used		
		int arrJag[][] = {
							{1, 2, 3},
							{4, 5, 6, 7},
							{8, 9, 10, 11, 12}
						 };
		
		//1. Array Initialization - Arrays in Java are Objects. Since, in order to create an Object in Java "new" Keyword is required, the "new" Keyword is used to initialize an Array, followed by the data type of the Array, followed by the size of the row inside the first bracket "[]". Since, the number of columns in each row would be different, Jagged Arrays can't be instantiated dynamically like the Two Dimensional Array
		int arrJag1[][] = new int[4][];
				
		//The elements in an Array allocated by the "new" Keyword, will be automatically initialized to "0" for Integral Numeric types, "0.0" for Floating-Point Numeric types, "false" for Boolean, and, "null" for Reference types
		arrJag1[0] = new int[4];
		arrJag1[0][0] = 12;
		arrJag1[0][1] = 10;
		arrJag1[0][2] = 17;
		arrJag1[0][3] = 14;
		
		arrJag1[1] = new int[2];
		arrJag1[1][0] = 9;
		arrJag1[1][1] = 19;
		
		arrJag1[2] = new int[3];
		arrJag1[2][0] = 11;
		arrJag1[2][1] = 21;
		arrJag1[2][2] = 6;
		
		arrJag1[3] = new int[5];
		arrJag1[3][0] = 26;
		arrJag1[3][1] = 15;
		arrJag1[3][2] = 2;
		arrJag1[3][3] = 13;
		arrJag1[3][4] = 22;
		
		//2. Accessing Java Two Dimensional Jagged Array Elements - Each element in an Array is accessed by its index. The index of both the rows and columns begins with "0", and, ends at "Total Size of the Array - 1". All the elements of an Array can be accessed using any of the Loops present in Java
		//Access all the elements of the Two Dimensional Jagged Array "arrJag1" using "For" loop
		System.out.println("Accessing All the Elements of the Two Dimensional Jagged Array \"arrJag1\" Using \"For\" Loop :");
		for(int row = 0; row < arrJag1.length; row++)
		{
			System.out.println("Row : " + row + " ");
					
			for(int col = 0; col < arrJag1[row].length; col++)
			{
				System.out.print("Col : " + col + " ");
				System.out.print("Value : " + arrJag1[row][col] + ", ");
			}
			System.out.println();
		}
						
		//Access all the elements of the Two Dimensional Jagged Array "arrJag1" using "ForEach" or "Enhanced For" loop
		System.out.println("Accessing All the Elements of the Two Dimensional Jagged Array \"arrJag1\" Using \"ForEach\" Loop :");
						
		for(int row[] : arrJag1)
		{
			for(int colVal : row)
				System.out.println("Column Value : " + colVal);
		}
						
		System.out.println();
	}
}