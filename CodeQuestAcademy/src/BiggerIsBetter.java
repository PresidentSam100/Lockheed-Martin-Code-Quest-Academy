import java.util.Scanner;
// Problem 133: Bigger Is Better
// Originally Published: Code Quest 2021
// Author: Vedant Patel, Stratford, Connecticut, United States
// Difficulty: Easy
// Code Written By: Sam L.
public class BiggerIsBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++)
        {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            long max = 0;
            for (int j = 0; j < s.length; j++)
            {
                long temp = Long.parseLong(s[j]);
                max = Math.max(temp, max);
            }
            System.out.println(max);
        }
    }
}
