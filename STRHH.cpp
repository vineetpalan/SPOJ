/*STRHH-Half of the Half -Spoj*/

#include <iostream>
#include <cstring> //or string.h

using namespace std;

int main() 
{
	int testCases=0;
	cin>>testCases;
	char inputSequence[201];
	
	for (int i=0;i< testCases; i++)
	{
		cin>>inputSequence;
		int len = strlen(inputSequence)/2;
		for (int j=0;j<len;j+=2)
		{
			cout<<inputSequence[j];
		}
		cout<<endl;
	}
	return 0;
}
