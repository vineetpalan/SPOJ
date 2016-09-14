/*
ARITH2 - Simple Arithmetics II

Description : http://www.spoj.com/problems/ARITH2/
Run Online :  http://ideone.com/8hj4sF

----------------------------------------------------------------------------------------------------------------------
Input:
4

1 + 1 * 2 =

29 / 5 =

103 * 103 * 5 =

50 * 40 * 250 + 791 =

Output:
4
5
53045
500791

----------------------------------------------------------------------------------------------------------------------
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ARITH2
{
	static Scanner in =  new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	
		int testCases = in.nextInt();
		List digitsArray,operatorArray;
		
		while (testCases-- >0)
		{
			evaluateExpression();
		}
	}
	static void evaluateExpression() throws Exception 
	{
        long value = readOperand();
        char operator;
        while ((operator = readOperator()) != '=') 
        {
            long operand = readOperand();
            
            switch (operator) 
            {
                case '+' : 
                	value += operand; 
                	break;
                case '-' : 
                	value -= operand;
                	break;
                case '*' : 
                	value *= operand; 
                	break;
                case '/' : 
                	value /= operand;
                	break;
            }
        }
        System.out.println(value);
    }	
    
    static long readOperand()
    {
       try
       {
       	return Long.parseLong(in.next());
       }
       catch(Exception e)
       {
       	return 0;
       }
    }
   static char readOperator() throws Exception 
   {
        in.reset();
        char c = in.next().charAt(0);
        while (c != '+' && c != '-' && c != '*' && c != '/' && c != '=')
            c = in.next().charAt(0);
        return c;
    }
    
}
