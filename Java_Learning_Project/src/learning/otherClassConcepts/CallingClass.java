package learning.otherClassConcepts;

import learning.classConcepts.*;

public class CallingClass
{
	public static void main(String[] args)
	{
		AccessModifiersIntroductionClass obj = new AccessModifiersIntroductionClass();
		
		//Trying to access Default Members of the Class "AccessModifiersIntroductionClass" from outside the Class, and, also outside the Package "learning.classConcepts" gives Compile-Time Error, because, since the Member Variable "b", and, Member Method "display" are not public, those cannot be accessed from outside the Package.
		/*
		obj.b = 5.4; //Compile-Time Error: "The field AccessModifiersIntroductionClass.b is not visible"
		obj.display(1.9); //Compile-Time Error: "The method display(double) from the type AccessModifiersIntroductionClass is not visible"
		*/
		
		//Trying to access Public Members of the Class "AccessModifiersIntroductionClass" from outside the Class, and, also outside the Package "learning.classConcepts"
		obj.name = "Kasturi";
		obj.show("Oindrila");
				
		//Default Static Variable "name" assigned in a "Static Block" in the Class "StaticIntroductionClass" cannot be accessed from outside the Package "learning.classConcepts"
		//System.out.println("Value of Static Variable 'name' is : " + StaticIntroductionClass.name + " in the different Package 'learning.otherClassConcepts'");
		
		//Public Static Variable "d" assigned in a "Static Block" in the Class "StaticIntroductionClass" can be accessed from outside the Package "learning.classConcepts"
		System.out.println("Value of Public Static Variable 'd' is : " + StaticIntroductionClass.d + " in the different Package 'learning.otherClassConcepts'");
	}
}