/* TEST - Life, the Universe, and Everything */

import java.util.*;
import java.lang.*;
import java.io.*;

class TEST
{
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int inputNumber = in.nextInt();
		while(inputNumber!=42)
		{
			System.out.println(inputNumber);
			inputNumber = in.nextInt();
		}
	}
}
