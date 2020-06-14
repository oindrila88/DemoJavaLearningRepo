package learning.threads;

public class Hi
{
	Runnable hi = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i <= 5; i++)
			{
				System.out.println("Hi");
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