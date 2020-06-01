package learning.otherClassConcepts;

import learning.classConcepts.*;

public class NewCallingClass extends AccessModifiersIntroductionClass
{
	public static void main(String[] args)
	{
		//Trying to access Protected Members of the Class "AccessModifiersIntroductionClass" from outside the Class, and, also outside the Package through Child Class, i.e., Inheritance
		NewCallingClass obj1 = new NewCallingClass();
		obj1.c = 4;
		obj1.show(12);
	}
}