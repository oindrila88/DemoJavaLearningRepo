package code.practice.ms;

import java.util.*;

public class PrintConsecutiveNumbersCount
{
	public static void main(String[] args)
	{
		//Number of Consecutive Numbers Present in an Array but not Present in Chronological Order
		longestConsecutiveNumbersInArray();
		
		//Longest Repeated Subsequence Present in a String
		longestRepeatedSubsequenceInString();
		
		//Number of Consecutive Ones Present in a Binary Array
		longestConsecutiveOnesInBinaryArray();
	}
	
	static void longestConsecutiveNumbersInArray()
	{
		//Input : arr[] = {1, 94, 93, 1000, 5, 92, 78};
		//Output : 3 
		//The largest set of consecutive elements are - 92, 93, 94 

		//Input  : arr[] = {1, 5, 92, 4, 78, 6, 7};
		//Output : 4 
		//The largest set of consecutive elements are - 4, 5, 6, 7
		
		//int arr[] = {1, 94, 93, 1000, 5, 92, 78};
		//int arr[] = {1, 5, 92, 4, 78, 6, 7};
		//int arr[] = {1, 9, 3, 10, 4, 20, 2};
		int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		int maxConsecutiveCount = 0;
		
		//Insert all the array elements into the unordered set
		Set<Integer> arrSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++)
			arrSet.add(arr[i]);
		
		for (int i = 0; i < arr.length; i++)
		{
			//Check if current element is the starting element of a sequence
			//Then check for next elements in the sequence
			int j = arr[i];
				
			//Increment the value of array element and repeat search in the Set
			while (arrSet.contains(j))
				j++;
			
			//Update "maxConsecutiveCount", if consecutive elements are found
			maxConsecutiveCount = Math.max(maxConsecutiveCount, j - arr[i]);
		}
		
		System.out.println("Length of Longest Consecutive Numbers Sequence in an Array Not in Chronology Order : " + maxConsecutiveCount);
	}
	
	static void longestConsecutiveOnesInBinaryArray()
	{
		//Input  : arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
		//Output : 4

		//Input  : arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
		//Output : 1
		
		//int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
		int arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
		int oneCount = 0;
		int maxConsecutiveOneCount = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			//Reset "oneCount" to "0", when "0" is found 
			if (arr[i] == 0)
				oneCount = 0;
			//Increment "oneCount" by "1", if "1" is found, and, update "maxConsecutiveOneCount" if "oneCount" becomes max
			else
			{
				oneCount++;
				maxConsecutiveOneCount = Math.max(maxConsecutiveOneCount, oneCount);
			}
		}
		
		System.out.println("Length of Longest Consecutive Ones in a Binary Array : " + maxConsecutiveOneCount);
	}
	
	static void longestRepeatedSubsequenceInString()
	{
		//Input: str = "abc"
		//Output: 0
		//There is no repeating subsequence

		//Input: str = "aab"
		//Output: 1
		//The two subsequence are 'a'(first) and 'a'(second). Note that 'b' cannot be considered as part of subsequence as it would be at same index in both.

		//Input: str = "aabb"
		//Output: 2

		//Input: str = "axxxy"
		//Output: 2
		String str = "abc";
		int repeatCount = 1, maxRepeatCount = 1;
		
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == str.charAt(i - 1))
				++repeatCount;
			else
			{
				if (maxRepeatCount < repeatCount)
					maxRepeatCount = repeatCount;
				repeatCount = 1;
			}
		}
		
		if (maxRepeatCount > 1)
			System.out.println("Length of the Longest Repetitive Subsequence is : "+ maxRepeatCount);
		else
			System.out.println("No Repetitive Subsequence Exists");
	}
}