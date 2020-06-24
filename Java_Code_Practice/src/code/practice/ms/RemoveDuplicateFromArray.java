package code.practice.ms;

import java.util.*;

public class RemoveDuplicateFromArray
{
	public static void main(String[] args)
	{
		//Remove Duplicate Elements from Array Using Set
		removeDuplicateFromArrayWithSet();
		
		//Remove Duplicate Elements from Array
	}
	
	static void removeDuplicateFromArrayWithSet()
	{
		//Input  : arr[] = {2, 2, 2, 2, 2}
		//Output : arr[] = {2}
				
		//Input  : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
		//Output : arr[] = {1, 2, 3, 4, 5}
				
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		Set<Integer> arrSet = new HashSet<>();
				
		for (int i = 0; i < arr.length; i++)
		{
			if (!arrSet.contains(arr[i]))
				arrSet.add(arr[i]);
		}
				
		System.out.println("Set Values after removing duplicates : ");
		for (int i : arrSet)
			System.out.print(i + " ");
		System.out.println();
				
		int x = 0;
		arr = new int[arrSet.size()];
		for (int i : arrSet)
			arr[x++] = i;
		
		System.out.println("Values in Array after removing duplicates : ");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	static void removeDuplicateFromArray()
	{
		//Input  : arr[] = {2, 2, 2, 2, 2}
		//Output : arr[] = {2}
				
		//Input  : arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}
		//Output : arr[] = {1, 2, 3, 4, 5}
				
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	
	}
}