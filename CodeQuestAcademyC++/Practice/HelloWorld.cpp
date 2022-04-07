/*
Problem A: Hello, World!
Practice Problem
*/

#include <iostream>
#include <string>
#include <cmath>
#include <cstdlib>
using namespace std; 

int main()
{
	int testCases;
	cin >> testCases;
	string dummy;
	getline(cin, dummy);

	for (int testcase = 0; testcase < testCases; testcase++) {
		string text;
		getline(cin, text);
		cout << text << '\n';
	}
}

/*
Sample Input:
2
Welcome to Code Quest!
Good luck today!
*/

/*
Sample Output:
Welcome to Code Quest!
Good luck today!
*/