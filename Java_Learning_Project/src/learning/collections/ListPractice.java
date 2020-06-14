package learning.collections;

import java.util.*;

public class ListPractice
{
	public static void main(String[] args)
	{
		//ArrayList can contain duplicate elements
		
		//ArrayList maintains insertion order
		
		//ArrayList is not synchronized, i.e., it is not thread-safe
		
		//Java LinkedList uses "Double Linked List" concept
		
		//In LinkedList, manipulation is faster, because no shifting needs to be occurred
		
		List<Integer> list = new ArrayList<>();
		list.add(56);
		list.add(23);
		list.add(12);
		list.add(78);
		
		System.out.println("List Implemented by ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Add a value "33" at third position, i.e., at index = 2
		list.add(2, 33);
		
		System.out.println("Added '33' at third position, i.e., at index = 2 in ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Remove a value from the fourth position, i.e., at index = 3
		list.remove(3);
		
		System.out.println("Removed value at fourth position, i.e., at index = 3 in ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Get the value from second position, i.e., at index = 1
		System.out.println("Value present at the second position, i.e., at index = 1 is : " + list.get(1));
		
		//Replace the value in the third position, i.e., at index = 2 by "88"
		list.set(2, 88);
		
		System.out.println("Replaced value at third position by '88', i.e., at index = 2 in ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Append 42, 67, 23, 78 respectively
		list.add(42);
		list.add(67);
		list.add(23);
		list.add(78);
		
		System.out.println("Appended '42', '67', '23', '78' respectively in ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Find the first occurrence of "23" from the list
		System.out.println("First occurrence of '23' from the list is at index : " + list.indexOf(23));
		
		//Find the first occurrence of "12" from the list
		System.out.println("First occurrence of '12' from the list is at index : " + list.indexOf(12));
		//Since "12" is not present in the list, the returned output is "-1"
		
		//Append 56, 78 respectively
		list.add(56);
		list.add(78);
		
		System.out.println("Again appended '56', '78' respectively in ArrayList : ");
		for (int num : list)
			System.out.print(num + " ");
		System.out.println();
		
		//Find the last occurrence of "78" from the list
		System.out.println("Last occurrence of '78' from the list is at index : " + list.lastIndexOf(78));
		
		//Get the size of the ArrayList
		System.out.println("Size of the ArrayList : " + list.size());
		
		//Find if the ArrayList contains a value "56"
		System.out.println("The ArrayList contains the value '56' inside it : " + list.contains(56));
		
		//Find if the ArrayList contains a value "99"
		System.out.println("The ArrayList contains the value '99' inside it : " + list.contains(99));
		
		//Create a Sub-List from third position, i.e., from index = 2 to eighth position, i.e., to index 7
		List<Integer> subList = list.subList(2, 7);
		
		System.out.println("Sub-List from third position, i.e., from index = 2 to eighth position, i.e., to index 7 in ArrayList : ");
		for (int num : subList)
			System.out.print(num + " ");
		System.out.println();
		
		//Sort ArrayList in ascending order
		List<Integer> newList = new ArrayList<>(list);
		Collections.sort(newList);
		
		System.out.println("ArrayList sorted in ascending order : ");
		for (int num : newList)
			System.out.print(num + " ");
		System.out.println();
		
		//Sort ArrayList in descending order of insertion
		newList = new ArrayList<>(list);
		Collections.reverse(newList);
		
		System.out.println("ArrayList sorted in descending order of insertion : ");
		for (int num : newList)
			System.out.print(num + " ");
		System.out.println();
		
		//Print only duplicate values from the ArrayList "list"
		System.out.println("The duplicate elements in the ArrayList 'list' are : ");
		Set<Integer> uniqueSet = new HashSet<>();
		
		for (int num : list)
		{
			if (!uniqueSet.add(num))
				System.out.println(num);
		}
	}
}