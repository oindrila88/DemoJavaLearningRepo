package learning.singletonClass;

public class LazyInstanceSingleton
{
	//Step 1: Create a Private "Static Instance" of the Class
	//In "Lazy Instance Initialization Singleton Pattern", the "Private Static Member" is only declared here
	private static LazyInstanceSingleton obj;
		
	private int num;
		
	//Step 2: Create a Private No-Argument Constructor so that any Instance of this Class cannot be created
	private LazyInstanceSingleton()
	{
		
	}
		
	//Step 3: Create a Public "Static Method" which will return the "Private Static Instance". The previously declared "Private Static Instance" will be instantiated only at the time of calling this "Static Method". This is the concept of "Lazy Instance Initialization Singleton Pattern"
	//The main problem with "Lazy Instance Initialization Singleton Pattern" is that this "Singleton Pattern" is not Thread-Safe". Suppose. two Threads "t1", and "t2", are working with two Instances of "LazyInstanceSingleton" Class. Now, both the Threads might enter the verification block inside "getInstance()" method at the same time. So, both the Threads might execute the statement "if (obj == null)" at the same time, and, both the Threads will find that "obj" is null. Then both the Threads will execute the statement "obj = new LazyInstanceSingleton();". That means, there will be two Instances of "LazyInstanceSingleton" Class, which defeats the concept of "Singleton Class". This is the problem with normal "Lazy Instance Initialization Singleton Pattern"
	public static LazyInstanceSingleton getInstance()
	{
		if (obj == null)
			obj = new LazyInstanceSingleton();
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