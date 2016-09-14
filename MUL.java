/*
MUL - Fast Multiplication
#simple-math #recursion
Multiply the given numbers.

Input

n [the number of multiplications <= 1000]

l1 l2 [numbers to multiply (at most 10000 decimal digits each)]

Text grouped in [ ] does not appear in the input file.

Output

The results of multiplications.

Example

Input:
5
4 2
123 43
324 342
0 12
9999 12345

Output:
8
5289
110808
0
123437655

*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class MUL
{
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int testCases=in.nextInt();
		BigInteger result;
		while (testCases>0)
		{
			BigInteger numberOne = in.nextBigInteger(); // x
			BigInteger numberTwo = in.nextBigInteger(); //y
			result = numberOne.multiply(numberTwo); // x * y
			System.out.println( result);
			testCases--;
		}
	}
}
