package learning.classConcepts;

public class ClassObjectIntroductionClass
{
	//Class - A "Class" represents a definition, or, a type of an "Object". In Java, a "Class" can contain "Variables", "Methods" and "Constructors"
	//Object - While "Classes" are translated during Compile-Time, "Objects" are created from "Classes" at Run-Time. "Objects" of a "Class" are called "Instances", and, those are created and initialized with "Constructors"
	//"Objects" have two characteristics - "States" (Variables) and "Behaviours" (Methods)
	
	//The point of using "Class" and "Object" in Java is to define the "Blueprint" in one place (Class), and then, to reuse many times in many places (Object)
	
	//Here the Class "ClassObjectIntroductionClass" contains a Variable "x" and a Method "Show"
	int x;
	
	void show()
	{
		System.out.println("Hello");
	}
	
	void setX(int x)
	{
		this.x = x;
	}
	
	int getX()
	{
		return x;
	}
}