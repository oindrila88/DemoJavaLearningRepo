package learning.oops.abstraction.interfaceIntroduction;

public interface Phone
{
	void showConfig();
	void makeCall();
	void disconnectCall();
	
	default public void installBixby()
	{
		System.out.println("In installBixby of Samsung");
	}
	
	default void installSiri()
	{
		System.out.println("In installSiri of IPhone");
	}
	
	static void androidUpdate()
	{
		System.out.println("Special Update for Samsung in Phone Class");
	}
}
