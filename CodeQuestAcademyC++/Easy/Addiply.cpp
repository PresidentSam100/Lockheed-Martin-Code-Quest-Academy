/*
Problem 44: Addiply
Difficulty: Easy
Originally Published: Code Quest 2017
*/

#include <bits/stdc++.h>
#define lli long long int
using namespace std; 

lli T, X, Y;

int main()
{
	cin >> T;
	for (lli t = 0; t < T; t++) {
		cin >> X >> Y;
		cout << (X + Y) << " " << (X * Y) << endl;
	}
	return 0;
}

/*
Sample Input:
3
2 2
5 4
3 8
*/

/*
Sample Output:
4 4
9 20
11 24
*/