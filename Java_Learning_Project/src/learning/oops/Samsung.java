package learning.oops;

import learning.oops.abstraction.interfaceIntroduction.Phone;

public class Samsung implements Phone, AndroidUpdatePermission
{
	@Override
	public void showConfig()
	{
		System.out.println("In showConfig of Samsung");
	}

	@Override
	public void makeCall()
	{
		System.out.println("In makeCall of Samsung");
	}

	@Override
	public void disconnectCall()
	{
		System.out.println("In disconnectCall of Samsung");
	}

	/*
	public void installBixby()
	{
		System.out.println("In installBixby of Samsung");
	}
	*/
	
	
	public void androidUpdate()
	{
		System.out.println("Special Updatefor Samsung in Samsung Class");
	}
	
}
