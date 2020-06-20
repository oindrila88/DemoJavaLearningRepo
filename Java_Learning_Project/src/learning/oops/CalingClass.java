package learning.oops;
import java.io.*;

public class CalingClass
{
	public static void main(String[] args)
	{
		/*
		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.disconnectCall();
		samsung.showConfig();
		
		Phone iphone = new IPhone();
		iphone.makeCall();
		iphone.disconnectCall();
		iphone.showConfig();
		
		Samsung samsung = new Samsung();
		samsung.makeCall();
		samsung.disconnectCall();
		samsung.showConfig();
		samsung.androidUpdate();
		
		IPhone iphone = new IPhone();
		iphone.makeCall();
		iphone.disconnectCall();
		iphone.showConfig();
		iphone.getUpdate();
		*/
		
		File file;
		FileReader fr;
		//BufferedReader br;
		
		/*
		try
		{
			fr = new FileReader("D:\\Tutorials\\Shell Scripting Tutorials\\Basic_Linux_Commands_Tutorial.docx");
			br = new BufferedReader(fr);
			while (br.readLine() != null)
				System.out.println(br.readLine());
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
		*/
		
		file= new File("D:\\Tutorials\\Shell Scripting Tutorials\\Basic_Linux_Commands_Tutorial.docx");
		//br = new BufferedReader(new FileReader(file));
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			while (br.readLine() != null)
				System.out.println(br.readLine());
			throw new MyException("Finally Finished");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("In FileNotFoundException catch : " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("In IOException catch : " + e.getMessage());
		}
		catch (MyException e)
		{
			System.out.println("In customized catch : " + e.getMessage());
		}

	}
}
