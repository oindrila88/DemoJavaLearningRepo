package learning.arrays;

public class TwoDimensionArrayIntroductionClass
{
	public static void main(String[] args)
	{
		//Two Dimensional Array - It is a Multi-Dimensional Array having more than one rows, and, one or more columns
		
		/* Initialization of Two Dimensional Array */
		//Two Dimensional Array Literal - In a situation, where the number of rows and columns of a Two Dimensional Array and the elements of that Array are already known, Two Dimensional Array Literals can be used
		int arr[][] = {
						{5, 6, 7, 8},
						{6, 7, 8, 9},
						{9, 8, 7, 6}
					  };
		
		//1. Array Initialization - Arrays in Java are Objects. Since, in order to create an Object in Java "new" Keyword is required, the "new" Keyword is used to initialize an Array, followed by the data type of the Array, followed by the size of the rows and columns of the Array typed inside the first and second brackets "[]" respectively
		int arr1[][] = new int[3][4];
				
		//The elements in an Array allocated by the "new" Keyword, will be automatically initialized to "0" for Integral Numeric types, "0.0" for Floating-Point Numeric types, "false" for Boolean, and, "null" for Reference types
		arr1[0][0] = 12;
		arr1[0][1] = 10;
		arr1[0][2] = 17;
		arr1[0][3] = 14;
		arr1[1][0] = 9;
		arr1[1][1] = 19;
		arr1[1][2] = 11;
		arr1[1][3] = 21;
		arr1[2][0] = 6;
		arr1[2][1] = 26;
		arr1[2][2] = 15;
		arr1[2][3] = 2;
		
		//2. Accessing Java Two Dimensional Array Elements - Each element in an Array is accessed by its index. The index of both the rows and columns begins with "0", and, ends at "Total Size of the Array - 1". All the elements of an Array can be accessed using any of the Loops present in Java
		//Access all the elements of the Two Dimensional Array "arr1" using "For" loop
		System.out.println("Accessing All the Elements of the Two Dimensional Array \"arr1\" Using \"For\" Loop :");
		for(int row = 0; row < arr1.length; row++)
		{
			System.out.println("Row : " + row + " ");
			
			for(int col = 0; col < arr1[row].length; col++)
			{
				System.out.print("Col : " + col + " ");
				System.out.print("Value : " + arr[row][col] + ", ");
			}
			System.out.println();
		}
				
		//Access all the elements of the Two Dimensional Array "arr1" using "ForEach" or "Enhanced For" loop
		System.out.println("Accessing All the Elements of the Two Dimensional Array \"arr1\" Using \"ForEach\" Loop :");
				
		for(int row[] : arr1)
		{
			for(int colVal : row)
				System.out.println("Column Value : " + colVal + " ");
		}
				
		System.out.println();
	}
}