package learning.threads;

public class MyThread extends Thread
{
	int arr[] = {34, 51, 90, 23, 66, 41};
	
	public void run()
	{
		for (int i = 0; i <arr.length; i++)
			arr[i] = arr[i] * 2;
	}
	
	public void printArr()
	{
		for (int a : arr)
			System.out.print(a + " ");
		System.out.println();
	}
}