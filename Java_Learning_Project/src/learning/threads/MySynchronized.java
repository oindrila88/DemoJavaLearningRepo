package learning.threads;

public class MySynchronized
{
	int count;
	
	public synchronized void increment()
	{
		count++;
	}
	
	Runnable incrementRunnable1 = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 1000; i++)
				increment();
		}	
	};
	
	Runnable incrementRunnable2 = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 1000; i++)
				increment();
		}	
	};
	
	public void getCountValue()
	{
		System.out.println("Value of 'count' : " + count);
	}
}