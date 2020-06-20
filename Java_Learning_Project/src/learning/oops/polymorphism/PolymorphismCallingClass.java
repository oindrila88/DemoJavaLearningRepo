package learning.oops.polymorphism;

public class PolymorphismCallingClass
{
	public static void main(String[] args)
	{
		//"Method Overloading" of Instance Methods
		PolymorphismIntroductionClass obj = new PolymorphismIntroductionClass();
		//Calling Method "setAandB(int, double)"
		obj.setAandB(10, 20.6);
		obj.showAandB();
		
		//Calling Method "setAandB(double, int)"
		obj.setAandB(42.67, 25);
		obj.showAandB();
		
		//"Method Overloading" of Static Methods
		//Calling Method "setIandX(int, double)"
		PolymorphismIntroductionClass.setIandX(11, 19.32);
		PolymorphismIntroductionClass.showIandX();
		
		//Calling Method "setIandX(double, int)"
		PolymorphismIntroductionClass.setIandX(15.239, 29);
		PolymorphismIntroductionClass.showIandX();
	}
}