package learning.operators;

public class PrePostIncrementOperatorsIntroductionClass
{
	public static void main(String[] args)
	{
		/* Pre-Increment Operator (++n) */
		/* First the value of the variable on which the pre-increment operator is used, is incremented by 1, then the incremented value is assigned to the variable placed on the left side of the assignment operator */
		//Pre-Increment Operator on Byte
		byte by = 12;
		byte by1 = ++by;
		System.out.println("Value of First Byte Variable is : " + by);
		System.out.println("Value of Pre-Incremented First Byte Variable Stored into Second is : " + by1);
		
		//Pre-Increment Operator on Short
		short s = 4569;
		short s1 = ++s;
		System.out.println("Value of First Short Variable is : " + s);
		System.out.println("Value of Pre-Incremented First Short Variable Stored into Second is : " + s1);
		
		//Pre-Increment Operator on Int
		int i = 456789;
		int i1 = ++i;
		System.out.println("Value of First Int Variable is : " + i);
		System.out.println("Value of Pre-Incremented First Int Variable Stored into Second is : " + i1);
		
		//Pre-Increment Operator on Long
		long l = 89053486125l;
		long l1 = ++l;
		System.out.println("Value of First Long Variable is : " + l);
		System.out.println("Value of Pre-Incremented First Long Variable Stored into Second is : " + l1);
		
		//Pre-Increment Operator on Float
		float f = 67.456f;
		float f1 = ++f;
		System.out.println("Value of First Float Variable is : " + f);
		System.out.println("Value of Pre-Incremented First Float Variable Stored into Second is : " + f1);
				
		//Pre-Increment Operator on Double
		double d = 29056.389;
		double d1 = ++d;
		System.out.println("Value of First Double Variable is : " + d);
		System.out.println("Value of Pre-Incremented First Double Variable Stored into Second is : " + d1);
		
		//Pre-Increment Operator on Character
		char c = 'U';
		char c1 = ++c;
		System.out.println("Value of First Character Variable is : " + c);
		System.out.println("Value of Pre-Incremented First Character Variable Stored into Second is : " + c1);
		
		//Special Question on Pre-Increment Operator
		int a = 5;
		a = ++a;
		System.out.println("Value of a is : " + a);
		
		/* Post-Increment Operator (n++) */
		/* First the value of the variable on which the post-increment operator is used, is assigned to the variable placed on the left side of the assignment operator, then the value of the variable on which the post-increment operator used is incremented by 1 */
		//Post-Increment Operator on Byte
		byte by2 = 23;
		byte by3 = by2++;
		System.out.println("Value of First Byte Variable is : " + by2);
		System.out.println("Value of Post-Incremented First Byte Variable Stored into Second is : " + by3);
		
		//Post-Increment Operator on Short
		short s2 = 2895;
		short s3 = s2++;
		System.out.println("Value of First Short Variable is : " + s2);
		System.out.println("Value of Post-Incremented First Short Variable Stored into Second is : " + s3);
		
		//Post-Increment Operator on Int
		int i2 = 109563;
		int i3 = i2++;
		System.out.println("Value of First Int Variable is : " + i2);
		System.out.println("Value of Post-Incremented First Int Variable Stored into Second is : " + i3);
		
		//Post-Increment Operator on Long
		long l2 = 4512907634l;
		long l3 = l2++;
		System.out.println("Value of First Long Variable is : " + l2);
		System.out.println("Value of Post-Incremented First Long Variable Stored into Second is : " + l3);
		
		//Post-Increment Operator on Float
		float f2 = 38.198f;
		float f3 = f2++;
		System.out.println("Value of First Float Variable is : " + f2);
		System.out.println("Value of Post-Incremented First Float Variable Stored into Second is : " + f3);
				
		//Post-Increment Operator on Double
		double d2 = 19067.209;
		double d3 = d2++;
		System.out.println("Value of First Double Variable is : " + d2);
		System.out.println("Value of Post-Incremented First Double Variable Stored into Second is : " + d3);
		
		//Post-Increment Operator on Character
		char c2 = 'Z';
		char c3 = c2++;
		System.out.println("Value of First Character Variable is : " + c2);
		System.out.println("Value of Post-Incremented First Character Variable Stored into Second is : " + c3);
		
		//Special Question on Post-Increment Operator
		int b = 8;
		b = b++;
		System.out.println("Value of b is : " + b);
		//The above operation is equivalent to the following series of operations
		int newC = 10;
		int temp;
		temp = newC;
		newC++;
		System.out.println("Value of newC : " + newC);
		System.out.println("Value of temp : " + temp);
	}
}