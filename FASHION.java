/*

Description : http://www.spoj.com/problems/FASHION/
Run Online : http://ideone.com/F7qCxj

nput

The first line of the input contains an integer t, the number of test cases. t test cases follow.

Each test case consists of 3 lines:

The first line contains a single integer N (1 <= N <= 1000).
The second line contains N integers separated by single spaces denoting the hotness levels of the men.
The third line contains N integers separated by single spaces denoting the hotness levels of the women.
All hotness ratings are on a scale of 0 to 10.

Output

For each test case output a single line containing a single integer denoting the sum of the hotness bonds for all pairs that MMDS has proposed.

Example

Input:
2
2
1 1
3 2
3
2 3 2
1 3 2

Output:
5
15

*/

import java.util.*;
import java.lang.*;
import java.io.*;


class FASHION
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
 		int testCases=in.nextInt();
 		int participants=0,result=0;
 		Integer[] menArray,womenArray;
 		
 		while(testCases>0)
 		{
 			participants=in.nextInt();
 			menArray= new Integer[participants];
 			womenArray = new Integer[participants];
 			result = 0;
 			for(int i=0;i<participants;i++)
 			{
 				menArray[i] = in.nextInt();
 			}
 			for(int i=0;i<participants;i++)
 			{
 				womenArray[i] =in.nextInt();
 			}
 			Arrays.sort(menArray);
 			Arrays.sort(womenArray);
 			
 			for (int i=0;i<participants;i++)
 			{
 				result +=(menArray[i] *  womenArray[i]);
 			}
 			System.out.println(result);
 			testCases--;
 		}
	}
}
