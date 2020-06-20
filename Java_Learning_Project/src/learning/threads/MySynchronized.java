package learning.threads;

public class MySynchronized
{
	int count;
	static int size;
	
	//"synchronized" Keyword - "synchronized" keyword marks a "Block", or, a "Method" a "Critical Section". A "Critical Section" is where only one Thread executes at a time, and, that Thread holds the "Lock" for that "synchronized" Section. This keyword helps in writing concurrent parts of any applications. This keyword also protects "Shared Resources" within the "Block", or, "Method"
	//The "synchronized" keyword can be used with -
	//1. Method - When a Thread wants to execute the "synchronized" statement inside the "Method", that Thread must acquire the "Lock" on the current Object of this Class, in which the "synchronized" Method would be invoked. Only one Thread can acquire the "Lock" on the current Object of this Class at a time. So, all the other Threads must wait till the currently executing Thread acquires the "Lock" and finishes its execution. This way, the "synchronized" keyword guarantees that only one Thread will be executing the "Synchronized Method Statements" at a time, and, thus prevents multiple Threads from corrupting the "Shared Data" that is present inside the "Method"
	//
	public synchronized void incrementCount()
	{
		count++;
	}
	
	public static synchronized void incrementSize()
	{
		size++;
	}
	
	public void getCountValue()
	{
		System.out.println("Value of 'count' : " + count);
	}
	
	public static void getSizeValue()
	{
		System.out.println("Value of 'size' : " + size);
	}
}