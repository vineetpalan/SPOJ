/*ADDREV - Adding Reversed Numbers*/

#include <iostream>
using namespace std;


int reverseNumber(int inputNumber)
{
	int reverse = 0;
	
	while(inputNumber != 0) 
	{
        reverse = reverse*10 + inputNumber%10;
        inputNumber/=10;
    }
	
	return reverse;
}

int main() {
	
	int testCases=0;
	
	cin>>testCases;
	
	int firstNumber=0;
	int secondNumber=0;
	int total=0;
	
	while(testCases--)
	{
		cin>>firstNumber>>secondNumber;
		cout<<reverseNumber((reverseNumber(firstNumber) + reverseNumber(secondNumber) ))<<endl;
	}
	
	return 0;
}

