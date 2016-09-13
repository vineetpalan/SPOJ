/*STRHH-Half of the Half -Spoj*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		
		int testCases  =in.nextInt();
		
		String inputSequence;
		
		for (int i=0;i< testCases; i++)
		{
			inputSequence = in.next();
			
			int length = inputSequence.length()/2;
			
			for (int j=0;j<length;j=j+2)
			{
				System.out.print(inputSequence.charAt(j));
			}
			System.out.println();
		}
	}
}
