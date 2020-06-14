package learning.singletonClass;

public class SynchronizedLazyInstanceSingleton
{
	//Step 1: Create a Private "Static Instance" of the Class
	private static SynchronizedLazyInstanceSingleton obj;
	
	private int num;
	
	//Step 2: Create a Private No-Argument Constructor so that any Instance of this Class cannot be created
	private SynchronizedLazyInstanceSingleton()
	{
		
	}
		
	//Step 3: Create a Public "Static Method" which will return the "Private Static Instance". The problem with "Synchronized Lazy Instance Initialization Singleton Pattern" is that, if this method would perform huge amount of work, using "synchronized" keyword for the entire method would decrease the performance of this method. Until a Thread finishes the work with this method, no other Thread can start working with this method, hence, the execution speed of this method will be decreased significantly
	public static synchronized SynchronizedLazyInstanceSingleton getInstance()
	{
		if (obj == null)
			obj = new SynchronizedLazyInstanceSingleton();
		return obj;
	}
		
	public void setNum(int num)
	{
		System.out.println("Assigning the value '" + num + "' to the variable 'num'");
		this.num = num;
	}
	
	public void getNum()
	{
		System.out.println("Fetching the value of the variable 'num' : " + num);
	}
}