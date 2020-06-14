package learning.collections;

import java.util.*;

public class ComparatorComparableCallingClass
{
	public static void main(String[] args)
	{
		List<Student> lstStudent = new ArrayList<>();
		lstStudent.add(new Student("Oindrila", 1, 93));
		lstStudent.add(new Student("Soumyajyoti", 2, 100));
		lstStudent.add(new Student("Rama", 3, 83));
		lstStudent.add(new Student("Premanshu", 4, 96));
		lstStudent.add(new Student("Debajyoti", 5, 93));
		lstStudent.add(new Student("Dola", 6, 88));
		
		//Sort in ascending order according to marks of each Student using Comparator Interface
		Comparator<Student> comStudent = new Comparator<>()
		{
			@Override
			public int compare(Student o1, Student o2)
			{
				if (o1.marks == o2.marks)
					return 0;
				else if (o1.marks > o2.marks)
					return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(lstStudent, comStudent);
		
		System.out.println("ArrayList of Students sorted in ascending order according to marks : ");
		for (Student student : lstStudent)
			System.out.println("Name : " + student.name + ", Roll : " + student.roll + ", Marks : " + student.marks);
		
		//Sort in descending order according to marks of each Student using Comparable Interface
		List<ComparableStudent> lstComparableStudent = new ArrayList<>();
		lstComparableStudent.add(new ComparableStudent("Oindrila", 1, 93));
		lstComparableStudent.add(new ComparableStudent("Soumyajyoti", 2, 100));
		lstComparableStudent.add(new ComparableStudent("Rama", 3, 83));
		lstComparableStudent.add(new ComparableStudent("Premanshu", 4, 96));
		lstComparableStudent.add(new ComparableStudent("Debajyoti", 5, 93));
		lstComparableStudent.add(new ComparableStudent("Dola", 6, 88));
		
		Collections.sort(lstComparableStudent);
		
		System.out.println("ArrayList of ComparableStudents sorted in descending order according to marks : ");
		for (ComparableStudent student : lstComparableStudent)
			System.out.println("Name : " + student.name + ", Roll : " + student.roll + ", Marks : " + student.marks);
	}
}
