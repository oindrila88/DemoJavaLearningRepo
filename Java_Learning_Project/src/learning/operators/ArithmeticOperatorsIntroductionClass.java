package learning.operators;

public class ArithmeticOperatorsIntroductionClass
{
	public static void main(String[] args)
	{
		/* Addition Operator */
		//Add Two Integral Values
		int i1 = 78, i2 = 34;
		System.out.println("Addition of Two Integral Values is : " + (i1 + i2));
		
		//Add One Integral Value With One Floating-Point Value
		double d1 = 54.98;
		System.out.println("Addition of One Integral Value With One Floating-Point Value is : " + (i1 + d1));
		
		//Add One Floating-Point Value With One Integral Value
		float f1 = 23.56f;
		System.out.println("Addition of One Floating-Point Value With One Integral Value is : " + (f1 + i2));
		
		//Add Two Floating-Point Values
		System.out.println("Addition of Two Floating-Point Values is : " + (f1 + d1));
		
		//Add Two Character Values
		char c1 = 'A', c2 = '%';
		System.out.println("Addition of Two Character Values is : " + (c1 + c2));
		
		//Add One Integral Value With One Character Value
		System.out.println("Addition of One Integral Value With One Character Value is : " + (i1 + c1));
		
		//Add One Character Value With One Integral Value
		System.out.println("Addition of One Character Value With One Integral Value is : " + (c2 + i2));
		
		//Add One Floating-Point Value With One Character Value
		System.out.println("Addition of One Floating-Point Value With One Character Value is : " + (d1 + c1));
				
		//Add One Character Value With One Floating-Point Value
		System.out.println("Addition of One Character Value With One Floating-Point Value is : " + (c2 + f1));
		
		/* Subtraction Operator */
		//Subtract One Integral Value From Another Integral Value
		System.out.println("Subtraction of One Integral Value From Another Integral Value is : " + (i1 - i2));
		
		//Subtract One Integral Value From One Floating-Point Value
		System.out.println("Subtraction of One Integral Value From One Floating-Point Value is : " + (f1 - i2));
		
		//Subtract One Floating-Point Value From One Integral Value
		System.out.println("Subtraction of One Floating-Point Value From One Integral Value is : " + (i2 - d1));
		
		//Subtract One Floating-Point Value From Another Floating-Point Value
		System.out.println("Subtraction of One Floating-Point Value From Another Floating-Point Value is : " + (f1 - d1));
		
		//Subtract One Character Value From Another Character Value
		System.out.println("Subtraction of One Character Value From Another Character Value is : " + (c1 - c2));
		
		//Subtract One Integral Value From One Character Value
		System.out.println("Subtraction of One Integral Value From One Character Value is : " + (c2 - i1));
		
		//Subtract One Character Value From One Integral Value
		System.out.println("Subtraction of One Character Value From One Integral Value is : " + (i1 - c1));
		
		//Subtract One Floating-Point Value From One Character Value
		System.out.println("Subtraction of One Floating-Point Value From One Character Value is : " + (c1 - f1));
				
		//Subtract One Character Value From One Floating-Point Value
		System.out.println("Subtraction of One Character Value From One Floating-Point Value is : " + (d1 - c2));
		
		/* Multiplication Operator */
		//Multiply Two Integral Values
		int i3 = 23, i4 = 41;
		System.out.println("Multiplication of Two Integral Values is : " + (i3 * i4));
				
		//Multiply One Integral Value With One Floating-Point Value
		double d2 = 11.32;
		System.out.println("Multiplication of One Integral Value With One Floating-Point Value is : " + (i3 * d2));
				
		//Multiply One Floating-Point Value With One Integral Value
		float f2 = 23.56f;
		System.out.println("Multiplication of One Floating-Point Value With One Integral Value is : " + (f2 * i4));
				
		//Multiply Two Floating-Point Values
		System.out.println("Multiplication of Two Floating-Point Values is : " + (d2 * f2));
		
		//Multiply Two Character Values
		char c3 = '"', c4 = ')';
		System.out.println("Multiplication of Two Character Values is : " + (c3 * c4));
				
		//Multiply One Integral Value With One Character Value
		System.out.println("Multiplication of One Integral Value With One Character Value is : " + (i3 * c3));
				
		//Multiply One Character Value With One Integral Value
		System.out.println("Multiplication of One Character Value With One Integral Value is : " + (c4 * i4));
				
		//Multiply One Floating-Point Value With One Character Value
		System.out.println("Multiplication of One Floating-Point Value With One Character Value is : " + (d2 * c3));
						
		//Multiply One Character Value With One Floating-Point Value
		System.out.println("Multiplication of One Character Value With One Floating-Point Value is : " + (c4 * f2));

		/* Division Operator */
		//Divide One Integral Value By Another Integral Value
		int i5 = 15, i6 = 28;
		System.out.println("Division of One Integral Value By Another Integral Value is : " + (i5 / i6));
		//Division Result Being Implicitly Converted to Double Variable While Storing
		double d3 = i5 / i6;
		System.out.println("Division of One Integral Value By Another Integral Value Stored in Double Variable is : " + d3);
		//Actual Floating-Point Result of Division of One Integral Value By Another Integral Value Stored in Double Variable
		double d4 = (double) i5 / i6;
		System.out.println("Floating-Point Result of Division of One Integral Value By Another Integral Value Stored in Double Variable is : " + d4);
		
		//Divide One Integral Value By One Floating-Point Value
		float f3 = 4.57f;
		System.out.println("Division of One Integral Value By One Floating-Point Value is : " + (i6 / f3));
				
		//Divide One Floating-Point Value By One Integral Value
		double d5 = 104.673;
		System.out.println("Division of One Floating-Point Value By One Integral Value is : " + (d5 / i5));
				
		//Divide One Floating-Point Value By Another Floating-Point Value
		System.out.println("Division of One Floating-Point Value By Another Floating-Point Value is : " + (f3 / d5));
		
		//Divide One Character Value By Another Character Value
		char c5 = '?', c6 = '*';
		System.out.println("Division of One Character Value By Another Character Value is : " + (c5 / c6));
		//Division Result Being Implicitly Converted to Double Variable While Storing
		double d6 = c5 / c6;
		System.out.println("Division of One Character Value By Another Character Value Stored in Double Variable is : " + d6);
		//Actual Floating-Point Result of Division of One Character Value By Another Character Value Stored in Double Variable
		double d7 = (double) c5 / c6;
		System.out.println("Floating-Point Result of Division of One Character Value By Another Character Value Stored in Double Variable is : " + d7);	
		
		//Divide One Integral Value By One Character Value
		System.out.println("Division of One Integral Value By One Character Value is : " + (i6 / c6));
		//Division Result Being Implicitly Converted to Double Variable While Storing
		double d8 = i6 / c6;
		System.out.println("Division of One Integral Value By One Character Value Stored in Double Variable is : " + d8);
		//Actual Floating-Point Result of Division of One Integral Value By One Character Value Stored in Double Variable
		double d9 = (double) i6 / c6;
		System.out.println("Floating-Point Result of Division of One Integral Value By One Character Value Stored in Double Variable is : " + d9);
		
		//Divide One Character Value By One Integral Value
		System.out.println("Division of One Character Value By One Integral Value is : " + (c5 / i5));
		//Division Result Being Implicitly Converted to Double Variable While Storing
		double d10 = c5 / i5;
		System.out.println("Division of One Character Value By One Integral Value Stored in Double Variable is : " + d10);
		//Actual Floating-Point Result of Division of One Character Value By One Integral Value Stored in Double Variable
		double d11 = (double) c5 / i5;
		System.out.println("Floating-Point Result of Division of One Character Value By One Integral Value Stored in Double Variable is : " + d11);		
		
		//Divide One Floating-Point Value By One Character Value
		System.out.println("Division of One Floating-Point Value By One Character Value is : " + (d5 / c5));
						
		//Divide One Character Value By One Floating-Point Value
		System.out.println("Division of One Character Value By One Floating-Point Value is : " + (c6 / f3));
		
		/* Remainder Operator */
		//Get Remainder When One Integral Value Divided By Another Integral Value
		int i7 = 12, i8 = 25;
		System.out.println("Remainder of One Integral Value Divided By Another Integral Value is : " + (i7 % i8));
				
		//Get Remainder When One Integral Value Divided By One Floating-Point Value
		float f4 = 7.43f;
		System.out.println("Remainder of One Integral Value Divided By One Floating-Point Value is : " + (i7 % f4));
						
		//Get Remainder When One Floating-Point Value Divided By One Integral Value
		double d12 = 99.3964;
		System.out.println("Remainder of One Floating-Point Value Divided By One Integral Value is : " + (d12 % i8));
						
		//Get Remainder When One Floating-Point Value Divided By Another Floating-Point Value
		System.out.println("Remainder of One Floating-Point Value Divided By Another Floating-Point Value is : " + (f4 % d12));
				
		//Get Remainder When One Character Value Divided By Another Character Value
		char c7 = '}', c8 = ',';
		System.out.println("Remainder of One Character Value Divided By Another Character Value is : " + (c7 % c8));
		
		//Get Remainder When One Integral Value Divided By One Character Value
		System.out.println("Remainder of One Integral Value Divided By One Character Value is : " + (i7 % c7));
				
		//Get Remainder When One Character Value Divided By One Integral Value
		System.out.println("Remainder of One Character Value Divided By One Integral Value is : " + (c8 % i8));
				
		//Get Remainder When One Floating-Point Value Divided By One Character Value
		System.out.println("Remainder of One Floating-Point Value Divided By One Character Value is : " + (d12 % c8));
								
		//Get Remainder When One Character Value Divided By One Floating-Point Value
		System.out.println("Remainder of One Character Value Divided By One Floating-Point Value is : " + (c7 % f4));
		
	}
}