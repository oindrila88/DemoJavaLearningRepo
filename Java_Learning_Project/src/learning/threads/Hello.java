package learning.threads;

public class Hello
{
	Runnable hello = new Runnable()
	{
		@Override
		public void run()
		{
			for (int i = 0; i <= 5; i++)
			{
				System.out.println("Hello");
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