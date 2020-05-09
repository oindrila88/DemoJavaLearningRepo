package learning.datatype;

public class IntegralFloatingPointIntroductionClass
{
	public static void main(String[] args)
	{
		//Integral Values
		//1. byte (Size = 1 byte)
		byte b = 67;
		System.out.println("Byte Value is : " + b);
		System.out.println("Max Limit of Byte : " + Byte.MAX_VALUE);
		System.out.println("Min Limit of Byte : " + Byte.MIN_VALUE);
				
		//2. short (Size = 2 byte)
		short s = 32700;
		System.out.println("Short Value is : " + s);
		System.out.println("Max Limit of Short : " + Short.MAX_VALUE);
		System.out.println("Min Limit of Short : " + Short.MIN_VALUE);
				
		//3. int (Size = 4 byte)
		int i = 67890;
		System.out.println("Int Value is : " + i);
		System.out.println("Max Limit of Int : " + Integer.MAX_VALUE);
		System.out.println("Min Limit of Int : " + Integer.MIN_VALUE);
				
		//4. long (Size = 8 byte)
		long l = 3489090976l;
		System.out.println("Long Value is : " + l);
		System.out.println("Max Limit of Long : " + Long.MAX_VALUE);
		System.out.println("Min Limit of Long : " + Long.MIN_VALUE);
				
		//Implicit Type Conversion from Byte to Short
		s = b;
		System.out.println("Converted Value from Byte to Short is : " + s);
		//Implicit Type Conversion from Short to Byte Not Possible. Hence Explicit Type Conversion Needed
		byte b1 = 60;
		short s1 = 3896;
		b1 = (byte)s1;
		System.out.println("Converted Value from Short to Byte is : " + b1);
			
		//Implicit Type Conversion from Short to Int
		s = 5678;
		i = s;
		System.out.println("Converted Value from Short to Int is : " + i);
		//Implicit Type Conversion from Int to Short Not Possible. Hence Explicit Type Conversion Needed
		short s2 = 8965;
		int i1 = 349076543;
		s2 = (short)i1;
		System.out.println("Converted Value from Int to Short is : " + s2);
				
		//Implicit Type Conversion from Int to Long
		i = 89765034;
		l = i;
		System.out.println("Converted Value from Int to Long is : " + l);
		//Implicit Type Conversion from Long to Int Not Possible. Hence Explicit Type Conversion Needed
		int i2 = 563490653;
		long l1 = 567890563423909l;
		i2 = (int)l1;
		System.out.println("Converted Value from Long to Int is : " + i2);
			
		//Floating-Point Variables
		//1. float (Size = 4 byte)
		float f = 65786.7878780780f;
		System.out.println("Float Value is : " + f);
		System.out.println("Max Limit of Float : " + Float.MAX_VALUE);
		System.out.println("Min Limit of Float : " + Float.MIN_VALUE);
				
		//2. double (Size = 8 byte)
		double d = 878780.345345345345254254254;
		System.out.println("Double Value is : " + d);
		System.out.println("Max Limit of Double : " + Double.MAX_VALUE);
		System.out.println("Min Limit of Double : " + Double.MIN_VALUE);
			
		//Implicit Type Conversion from Float to Double
		d = f;
		System.out.println("Converted Value from Float to Double is : " + d);
		//Implicit Type Conversion from Double to Float Not Possible. Hence Explicit Type Conversion Needed
		float f2 = 67.8976f;
		double d1 = 4578954.214242141424234243;
		f2 = (float)d1;
		System.out.println("Converted Value from Double to Float is : " + f2);
				
		//Implicit Type Conversion from Int to Float
		int i3 = 654987;
		float f3 = i3;
		System.out.println("Converted Value from Int to Float is : " + f3);
		//Implicit Type Conversion from Float to Int Not Possible. Hence Explicit Type Conversion Needed
		float f4 = 456456.67867876f;
		int i4 = (int) f4;
		System.out.println("Converted Value from Float to Int is : " + i4);
				
		//Implicit Type Conversion from Int to Double
		int i5 = 2356579;
		double d3 = i5;
		System.out.println("Converted Value from Int to Double is : " + d3);	
		//Implicit Type Conversion from Double to Int Not Possible. Hence Explicit Type Conversion Needed
		double d4 = 67869098.12124335345;
		int i6 = (int) d4;
		System.out.println("Converted Value from Double to Int is : " + i6);
		
		//Implicit Type Conversion from Long to Float
		long l2 = 4567696969699l;
		float f5 = l2;
		System.out.println("Converted Value from Long to Float is : " + f5);	
		//Implicit Type Conversion from Float to Long Not Possible. Hence Explicit Type Conversion Needed
		float f6 = 34634.2354346346f;
		long l3 = (long) f6;
		System.out.println("Converted Value from Float to Long is : " + l3);
		
		//Implicit Type Conversion from Long to Double
		long l4 = 89878678676769l;
		double d5 = l4;
		System.out.println("Converted Value from Long to Double is : " + d5);	
		//Implicit Type Conversion from Double to Long Not Possible. Hence Explicit Type Conversion Needed
		double d6 = 8978867.2323452545;
		long l5 = (long) d6;
		System.out.println("Converted Value from Double to Long is : " + l5);
	}
}