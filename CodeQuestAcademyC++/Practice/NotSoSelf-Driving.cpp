/*
Problem B: Not So Self-Driving
Practice Problem
Author: Chris Liu, California High School
*/

#include <bits/stdc++.h>
#define lli long long int
using namespace std; 

lli T;
double V, X;
string S;

int main()
{
	cin >> T;
	for (lli t = 0; t < T; t++) {
		cin >> S;
		V = stod(S.substr(0, S.find(":")));
		X = stod(S.substr(S.find(":") + 1));
		if (X / V <= 1)
			cout << "SWERVE" << endl;
		else if (X / V <= 5)
			cout << "BRAKE" << endl;
		else
			cout << "SAFE" << endl;
	}
}

/*
Sample Input:
5
23.15:98.34
2.40:17.33
6.79:5.01
0.00:1.53
113.56:113.56
*/

/*
Sample Output:
BRAKE
SAFE
SWERVE
SAFE
SWERVE
*/
