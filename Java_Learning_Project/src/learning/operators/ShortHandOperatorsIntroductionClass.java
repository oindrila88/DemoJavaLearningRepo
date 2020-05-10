package learning.operators;

public class ShortHandOperatorsIntroductionClass
{
	public static void main(String[] args)
	{
		//In Short Hand Operator Expressions (EP1 OP EP2), the result's data type will always be the first operand's data type
		//Short Hand Operators are - +=, -=, *=, /=, %=
		
		//Short Hand Operator +=
		byte b = 9;
		//b = b + 2.5 -- Compiler Error : (Type mismatch : cannot convert from double to byte)
		//b = (byte) (b + 2.5); -- The expected result in Byte can be fetched using explicit type cast to Byte
		//Other way of fetching the expected result in Byte is using Short Hand Operator (+=)
		b += 2.5;
		//EP1 OP EP2 (Here. EP1 is b, OP is +=, EP2 is 2.5). Hence, the result is of the Byte data type
		System.out.println("Value of Byte Variable Incremented by Double Value is : " + b);
		
		//Short Hand Operator -=
		long l = 7879696978697l;
		//l = l - 345678.3443535; -- Compiler Error : (Type mismatch : cannot convert from double to long)
		//l = (long) (l - 345678.3443535); -- The expected result in Long can be fetched using explicit type cast to Long
		//Other way of fetching the expected result in Long is using Short Hand Operator (-=)
		l -= 345678.3443535;
		//EP1 OP EP2 (Here. EP1 is l, OP is -=, EP2 is 345678.3443535). Hence, the result is of the Long data type
		System.out.println("Value of Long Variable From Which Double Value Being Subtracted is : " + l);
		
		//Short Hand Operator *=
		long l1 = 34789012748693l;
		//l1 = l1 * 4219045.2355555; -- Compiler Error : (Type mismatch : cannot convert from double to long)
		//l1 = (long) (l1 * 4219045.2355555); -- The expected result in Long can be fetched using explicit type cast to Long
		//Other way of fetching the expected result in Long is using Short Hand Operator (*=)
		l1 *= 4219045.2355555;
		//EP1 OP EP2 (Here. EP1 is l1, OP is *=, EP2 is 4219045.2355555). Hence, the result is of the Long data type
		System.out.println("Value of Long Variable Multiplied By Double Value is : " + l1);
		
		//Short Hand Operator /=
		short s = 32229;
		//s = s / 56789034561286l; -- Compiler Error : (Type mismatch : cannot convert from long to short)
		//s = (short) (s / 56789034561286l); -- The expected result in Short can be fetched using explicit type cast to Short
		//Other way of fetching the expected result in Short is using Short Hand Operator (/=)
		s /= 56789034561286l;
		//EP1 OP EP2 (Here. EP1 is s, OP is /=, EP2 is 56789034561286l). Hence, the result is of the Short data type
		System.out.println("Value of Short Variable Divided By Long Value is : " + s);
		
		//Short Hand Operator %=
		int i = 200;
		//i = i % 23.678; -- Compiler Error : (Type mismatch : cannot convert from double to int)
		//i = (int) (i % 23.678); -- The expected result in Int can be fetched using explicit type cast to Int
		//Other way of fetching the expected result in Int is using Short Hand Operator (%=)
		i %= 23.678;
		//EP1 OP EP2 (Here. EP1 is i, OP is %=, EP2 is 23.678). Hence, the result is of the Int data type
		System.out.println("Value of Remainder of Int Variable Divideed by Double Value is : " + i);
	}
}