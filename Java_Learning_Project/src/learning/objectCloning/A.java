package learning.objectCloning;

public class A implements Cloneable
{
	int x;
	int y;
	
	public A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}