package learning.singletonClass;

public class EagerInstanceSingleton
{
	//Singleton Class - A "Singleton" Class is a Class that can have only one Instance throughout the entire application
	
	//Step 1: Create a Private "Static Instance" of the Class
	//The problem with "Eager Instance Initialization Singleton Pattern" is that, as "obj" is a "Static Member", even if this Object is not used, it will stay in the Memory till the Program terminates. If this Object "obj" contains lots of resources, then it would waste significant amount of Memory and Processing power
	private static EagerInstanceSingleton obj = new EagerInstanceSingleton();
	
	private int num;
	
	//Step 2: Create a Private No-Argument Constructor so that any Instance of this Class cannot be created
	private EagerInstanceSingleton()
	{
		
	}
	
	//Step 3: Create a Public "Static Method" which will return the Private "Static Instance"
	public static EagerInstanceSingleton getInstance()
	{
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
