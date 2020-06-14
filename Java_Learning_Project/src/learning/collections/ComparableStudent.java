package learning.collections;

public class ComparableStudent implements Comparable<ComparableStudent>
{
	String name;
	int roll;
	int marks;
	
	public ComparableStudent(String name, int roll, int marks)
	{
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(ComparableStudent o)
	{
		if (this.marks == o.marks)
			return 0;
		else if (this.marks < o.marks)
			return 1;
		else
			return -1;
	}
}