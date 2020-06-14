package learning.singletonClass;

public class DoubleLockingLazyInstanceSingleton
{
	//Step 1: Create a Private "Static Instance" of the Class
	private static DoubleLockingLazyInstanceSingleton obj;
		
	private int num;
		
	//Step 2: Create a Private No-Argument Constructor so that any Instance of this Class cannot be created
	private DoubleLockingLazyInstanceSingleton()
	{
			
	}
			
	//Step 3: Create a Public "Static Method" which will return the "Private Static Instance".
	//To improve performance of this method, instead of making the entire method as "synchronized", only the block of code, where the Object is getting checked and created can be made "synchronized" using "synchronized block".
	//Here, "if (obj == null)" will be checked twice. 1. Just after coming to this method, 2. Inside the "synchronized block", which will be "synchronized" with the "DoubleLockingLazyInstanceSingleton" Class
	public static DoubleLockingLazyInstanceSingleton getInstance()
	{
		if (obj == null)
		{
			synchronized(DoubleLockingLazyInstanceSingleton.class)
			{
				if (obj == null)
					obj = new DoubleLockingLazyInstanceSingleton();
			}
		}
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