/*
FCTRL2 - Small factorials
#math #big-numbers

Description : http://www.spoj.com/problems/FCTRL2/
Run Online : http://ideone.com/DLoOWP

You are asked to calculate factorials of some small positive integers.

Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output

For each integer n given at input, display a line with the value of n!

Example

Sample input:
4
1
2
5
3
Sample output:

1
2
120
6

*/


import java.math.BigInteger;
import java.util.Scanner;

class FCTRL2 {

   public static void main(String[] args) 
   {
       Scanner in = new Scanner(System.in);
		int testCases=in.nextInt();
 		int participants=0,result=0;
 		while(testCases>0)
		{
	       int n = in.nextInt();
	       String fact = factorial(n);
	       System.out.println(fact);
	       testCases--;
		}
	 }

   public static String factorial(int n) 
   {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }
}
