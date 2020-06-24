package learning.reflectionApi;

import java.lang.reflect.*;

import learning.singletonClass.*;

public class ReflectionCallingClass
{
	public static void main(String[] args)
	{
		try
		{
			//Create an Object of "Class" Class using the fully qualified path of the Class "Test", of which Object needs to be created
			Class c = Class.forName("learning.reflectionApi.Test");
			
			//Create Object of the Class "Test" using the method "getDeclaredConstructor().newInstance()" using the Object of Class "Class", and, since the mentioned method returns an Object of Class "Object", the Object is then type casted to Class "Test"
			Test t = (Test) c.getDeclaredConstructor().newInstance();
			
			//Create an Object of the Class "Method", and, call the method "getDeclaredMethod()" using the Object of Class "Class". This method takes two parameters - 1. The name of the "Private Method" to call, and, 2. Parameters that "Private Method" takes. Here, since the "show()" method does not take any parameter, "null" is provided
			Method m = c.getDeclaredMethod("show", null);
			
			//Since the method is "Private", to run invoke the method, its access must be set to true
			m.setAccessible(true);
			
			//Invoking the method. This "invoke()" method takes two parameters - 1. The Object, through which the method would be called, and, 2. Parameters that "Private Method" takes. Here, since the "show()" method does not take any parameter, "null" is provided
			m.invoke(t, null);
			
			//Check if a ".java" file contains a Class, or, an Interface using the "isInterface()" method of the Class "Class"
			c = Class.forName("learning.oops.abstraction.interfaceIntroduction.Phone");
			boolean isInterface = c.isInterface();
			
			if (isInterface)
				System.out.println("'learning.oops.Phone' is an Interface");
			else
				System.out.println("'learning.oops.Phone' is a Class");
			
			//
			c = Class.forName("learning.singletonClass.DoubleLockingLazyInstanceSingleton");
			DoubleLockingLazyInstanceSingleton obj = (DoubleLockingLazyInstanceSingleton) c.getDeclaredConstructor().newInstance();
			
			Method[] methods = c.getDeclaredMethods();
			for (Method mt : methods)
			{
				mt.setAccessible(true);
				System.out.print(mt.getName());
			}
			System.out.println();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (InstantiationException e)
		{
			e.printStackTrace();
		}
		catch (IllegalAccessException e)
		{
			e.printStackTrace();
		}
		catch (IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
	}
}