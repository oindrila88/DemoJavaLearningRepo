package learning.collections;

import java.util.*;

public class SetPractice
{
	public static void main(String[] args)
	{
		//Set contains unique elements
		
		//HashSet does not maintain insertion order. At the time of fetching all values from HashSet, values are displayed at random order
		
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(56);
		hashSet.add(23);
		hashSet.add(12);
		hashSet.add(78);
		
		System.out.println("Set Implemented by HashSet : ");
		for (int num : hashSet)
			System.out.print(num + " ");
		System.out.println();
		
		//TreeSet does not maintain insertion order. At the time of fetching all values from TreeSet, values are displayed at ascending sorted order
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(56);
		treeSet.add(23);
		treeSet.add(12);
		treeSet.add(78);
		
		System.out.println("Set Implemented by TreeSet : ");
		for (int num : treeSet)
			System.out.print(num + " ");
		System.out.println();
		
		//SetA = [1,3,2,4,8,9,0], SetB = [1,3,7,5,4,0,7,5]
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(0);
		
		Set<Integer> setA = new HashSet<>(list);
		
		Set<Integer> setB = new HashSet<>();
		setB.add(1);
		setB.add(3);
		setB.add(7);
		setB.add(5);
		setB.add(4);
		setB.add(0);
		setB.add(7);
		setB.add(5);
		
		//Union - All unique elements from SetA and SetB will be displayed, i.e., [0,1,2.3.4.5,7,8,9]
		Set<Integer> setUnion = new HashSet<>(setA);
		setUnion.addAll(setB);
		
		System.out.println("After Performing Union of SetA and SetB : ");
		for (int num : setUnion)
			System.out.print(num + " ");
		System.out.println();
		
		//Intersection - Common unique elements from SetA and SetB will be displayed, i.e., [0,1.3.4]
		Set<Integer> setIntersection = new HashSet<>(setA);
		setIntersection.retainAll(setB);
		
		System.out.println("After Performing Intersection of SetA and SetB : ");
		for (int num : setIntersection)
			System.out.print(num + " ");
		System.out.println();
		
		//Difference - Values present in SetA only, but, not in SetB, i.e., [2,8,9]
		Set<Integer> setAValueOnly = new HashSet<>(setA);
		setAValueOnly.removeAll(setB);
		
		System.out.println("Values present in SetA only, but, not in SetB : ");
		for (int num : setAValueOnly)
			System.out.print(num + " ");
		System.out.println();
		
		//Difference - Values present in SetB only, but, not in SetA, i.e., [5,7]
		Set<Integer> setBValueOnly = new HashSet<>(setB);
		setBValueOnly.removeAll(setA);
				
		System.out.println("Values present in SetB only, but, not in SetA : ");
		for (int num : setBValueOnly)
			System.out.print(num + " ");
		System.out.println();
	}
}