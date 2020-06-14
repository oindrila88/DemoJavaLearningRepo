package learning.threads;

public class MyNumber
{
	int x;
	boolean isValueSet = false;
	
	public synchronized void setNumber(int x)
	{
		if (!isValueSet)
		{
			System.out.println("Setting the number to 'x' : " + x);
			this.x = x;
			isValueSet = true;
			notify();
		}
		else
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void getNumber()
	{
		if (isValueSet)
		{
			System.out.println("Value in 'x' : " + x);
			isValueSet = false;
			notify();
		}
		else
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	Runnable setNumberRunnable = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 1; i <= 10; i++)
			{
				setNumber(i);
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	};
	
	Runnable getNumberRunnable = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 1; i <= 10; i++)
			{
				getNumber();
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	};
}