/*

STOB - String To Binary

It is an easy problem.you have a string (without any space) & you should find the Binary of sum of string ascci value.

your have to remove all duplicate  character from the string.

Ex:

SSsssstttrriiinnng = Sstring
HELLO = HELO

---------------------------------------------------------------------------------------------------------------------
Input

The input consists of N<=20 cases.The first line of the input contains only positive integer N. Then follow the cases. Each case consists a string S without any space.the length of the S could be around 1000>=S.include special character.

Output

For each cases you should print case number & Binary of sum of string ascci value.ex(#1 : ......) & print new line for every test cases.

Example

Input:
2
HELLO
SSSPPPOOOJJJ


Output:
#1 : 100101000
#2 : 100111100
---------------------------------------------------------------------------------------------------------------------

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 	Scanner in = new Scanner(System.in);
	 	int testCases=in.nextInt();
	 	
	 	String inputString="";
	 
	 	int total=0;
	 	for (int i=0;i< testCases; i++)
		{
			inputString=in.next();
			String outputString = "";
			total=0;
				
			int length = inputString.length();
			
			for (int j=0;j<length;j++)
			{
	 			char c = inputString.charAt(j);
	 		
	 			if (outputString.indexOf(c)==-1)
	 			{
	 				total += (int)c;
	 				outputString+=c;
	 			}
			}
	 	System.out.println("#" + (i+1) + " : "+ Integer.toBinaryString(total));	
		}
	}
}
