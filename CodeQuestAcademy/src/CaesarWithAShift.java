import java.util.Scanner;
// Problem 145: Caesar With a Shift
// Difficulty: Medium
// Author: Carlos J. Sepulveda, Orlando, Florida, United States
// Originally Published Code Quest 2021
// Code Written By: Sam L.
public class CaesarWithAShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] shift = sc.nextLine().split(" ");
            String[] direction = sc.nextLine().split(" ");
            String ans = "";
            int shiftIndex = 0;
            int directionIndex = 0;
            for (int j = 0; j < str.length(); j++)
            {
                if (!str.substring(j, j + 1).matches("[A-Z]"))
                {
                    ans += str.substring(j, j + 1);
                }
                else
                {
                    int letter = (str.charAt(j) - 'A' + 26 + Integer.parseInt(shift[shiftIndex]) * (direction[directionIndex].equals("1")?-1:1)) % 26;
                    ans += (char)('a' + letter);
                    shiftIndex++;
                    shiftIndex %= shift.length;
                    directionIndex++;
                    directionIndex %= direction.length;
                }
            }
            System.out.println(ans);
        }
    }
}
/*
3
EDEPCG
1 1 2
1 0 1
EDENEC
1 1 2
1 0
DYA! EZP?
1 2
1 0 0
 */