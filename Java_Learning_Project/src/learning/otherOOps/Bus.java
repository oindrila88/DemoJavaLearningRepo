package learning.otherOOps;

import learning.oops.*;
import learning.oops.inheritance.Vehicle;

public class Bus extends Vehicle
{
	private int numberOfSeats;
	static int numberOfWindows;
	public String companyName;
	
	static
	{
		numberOfWindows = 12;
	}
	
	public Bus()
	{
		System.out.println("Default Constructor of Child Class 'Bus' of the Base Class 'Vehicle'");
		numberOfSeats = 0;
		companyName = "Mahindra";
	}
	
	public Bus(int numberOfSeats, String companyName)
	{
		System.out.println("Overloaded Constructor of Child Class 'Bus' with 'NumberOfSeats' and 'CompanyName' of the Base Class 'Vehicle'");
		this.numberOfSeats = numberOfSeats;
		this.companyName = companyName;
	}
	
	public void openWindows()
	{
		System.out.println("Opening the Window in the Child Class 'Bus' of the Base Class 'Vehicle'");
	}
	
	public void busInformation()
	{
		System.out.println("Information of 'NumberOfSeats' and 'CompanyName' in the Child Class 'Bus' of the Base Class 'Vehicle'");
		System.out.println("NumberOfSeats : " + numberOfSeats + " CompanyName : " + companyName);
	}
	
	public static void numberOfWindowsInformation()
	{
		System.out.println("Information of 'NumberOfWindows' in the Child Class 'Bus' of the Base Class 'Vehicle'");
		System.out.println("NumberOfWindows : " + numberOfWindows);
	}
}