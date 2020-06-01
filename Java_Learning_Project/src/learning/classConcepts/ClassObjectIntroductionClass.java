package learning.classConcepts;

public class ClassObjectIntroductionClass
{
	//Class - It defines the structure / working of an Object.
	//Object - Every Object knows something (i.e. Variables) and does something, that is behaves (i.e. Methods). To define what an Object knows and does or behaves, a blueprint (i.e. Class) is required. The blueprint (i.e. Class) defines what is the behaviour and what are the knowledge that the Object possesses.
	
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