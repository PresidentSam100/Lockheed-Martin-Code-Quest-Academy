/*
Problem 115: Animal Farm
Difficulty: Easy
Author: Shelly Adamie, Fort Worth, Texas, United States
Originally Published: Code Quest Australia 2019
*/

#include <bits/stdc++.h>
#define lli long long int
using namespace std; 

lli T, a, b, c;

int main()
{
	cin >> T;
	for (lli t = 0; t < T; t++) {
		cin >> a >> b >> c;
		cout << (a * 2) + (b * 4) + (c * 4) << endl;
	}
	return 0;
}

/*
Sample Input:
3
2 3 5
2 2 2
3 2 4
*/

/*
Sample Output:
36
20
30
*/