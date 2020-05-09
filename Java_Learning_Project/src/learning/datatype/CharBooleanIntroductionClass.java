package learning.datatype;

public class CharBooleanIntroductionClass
{
	public static void main(String[] args)
	{
		//Boolean Data Type Has Two Values Only - 1. true, 2.false. It Does Not Take "null" as Value (Size = NA)
		boolean b = true;
		System.out.println("Boolean Value is : " + b);
		
		//Implicit Type Conversion from Boolean to Integral Value Not Possible. Not Even With Explicit Type Conversion
		//byte by = (byte) b; -- Gives Compile-Time error
		//short s = (short) b; -- Gives Compile-Time error
		//int i = (int) b; -- Gives Compile-Time error
		//long l = (long) b; -- Gives Compile-Time error
		
		//Implicit Type Conversion from Boolean to Floating-Point Value Not Possible. Not Even With Explicit Type Conversion
		//float f = (float) b; -- Gives Compile-Time error
		//double d = (double) b; -- Gives Compile-Time error 
		
		//Implicit Type Conversion from Integral Value to Boolean Not Possible. Not Even With Explicit Type Conversion
		//byte by = 1;
		//boolean b1 = (boolean) by; -- Gives Compile-Time error
		//short s = 1;
		//boolean b1 = (short) s; -- Gives Compile-Time error
		//int i = 1;
		//boolean b1 = (int) i; -- Gives Compile-Time error
		//long l = 1;
		//boolean b1 = (long) l; -- Gives Compile-Time error
		
		//Implicit Type Conversion from Floating-Point Value to Boolean Not Possible. Not Even With Explicit Type Conversion
		//float f = 1;
		//boolean b1 = (boolean) f; -- Gives Compile-Time error
		//double d = 1;
		//boolean b1 = (boolean) d; -- Gives Compile-Time error
		
		//Implicit Type Conversion from String Value to Boolean Not Possible. Not Even With Explicit Type Conversion
		//String str = "true";
		//boolean b1 = (String) str; -- Gives Compile-Time error
		
		//Character Data Type (Size = 2 byte)
		char c = '>';
		System.out.println("Character Value is : " + c);
		
		//Implicit Type Conversion from Character Value to Byte Value Not Possible. Explicit Type Conversion Needed
		byte by = (byte) c; //Character to Byte Explicit Type Conversion
		System.out.println("Converted Value from Character to Byte is : " + by);
		//Implicit Type Conversion from Byte Value to Character Value Not Possible. Explicit Type Conversion Needed
		byte by1 = 45;
		c = (char) by1;
		System.out.println("Converted Value from Byte to Character is : " + c);
		
		//Implicit Type Conversion from Character Value to Short Value Not Possible. Explicit Type Conversion Needed
		char c1 = 'T';
		short s = (short) c1; //Character to Short Explicit Type Conversion
		System.out.println("Converted Value from Character to Short is : " + s);
		//Implicit Type Conversion from Short Value to Character Value Not Possible. Explicit Type Conversion Needed
		short s1 = 90;
		c1 = (char) s1;
		System.out.println("Converted Value from Short to Character is : " + c1);
		
		//Implicit Type Conversion from Character to Int Allowed
		char c2 = ' ';
		int i = c2;
		System.out.println("Converted Value from Character to Int is : " + i);
		//Implicit Type Conversion from Int Value to Character Value Not Possible. Explicit Type Conversion Needed
		int i1 = 100;
		c2 = (char) i1;
		System.out.println("Converted Value from Int to Character is : " + c2);
		
		//Implicit Type Conversion from Character to Long Allowed
		char c3 = '#';
		long l = c3; //Character to Short Explicit Type Conversion
		System.out.println("Converted Value from Character to Long is : " + l);
		//Implicit Type Conversion from Long Value to Character Value Not Possible. Explicit Type Conversion Needed
		long l1 = 12;
		c3 = (char) l1;
		System.out.println("Converted Value from Long to Character is : " + c3);
		
		//Implicit Type Conversion from Character to Float Allowed
		char c4 = '/';
		float f = c4;
		System.out.println("Converted Value from Character to Float is : " + f);
		//Implicit Type Conversion from Float Value to Character Value Not Possible. Explicit Type Conversion Needed
		float f1 = 34.0f;
		c4 = (char) f1;
		System.out.println("Converted Value from Float to Character is : " + c4);
		
		//Implicit Type Conversion from Character to Double Allowed
		char c5 = '5';
		double d = c5;
		System.out.println("Converted Value from Character to Double is : " + d);
		//Implicit Type Conversion from Double Value to Character Value Not Possible. Explicit Type Conversion Needed
		double d1 = 190.0;
		c5 = (char) d1;
		System.out.println("Converted Value from Double to Character is : " + c5);
	}
}