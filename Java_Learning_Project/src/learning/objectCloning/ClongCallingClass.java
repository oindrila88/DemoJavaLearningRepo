package learning.objectCloning;

public class ClongCallingClass
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		A a = new A(3, 4);
		System.out.println("x in object a = : " + a.x + ", y in object a = : " + a.y);
				
		//Clone the Object "a"
		A a1 = (A) a.clone();
		System.out.println("x in object a1 = : " + a1.x + ", y in object a1 = : " + a1.y);
	}
}
