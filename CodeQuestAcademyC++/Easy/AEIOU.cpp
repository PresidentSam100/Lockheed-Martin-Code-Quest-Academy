/*
Problem 67: AEIOU
Difficulty: Easy
Originally Published: Code Quest 2018
*/

#include <bits/stdc++.h>
#define lli long long int
using namespace std; 

lli T, V;
string S;

int main()
{
	cin >> T;
	getline(cin, S);
	for (lli t = 0; t < T; t++) {
		getline(cin, S);
		V = 0;
		for (lli s = 0; s < S.size(); s++){
			if (S.at(s) == 'a' || S.at(s) == 'e' || S.at(s) == 'i' || S.at(s) == 'o' || S.at(s) == 'u') {
				V++;
			}
		}
		cout << V << endl;
	}
}

/*
Sample Input:
3
code quest is fun
good luck programming today
queueing has five vowels in a row
*/

/*
Sample Output:
6
8
13
*/