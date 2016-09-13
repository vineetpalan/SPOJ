/* TEST - Life, the Universe, and Everything */

#include <iostream>

using namespace std;

int main() 
{
	int inputNumber = 0;
	
	cin>>inputNumber;
	
	while (inputNumber!=42)
	{
		cout<<inputNumber<<endl;
		cin>>inputNumber;
	}
	
	return 0;
}
