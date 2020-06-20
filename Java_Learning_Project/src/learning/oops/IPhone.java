package learning.oops;

public class IPhone implements Phone, MacUpdatePermission
{
	@Override
	public void showConfig()
	{
		System.out.println("In showConfig of IPhone");
	}

	@Override
	public void makeCall()
	{
		System.out.println("In makeCall of IPhone");
	}

	@Override
	public void disconnectCall()
	{
		System.out.println("In disconnectCall of IPhone");
	}

	/*
	public void installSiri()
	{
		System.out.println("In installSiri of IPhone");
	}
	*/
	
	void getUpdate()
	{
		Phone.androidUpdate();
		System.out.println("Special Update for IPhone in IPhone Class");
	}
}
