package learning.threads;

public class MySynchronizedImplemented
{
	MySynchronized mySynchronized;
	
	public MySynchronizedImplemented(MySynchronized mySynchronized)
	{
		this.mySynchronized = mySynchronized;
	}
	
	Runnable incrementCountRunnable1 = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
	//2. Code Block - When a Thread wants to execute the "synchronized" statement inside the "Block", that Thread must acquire the "Lock" on the current Object of this Class, in which the "synchronized" "Block" would be invoked. Only one Thread can acquire the "Lock" on the current Object of this Class at a time. So, all the other Threads must wait till the currently executing Thread acquires the "Lock" and finishes its execution. This way, the "synchronized" keyword guarantees that only one Thread will be executing the "Synchronized Block Statements" at a time, and, thus prevents multiple Threads from corrupting the "Shared Data" that is present inside the "Block"
	//If a Thread is put to sleep, using "Thread.sleep()" method, inside the "Block", then it does not release the "Lock". During this sleep time, no Thread will be executing the "Synchronized Block Statements"
	//"synchronized" keyword will throw "NullPointerException" if the Object on which the "Lock" needs to be acquired is "null"
	//In a "synchronized" "Block", the "Lock" Object passed should be an Instance of the Class currently used, if it executes any Instance Method inside the "Block"
	//"synchronized" "Block" is faster than "synchronized "Methods"
				//synchronized(mySynchronized)
				//{
					mySynchronized.incrementCount();
				//}
			}
		}	
	};
	
	Runnable incrementCountRunnable2 = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
				//synchronized(mySynchronized)
				//{
					mySynchronized.incrementCount();
				//}
			}
		}	
	};
	
	Runnable incrementSizeRunnable1 = new Runnable()
	{
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
	//In a "synchronized" "Block", the "Lock" Object passed should be the Class itself, if it executes any Static Method inside the "Block"
				//synchronized (MySynchronized.class)
				//{
					MySynchronized.incrementSize();
				//}
			}
		}
	};
	
	Runnable incrementSizeRunnable2 = new Runnable()
	{
		public void run()
		{
			for (int i = 0; i < 1000; i++)
			{
				//synchronized (MySynchronized.class)
				//{
					MySynchronized.incrementSize();
				//}
			}
		}
	};
}