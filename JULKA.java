/*
http://www.spoj.com/problems/JULKA/

Some Points To Note : 
1. Test Cases In which answer is not possible will not be given. 
2. Must Remove Zeroes From Starting . (008 is not valid , 8 is valid) 
3.Take Array Bigger Than 101(take 102) (101 is also right , i guess but just in case ) So That No Segmentation Fault Occurs. 
4.Test Cases Are Exactly 10. 
5. Check program for input like: (Thanks To bunnycoder) 
0 0 
2003 65 
1000 998 
9999999 99 
5555 5555 
16 8 

Output: 
0 0 
1034 969 
999 1 
5000049 4999950 
5555 0 
12 4 

*/

import java.util.*;
import java.lang.*;
import java.math.*;


class JULKA
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int testCases=10;
		BigInteger n;
		while (testCases>0)
		{
			BigInteger totalApples = in.nextBigInteger(); // x
			BigInteger moreApplesKHas = in.nextBigInteger(); //y
			n = totalApples.subtract(moreApplesKHas); // x - y
			n = n.divide(BigInteger.valueOf(2)); // (x-y)/2
			
			System.out.print(n.add(moreApplesKHas));
			System.out.println( " " + n);
			testCases--;
		}
	}
}

