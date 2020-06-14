package learning.singletonClass;

public class SingletonCallingClass
{
	public static void main(String[] args)
	{
		//Call Singleton Object of "Eager Instance Initialization Singleton Pattern"
		//Cannot create an Object of "EagerInstanceSingleton" Class using "new" keyword as this is a "Singleton Class"
		//EagerInstanceSingleton eis = new EagerInstanceSingleton();
		
		EagerInstanceSingleton eis = EagerInstanceSingleton.getInstance();
		eis.setNum(5);
		eis.getNum();
		
		EagerInstanceSingleton eis1 = EagerInstanceSingleton.getInstance();
		eis1.getNum();
		
		//Call Singleton Object of "Lazy Instance Initialization Singleton Pattern"
		LazyInstanceSingleton lis = LazyInstanceSingleton.getInstance();
		lis.setNum(8);
		lis.getNum();
		
		LazyInstanceSingleton lis1 = LazyInstanceSingleton.getInstance();
		lis1.getNum();
		
		//Call Singleton Object of "Synchronized Lazy Instance Initialization Singleton Pattern"
		SynchronizedLazyInstanceSingleton slis = SynchronizedLazyInstanceSingleton.getInstance();
		slis.setNum(12);
		slis.getNum();
				
		SynchronizedLazyInstanceSingleton slis1 = SynchronizedLazyInstanceSingleton.getInstance();
		slis1.getNum();
		
		//Call Singleton Object of "Double Locking Lazy Instance Initialization Singleton Pattern"
		DoubleLockingLazyInstanceSingleton dllis = DoubleLockingLazyInstanceSingleton.getInstance();
		dllis.setNum(88);
		dllis.getNum();
						
		DoubleLockingLazyInstanceSingleton dllis1 = DoubleLockingLazyInstanceSingleton.getInstance();
		dllis1.getNum();
	}
}