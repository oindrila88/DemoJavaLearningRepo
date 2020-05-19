package learning.arrays;

import java.util.*;

public class SingleDimensionArrayIntroductionClass
{
	public static void main(String[] args)
	{
		//Array - An Array is a group of like-typed variables that are referred by a common name. In Java, all Arrays are dynamically allocated, that means, Arrays are Objects in Java. Hence, the length of an Array can be fetched using the member variable "length"
		//Arrays can contain primitive data types (like, int, char, float etc.), as well as Object (non-primitive) references of a Class. In case of primitive data types, the actual values are stored in contiguous Stack Memory locations. In case of Objects of a Class, the actual Objects are stored in Heap Memory
		
		/* Initialization of Single Dimensional Array */
		//Single Dimensional Array Literal - In a situation, where the size of an Array and the elements of that Array are already known, Array Literals can be used
		int arr[] = {22, 12, 65, 43, 30, 49};
		
		//1. Array Initialization - Arrays in Java are Objects. Since, in order to create an Object in Java "new" Keyword is required, the "new" Keyword is used to initialize an Array, followed by the data type of the Array, followed by the size of the Array typed inside the brackets "[]"
		int arr1[] = new int[6];
		
		//The elements in an Array allocated by the "new" Keyword, will be automatically initialized to "0" for Integral Numeric types, "0.0" for Floating-Point Numeric types, "false" for Boolean, and, "null" for Reference types
		arr1[0] = 2;
		arr1[1] = 6;
		arr1[2] = 8;
		arr1[3] = 4;
		arr1[4] = 1;
		arr1[5] = 9;
		
		//The Statement "System.out.println(arr1); - Will it print the values of all the elements of the Array "arr1"?
		System.out.println(arr1); // Output is - [I@36baf30c
		
		//Arrays in Java are Objects. Since, if an Object Reference is tried to be printed using "println()" method, the "Hash Code" associated with that Object gets printed, here the "Hash Code" associated with the Array Object Reference "arr1" gets printed, i.e., [I@36baf30c
		
		//2. Accessing Java Array Elements - Each element in an Array is accessed by its index. The index begins with "0", and, ends at "Total Size of the Array - 1". All the elements of an Array can be accessed using any of the Loops present in Java
		//Access all the elements of the Array "arr1" using "For" loop
		System.out.println("Accessing All the Elements of the Array \"arr1\" Using \"For\" Loop :");
		for(int i = 0; i < arr1.length; i++)
			System.out.print(arr1[i] + " ");
		
		System.out.println();
		
		//Access all the elements of the Array "arr1" using "ForEach" or "Enhanced For" loop
		System.out.println("Accessing All the Elements of the Array \"arr1\" Using \"ForEach\" Loop :");
		
		for(int i : arr1)
			System.out.print(i + " ");
		
		System.out.println();
		
		//Accessing Element of an Array Outside the Size of that Array - JVM throws "ArrayIndexOutOfBoundsException" to indicate that Array has been accessed with an illegal index. The index could be either negative or greater than or equal to the size of that Array
		//Access the index 8 of the Array "arr1"
		/*
		System.out.println("Trying to Access Non-Existent Index \"8\" of Array \"arr1\" :");
		
		for(int i = 0; i < arr1.length; i++)
			System.out.print("The Value in the Index \"8\" of the Array \"arr1\" is : " + arr1[8]);
		*/
		
		//In this case, JVM throws "ArrayIndexOutOfBoundsException" to indicate that the index "8" was tried to access whereas the size of the Array is "6"
		
		//Usage of "Random" Class (This Class belongs to "java.util" package) to Store Random Numbers in an Array
		//There is an Array "arr2" having the size as "20". Store 20 random values within the range 1 to 50 into the Array "arr2".
		Random r = new Random();
		int arr2[] = new int[20];
		
		//Assign the random 20 values into the Array arr2
		for(int i = 0; i < arr2.length; i++)
		{
			arr2[i] = r.nextInt(50); //The upper range, i.e., the maximum value to print
		}
		
		System.out.println("Accessing All the Elements of the Array \"arr2\" Using \"ForEach\" Loop :");
		
		for(int i : arr2)
			System.out.print(i + " ");
		
		System.out.println();
	}
}