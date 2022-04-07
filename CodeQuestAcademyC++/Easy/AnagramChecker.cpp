/*
Problem 28: Anagram Checker
Difficulty: Easy
Originally Published: Code Quest 2016
*/

#include <bits/stdc++.h>
#define lli long long int
using namespace std; 

lli T;
string S, S1, S2, S3, S4;

int main()
{
	cin >> T;
	for (lli t = 0; t < T; t++) {
		cin >> S;
		// Get String inputs
		S1 = S.substr(0, S.find("|"));
		S2 = S.substr(S.find("|") + 1);
		S3 = S1;
		S4 = S2;
		sort(S1.begin(), S1.end());
		sort(S2.begin(), S2.end());
		// Check for anagram
		if (S1 == S2 && S3 != S4) {
			cout << S << " = ANAGRAM" << endl;
		} else {
			cout << S << " = NOT AN ANAGRAM" << endl;
		}
	}
	return 0;
}

/*
Sample Input:
11
STOP|POTS
ADMIRER|MARRIED
CAT|DOG
CREATIVE|REACTIVE
LISTEN|SILENT
ANGERED|ENRAGED
ELVIS|LIVES
RUN|FLY
DEDUCTIONS|DISCOUNTED
PATERNAL|PARENTAL
MIKE|MIKE
*/

/*
Sample Output:
STOP|POTS = ANAGRAM
ADMIRER|MARRIED = ANAGRAM
CAT|DOG = NOT AN ANAGRAM
CREATIVE|REACTIVE = ANAGRAM
LISTEN|SILENT = ANAGRAM
ANGERED|ENRAGED = ANAGRAM
ELVIS|LIVES = ANAGRAM
RUN|FLY = NOT AN ANAGRAM
DEDUCTIONS|DISCOUNTED = ANAGRAM
PATERNAL|PARENTAL = ANAGRAM
MIKE|MIKE = NOT AN ANAGRAM
*/