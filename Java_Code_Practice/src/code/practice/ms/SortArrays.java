package code.practice.ms;

import java.util.Arrays;

public class SortArrays
{
	public static void main(String[] args)
	{
		//Sort Binary Array
		sortBinaryArray();
		
		//Sort Array
		sortArray();
	}
	
	static void sortBinaryArray()
	{
		//Input : {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0} 
		//Output : 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1

		//Input : {1, 0, 1, 0, 1, 0, 1, 0}
		//Output : 0 0 0 0 1 1 1 1
		
		int arr[] = {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0};
		int j = -1, temp;
		
		System.out.println("Values in Binary Array before sorting : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 1)
			{
				j++;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
		
		System.out.println("Values in Binary Array after sorting : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	static void sortArray()
	{
		int arr[] = {45,12,85,32,89,39,69,44,42,1,6,8};
		Arrays.sort(arr);
		
		System.out.println("Values in Array after sorting : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
}